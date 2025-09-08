// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataopticalpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataOpticalPayloadTupleResponseTest {

    @Test
    fun create() {
        val seradataOpticalPayloadTupleResponse =
            SeradataOpticalPayloadTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataOpticalPayloadTupleResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATAOPTICALPAYLOAD-ID")
                .bestResolution(1.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fieldOfRegard(1.23)
                .fieldOfView(1.23)
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idSensor("idSensor")
                .imagingPayloadCategory("Infrared")
                .manufacturerOrgId("manufacturerOrgId")
                .name("TOURNESOL")
                .notes("Sample Notes")
                .numberOfFilmReturnCanisters(1L)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .pointingMethod("Spacecraft")
                .recorderSize("1024")
                .spectralBand("Green")
                .spectralFrequencyLimits("0.51")
                .swathWidth(1.23)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(seradataOpticalPayloadTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(seradataOpticalPayloadTupleResponse.dataMode())
            .isEqualTo(SeradataOpticalPayloadTupleResponse.DataMode.TEST)
        assertThat(seradataOpticalPayloadTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(seradataOpticalPayloadTupleResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seradataOpticalPayloadTupleResponse.id()).contains("SERADATAOPTICALPAYLOAD-ID")
        assertThat(seradataOpticalPayloadTupleResponse.bestResolution()).contains(1.23)
        assertThat(seradataOpticalPayloadTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataOpticalPayloadTupleResponse.createdBy()).contains("some.user")
        assertThat(seradataOpticalPayloadTupleResponse.fieldOfRegard()).contains(1.23)
        assertThat(seradataOpticalPayloadTupleResponse.fieldOfView()).contains(1.23)
        assertThat(seradataOpticalPayloadTupleResponse.groundStationLocations())
            .contains("groundStationLocations")
        assertThat(seradataOpticalPayloadTupleResponse.groundStations()).contains("groundStations")
        assertThat(seradataOpticalPayloadTupleResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seradataOpticalPayloadTupleResponse.idSensor()).contains("idSensor")
        assertThat(seradataOpticalPayloadTupleResponse.imagingPayloadCategory())
            .contains("Infrared")
        assertThat(seradataOpticalPayloadTupleResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seradataOpticalPayloadTupleResponse.name()).contains("TOURNESOL")
        assertThat(seradataOpticalPayloadTupleResponse.notes()).contains("Sample Notes")
        assertThat(seradataOpticalPayloadTupleResponse.numberOfFilmReturnCanisters()).contains(1L)
        assertThat(seradataOpticalPayloadTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seradataOpticalPayloadTupleResponse.origNetwork()).contains("OPS1")
        assertThat(seradataOpticalPayloadTupleResponse.pointingMethod()).contains("Spacecraft")
        assertThat(seradataOpticalPayloadTupleResponse.recorderSize()).contains("1024")
        assertThat(seradataOpticalPayloadTupleResponse.spectralBand()).contains("Green")
        assertThat(seradataOpticalPayloadTupleResponse.spectralFrequencyLimits()).contains("0.51")
        assertThat(seradataOpticalPayloadTupleResponse.swathWidth()).contains(1.23)
        assertThat(seradataOpticalPayloadTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataOpticalPayloadTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seradataOpticalPayloadTupleResponse =
            SeradataOpticalPayloadTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataOpticalPayloadTupleResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATAOPTICALPAYLOAD-ID")
                .bestResolution(1.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fieldOfRegard(1.23)
                .fieldOfView(1.23)
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idSensor("idSensor")
                .imagingPayloadCategory("Infrared")
                .manufacturerOrgId("manufacturerOrgId")
                .name("TOURNESOL")
                .notes("Sample Notes")
                .numberOfFilmReturnCanisters(1L)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .pointingMethod("Spacecraft")
                .recorderSize("1024")
                .spectralBand("Green")
                .spectralFrequencyLimits("0.51")
                .swathWidth(1.23)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSeradataOpticalPayloadTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seradataOpticalPayloadTupleResponse),
                jacksonTypeRef<SeradataOpticalPayloadTupleResponse>(),
            )

        assertThat(roundtrippedSeradataOpticalPayloadTupleResponse)
            .isEqualTo(seradataOpticalPayloadTupleResponse)
    }
}
