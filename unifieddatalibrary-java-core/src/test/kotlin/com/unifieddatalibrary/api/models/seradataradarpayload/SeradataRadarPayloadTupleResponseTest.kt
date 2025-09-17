// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataradarpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataRadarPayloadTupleResponseTest {

    @Test
    fun create() {
        val seradataRadarPayloadTupleResponse =
            SeradataRadarPayloadTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataRadarPayloadTupleResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("12345")
                .id("SERADATARADARPAYLOAD-ID")
                .bandwidth(1.23)
                .bestResolution(1.23)
                .category("SAR")
                .constellationInterferometricCapability("constellationInterferometricCapability")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .dutyCycle("dutyCycle")
                .fieldOfRegard(1.23)
                .fieldOfView(1.23)
                .frequency(1.23)
                .frequencyBand("X")
                .groundStationLocations("51,42N-44,35E")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idSensor("3c1ee9a0-90ad-1d75-c47b-2414e0a77e53")
                .manufacturerOrgId("manufacturerOrgId")
                .name("ALT")
                .notes("Sample Notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .partnerSpacecraft("partnerSpacecraft")
                .pointingMethod("Spacecraft")
                .receivePolarization("Lin Dual")
                .recorderSize("256")
                .swathWidth(1.23)
                .transmitPolarization("Lin Dual")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .waveLength(1.23)
                .build()

        assertThat(seradataRadarPayloadTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(seradataRadarPayloadTupleResponse.dataMode())
            .isEqualTo(SeradataRadarPayloadTupleResponse.DataMode.TEST)
        assertThat(seradataRadarPayloadTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(seradataRadarPayloadTupleResponse.spacecraftId()).isEqualTo("12345")
        assertThat(seradataRadarPayloadTupleResponse.id()).contains("SERADATARADARPAYLOAD-ID")
        assertThat(seradataRadarPayloadTupleResponse.bandwidth()).contains(1.23)
        assertThat(seradataRadarPayloadTupleResponse.bestResolution()).contains(1.23)
        assertThat(seradataRadarPayloadTupleResponse.category()).contains("SAR")
        assertThat(seradataRadarPayloadTupleResponse.constellationInterferometricCapability())
            .contains("constellationInterferometricCapability")
        assertThat(seradataRadarPayloadTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataRadarPayloadTupleResponse.createdBy()).contains("some.user")
        assertThat(seradataRadarPayloadTupleResponse.dutyCycle()).contains("dutyCycle")
        assertThat(seradataRadarPayloadTupleResponse.fieldOfRegard()).contains(1.23)
        assertThat(seradataRadarPayloadTupleResponse.fieldOfView()).contains(1.23)
        assertThat(seradataRadarPayloadTupleResponse.frequency()).contains(1.23)
        assertThat(seradataRadarPayloadTupleResponse.frequencyBand()).contains("X")
        assertThat(seradataRadarPayloadTupleResponse.groundStationLocations())
            .contains("51,42N-44,35E")
        assertThat(seradataRadarPayloadTupleResponse.groundStations()).contains("groundStations")
        assertThat(seradataRadarPayloadTupleResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seradataRadarPayloadTupleResponse.idSensor())
            .contains("3c1ee9a0-90ad-1d75-c47b-2414e0a77e53")
        assertThat(seradataRadarPayloadTupleResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seradataRadarPayloadTupleResponse.name()).contains("ALT")
        assertThat(seradataRadarPayloadTupleResponse.notes()).contains("Sample Notes")
        assertThat(seradataRadarPayloadTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seradataRadarPayloadTupleResponse.origNetwork()).contains("OPS1")
        assertThat(seradataRadarPayloadTupleResponse.partnerSpacecraft())
            .contains("partnerSpacecraft")
        assertThat(seradataRadarPayloadTupleResponse.pointingMethod()).contains("Spacecraft")
        assertThat(seradataRadarPayloadTupleResponse.receivePolarization()).contains("Lin Dual")
        assertThat(seradataRadarPayloadTupleResponse.recorderSize()).contains("256")
        assertThat(seradataRadarPayloadTupleResponse.swathWidth()).contains(1.23)
        assertThat(seradataRadarPayloadTupleResponse.transmitPolarization()).contains("Lin Dual")
        assertThat(seradataRadarPayloadTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataRadarPayloadTupleResponse.updatedBy()).contains("some.user")
        assertThat(seradataRadarPayloadTupleResponse.waveLength()).contains(1.23)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seradataRadarPayloadTupleResponse =
            SeradataRadarPayloadTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataRadarPayloadTupleResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("12345")
                .id("SERADATARADARPAYLOAD-ID")
                .bandwidth(1.23)
                .bestResolution(1.23)
                .category("SAR")
                .constellationInterferometricCapability("constellationInterferometricCapability")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .dutyCycle("dutyCycle")
                .fieldOfRegard(1.23)
                .fieldOfView(1.23)
                .frequency(1.23)
                .frequencyBand("X")
                .groundStationLocations("51,42N-44,35E")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idSensor("3c1ee9a0-90ad-1d75-c47b-2414e0a77e53")
                .manufacturerOrgId("manufacturerOrgId")
                .name("ALT")
                .notes("Sample Notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .partnerSpacecraft("partnerSpacecraft")
                .pointingMethod("Spacecraft")
                .receivePolarization("Lin Dual")
                .recorderSize("256")
                .swathWidth(1.23)
                .transmitPolarization("Lin Dual")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .waveLength(1.23)
                .build()

        val roundtrippedSeradataRadarPayloadTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seradataRadarPayloadTupleResponse),
                jacksonTypeRef<SeradataRadarPayloadTupleResponse>(),
            )

        assertThat(roundtrippedSeradataRadarPayloadTupleResponse)
            .isEqualTo(seradataRadarPayloadTupleResponse)
    }
}
