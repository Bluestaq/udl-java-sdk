// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataopticalpayload

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataOpticalPayloadCreateParamsTest {

    @Test
    fun create() {
        SeradataOpticalPayloadCreateParams.builder()
            .classificationMarking("U")
            .dataMode(SeradataOpticalPayloadCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            SeradataOpticalPayloadCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SeradataOpticalPayloadCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SeradataOpticalPayloadCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(body.id()).contains("SERADATAOPTICALPAYLOAD-ID")
        assertThat(body.bestResolution()).contains(1.23)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.fieldOfRegard()).contains(1.23)
        assertThat(body.fieldOfView()).contains(1.23)
        assertThat(body.groundStationLocations()).contains("groundStationLocations")
        assertThat(body.groundStations()).contains("groundStations")
        assertThat(body.hostedForCompanyOrgId()).contains("hostedForCompanyOrgId")
        assertThat(body.idSensor()).contains("idSensor")
        assertThat(body.imagingPayloadCategory()).contains("Infrared")
        assertThat(body.manufacturerOrgId()).contains("manufacturerOrgId")
        assertThat(body.name()).contains("TOURNESOL")
        assertThat(body.notes()).contains("Sample Notes")
        assertThat(body.numberOfFilmReturnCanisters()).contains(1L)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.pointingMethod()).contains("Spacecraft")
        assertThat(body.recorderSize()).contains("1024")
        assertThat(body.spectralBand()).contains("Green")
        assertThat(body.spectralFrequencyLimits()).contains("0.51")
        assertThat(body.swathWidth()).contains(1.23)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SeradataOpticalPayloadCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SeradataOpticalPayloadCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SeradataOpticalPayloadCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.spacecraftId()).isEqualTo("spacecraftId")
    }
}
