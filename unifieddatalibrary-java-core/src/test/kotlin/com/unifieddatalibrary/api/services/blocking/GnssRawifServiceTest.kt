// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
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
internal class GnssRawifServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawifService = client.gnssRawif()

        val page =
            gnssRawifService.list(
                GnssRawifListParams.builder()
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawifService = client.gnssRawif()

        gnssRawifService.count(
            GnssRawifCountParams.builder()
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun fileGet(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawifService = client.gnssRawif()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            gnssRawifService.fileGet(
                GnssRawifFileGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawifService = client.gnssRawif()

        val gnssRawif =
            gnssRawifService.get(
                GnssRawifGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        gnssRawif.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawifService = client.gnssRawif()

        val response = gnssRawifService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawifService = client.gnssRawif()

        val response =
            gnssRawifService.tuple(
                GnssRawifTupleParams.builder()
                    .columns("columns")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun uploadZip() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawifService = client.gnssRawif()

        gnssRawifService.uploadZip(
            GnssRawifUploadZipParams.builder().file("some content".byteInputStream()).build()
        )
    }
}
