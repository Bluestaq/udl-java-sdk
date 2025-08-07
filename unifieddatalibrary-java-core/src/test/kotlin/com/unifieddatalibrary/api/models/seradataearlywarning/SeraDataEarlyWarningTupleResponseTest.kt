// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataearlywarning

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataEarlyWarningTupleResponseTest {

    @Test
    fun create() {
        val seraDataEarlyWarningTupleResponse =
            SeraDataEarlyWarningTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningTupleResponse.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(seraDataEarlyWarningTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(seraDataEarlyWarningTupleResponse.dataMode())
            .isEqualTo(SeraDataEarlyWarningTupleResponse.DataMode.TEST)
        assertThat(seraDataEarlyWarningTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(seraDataEarlyWarningTupleResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seraDataEarlyWarningTupleResponse.id()).contains("SERADATAEARLYWARNING-ID")
        assertThat(seraDataEarlyWarningTupleResponse.bestResolution()).contains(1.23)
        assertThat(seraDataEarlyWarningTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seraDataEarlyWarningTupleResponse.createdBy()).contains("some.user")
        assertThat(seraDataEarlyWarningTupleResponse.earthPointing()).contains(true)
        assertThat(seraDataEarlyWarningTupleResponse.frequencyLimits()).contains("frequencyLimits")
        assertThat(seraDataEarlyWarningTupleResponse.groundStationLocations())
            .contains("groundStationLocations")
        assertThat(seraDataEarlyWarningTupleResponse.groundStations()).contains("groundStations")
        assertThat(seraDataEarlyWarningTupleResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seraDataEarlyWarningTupleResponse.idIr()).contains("idIR")
        assertThat(seraDataEarlyWarningTupleResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seraDataEarlyWarningTupleResponse.missileLaunchPhaseDetectionAbility())
            .contains("missileLaunchPhaseDetectionAbility")
        assertThat(seraDataEarlyWarningTupleResponse.name()).contains("Infra red telescope")
        assertThat(seraDataEarlyWarningTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seraDataEarlyWarningTupleResponse.origNetwork()).contains("ORIG")
        assertThat(seraDataEarlyWarningTupleResponse.partnerSpacecraftId())
            .contains("partnerSpacecraftId")
        assertThat(seraDataEarlyWarningTupleResponse.payloadNotes()).contains("Sample Notes")
        assertThat(seraDataEarlyWarningTupleResponse.spectralBands()).contains("Infra-Red")
        assertThat(seraDataEarlyWarningTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seraDataEarlyWarningTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seraDataEarlyWarningTupleResponse =
            SeraDataEarlyWarningTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningTupleResponse.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSeraDataEarlyWarningTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seraDataEarlyWarningTupleResponse),
                jacksonTypeRef<SeraDataEarlyWarningTupleResponse>(),
            )

        assertThat(roundtrippedSeraDataEarlyWarningTupleResponse)
            .isEqualTo(seraDataEarlyWarningTupleResponse)
    }
}
