// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geohexcell

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class H3GeoHexCellListResponseTest {

    @Test
    fun create() {
        val h3GeoHexCellListResponse =
            H3GeoHexCellListResponse.builder()
                .cellId("830b90fffffffff")
                .classificationMarking("U")
                .dataMode(H3GeoHexCellListResponse.DataMode.TEST)
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

        assertThat(h3GeoHexCellListResponse.cellId()).isEqualTo("830b90fffffffff")
        assertThat(h3GeoHexCellListResponse.classificationMarking()).isEqualTo("U")
        assertThat(h3GeoHexCellListResponse.dataMode())
            .isEqualTo(H3GeoHexCellListResponse.DataMode.TEST)
        assertThat(h3GeoHexCellListResponse.source()).isEqualTo("Bluestaq")
        assertThat(h3GeoHexCellListResponse.id()).contains("443fg911-4ab6-3d74-1991-372149d87f89")
        assertThat(h3GeoHexCellListResponse.altMean()).contains(450.1)
        assertThat(h3GeoHexCellListResponse.altSigma()).contains(400.1)
        assertThat(h3GeoHexCellListResponse.anomScoreInterference()).contains(0.125)
        assertThat(h3GeoHexCellListResponse.anomScoreSpoofing()).contains(0.125)
        assertThat(h3GeoHexCellListResponse.changeScore()).contains(12.34)
        assertThat(h3GeoHexCellListResponse.coverage()).contains(8)
        assertThat(h3GeoHexCellListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(h3GeoHexCellListResponse.createdBy()).contains("some.user")
        assertThat(h3GeoHexCellListResponse.idH3Geo())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(h3GeoHexCellListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(h3GeoHexCellListResponse.origNetwork()).contains("OPS1")
        assertThat(h3GeoHexCellListResponse.rpmMax()).contains(50.1)
        assertThat(h3GeoHexCellListResponse.rpmMean()).contains(47.953125)
        assertThat(h3GeoHexCellListResponse.rpmMedian()).contains(48.375)
        assertThat(h3GeoHexCellListResponse.rpmMin()).contains(43.1)
        assertThat(h3GeoHexCellListResponse.rpmSigma()).contains(1.23)
        assertThat(h3GeoHexCellListResponse.sourceDl()).contains("AXE")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val h3GeoHexCellListResponse =
            H3GeoHexCellListResponse.builder()
                .cellId("830b90fffffffff")
                .classificationMarking("U")
                .dataMode(H3GeoHexCellListResponse.DataMode.TEST)
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

        val roundtrippedH3GeoHexCellListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(h3GeoHexCellListResponse),
                jacksonTypeRef<H3GeoHexCellListResponse>(),
            )

        assertThat(roundtrippedH3GeoHexCellListResponse).isEqualTo(h3GeoHexCellListResponse)
    }
}
