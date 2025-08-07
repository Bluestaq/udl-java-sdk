// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.routestats

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteStatUpdateParamsTest {

    @Test
    fun create() {
        RouteStatUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(RouteStatUpdateParams.DataMode.TEST)
            .locationEnd("KCOS")
            .locationStart("KDEN")
            .source("Bluestaq")
            .bodyId("0167f577-e06c-358e-85aa-0a07a730bdd0")
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
    }

    @Test
    fun pathParams() {
        val params =
            RouteStatUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RouteStatUpdateParams.DataMode.TEST)
                .locationEnd("KCOS")
                .locationStart("KDEN")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RouteStatUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RouteStatUpdateParams.DataMode.TEST)
                .locationEnd("KCOS")
                .locationStart("KDEN")
                .source("Bluestaq")
                .bodyId("0167f577-e06c-358e-85aa-0a07a730bdd0")
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RouteStatUpdateParams.DataMode.TEST)
        assertThat(body.locationEnd()).isEqualTo("KCOS")
        assertThat(body.locationStart()).isEqualTo("KDEN")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(body.avgDuration()).contains(47.1)
        assertThat(body.avgSpeed()).contains(450.1)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.dataPtsUsed()).contains(6)
        assertThat(body.distance()).contains(63.1)
        assertThat(body.distUnit()).contains("Nautical miles")
        assertThat(body.firstPt()).contains(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
        assertThat(body.idealDesc()).contains("Block speed using great circle path")
        assertThat(body.idealDuration()).contains(45.1)
        assertThat(body.idSiteEnd()).contains("77b5550c-c0f4-47bd-94ce-d71cdaa52f62")
        assertThat(body.idSiteStart()).contains("23370387-5e8e-4a74-89db-ad81145aa4df")
        assertThat(body.lastPt()).contains(OffsetDateTime.parse("2024-03-31T16:00:00.123Z"))
        assertThat(body.locationType()).contains("ICAO")
        assertThat(body.maxDuration()).contains(52.1)
        assertThat(body.maxSpeed()).contains(470.1)
        assertThat(body.minDuration()).contains(42.1)
        assertThat(body.minSpeed()).contains(420.1)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.partialDesc()).contains("Performance speed using great circle path")
        assertThat(body.partialDuration()).contains(38.1)
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.speedUnit()).contains("knots")
        assertThat(body.timePeriod()).contains("Q1")
        assertThat(body.vehicleCategory()).contains("AIRCRAFT")
        assertThat(body.vehicleType()).contains("C-17")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RouteStatUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RouteStatUpdateParams.DataMode.TEST)
                .locationEnd("KCOS")
                .locationStart("KDEN")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RouteStatUpdateParams.DataMode.TEST)
        assertThat(body.locationEnd()).isEqualTo("KCOS")
        assertThat(body.locationStart()).isEqualTo("KDEN")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
