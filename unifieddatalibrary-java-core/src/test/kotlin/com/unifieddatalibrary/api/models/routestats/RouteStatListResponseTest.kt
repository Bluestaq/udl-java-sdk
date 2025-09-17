// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.routestats

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteStatListResponseTest {

    @Test
    fun create() {
        val routeStatListResponse =
            RouteStatListResponse.builder()
                .classificationMarking("U")
                .dataMode(RouteStatListResponse.DataMode.TEST)
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

        assertThat(routeStatListResponse.classificationMarking()).isEqualTo("U")
        assertThat(routeStatListResponse.dataMode()).isEqualTo(RouteStatListResponse.DataMode.TEST)
        assertThat(routeStatListResponse.locationEnd()).isEqualTo("KCOS")
        assertThat(routeStatListResponse.locationStart()).isEqualTo("KDEN")
        assertThat(routeStatListResponse.source()).isEqualTo("Bluestaq")
        assertThat(routeStatListResponse.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(routeStatListResponse.avgDuration()).contains(47.1)
        assertThat(routeStatListResponse.avgSpeed()).contains(450.1)
        assertThat(routeStatListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(routeStatListResponse.createdBy()).contains("some.user")
        assertThat(routeStatListResponse.dataPtsUsed()).contains(6)
        assertThat(routeStatListResponse.distance()).contains(63.1)
        assertThat(routeStatListResponse.distUnit()).contains("Nautical miles")
        assertThat(routeStatListResponse.firstPt())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
        assertThat(routeStatListResponse.idealDesc())
            .contains("Block speed using great circle path")
        assertThat(routeStatListResponse.idealDuration()).contains(45.1)
        assertThat(routeStatListResponse.idSiteEnd())
            .contains("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
        assertThat(routeStatListResponse.idSiteStart())
            .contains("23370387-5e8e-4a74-89db-ad81145aa4df")
        assertThat(routeStatListResponse.lastPt())
            .contains(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
        assertThat(routeStatListResponse.locationType()).contains("ICAO")
        assertThat(routeStatListResponse.maxDuration()).contains(52.1)
        assertThat(routeStatListResponse.maxSpeed()).contains(470.1)
        assertThat(routeStatListResponse.minDuration()).contains(42.1)
        assertThat(routeStatListResponse.minSpeed()).contains(420.1)
        assertThat(routeStatListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(routeStatListResponse.origNetwork()).contains("OPS1")
        assertThat(routeStatListResponse.partialDesc())
            .contains("Performance speed using great circle path")
        assertThat(routeStatListResponse.partialDuration()).contains(38.1)
        assertThat(routeStatListResponse.sourceDl()).contains("AXE")
        assertThat(routeStatListResponse.speedUnit()).contains("knots")
        assertThat(routeStatListResponse.timePeriod()).contains("Q1")
        assertThat(routeStatListResponse.vehicleCategory()).contains("AIRCRAFT")
        assertThat(routeStatListResponse.vehicleType()).contains("C-17")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeStatListResponse =
            RouteStatListResponse.builder()
                .classificationMarking("U")
                .dataMode(RouteStatListResponse.DataMode.TEST)
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

        val roundtrippedRouteStatListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeStatListResponse),
                jacksonTypeRef<RouteStatListResponse>(),
            )

        assertThat(roundtrippedRouteStatListResponse).isEqualTo(routeStatListResponse)
    }
}
