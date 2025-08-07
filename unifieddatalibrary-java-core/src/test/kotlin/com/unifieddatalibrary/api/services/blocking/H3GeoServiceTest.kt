// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.h3geo.H3GeoCountParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoCreateParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoGetParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoListParams
import com.unifieddatalibrary.api.models.h3geo.H3GeoTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class H3GeoServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val h3GeoService = client.h3Geo()

        h3GeoService.create(
            H3GeoCreateParams.builder()
                .addCell(
                    H3GeoCreateParams.Cell.builder()
                        .cellId("830b90fffffffff")
                        .classificationMarking("U")
                        .dataMode(H3GeoCreateParams.Cell.DataMode.TEST)
                        .source("Bluestaq")
                        .id("443fg911-4ab6-3d74-1991-372149d87f89")
                        .altMean(450.1)
                        .altSigma(400.1)
                        .anomScoreInterference(0.125)
                        .anomScoreSpoofing(0.125)
                        .changeScore(12.34)
                        .coverage(8)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .idH3Geo("026dd511-8ba5-47d3-9909-836149f87686")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .rpmMax(50.1)
                        .rpmMean(47.953125)
                        .rpmMedian(48.375)
                        .rpmMin(43.1)
                        .rpmSigma(1.23)
                        .sourceDl("AXE")
                        .build()
                )
                .classificationMarking("U")
                .dataMode(H3GeoCreateParams.DataMode.TEST)
                .numCells(1)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2024-07-02T00:00:00.123Z"))
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .centerFreq(1575.42)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endTime(OffsetDateTime.parse("2024-07-03T00:00:00.123Z"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .resolution(3)
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .type("Cell Towers")
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
        val h3GeoService = client.h3Geo()

        val page =
            h3GeoService.list(
                H3GeoListParams.builder()
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
        val h3GeoService = client.h3Geo()

        h3GeoService.count(
            H3GeoCountParams.builder()
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val h3GeoService = client.h3Geo()

        val h3Geo =
            h3GeoService.get(
                H3GeoGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        h3Geo.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val h3GeoService = client.h3Geo()

        val response = h3GeoService.queryhelp()

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
        val h3GeoService = client.h3Geo()

        val response =
            h3GeoService.tuple(
                H3GeoTupleParams.builder()
                    .columns("columns")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
