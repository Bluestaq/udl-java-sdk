// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatanavigation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataNavigationListResponseTest {

    @Test
    fun create() {
        val seraDataNavigationListResponse =
            SeraDataNavigationListResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataNavigationListResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATANAVIGATION-ID")
                .areaCoverage("Worldwide")
                .clockType("Rubidium")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idNavigation("idNavigation")
                .locationAccuracy(1.23)
                .manufacturerOrgId("manufacturerOrgId")
                .modeFrequency("1234")
                .modes("Military")
                .name("WAAS GEO-5")
                .notes("Sample Notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadType("WAAS")
                .build()

        assertThat(seraDataNavigationListResponse.classificationMarking()).isEqualTo("U")
        assertThat(seraDataNavigationListResponse.dataMode())
            .isEqualTo(SeraDataNavigationListResponse.DataMode.TEST)
        assertThat(seraDataNavigationListResponse.source()).isEqualTo("Bluestaq")
        assertThat(seraDataNavigationListResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seraDataNavigationListResponse.id()).contains("SERADATANAVIGATION-ID")
        assertThat(seraDataNavigationListResponse.areaCoverage()).contains("Worldwide")
        assertThat(seraDataNavigationListResponse.clockType()).contains("Rubidium")
        assertThat(seraDataNavigationListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seraDataNavigationListResponse.createdBy()).contains("some.user")
        assertThat(seraDataNavigationListResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seraDataNavigationListResponse.idNavigation()).contains("idNavigation")
        assertThat(seraDataNavigationListResponse.locationAccuracy()).contains(1.23)
        assertThat(seraDataNavigationListResponse.manufacturerOrgId()).contains("manufacturerOrgId")
        assertThat(seraDataNavigationListResponse.modeFrequency()).contains("1234")
        assertThat(seraDataNavigationListResponse.modes()).contains("Military")
        assertThat(seraDataNavigationListResponse.name()).contains("WAAS GEO-5")
        assertThat(seraDataNavigationListResponse.notes()).contains("Sample Notes")
        assertThat(seraDataNavigationListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seraDataNavigationListResponse.origNetwork()).contains("ORIG")
        assertThat(seraDataNavigationListResponse.partnerSpacecraftId())
            .contains("partnerSpacecraftId")
        assertThat(seraDataNavigationListResponse.payloadType()).contains("WAAS")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seraDataNavigationListResponse =
            SeraDataNavigationListResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataNavigationListResponse.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATANAVIGATION-ID")
                .areaCoverage("Worldwide")
                .clockType("Rubidium")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idNavigation("idNavigation")
                .locationAccuracy(1.23)
                .manufacturerOrgId("manufacturerOrgId")
                .modeFrequency("1234")
                .modes("Military")
                .name("WAAS GEO-5")
                .notes("Sample Notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadType("WAAS")
                .build()

        val roundtrippedSeraDataNavigationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seraDataNavigationListResponse),
                jacksonTypeRef<SeraDataNavigationListResponse>(),
            )

        assertThat(roundtrippedSeraDataNavigationListResponse)
            .isEqualTo(seraDataNavigationListResponse)
    }
}
