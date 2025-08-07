// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemTrackingListResponseTest {

    @Test
    fun create() {
        val itemTrackingListResponse =
            ItemTrackingListResponse.builder()
                .classificationMarking("U")
                .dataMode(ItemTrackingListResponse.DataMode.TEST)
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

        assertThat(itemTrackingListResponse.classificationMarking()).isEqualTo("U")
        assertThat(itemTrackingListResponse.dataMode())
            .isEqualTo(ItemTrackingListResponse.DataMode.TEST)
        assertThat(itemTrackingListResponse.scanCode()).isEqualTo("ABC1234")
        assertThat(itemTrackingListResponse.scannerId()).isEqualTo("2051M")
        assertThat(itemTrackingListResponse.source()).isEqualTo("Bluestaq")
        assertThat(itemTrackingListResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
        assertThat(itemTrackingListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(itemTrackingListResponse.createdAt())
            .contains(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
        assertThat(itemTrackingListResponse.createdBy()).contains("some.user")
        assertThat(itemTrackingListResponse.dvCode()).contains("DV-4")
        assertThat(itemTrackingListResponse.idItem())
            .contains("36054487-bcba-6e2d-4f3b-9f25738b2639")
        assertThat(itemTrackingListResponse.keys().getOrNull())
            .containsExactly("tapeColor", "hazmat")
        assertThat(itemTrackingListResponse.lat()).contains(45.23)
        assertThat(itemTrackingListResponse.lon()).contains(179.1)
        assertThat(itemTrackingListResponse.notes()).contains("Example notes")
        assertThat(itemTrackingListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(itemTrackingListResponse.origNetwork()).contains("OPS1")
        assertThat(itemTrackingListResponse.scanType()).contains("TRANSIT")
        assertThat(itemTrackingListResponse.scGenTool()).contains("bID")
        assertThat(itemTrackingListResponse.sourceDl()).contains("AXE")
        assertThat(itemTrackingListResponse.type()).contains("CARGO")
        assertThat(itemTrackingListResponse.values().getOrNull()).containsExactly("yellow", "false")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemTrackingListResponse =
            ItemTrackingListResponse.builder()
                .classificationMarking("U")
                .dataMode(ItemTrackingListResponse.DataMode.TEST)
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

        val roundtrippedItemTrackingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemTrackingListResponse),
                jacksonTypeRef<ItemTrackingListResponse>(),
            )

        assertThat(roundtrippedItemTrackingListResponse).isEqualTo(itemTrackingListResponse)
    }
}
