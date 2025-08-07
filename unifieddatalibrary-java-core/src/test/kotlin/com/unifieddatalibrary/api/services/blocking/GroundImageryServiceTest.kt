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
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryCountParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryCreateParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetFileParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryGetParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryHistoryAodrParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryListParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryTupleParams
import com.unifieddatalibrary.api.models.groundimagery.GroundImageryUploadZipParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class GroundImageryServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val groundImageryService = client.groundImagery()

        groundImageryService.create(
            GroundImageryCreateParams.builder()
                .classificationMarking("U")
                .dataMode(GroundImageryCreateParams.DataMode.TEST)
                .filename("Example file name")
                .imageTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .source("Bluestaq")
                .id("GROUNDIMAGERY-ID")
                .checksumValue("120EA8A25E5D487BF68B5F7096440019")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .filesize(0L)
                .format("PNG")
                .idSensor("SENSOR-ID")
                .addKeyword("KEYWORD1")
                .addKeyword("KEYWORD2")
                .name("Example name")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origSensorId("ORIGSENSOR-ID")
                .region(
                    "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
                )
                .regionGeoJson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .regionNDims(2)
                .regionSRid(4326)
                .regionText(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .regionType("Polygon")
                .sourceDl("AXE")
                .subjectId("SUBJECT-ID")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .transactionId("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val groundImageryService = client.groundImagery()

        val page =
            groundImageryService.list(
                GroundImageryListParams.builder()
                    .imageTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val groundImageryService = client.groundImagery()

        groundImageryService.count(
            GroundImageryCountParams.builder()
                .imageTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val groundImageryService = client.groundImagery()

        val groundImagery =
            groundImageryService.get(
                GroundImageryGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        groundImagery.validate()
    }

    @Test
    fun getFile(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .password("My Password")
                .username("My Username")
                .build()
        val groundImageryService = client.groundImagery()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            groundImageryService.getFile(
                GroundImageryGetFileParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun historyAodr() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val groundImageryService = client.groundImagery()

        groundImageryService.historyAodr(
            GroundImageryHistoryAodrParams.builder()
                .imageTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val groundImageryService = client.groundImagery()

        val response = groundImageryService.queryhelp()

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
        val groundImageryService = client.groundImagery()

        val response =
            groundImageryService.tuple(
                GroundImageryTupleParams.builder()
                    .columns("columns")
                    .imageTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val groundImageryService = client.groundImagery()

        groundImageryService.uploadZip(
            GroundImageryUploadZipParams.builder().file("some content".byteInputStream()).build()
        )
    }
}
