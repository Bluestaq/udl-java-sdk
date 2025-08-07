// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListResponseTest {

    @Test
    fun create() {
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
                .scanCode("ABC1234")
                .scannerId("2051M")
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .createdAt(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
                .createdBy("some.user")
                .dvCode("DV-4")
                .idItem("36054487-bcba-6e2d-4f3b-9f25738b2639")
                .addKey("tapeColor")
                .addKey("hazmat")
                .lat(45.23)
                .lon(179.1)
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .scanType("TRANSIT")
                .scGenTool("bID")
                .sourceDl("AXE")
                .type("CARGO")
                .addValue("yellow")
                .addValue("false")
                .build()

        assertThat(historyListResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyListResponse.dataMode()).isEqualTo(HistoryListResponse.DataMode.TEST)
        assertThat(historyListResponse.scanCode()).isEqualTo("ABC1234")
        assertThat(historyListResponse.scannerId()).isEqualTo("2051M")
        assertThat(historyListResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyListResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
        assertThat(historyListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(historyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
        assertThat(historyListResponse.createdBy()).contains("some.user")
        assertThat(historyListResponse.dvCode()).contains("DV-4")
        assertThat(historyListResponse.idItem()).contains("36054487-bcba-6e2d-4f3b-9f25738b2639")
        assertThat(historyListResponse.keys().getOrNull()).containsExactly("tapeColor", "hazmat")
        assertThat(historyListResponse.lat()).contains(45.23)
        assertThat(historyListResponse.lon()).contains(179.1)
        assertThat(historyListResponse.notes()).contains("Example notes")
        assertThat(historyListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyListResponse.origNetwork()).contains("OPS1")
        assertThat(historyListResponse.scanType()).contains("TRANSIT")
        assertThat(historyListResponse.scGenTool()).contains("bID")
        assertThat(historyListResponse.sourceDl()).contains("AXE")
        assertThat(historyListResponse.type()).contains("CARGO")
        assertThat(historyListResponse.values().getOrNull()).containsExactly("yellow", "false")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
                .scanCode("ABC1234")
                .scannerId("2051M")
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .createdAt(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
                .createdBy("some.user")
                .dvCode("DV-4")
                .idItem("36054487-bcba-6e2d-4f3b-9f25738b2639")
                .addKey("tapeColor")
                .addKey("hazmat")
                .lat(45.23)
                .lon(179.1)
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .scanType("TRANSIT")
                .scGenTool("bID")
                .sourceDl("AXE")
                .type("CARGO")
                .addValue("yellow")
                .addValue("false")
                .build()

        val roundtrippedHistoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyListResponse),
                jacksonTypeRef<HistoryListResponse>(),
            )

        assertThat(roundtrippedHistoryListResponse).isEqualTo(historyListResponse)
    }
}
