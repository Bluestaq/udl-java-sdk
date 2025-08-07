// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.routestats

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteStatQueryResponseTest {

    @Test
    fun create() {
        val routeStatQueryResponse =
            RouteStatQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(RouteStatQueryResponse.DataMode.TEST)
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

        assertThat(routeStatQueryResponse.classificationMarking()).isEqualTo("U")
        assertThat(routeStatQueryResponse.dataMode())
            .isEqualTo(RouteStatQueryResponse.DataMode.TEST)
        assertThat(routeStatQueryResponse.locationEnd()).isEqualTo("KCOS")
        assertThat(routeStatQueryResponse.locationStart()).isEqualTo("KDEN")
        assertThat(routeStatQueryResponse.source()).isEqualTo("Bluestaq")
        assertThat(routeStatQueryResponse.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(routeStatQueryResponse.avgDuration()).contains(47.1)
        assertThat(routeStatQueryResponse.avgSpeed()).contains(450.1)
        assertThat(routeStatQueryResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(routeStatQueryResponse.createdBy()).contains("some.user")
        assertThat(routeStatQueryResponse.dataPtsUsed()).contains(6)
        assertThat(routeStatQueryResponse.distance()).contains(63.1)
        assertThat(routeStatQueryResponse.distUnit()).contains("Nautical miles")
        assertThat(routeStatQueryResponse.firstPt())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
        assertThat(routeStatQueryResponse.idealDesc())
            .contains("Block speed using great circle path")
        assertThat(routeStatQueryResponse.idealDuration()).contains(45.1)
        assertThat(routeStatQueryResponse.idSiteEnd())
            .contains("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
        assertThat(routeStatQueryResponse.idSiteStart())
            .contains("23370387-5e8e-4a74-89db-ad81145aa4df")
        assertThat(routeStatQueryResponse.lastPt())
            .contains(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
        assertThat(routeStatQueryResponse.locationType()).contains("ICAO")
        assertThat(routeStatQueryResponse.maxDuration()).contains(52.1)
        assertThat(routeStatQueryResponse.maxSpeed()).contains(470.1)
        assertThat(routeStatQueryResponse.minDuration()).contains(42.1)
        assertThat(routeStatQueryResponse.minSpeed()).contains(420.1)
        assertThat(routeStatQueryResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(routeStatQueryResponse.origNetwork()).contains("OPS1")
        assertThat(routeStatQueryResponse.partialDesc())
            .contains("Performance speed using great circle path")
        assertThat(routeStatQueryResponse.partialDuration()).contains(38.1)
        assertThat(routeStatQueryResponse.sourceDl()).contains("AXE")
        assertThat(routeStatQueryResponse.speedUnit()).contains("knots")
        assertThat(routeStatQueryResponse.timePeriod()).contains("Q1")
        assertThat(routeStatQueryResponse.vehicleCategory()).contains("AIRCRAFT")
        assertThat(routeStatQueryResponse.vehicleType()).contains("C-17")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeStatQueryResponse =
            RouteStatQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(RouteStatQueryResponse.DataMode.TEST)
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

        val roundtrippedRouteStatQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeStatQueryResponse),
                jacksonTypeRef<RouteStatQueryResponse>(),
            )

        assertThat(roundtrippedRouteStatQueryResponse).isEqualTo(routeStatQueryResponse)
    }
}
