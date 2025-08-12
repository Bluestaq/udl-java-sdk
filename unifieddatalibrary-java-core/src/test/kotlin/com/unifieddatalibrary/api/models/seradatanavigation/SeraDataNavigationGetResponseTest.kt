// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatanavigation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataNavigationGetResponseTest {

    @Test
    fun create() {
      val seraDataNavigationGetResponse = SeraDataNavigationGetResponse.builder()
          .classificationMarking("U")
          .dataMode(SeraDataNavigationGetResponse.DataMode.TEST)
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

      assertThat(seraDataNavigationGetResponse.classificationMarking()).isEqualTo("U")
      assertThat(seraDataNavigationGetResponse.dataMode()).isEqualTo(SeraDataNavigationGetResponse.DataMode.TEST)
      assertThat(seraDataNavigationGetResponse.source()).isEqualTo("Bluestaq")
      assertThat(seraDataNavigationGetResponse.spacecraftId()).isEqualTo("spacecraftId")
      assertThat(seraDataNavigationGetResponse.id()).contains("SERADATANAVIGATION-ID")
      assertThat(seraDataNavigationGetResponse.areaCoverage()).contains("Worldwide")
      assertThat(seraDataNavigationGetResponse.clockType()).contains("Rubidium")
      assertThat(seraDataNavigationGetResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(seraDataNavigationGetResponse.createdBy()).contains("some.user")
      assertThat(seraDataNavigationGetResponse.hostedForCompanyOrgId()).contains("hostedForCompanyOrgId")
      assertThat(seraDataNavigationGetResponse.idNavigation()).contains("idNavigation")
      assertThat(seraDataNavigationGetResponse.locationAccuracy()).contains(1.23)
      assertThat(seraDataNavigationGetResponse.manufacturerOrgId()).contains("manufacturerOrgId")
      assertThat(seraDataNavigationGetResponse.modeFrequency()).contains("1234")
      assertThat(seraDataNavigationGetResponse.modes()).contains("Military")
      assertThat(seraDataNavigationGetResponse.name()).contains("WAAS GEO-5")
      assertThat(seraDataNavigationGetResponse.notes()).contains("Sample Notes")
      assertThat(seraDataNavigationGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(seraDataNavigationGetResponse.origNetwork()).contains("ORIG")
      assertThat(seraDataNavigationGetResponse.partnerSpacecraftId()).contains("partnerSpacecraftId")
      assertThat(seraDataNavigationGetResponse.payloadType()).contains("WAAS")
      assertThat(seraDataNavigationGetResponse.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(seraDataNavigationGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val seraDataNavigationGetResponse = SeraDataNavigationGetResponse.builder()
          .classificationMarking("U")
          .dataMode(SeraDataNavigationGetResponse.DataMode.TEST)
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

      val roundtrippedSeraDataNavigationGetResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(seraDataNavigationGetResponse), jacksonTypeRef<SeraDataNavigationGetResponse>())

      assertThat(roundtrippedSeraDataNavigationGetResponse).isEqualTo(seraDataNavigationGetResponse)
    }
}
