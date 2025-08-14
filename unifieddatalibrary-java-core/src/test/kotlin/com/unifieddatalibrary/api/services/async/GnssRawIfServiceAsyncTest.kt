// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfCountParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfFileGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfTupleParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfUploadZipParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class GnssRawIfServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawIfServiceAsync = client.gnssRawIf()

        val pageFuture =
            gnssRawIfServiceAsync.list(
                GnssRawIfListParams.builder()
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawIfServiceAsync = client.gnssRawIf()

        val responseFuture =
            gnssRawIfServiceAsync.count(
                GnssRawIfCountParams.builder()
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun fileGet(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawIfServiceAsync = client.gnssRawIf()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            gnssRawIfServiceAsync.fileGet(
                GnssRawIfFileGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawIfServiceAsync = client.gnssRawIf()

        val gnssRawIfFuture =
            gnssRawIfServiceAsync.get(
                GnssRawIfGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val gnssRawIf = gnssRawIfFuture.get()
        gnssRawIf.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawIfServiceAsync = client.gnssRawIf()

        val responseFuture = gnssRawIfServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawIfServiceAsync = client.gnssRawIf()

        val responseFuture =
            gnssRawIfServiceAsync.tuple(
                GnssRawIfTupleParams.builder()
                    .columns("columns")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun uploadZip() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawIfServiceAsync = client.gnssRawIf()

        val future =
            gnssRawIfServiceAsync.uploadZip(
                GnssRawIfUploadZipParams.builder().file("some content".byteInputStream()).build()
            )

        val response = future.get()
    }
}
