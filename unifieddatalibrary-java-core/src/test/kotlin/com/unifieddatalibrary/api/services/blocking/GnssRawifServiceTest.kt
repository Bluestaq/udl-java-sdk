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
internal class GnssRawIfServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawIfService = client.gnssRawIf()

        val page =
            gnssRawIfService.list(
                GnssRawIfListParams.builder()
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
        val gnssRawIfService = client.gnssRawIf()

        gnssRawIfService.count(
            GnssRawIfCountParams.builder()
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
        val gnssRawIfService = client.gnssRawIf()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            gnssRawIfService.fileGet(
                GnssRawIfFileGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
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
        val gnssRawIfService = client.gnssRawIf()

        val gnssRawIf =
            gnssRawIfService.get(
                GnssRawIfGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        gnssRawIf.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssRawIfService = client.gnssRawIf()

        val response = gnssRawIfService.queryhelp()

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
        val gnssRawIfService = client.gnssRawIf()

        val response =
            gnssRawIfService.tuple(
                GnssRawIfTupleParams.builder()
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
        val gnssRawIfService = client.gnssRawIf()

        gnssRawIfService.uploadZip(
            GnssRawIfUploadZipParams.builder().file("some content".byteInputStream()).build()
        )
    }
}
