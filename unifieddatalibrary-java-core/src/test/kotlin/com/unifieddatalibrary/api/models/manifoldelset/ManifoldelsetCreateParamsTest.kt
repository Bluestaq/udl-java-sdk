// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifoldelset

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldelsetCreateParamsTest {

    @Test
    fun create() {
        ManifoldelsetCreateParams.builder()
            .classificationMarking("U")
            .dataMode(ManifoldelsetCreateParams.DataMode.TEST)
            .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
            .idManifold("REF-MANIFOLD-ID")
            .source("Bluestaq")
            .tmpSatNo(10)
            .id("MANIFOLDELSET-ID")
            .apogee(10.23)
            .argOfPerigee(10.23)
            .bStar(10.23)
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .eccentricity(0.5)
            .inclination(90.23)
            .line1("line1")
            .line2("line2")
            .meanAnomaly(10.23)
            .meanMotion(10.23)
            .meanMotionDDot(10.23)
            .meanMotionDot(10.23)
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .perigee(10.23)
            .period(10.23)
            .raan(10.23)
            .revNo(123)
            .semiMajorAxis(10.23)
            .build()
    }

    @Test
    fun body() {
        val params =
            ManifoldelsetCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ManifoldelsetCreateParams.DataMode.TEST)
                .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .idManifold("REF-MANIFOLD-ID")
                .source("Bluestaq")
                .tmpSatNo(10)
                .id("MANIFOLDELSET-ID")
                .apogee(10.23)
                .argOfPerigee(10.23)
                .bStar(10.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .eccentricity(0.5)
                .inclination(90.23)
                .line1("line1")
                .line2("line2")
                .meanAnomaly(10.23)
                .meanMotion(10.23)
                .meanMotionDDot(10.23)
                .meanMotionDot(10.23)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .perigee(10.23)
                .period(10.23)
                .raan(10.23)
                .revNo(123)
                .semiMajorAxis(10.23)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(ManifoldelsetCreateParams.DataMode.TEST)
        assertThat(body.epoch()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(body.idManifold()).isEqualTo("REF-MANIFOLD-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.tmpSatNo()).isEqualTo(10)
        assertThat(body.id()).contains("MANIFOLDELSET-ID")
        assertThat(body.apogee()).contains(10.23)
        assertThat(body.argOfPerigee()).contains(10.23)
        assertThat(body.bStar()).contains(10.23)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.eccentricity()).contains(0.5)
        assertThat(body.inclination()).contains(90.23)
        assertThat(body.line1()).contains("line1")
        assertThat(body.line2()).contains("line2")
        assertThat(body.meanAnomaly()).contains(10.23)
        assertThat(body.meanMotion()).contains(10.23)
        assertThat(body.meanMotionDDot()).contains(10.23)
        assertThat(body.meanMotionDot()).contains(10.23)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.perigee()).contains(10.23)
        assertThat(body.period()).contains(10.23)
        assertThat(body.raan()).contains(10.23)
        assertThat(body.revNo()).contains(123)
        assertThat(body.semiMajorAxis()).contains(10.23)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ManifoldelsetCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ManifoldelsetCreateParams.DataMode.TEST)
                .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .idManifold("REF-MANIFOLD-ID")
                .source("Bluestaq")
                .tmpSatNo(10)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(ManifoldelsetCreateParams.DataMode.TEST)
        assertThat(body.epoch()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(body.idManifold()).isEqualTo("REF-MANIFOLD-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.tmpSatNo()).isEqualTo(10)
    }
}
