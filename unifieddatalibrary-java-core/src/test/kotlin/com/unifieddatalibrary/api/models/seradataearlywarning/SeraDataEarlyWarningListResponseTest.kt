// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataearlywarning

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataEarlyWarningListResponseTest {

    @Test
    fun create() {
        val seraDataEarlyWarningListResponse =
            SeraDataEarlyWarningListResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningListResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATAEARLYWARNING-ID")
                .bestResolution(1.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .earthPointing(true)
                .frequencyLimits("frequencyLimits")
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idIr("idIR")
                .manufacturerOrgId("manufacturerOrgId")
                .missileLaunchPhaseDetectionAbility("missileLaunchPhaseDetectionAbility")
                .name("Infra red telescope")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadNotes("Sample Notes")
                .spectralBands("Infra-Red")
                .build()

        assertThat(seraDataEarlyWarningListResponse.classificationMarking()).isEqualTo("U")
        assertThat(seraDataEarlyWarningListResponse.dataMode())
            .isEqualTo(SeraDataEarlyWarningListResponse.DataMode.TEST)
        assertThat(seraDataEarlyWarningListResponse.source()).isEqualTo("Bluestaq")
        assertThat(seraDataEarlyWarningListResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seraDataEarlyWarningListResponse.id()).contains("SERADATAEARLYWARNING-ID")
        assertThat(seraDataEarlyWarningListResponse.bestResolution()).contains(1.23)
        assertThat(seraDataEarlyWarningListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seraDataEarlyWarningListResponse.createdBy()).contains("some.user")
        assertThat(seraDataEarlyWarningListResponse.earthPointing()).contains(true)
        assertThat(seraDataEarlyWarningListResponse.frequencyLimits()).contains("frequencyLimits")
        assertThat(seraDataEarlyWarningListResponse.groundStationLocations())
            .contains("groundStationLocations")
        assertThat(seraDataEarlyWarningListResponse.groundStations()).contains("groundStations")
        assertThat(seraDataEarlyWarningListResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seraDataEarlyWarningListResponse.idIr()).contains("idIR")
        assertThat(seraDataEarlyWarningListResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seraDataEarlyWarningListResponse.missileLaunchPhaseDetectionAbility())
            .contains("missileLaunchPhaseDetectionAbility")
        assertThat(seraDataEarlyWarningListResponse.name()).contains("Infra red telescope")
        assertThat(seraDataEarlyWarningListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seraDataEarlyWarningListResponse.origNetwork()).contains("ORIG")
        assertThat(seraDataEarlyWarningListResponse.partnerSpacecraftId())
            .contains("partnerSpacecraftId")
        assertThat(seraDataEarlyWarningListResponse.payloadNotes()).contains("Sample Notes")
        assertThat(seraDataEarlyWarningListResponse.spectralBands()).contains("Infra-Red")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seraDataEarlyWarningListResponse =
            SeraDataEarlyWarningListResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningListResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATAEARLYWARNING-ID")
                .bestResolution(1.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .earthPointing(true)
                .frequencyLimits("frequencyLimits")
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idIr("idIR")
                .manufacturerOrgId("manufacturerOrgId")
                .missileLaunchPhaseDetectionAbility("missileLaunchPhaseDetectionAbility")
                .name("Infra red telescope")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadNotes("Sample Notes")
                .spectralBands("Infra-Red")
                .build()

        val roundtrippedSeraDataEarlyWarningListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seraDataEarlyWarningListResponse),
                jacksonTypeRef<SeraDataEarlyWarningListResponse>(),
            )

        assertThat(roundtrippedSeraDataEarlyWarningListResponse)
            .isEqualTo(seraDataEarlyWarningListResponse)
    }
}
