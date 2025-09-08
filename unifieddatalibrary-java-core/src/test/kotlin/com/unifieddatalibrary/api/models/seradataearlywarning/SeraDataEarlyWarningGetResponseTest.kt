// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataearlywarning

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataEarlyWarningGetResponseTest {

    @Test
    fun create() {
        val seraDataEarlyWarningGetResponse =
            SeraDataEarlyWarningGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningGetResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadNotes("Sample Notes")
                .spectralBands("Infra-Red")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(seraDataEarlyWarningGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(seraDataEarlyWarningGetResponse.dataMode())
            .isEqualTo(SeraDataEarlyWarningGetResponse.DataMode.TEST)
        assertThat(seraDataEarlyWarningGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(seraDataEarlyWarningGetResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seraDataEarlyWarningGetResponse.id()).contains("SERADATAEARLYWARNING-ID")
        assertThat(seraDataEarlyWarningGetResponse.bestResolution()).contains(1.23)
        assertThat(seraDataEarlyWarningGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seraDataEarlyWarningGetResponse.createdBy()).contains("some.user")
        assertThat(seraDataEarlyWarningGetResponse.earthPointing()).contains(true)
        assertThat(seraDataEarlyWarningGetResponse.frequencyLimits()).contains("frequencyLimits")
        assertThat(seraDataEarlyWarningGetResponse.groundStationLocations())
            .contains("groundStationLocations")
        assertThat(seraDataEarlyWarningGetResponse.groundStations()).contains("groundStations")
        assertThat(seraDataEarlyWarningGetResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seraDataEarlyWarningGetResponse.idIr()).contains("idIR")
        assertThat(seraDataEarlyWarningGetResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seraDataEarlyWarningGetResponse.missileLaunchPhaseDetectionAbility())
            .contains("missileLaunchPhaseDetectionAbility")
        assertThat(seraDataEarlyWarningGetResponse.name()).contains("Infra red telescope")
        assertThat(seraDataEarlyWarningGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seraDataEarlyWarningGetResponse.origNetwork()).contains("OPS1")
        assertThat(seraDataEarlyWarningGetResponse.partnerSpacecraftId())
            .contains("partnerSpacecraftId")
        assertThat(seraDataEarlyWarningGetResponse.payloadNotes()).contains("Sample Notes")
        assertThat(seraDataEarlyWarningGetResponse.spectralBands()).contains("Infra-Red")
        assertThat(seraDataEarlyWarningGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seraDataEarlyWarningGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seraDataEarlyWarningGetResponse =
            SeraDataEarlyWarningGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningGetResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadNotes("Sample Notes")
                .spectralBands("Infra-Red")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSeraDataEarlyWarningGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seraDataEarlyWarningGetResponse),
                jacksonTypeRef<SeraDataEarlyWarningGetResponse>(),
            )

        assertThat(roundtrippedSeraDataEarlyWarningGetResponse)
            .isEqualTo(seraDataEarlyWarningGetResponse)
    }
}
