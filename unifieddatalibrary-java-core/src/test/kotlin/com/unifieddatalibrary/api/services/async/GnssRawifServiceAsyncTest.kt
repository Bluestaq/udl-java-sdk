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
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawifCountParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawifFileGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawifGetParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawifListParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawifTupleParams
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawifUploadZipParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class GnssRawifServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawifServiceAsync = client.gnssRawif()

        val pageFuture =
            gnssRawifServiceAsync.list(
                GnssRawifListParams.builder()
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
        val gnssRawifServiceAsync = client.gnssRawif()

        val responseFuture =
            gnssRawifServiceAsync.count(
                GnssRawifCountParams.builder()
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
        val gnssRawifServiceAsync = client.gnssRawif()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            gnssRawifServiceAsync.fileGet(
                GnssRawifFileGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
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
        val gnssRawifServiceAsync = client.gnssRawif()

        val gnssRawifFuture =
            gnssRawifServiceAsync.get(
                GnssRawifGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val gnssRawif = gnssRawifFuture.get()
        gnssRawif.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawifServiceAsync = client.gnssRawif()

        val responseFuture = gnssRawifServiceAsync.queryhelp()

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
        val gnssRawifServiceAsync = client.gnssRawif()

        val responseFuture =
            gnssRawifServiceAsync.tuple(
                GnssRawifTupleParams.builder()
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
        val gnssRawifServiceAsync = client.gnssRawif()

        val future =
            gnssRawifServiceAsync.uploadZip(
                GnssRawifUploadZipParams.builder().file("some content".byteInputStream()).build()
            )

        val response = future.get()
    }
}
