// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geo

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class H3GeoListResponseTest {

    @Test
    fun create() {
        val h3GeoListResponse =
            H3GeoListResponse.builder()
                .classificationMarking("U")
                .dataMode(H3GeoListResponse.DataMode.TEST)
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
                .type("Cell Towers")
                .build()

        assertThat(h3GeoListResponse.classificationMarking()).isEqualTo("U")
        assertThat(h3GeoListResponse.dataMode()).isEqualTo(H3GeoListResponse.DataMode.TEST)
        assertThat(h3GeoListResponse.numCells()).isEqualTo(1)
        assertThat(h3GeoListResponse.source()).isEqualTo("Bluestaq")
        assertThat(h3GeoListResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2024-07-02T00:00:00.123Z"))
        assertThat(h3GeoListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(h3GeoListResponse.centerFreq()).contains(1575.42)
        assertThat(h3GeoListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(h3GeoListResponse.createdBy()).contains("some.user")
        assertThat(h3GeoListResponse.endTime())
            .contains(OffsetDateTime.parse("2024-07-03T00:00:00.123Z"))
        assertThat(h3GeoListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(h3GeoListResponse.origNetwork()).contains("OPS1")
        assertThat(h3GeoListResponse.resolution()).contains(3)
        assertThat(h3GeoListResponse.sourceDl()).contains("AXE")
        assertThat(h3GeoListResponse.type()).contains("Cell Towers")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val h3GeoListResponse =
            H3GeoListResponse.builder()
                .classificationMarking("U")
                .dataMode(H3GeoListResponse.DataMode.TEST)
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
                .type("Cell Towers")
                .build()

        val roundtrippedH3GeoListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(h3GeoListResponse),
                jacksonTypeRef<H3GeoListResponse>(),
            )

        assertThat(roundtrippedH3GeoListResponse).isEqualTo(h3GeoListResponse)
    }
}
