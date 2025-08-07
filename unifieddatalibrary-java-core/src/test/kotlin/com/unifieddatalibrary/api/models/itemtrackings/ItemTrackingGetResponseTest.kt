// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemTrackingGetResponseTest {

    @Test
    fun create() {
        val itemTrackingGetResponse =
            ItemTrackingGetResponse.builder()
                .classificationMarking("U")
                .dataMode(ItemTrackingGetResponse.DataMode.TEST)
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

        assertThat(itemTrackingGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(itemTrackingGetResponse.dataMode())
            .isEqualTo(ItemTrackingGetResponse.DataMode.TEST)
        assertThat(itemTrackingGetResponse.scanCode()).isEqualTo("ABC1234")
        assertThat(itemTrackingGetResponse.scannerId()).isEqualTo("2051M")
        assertThat(itemTrackingGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(itemTrackingGetResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
        assertThat(itemTrackingGetResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(itemTrackingGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
        assertThat(itemTrackingGetResponse.createdBy()).contains("some.user")
        assertThat(itemTrackingGetResponse.dvCode()).contains("DV-4")
        assertThat(itemTrackingGetResponse.idItem())
            .contains("36054487-bcba-6e2d-4f3b-9f25738b2639")
        assertThat(itemTrackingGetResponse.keys().getOrNull())
            .containsExactly("tapeColor", "hazmat")
        assertThat(itemTrackingGetResponse.lat()).contains(45.23)
        assertThat(itemTrackingGetResponse.lon()).contains(179.1)
        assertThat(itemTrackingGetResponse.notes()).contains("Example notes")
        assertThat(itemTrackingGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(itemTrackingGetResponse.origNetwork()).contains("OPS1")
        assertThat(itemTrackingGetResponse.scanType()).contains("TRANSIT")
        assertThat(itemTrackingGetResponse.scGenTool()).contains("bID")
        assertThat(itemTrackingGetResponse.sourceDl()).contains("AXE")
        assertThat(itemTrackingGetResponse.type()).contains("CARGO")
        assertThat(itemTrackingGetResponse.values().getOrNull()).containsExactly("yellow", "false")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemTrackingGetResponse =
            ItemTrackingGetResponse.builder()
                .classificationMarking("U")
                .dataMode(ItemTrackingGetResponse.DataMode.TEST)
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

        val roundtrippedItemTrackingGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemTrackingGetResponse),
                jacksonTypeRef<ItemTrackingGetResponse>(),
            )

        assertThat(roundtrippedItemTrackingGetResponse).isEqualTo(itemTrackingGetResponse)
    }
}
