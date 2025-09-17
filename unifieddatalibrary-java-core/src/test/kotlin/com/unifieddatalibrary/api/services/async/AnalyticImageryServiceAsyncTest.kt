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
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryCountParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryFileGetParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryListParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryRetrieveParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryTupleParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class AnalyticImageryServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryServiceAsync = client.analyticImagery()

        val analyticImageryFullFuture =
            analyticImageryServiceAsync.retrieve(
                AnalyticImageryRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val analyticImageryFull = analyticImageryFullFuture.get()
        analyticImageryFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryServiceAsync = client.analyticImagery()

        val pageFuture =
            analyticImageryServiceAsync.list(
                AnalyticImageryListParams.builder()
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val analyticImageryServiceAsync = client.analyticImagery()

        val responseFuture =
            analyticImageryServiceAsync.count(
                AnalyticImageryCountParams.builder()
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val analyticImageryServiceAsync = client.analyticImagery()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            analyticImageryServiceAsync.fileGet(
                AnalyticImageryFileGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryServiceAsync = client.analyticImagery()

        val responseFuture = analyticImageryServiceAsync.queryhelp()

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
        val analyticImageryServiceAsync = client.analyticImagery()

        val analyticImageryAbridgedsFuture =
            analyticImageryServiceAsync.tuple(
                AnalyticImageryTupleParams.builder()
                    .columns("columns")
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val analyticImageryAbridgeds = analyticImageryAbridgedsFuture.get()
        analyticImageryAbridgeds.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryServiceAsync = client.analyticImagery()

        val future =
            analyticImageryServiceAsync.unvalidatedPublish(
                AnalyticImageryUnvalidatedPublishParams.builder()
                    .file("some content".byteInputStream())
                    .build()
            )

        val response = future.get()
    }
}
