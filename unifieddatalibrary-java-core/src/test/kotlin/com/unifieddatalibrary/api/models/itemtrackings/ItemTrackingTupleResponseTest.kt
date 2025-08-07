// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemTrackingTupleResponseTest {

    @Test
    fun create() {
        val itemTrackingTupleResponse =
            ItemTrackingTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(ItemTrackingTupleResponse.DataMode.TEST)
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

        assertThat(itemTrackingTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(itemTrackingTupleResponse.dataMode())
            .isEqualTo(ItemTrackingTupleResponse.DataMode.TEST)
        assertThat(itemTrackingTupleResponse.scanCode()).isEqualTo("ABC1234")
        assertThat(itemTrackingTupleResponse.scannerId()).isEqualTo("2051M")
        assertThat(itemTrackingTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(itemTrackingTupleResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
        assertThat(itemTrackingTupleResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(itemTrackingTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
        assertThat(itemTrackingTupleResponse.createdBy()).contains("some.user")
        assertThat(itemTrackingTupleResponse.dvCode()).contains("DV-4")
        assertThat(itemTrackingTupleResponse.idItem())
            .contains("36054487-bcba-6e2d-4f3b-9f25738b2639")
        assertThat(itemTrackingTupleResponse.keys().getOrNull())
            .containsExactly("tapeColor", "hazmat")
        assertThat(itemTrackingTupleResponse.lat()).contains(45.23)
        assertThat(itemTrackingTupleResponse.lon()).contains(179.1)
        assertThat(itemTrackingTupleResponse.notes()).contains("Example notes")
        assertThat(itemTrackingTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(itemTrackingTupleResponse.origNetwork()).contains("OPS1")
        assertThat(itemTrackingTupleResponse.scanType()).contains("TRANSIT")
        assertThat(itemTrackingTupleResponse.scGenTool()).contains("bID")
        assertThat(itemTrackingTupleResponse.sourceDl()).contains("AXE")
        assertThat(itemTrackingTupleResponse.type()).contains("CARGO")
        assertThat(itemTrackingTupleResponse.values().getOrNull())
            .containsExactly("yellow", "false")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemTrackingTupleResponse =
            ItemTrackingTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(ItemTrackingTupleResponse.DataMode.TEST)
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

        val roundtrippedItemTrackingTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemTrackingTupleResponse),
                jacksonTypeRef<ItemTrackingTupleResponse>(),
            )

        assertThat(roundtrippedItemTrackingTupleResponse).isEqualTo(itemTrackingTupleResponse)
    }
}
