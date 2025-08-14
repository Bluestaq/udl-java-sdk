// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geo.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryQueryResponseTest {

    @Test
    fun create() {
        val historyQueryResponse =
            HistoryQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryQueryResponse.DataMode.TEST)
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

        assertThat(historyQueryResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyQueryResponse.dataMode()).isEqualTo(HistoryQueryResponse.DataMode.TEST)
        assertThat(historyQueryResponse.numCells()).isEqualTo(1)
        assertThat(historyQueryResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyQueryResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2024-07-02T00:00:00.123Z"))
        assertThat(historyQueryResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(historyQueryResponse.centerFreq()).contains(1575.42)
        assertThat(historyQueryResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyQueryResponse.createdBy()).contains("some.user")
        assertThat(historyQueryResponse.endTime())
            .contains(OffsetDateTime.parse("2024-07-03T00:00:00.123Z"))
        assertThat(historyQueryResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyQueryResponse.origNetwork()).contains("OPS1")
        assertThat(historyQueryResponse.resolution()).contains(3)
        assertThat(historyQueryResponse.sourceDl()).contains("AXE")
        assertThat(historyQueryResponse.type()).contains("Cell Towers")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyQueryResponse =
            HistoryQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryQueryResponse.DataMode.TEST)
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

        val roundtrippedHistoryQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyQueryResponse),
                jacksonTypeRef<HistoryQueryResponse>(),
            )

        assertThat(roundtrippedHistoryQueryResponse).isEqualTo(historyQueryResponse)
    }
}
