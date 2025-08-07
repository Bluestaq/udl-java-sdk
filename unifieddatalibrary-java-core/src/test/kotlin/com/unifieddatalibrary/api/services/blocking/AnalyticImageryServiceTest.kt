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
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryCountParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryFileGetParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryHistoryAodrParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryHistoryCountParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryHistoryParams
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
internal class AnalyticImageryServiceTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryService = client.analyticImagery()

        val analyticImageryFull =
            analyticImageryService.retrieve(
                AnalyticImageryRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        analyticImageryFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryService = client.analyticImagery()

        val page =
            analyticImageryService.list(
                AnalyticImageryListParams.builder()
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val analyticImageryService = client.analyticImagery()

        analyticImageryService.count(
            AnalyticImageryCountParams.builder()
                .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val analyticImageryService = client.analyticImagery()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            analyticImageryService.fileGet(
                AnalyticImageryFileGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun history() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryService = client.analyticImagery()

        val analyticImageryAbridgeds =
            analyticImageryService.history(
                AnalyticImageryHistoryParams.builder()
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        analyticImageryAbridgeds.forEach { it.validate() }
    }

    @Test
    fun historyAodr() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryService = client.analyticImagery()

        analyticImageryService.historyAodr(
            AnalyticImageryHistoryAodrParams.builder()
                .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .columns("columns")
                .firstResult(0L)
                .maxResults(0L)
                .notification("notification")
                .outputDelimiter("outputDelimiter")
                .outputFormat("outputFormat")
                .build()
        )
    }

    @Test
    fun historyCount() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryService = client.analyticImagery()

        analyticImageryService.historyCount(
            AnalyticImageryHistoryCountParams.builder()
                .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryService = client.analyticImagery()

        val response = analyticImageryService.queryhelp()

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
        val analyticImageryService = client.analyticImagery()

        val analyticImageryAbridgeds =
            analyticImageryService.tuple(
                AnalyticImageryTupleParams.builder()
                    .columns("columns")
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        analyticImageryAbridgeds.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val analyticImageryService = client.analyticImagery()

        analyticImageryService.unvalidatedPublish(
            AnalyticImageryUnvalidatedPublishParams.builder()
                .file("some content".byteInputStream())
                .build()
        )
    }
}
