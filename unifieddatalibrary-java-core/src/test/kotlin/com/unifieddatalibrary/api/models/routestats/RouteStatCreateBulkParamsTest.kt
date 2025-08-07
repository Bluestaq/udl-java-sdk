// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.routestats

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteStatCreateBulkParamsTest {

    @Test
    fun create() {
        RouteStatCreateBulkParams.builder()
            .addBody(
                RouteStatCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(RouteStatCreateBulkParams.Body.DataMode.TEST)
                    .locationEnd("KCOS")
                    .locationStart("KDEN")
                    .source("Bluestaq")
                    .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .avgDuration(47.1)
                    .avgSpeed(450.1)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .dataPtsUsed(6)
                    .distance(63.1)
                    .distUnit("Nautical miles")
                    .firstPt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                    .idealDesc("Block speed using great circle path")
                    .idealDuration(45.1)
                    .idSiteEnd("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
                    .idSiteStart("23370387-5e8e-4a74-89db-ad81145aa4df")
                    .lastPt(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
                    .locationType("ICAO")
                    .maxDuration(52.1)
                    .maxSpeed(470.1)
                    .minDuration(42.1)
                    .minSpeed(420.1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .partialDesc("Performance speed using great circle path")
                    .partialDuration(38.1)
                    .sourceDl("AXE")
                    .speedUnit("knots")
                    .timePeriod("Q1")
                    .vehicleCategory("AIRCRAFT")
                    .vehicleType("C-17")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            RouteStatCreateBulkParams.builder()
                .addBody(
                    RouteStatCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(RouteStatCreateBulkParams.Body.DataMode.TEST)
                        .locationEnd("KCOS")
                        .locationStart("KDEN")
                        .source("Bluestaq")
                        .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                        .avgDuration(47.1)
                        .avgSpeed(450.1)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .dataPtsUsed(6)
                        .distance(63.1)
                        .distUnit("Nautical miles")
                        .firstPt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .idealDesc("Block speed using great circle path")
                        .idealDuration(45.1)
                        .idSiteEnd("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
                        .idSiteStart("23370387-5e8e-4a74-89db-ad81145aa4df")
                        .lastPt(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
                        .locationType("ICAO")
                        .maxDuration(52.1)
                        .maxSpeed(470.1)
                        .minDuration(42.1)
                        .minSpeed(420.1)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .partialDesc("Performance speed using great circle path")
                        .partialDuration(38.1)
                        .sourceDl("AXE")
                        .speedUnit("knots")
                        .timePeriod("Q1")
                        .vehicleCategory("AIRCRAFT")
                        .vehicleType("C-17")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                RouteStatCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(RouteStatCreateBulkParams.Body.DataMode.TEST)
                    .locationEnd("KCOS")
                    .locationStart("KDEN")
                    .source("Bluestaq")
                    .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .avgDuration(47.1)
                    .avgSpeed(450.1)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .dataPtsUsed(6)
                    .distance(63.1)
                    .distUnit("Nautical miles")
                    .firstPt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                    .idealDesc("Block speed using great circle path")
                    .idealDuration(45.1)
                    .idSiteEnd("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
                    .idSiteStart("23370387-5e8e-4a74-89db-ad81145aa4df")
                    .lastPt(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
                    .locationType("ICAO")
                    .maxDuration(52.1)
                    .maxSpeed(470.1)
                    .minDuration(42.1)
                    .minSpeed(420.1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .partialDesc("Performance speed using great circle path")
                    .partialDuration(38.1)
                    .sourceDl("AXE")
                    .speedUnit("knots")
                    .timePeriod("Q1")
                    .vehicleCategory("AIRCRAFT")
                    .vehicleType("C-17")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RouteStatCreateBulkParams.builder()
                .addBody(
                    RouteStatCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(RouteStatCreateBulkParams.Body.DataMode.TEST)
                        .locationEnd("KCOS")
                        .locationStart("KDEN")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                RouteStatCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(RouteStatCreateBulkParams.Body.DataMode.TEST)
                    .locationEnd("KCOS")
                    .locationStart("KDEN")
                    .source("Bluestaq")
                    .build()
            )
    }
}
