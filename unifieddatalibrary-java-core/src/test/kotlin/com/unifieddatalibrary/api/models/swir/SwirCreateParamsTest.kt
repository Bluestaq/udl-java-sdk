// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.swir

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwirCreateParamsTest {

    @Test
    fun create() {
        SwirCreateParams.builder()
            .classificationMarking("U")
            .dataMode(SwirCreateParams.DataMode.TEST)
            .source("Bluestaq")
            .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
            .id("SWIR-ID")
            .addAbsFlux(1.23)
            .addAbsFlux(4.56)
            .badWave("Example Comments")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .addFluxRatio(1.23)
            .addFluxRatio(4.56)
            .idOnOrbit("45234")
            .lat(70.55208)
            .locationName("AeroTel")
            .lon(81.18191)
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .origObjectId("WildBlue-1")
            .addRatioWavelength(1.23)
            .addRatioWavelength(4.56)
            .satNo(25544)
            .solarPhaseAngle(1.23)
            .addWavelength(1.23)
            .addWavelength(4.56)
            .build()
    }

    @Test
    fun body() {
        val params =
            SwirCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SwirCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .id("SWIR-ID")
                .addAbsFlux(1.23)
                .addAbsFlux(4.56)
                .badWave("Example Comments")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .addFluxRatio(1.23)
                .addFluxRatio(4.56)
                .idOnOrbit("45234")
                .lat(70.55208)
                .locationName("AeroTel")
                .lon(81.18191)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origObjectId("WildBlue-1")
                .addRatioWavelength(1.23)
                .addRatioWavelength(4.56)
                .satNo(25544)
                .solarPhaseAngle(1.23)
                .addWavelength(1.23)
                .addWavelength(4.56)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SwirCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.ts()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(body.id()).contains("SWIR-ID")
        assertThat(body.absFluxes().getOrNull()).containsExactly(1.23, 4.56)
        assertThat(body.badWave()).contains("Example Comments")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.fluxRatios().getOrNull()).containsExactly(1.23, 4.56)
        assertThat(body.idOnOrbit()).contains("45234")
        assertThat(body.lat()).contains(70.55208)
        assertThat(body.locationName()).contains("AeroTel")
        assertThat(body.lon()).contains(81.18191)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.origObjectId()).contains("WildBlue-1")
        assertThat(body.ratioWavelengths().getOrNull()).containsExactly(1.23, 4.56)
        assertThat(body.satNo()).contains(25544)
        assertThat(body.solarPhaseAngle()).contains(1.23)
        assertThat(body.wavelengths().getOrNull()).containsExactly(1.23, 4.56)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SwirCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SwirCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SwirCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.ts()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
    }
}
