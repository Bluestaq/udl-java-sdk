// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataopticalpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataOpticalPayloadListResponseTest {

    @Test
    fun create() {
        val seradataOpticalPayloadListResponse =
            SeradataOpticalPayloadListResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataOpticalPayloadListResponse.DataMode.TEST)
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
                .origNetwork("ORIG")
                .pointingMethod("Spacecraft")
                .recorderSize("1024")
                .spectralBand("Green")
                .spectralFrequencyLimits("0.51")
                .swathWidth(1.23)
                .build()

        assertThat(seradataOpticalPayloadListResponse.classificationMarking()).isEqualTo("U")
        assertThat(seradataOpticalPayloadListResponse.dataMode())
            .isEqualTo(SeradataOpticalPayloadListResponse.DataMode.TEST)
        assertThat(seradataOpticalPayloadListResponse.source()).isEqualTo("Bluestaq")
        assertThat(seradataOpticalPayloadListResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seradataOpticalPayloadListResponse.id()).contains("SERADATAOPTICALPAYLOAD-ID")
        assertThat(seradataOpticalPayloadListResponse.bestResolution()).contains(1.23)
        assertThat(seradataOpticalPayloadListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seradataOpticalPayloadListResponse.createdBy()).contains("some.user")
        assertThat(seradataOpticalPayloadListResponse.fieldOfRegard()).contains(1.23)
        assertThat(seradataOpticalPayloadListResponse.fieldOfView()).contains(1.23)
        assertThat(seradataOpticalPayloadListResponse.groundStationLocations())
            .contains("groundStationLocations")
        assertThat(seradataOpticalPayloadListResponse.groundStations()).contains("groundStations")
        assertThat(seradataOpticalPayloadListResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seradataOpticalPayloadListResponse.idSensor()).contains("idSensor")
        assertThat(seradataOpticalPayloadListResponse.imagingPayloadCategory()).contains("Infrared")
        assertThat(seradataOpticalPayloadListResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seradataOpticalPayloadListResponse.name()).contains("TOURNESOL")
        assertThat(seradataOpticalPayloadListResponse.notes()).contains("Sample Notes")
        assertThat(seradataOpticalPayloadListResponse.numberOfFilmReturnCanisters()).contains(1L)
        assertThat(seradataOpticalPayloadListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seradataOpticalPayloadListResponse.origNetwork()).contains("ORIG")
        assertThat(seradataOpticalPayloadListResponse.pointingMethod()).contains("Spacecraft")
        assertThat(seradataOpticalPayloadListResponse.recorderSize()).contains("1024")
        assertThat(seradataOpticalPayloadListResponse.spectralBand()).contains("Green")
        assertThat(seradataOpticalPayloadListResponse.spectralFrequencyLimits()).contains("0.51")
        assertThat(seradataOpticalPayloadListResponse.swathWidth()).contains(1.23)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seradataOpticalPayloadListResponse =
            SeradataOpticalPayloadListResponse.builder()
                .classificationMarking("U")
                .dataMode(SeradataOpticalPayloadListResponse.DataMode.TEST)
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
                .origNetwork("ORIG")
                .pointingMethod("Spacecraft")
                .recorderSize("1024")
                .spectralBand("Green")
                .spectralFrequencyLimits("0.51")
                .swathWidth(1.23)
                .build()

        val roundtrippedSeradataOpticalPayloadListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seradataOpticalPayloadListResponse),
                jacksonTypeRef<SeradataOpticalPayloadListResponse>(),
            )

        assertThat(roundtrippedSeradataOpticalPayloadListResponse)
            .isEqualTo(seradataOpticalPayloadListResponse)
    }
}
