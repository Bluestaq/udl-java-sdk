// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemTrackingCreateParamsTest {

    @Test
    fun create() {
        ItemTrackingCreateParams.builder()
            .classificationMarking("U")
            .dataMode(ItemTrackingCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            ItemTrackingCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ItemTrackingCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(ItemTrackingCreateParams.DataMode.TEST)
        assertThat(body.scanCode()).isEqualTo("ABC1234")
        assertThat(body.scannerId()).isEqualTo("2051M")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.ts()).isEqualTo(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
        assertThat(body.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.dvCode()).contains("DV-4")
        assertThat(body.idItem()).contains("36054487-bcba-6e2d-4f3b-9f25738b2639")
        assertThat(body.keys().getOrNull()).containsExactly("tapeColor", "hazmat")
        assertThat(body.lat()).contains(45.23)
        assertThat(body.lon()).contains(179.1)
        assertThat(body.notes()).contains("Example notes")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.scanType()).contains("TRANSIT")
        assertThat(body.scGenTool()).contains("bID")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.type()).contains("CARGO")
        assertThat(body.values().getOrNull()).containsExactly("yellow", "false")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ItemTrackingCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ItemTrackingCreateParams.DataMode.TEST)
                .scanCode("ABC1234")
                .scannerId("2051M")
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(ItemTrackingCreateParams.DataMode.TEST)
        assertThat(body.scanCode()).isEqualTo("ABC1234")
        assertThat(body.scannerId()).isEqualTo("2051M")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.ts()).isEqualTo(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
    }
}
