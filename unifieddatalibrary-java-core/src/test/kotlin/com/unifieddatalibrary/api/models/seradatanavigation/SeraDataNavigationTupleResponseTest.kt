// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatanavigation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataNavigationTupleResponseTest {

    @Test
    fun create() {
        val seraDataNavigationTupleResponse =
            SeraDataNavigationTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataNavigationTupleResponse.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(seraDataNavigationTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(seraDataNavigationTupleResponse.dataMode())
            .isEqualTo(SeraDataNavigationTupleResponse.DataMode.TEST)
        assertThat(seraDataNavigationTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(seraDataNavigationTupleResponse.spacecraftId()).isEqualTo("spacecraftId")
        assertThat(seraDataNavigationTupleResponse.id()).contains("SERADATANAVIGATION-ID")
        assertThat(seraDataNavigationTupleResponse.areaCoverage()).contains("Worldwide")
        assertThat(seraDataNavigationTupleResponse.clockType()).contains("Rubidium")
        assertThat(seraDataNavigationTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seraDataNavigationTupleResponse.createdBy()).contains("some.user")
        assertThat(seraDataNavigationTupleResponse.hostedForCompanyOrgId())
            .contains("hostedForCompanyOrgId")
        assertThat(seraDataNavigationTupleResponse.idNavigation()).contains("idNavigation")
        assertThat(seraDataNavigationTupleResponse.locationAccuracy()).contains(1.23)
        assertThat(seraDataNavigationTupleResponse.manufacturerOrgId())
            .contains("manufacturerOrgId")
        assertThat(seraDataNavigationTupleResponse.modeFrequency()).contains("1234")
        assertThat(seraDataNavigationTupleResponse.modes()).contains("Military")
        assertThat(seraDataNavigationTupleResponse.name()).contains("WAAS GEO-5")
        assertThat(seraDataNavigationTupleResponse.notes()).contains("Sample Notes")
        assertThat(seraDataNavigationTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(seraDataNavigationTupleResponse.origNetwork()).contains("ORIG")
        assertThat(seraDataNavigationTupleResponse.partnerSpacecraftId())
            .contains("partnerSpacecraftId")
        assertThat(seraDataNavigationTupleResponse.payloadType()).contains("WAAS")
        assertThat(seraDataNavigationTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(seraDataNavigationTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seraDataNavigationTupleResponse =
            SeraDataNavigationTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SeraDataNavigationTupleResponse.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSeraDataNavigationTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seraDataNavigationTupleResponse),
                jacksonTypeRef<SeraDataNavigationTupleResponse>(),
            )

        assertThat(roundtrippedSeraDataNavigationTupleResponse)
            .isEqualTo(seraDataNavigationTupleResponse)
    }
}
