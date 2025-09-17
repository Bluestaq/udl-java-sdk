// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laseremitter

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaseremitterListResponseTest {

    @Test
    fun create() {
        val laseremitterListResponse =
            LaseremitterListResponse.builder()
                .classificationMarking("U")
                .dataMode(LaseremitterListResponse.DataMode.TEST)
                .laserName("HEL")
                .laserType("PULSED")
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .atmosphericTransmission(1.0)
                .beamOutputPower(100.5)
                .beamWaist(14.4)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .divergence(2.5)
                .idEntity("ENTITY-ID")
                .isOperational(true)
                .maxDuration(1.5)
                .maxFocusRange(30000.5)
                .minFocusRange(2500.5)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .pulseFluence(1000005.5)
                .pulsePeakPower(640.25)
                .pulseRepFreq(2225.5)
                .pulseShape("RECTANGULAR")
                .pulseWidth(0.25)
                .sourceDl("AXE")
                .wavelength(0.11)
                .build()

        assertThat(laseremitterListResponse.classificationMarking()).isEqualTo("U")
        assertThat(laseremitterListResponse.dataMode())
            .isEqualTo(LaseremitterListResponse.DataMode.TEST)
        assertThat(laseremitterListResponse.laserName()).isEqualTo("HEL")
        assertThat(laseremitterListResponse.laserType()).isEqualTo("PULSED")
        assertThat(laseremitterListResponse.source()).isEqualTo("Bluestaq")
        assertThat(laseremitterListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(laseremitterListResponse.atmosphericTransmission()).contains(1.0)
        assertThat(laseremitterListResponse.beamOutputPower()).contains(100.5)
        assertThat(laseremitterListResponse.beamWaist()).contains(14.4)
        assertThat(laseremitterListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(laseremitterListResponse.createdBy()).contains("some.user")
        assertThat(laseremitterListResponse.divergence()).contains(2.5)
        assertThat(laseremitterListResponse.idEntity()).contains("ENTITY-ID")
        assertThat(laseremitterListResponse.isOperational()).contains(true)
        assertThat(laseremitterListResponse.maxDuration()).contains(1.5)
        assertThat(laseremitterListResponse.maxFocusRange()).contains(30000.5)
        assertThat(laseremitterListResponse.minFocusRange()).contains(2500.5)
        assertThat(laseremitterListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(laseremitterListResponse.origNetwork()).contains("OPS1")
        assertThat(laseremitterListResponse.pulseFluence()).contains(1000005.5)
        assertThat(laseremitterListResponse.pulsePeakPower()).contains(640.25)
        assertThat(laseremitterListResponse.pulseRepFreq()).contains(2225.5)
        assertThat(laseremitterListResponse.pulseShape()).contains("RECTANGULAR")
        assertThat(laseremitterListResponse.pulseWidth()).contains(0.25)
        assertThat(laseremitterListResponse.sourceDl()).contains("AXE")
        assertThat(laseremitterListResponse.wavelength()).contains(0.11)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val laseremitterListResponse =
            LaseremitterListResponse.builder()
                .classificationMarking("U")
                .dataMode(LaseremitterListResponse.DataMode.TEST)
                .laserName("HEL")
                .laserType("PULSED")
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .atmosphericTransmission(1.0)
                .beamOutputPower(100.5)
                .beamWaist(14.4)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .divergence(2.5)
                .idEntity("ENTITY-ID")
                .isOperational(true)
                .maxDuration(1.5)
                .maxFocusRange(30000.5)
                .minFocusRange(2500.5)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .pulseFluence(1000005.5)
                .pulsePeakPower(640.25)
                .pulseRepFreq(2225.5)
                .pulseShape("RECTANGULAR")
                .pulseWidth(0.25)
                .sourceDl("AXE")
                .wavelength(0.11)
                .build()

        val roundtrippedLaseremitterListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(laseremitterListResponse),
                jacksonTypeRef<LaseremitterListResponse>(),
            )

        assertThat(roundtrippedLaseremitterListResponse).isEqualTo(laseremitterListResponse)
    }
}
