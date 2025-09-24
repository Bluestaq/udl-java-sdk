// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.models.scs.ScCopyParams
import com.unifieddatalibrary.api.models.scs.ScDeleteParams
import com.unifieddatalibrary.api.models.scs.ScDownloadParams
import com.unifieddatalibrary.api.models.scs.ScFileDownloadParams
import com.unifieddatalibrary.api.models.scs.ScFileUploadParams
import com.unifieddatalibrary.api.models.scs.ScMoveParams
import com.unifieddatalibrary.api.models.scs.ScRenameParams
import com.unifieddatalibrary.api.models.scs.ScSearchParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ScServiceAsyncTest {

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()

        val future = scServiceAsync.delete(ScDeleteParams.builder().id("id").build())

        val response = future.get()
    }

    @Test
    fun allowableFileExtensions() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()

        val responseFuture = scServiceAsync.allowableFileExtensions()

        val response = responseFuture.get()
    }

    @Test
    fun allowableFileMimes() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()

        val responseFuture = scServiceAsync.allowableFileMimes()

        val response = responseFuture.get()
    }

    @Test
    fun copy() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()

        val responseFuture =
            scServiceAsync.copy(ScCopyParams.builder().id("id").targetPath("targetPath").build())

        val response = responseFuture.get()
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            scServiceAsync.download(
                ScDownloadParams.builder().addBody("/MyFolderToDownload/").build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun fileDownload(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            scServiceAsync.fileDownload(
                ScFileDownloadParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun fileUpload() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()

        val responseFuture =
            scServiceAsync.fileUpload(
                ScFileUploadParams.builder()
                    .classificationMarking("classificationMarking")
                    .fileName("fileName")
                    .path("path")
                    .deleteAfter("deleteAfter")
                    .description("description")
                    .overwrite(true)
                    .sendNotification(true)
                    .tags("tags")
                    .fileContent("some content")
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun move() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()

        val responseFuture =
            scServiceAsync.move(ScMoveParams.builder().id("id").targetPath("targetPath").build())

        val response = responseFuture.get()
    }

    @Test
    fun rename() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()

        val future =
            scServiceAsync.rename(ScRenameParams.builder().id("id").newName("newName").build())

        val response = future.get()
    }

    @Test
    fun search() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scServiceAsync = client.scs()

        val fileDataFuture =
            scServiceAsync.search(
                ScSearchParams.builder()
                    .path("path")
                    .count(0)
                    .offset(0)
                    .contentCriteria("contentCriteria")
                    .metaDataCriteria(
                        ScSearchParams.MetaDataCriteria.builder()
                            .putAdditionalProperty(
                                "CREATED_AT",
                                JsonValue.from(listOf("< 2022-06-14T07:48:11.302Z")),
                            )
                            .build()
                    )
                    .nonRangeCriteria(
                        ScSearchParams.NonRangeCriteria.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .rangeCriteria(
                        ScSearchParams.RangeCriteria.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .searchAfter("searchAfter")
                    .build()
            )

        val fileData = fileDataFuture.get()
        fileData.forEach { it.validate() }
    }
}
