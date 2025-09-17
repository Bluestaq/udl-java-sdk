// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataearlywarning

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataEarlyWarningUpdateParamsTest {

    @Test
    fun create() {
        SeraDataEarlyWarningUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(SeraDataEarlyWarningUpdateParams.DataMode.TEST)
            .source("Bluestaq")
            .spacecraftId("spacecraftId")
            .bodyId("SERADATAEARLYWARNING-ID")
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SeraDataEarlyWarningUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SeraDataEarlyWarningUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .bodyId("SERADATAEARLYWARNING-ID")
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
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SeraDataEarlyWarningUpdateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(body.bodyId()).contains("SERADATAEARLYWARNING-ID")
        assertThat(body.bestResolution()).contains(1.23)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.earthPointing()).contains(true)
        assertThat(body.frequencyLimits()).contains("frequencyLimits")
        assertThat(body.groundStationLocations()).contains("groundStationLocations")
        assertThat(body.groundStations()).contains("groundStations")
        assertThat(body.hostedForCompanyOrgId()).contains("hostedForCompanyOrgId")
        assertThat(body.idIr()).contains("idIR")
        assertThat(body.manufacturerOrgId()).contains("manufacturerOrgId")
        assertThat(body.missileLaunchPhaseDetectionAbility())
            .contains("missileLaunchPhaseDetectionAbility")
        assertThat(body.name()).contains("Infra red telescope")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.partnerSpacecraftId()).contains("partnerSpacecraftId")
        assertThat(body.payloadNotes()).contains("Sample Notes")
        assertThat(body.spectralBands()).contains("Infra-Red")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SeraDataEarlyWarningUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SeraDataEarlyWarningUpdateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.spacecraftId()).isEqualTo("spacecraftId")
    }
}
