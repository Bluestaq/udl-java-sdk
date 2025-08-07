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
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryCountParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryFileGetParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryGetParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryListParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryTupleParams
import com.unifieddatalibrary.api.models.skyimagery.SkyImageryUploadZipParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class SkyImageryServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val skyImageryService = client.skyImagery()

        val page =
            skyImageryService.list(
                SkyImageryListParams.builder()
                    .expStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val skyImageryService = client.skyImagery()

        skyImageryService.count(
            SkyImageryCountParams.builder()
                .expStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val skyImageryService = client.skyImagery()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            skyImageryService.fileGet(
                SkyImageryFileGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
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
        val skyImageryService = client.skyImagery()

        val skyImagery =
            skyImageryService.get(
                SkyImageryGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        skyImagery.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val skyImageryService = client.skyImagery()

        val response = skyImageryService.queryhelp()

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
        val skyImageryService = client.skyImagery()

        val response =
            skyImageryService.tuple(
                SkyImageryTupleParams.builder()
                    .columns("columns")
                    .expStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val skyImageryService = client.skyImagery()

        skyImageryService.uploadZip(
            SkyImageryUploadZipParams.builder().file("some content".byteInputStream()).build()
        )
    }
}
