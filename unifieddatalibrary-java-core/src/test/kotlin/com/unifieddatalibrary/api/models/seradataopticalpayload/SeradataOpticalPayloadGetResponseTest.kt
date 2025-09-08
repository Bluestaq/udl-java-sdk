// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataopticalpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataOpticalPayloadGetResponseTest {

    @Test
    fun create() {
        val seradataOpticalPayloadGetResponse =
            SeradataOpticalPayloadGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataOpticalPayloadGetResponse.DataMode.TEST)
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

        assertThat(seradataOpticalPayloadGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(seradataOpticalPayloadGetResponse.dataMode())
            .isEqualTo(SeradataOpticalPayloadGetResponse.DataMode.TEST)
        assertThat(seradataOpticalPayloadGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(seradataOpticalPayloadGetResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seradataOpticalPayloadGetResponse.id()).contains("SERADATAOPTICALPAYLOAD-ID")
        assertThat(seradataOpticalPayloadGetResponse.bestResolution()).contains(1.23)
        assertThat(seradataOpticalPayloadGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataOpticalPayloadGetResponse.createdBy()).contains("some.user")
        assertThat(seradataOpticalPayloadGetResponse.fieldOfRegard()).contains(1.23)
        assertThat(seradataOpticalPayloadGetResponse.fieldOfView()).contains(1.23)
        assertThat(seradataOpticalPayloadGetResponse.groundStationLocations())
            .contains("groundStationLocations")
        assertThat(seradataOpticalPayloadGetResponse.groundStations()).contains("groundStations")
        assertThat(seradataOpticalPayloadGetResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seradataOpticalPayloadGetResponse.idSensor()).contains("idSensor")
        assertThat(seradataOpticalPayloadGetResponse.imagingPayloadCategory()).contains("Infrared")
        assertThat(seradataOpticalPayloadGetResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seradataOpticalPayloadGetResponse.name()).contains("TOURNESOL")
        assertThat(seradataOpticalPayloadGetResponse.notes()).contains("Sample Notes")
        assertThat(seradataOpticalPayloadGetResponse.numberOfFilmReturnCanisters()).contains(1L)
        assertThat(seradataOpticalPayloadGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seradataOpticalPayloadGetResponse.origNetwork()).contains("OPS1")
        assertThat(seradataOpticalPayloadGetResponse.pointingMethod()).contains("Spacecraft")
        assertThat(seradataOpticalPayloadGetResponse.recorderSize()).contains("1024")
        assertThat(seradataOpticalPayloadGetResponse.spectralBand()).contains("Green")
        assertThat(seradataOpticalPayloadGetResponse.spectralFrequencyLimits()).contains("0.51")
        assertThat(seradataOpticalPayloadGetResponse.swathWidth()).contains(1.23)
        assertThat(seradataOpticalPayloadGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataOpticalPayloadGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seradataOpticalPayloadGetResponse =
            SeradataOpticalPayloadGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataOpticalPayloadGetResponse.DataMode.TEST)
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

        val roundtrippedSeradataOpticalPayloadGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seradataOpticalPayloadGetResponse),
                jacksonTypeRef<SeradataOpticalPayloadGetResponse>(),
            )

        assertThat(roundtrippedSeradataOpticalPayloadGetResponse)
            .isEqualTo(seradataOpticalPayloadGetResponse)
    }
}
