// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.reportandactivity

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.reportandactivity.udlh3geo.UdlH3geoUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UdlH3geoServiceTest {

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val udlH3geoService = client.reportAndActivity().udlH3geo()

        udlH3geoService.unvalidatedPublish(
            UdlH3geoUnvalidatedPublishParams.builder()
                .addCell(
                    UdlH3geoUnvalidatedPublishParams.Cell.builder()
                        .cellId("830b90fffffffff")
                        .classificationMarking("U")
                        .dataMode(UdlH3geoUnvalidatedPublishParams.Cell.DataMode.TEST)
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
                .dataMode(UdlH3geoUnvalidatedPublishParams.DataMode.TEST)
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
}
