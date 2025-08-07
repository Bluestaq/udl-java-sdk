// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemTrackingUnvalidatedPublishParamsTest {

    @Test
    fun create() {
        ItemTrackingUnvalidatedPublishParams.builder()
            .addBody(
                ItemTrackingUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(ItemTrackingUnvalidatedPublishParams.Body.DataMode.TEST)
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ItemTrackingUnvalidatedPublishParams.builder()
                .addBody(
                    ItemTrackingUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(ItemTrackingUnvalidatedPublishParams.Body.DataMode.TEST)
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                ItemTrackingUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(ItemTrackingUnvalidatedPublishParams.Body.DataMode.TEST)
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ItemTrackingUnvalidatedPublishParams.builder()
                .addBody(
                    ItemTrackingUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(ItemTrackingUnvalidatedPublishParams.Body.DataMode.TEST)
                        .scanCode("ABC1234")
                        .scannerId("2051M")
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                ItemTrackingUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(ItemTrackingUnvalidatedPublishParams.Body.DataMode.TEST)
                    .scanCode("ABC1234")
                    .scannerId("2051M")
                    .source("Bluestaq")
                    .ts(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
                    .build()
            )
    }
}
