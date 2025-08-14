// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geo

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class H3GeoGetResponseTest {

    @Test
    fun create() {
        val h3GeoGetResponse =
            H3GeoGetResponse.builder()
                .addCell(
                    H3GeoGetResponse.Cell.builder()
                        .cellId("830b90fffffffff")
                        .classificationMarking("U")
                        .dataMode(H3GeoGetResponse.Cell.DataMode.TEST)
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
                .dataMode(H3GeoGetResponse.DataMode.TEST)
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

        assertThat(h3GeoGetResponse.cells())
            .containsExactly(
                H3GeoGetResponse.Cell.builder()
                    .cellId("830b90fffffffff")
                    .classificationMarking("U")
                    .dataMode(H3GeoGetResponse.Cell.DataMode.TEST)
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
        assertThat(h3GeoGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(h3GeoGetResponse.dataMode()).isEqualTo(H3GeoGetResponse.DataMode.TEST)
        assertThat(h3GeoGetResponse.numCells()).isEqualTo(1)
        assertThat(h3GeoGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(h3GeoGetResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2024-07-02T00:00:00.123Z"))
        assertThat(h3GeoGetResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(h3GeoGetResponse.centerFreq()).contains(1575.42)
        assertThat(h3GeoGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(h3GeoGetResponse.createdBy()).contains("some.user")
        assertThat(h3GeoGetResponse.endTime())
            .contains(OffsetDateTime.parse("2024-07-03T00:00:00.123Z"))
        assertThat(h3GeoGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(h3GeoGetResponse.origNetwork()).contains("OPS1")
        assertThat(h3GeoGetResponse.resolution()).contains(3)
        assertThat(h3GeoGetResponse.sourceDl()).contains("AXE")
        assertThat(h3GeoGetResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(h3GeoGetResponse.type()).contains("Cell Towers")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val h3GeoGetResponse =
            H3GeoGetResponse.builder()
                .addCell(
                    H3GeoGetResponse.Cell.builder()
                        .cellId("830b90fffffffff")
                        .classificationMarking("U")
                        .dataMode(H3GeoGetResponse.Cell.DataMode.TEST)
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
                .dataMode(H3GeoGetResponse.DataMode.TEST)
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

        val roundtrippedH3GeoGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(h3GeoGetResponse),
                jacksonTypeRef<H3GeoGetResponse>(),
            )

        assertThat(roundtrippedH3GeoGetResponse).isEqualTo(h3GeoGetResponse)
    }
}
