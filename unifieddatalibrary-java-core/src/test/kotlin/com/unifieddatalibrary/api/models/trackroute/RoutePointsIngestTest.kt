// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutePointsIngestTest {

    @Test
    fun create() {
        val routePointsIngest =
            RoutePointsIngest.builder()
                .altCountryCode("IZ")
                .countryCode("NL")
                .dafifPt(true)
                .magDec(7.35)
                .navaid("HTO")
                .navaidLength(100.2)
                .navaidType("VORTAC")
                .ptLat(45.23)
                .ptLon(179.1)
                .ptSequenceId(1)
                .ptTypeCode("EP")
                .ptTypeName("ENTRY POINT")
                .waypointName("KCHS")
                .build()

        assertThat(routePointsIngest.altCountryCode()).contains("IZ")
        assertThat(routePointsIngest.countryCode()).contains("NL")
        assertThat(routePointsIngest.dafifPt()).contains(true)
        assertThat(routePointsIngest.magDec()).contains(7.35)
        assertThat(routePointsIngest.navaid()).contains("HTO")
        assertThat(routePointsIngest.navaidLength()).contains(100.2)
        assertThat(routePointsIngest.navaidType()).contains("VORTAC")
        assertThat(routePointsIngest.ptLat()).contains(45.23)
        assertThat(routePointsIngest.ptLon()).contains(179.1)
        assertThat(routePointsIngest.ptSequenceId()).contains(1)
        assertThat(routePointsIngest.ptTypeCode()).contains("EP")
        assertThat(routePointsIngest.ptTypeName()).contains("ENTRY POINT")
        assertThat(routePointsIngest.waypointName()).contains("KCHS")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routePointsIngest =
            RoutePointsIngest.builder()
                .altCountryCode("IZ")
                .countryCode("NL")
                .dafifPt(true)
                .magDec(7.35)
                .navaid("HTO")
                .navaidLength(100.2)
                .navaidType("VORTAC")
                .ptLat(45.23)
                .ptLon(179.1)
                .ptSequenceId(1)
                .ptTypeCode("EP")
                .ptTypeName("ENTRY POINT")
                .waypointName("KCHS")
                .build()

        val roundtrippedRoutePointsIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routePointsIngest),
                jacksonTypeRef<RoutePointsIngest>(),
            )

        assertThat(roundtrippedRoutePointsIngest).isEqualTo(routePointsIngest)
    }
}
