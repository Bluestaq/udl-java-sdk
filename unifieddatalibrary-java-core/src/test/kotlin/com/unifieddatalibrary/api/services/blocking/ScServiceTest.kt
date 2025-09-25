// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.models.scs.ScCopyParams
import com.unifieddatalibrary.api.models.scs.ScDeleteParams
import com.unifieddatalibrary.api.models.scs.ScDownloadParams
import com.unifieddatalibrary.api.models.scs.ScFileDownloadParams
import com.unifieddatalibrary.api.models.scs.ScFileUploadParams
import com.unifieddatalibrary.api.models.scs.ScHasWriteAccessParams
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
internal class ScServiceTest {

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()

        scService.delete(ScDeleteParams.builder().id("id").build())
    }

    @Test
    fun allowableFileExtensions() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()

        scService.allowableFileExtensions()
    }

    @Test
    fun allowableFileMimes() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()

        scService.allowableFileMimes()
    }

    @Test
    fun copy() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()

        scService.copy(ScCopyParams.builder().id("id").targetPath("targetPath").build())
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            scService.download(ScDownloadParams.builder().addBody("/MyFolderToDownload/").build())

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun fileDownload(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            scService.fileDownload(
                ScFileDownloadParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun fileUpload() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()

        scService.fileUpload(
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
    }

    @Test
    fun hasWriteAccess() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()

        scService.hasWriteAccess(
            ScHasWriteAccessParams.builder().path("path").firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun move() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()

        scService.move(ScMoveParams.builder().id("id").targetPath("targetPath").build())
    }

    @Test
    fun rename() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()

        scService.rename(ScRenameParams.builder().id("id").newName("newName").build())
    }

    @Test
    fun search() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val scService = client.scs()

        val fileData =
            scService.search(
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

        fileData.forEach { it.validate() }
    }
}
