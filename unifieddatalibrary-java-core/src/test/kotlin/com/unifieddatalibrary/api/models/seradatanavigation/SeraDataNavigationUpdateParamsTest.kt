// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatanavigation

import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationUpdateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataNavigationUpdateParamsTest {

    @Test
    fun create() {
      SeraDataNavigationUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(SeraDataNavigationUpdateParams.DataMode.TEST)
          .source("Bluestaq")
          .spacecraftId("spacecraftId")
          .bodyId("SERADATANAVIGATION-ID")
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
    }

    @Test
    fun pathParams() {
      val params = SeraDataNavigationUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(SeraDataNavigationUpdateParams.DataMode.TEST)
          .source("Bluestaq")
          .spacecraftId("spacecraftId")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
      val params = SeraDataNavigationUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(SeraDataNavigationUpdateParams.DataMode.TEST)
          .source("Bluestaq")
          .spacecraftId("spacecraftId")
          .bodyId("SERADATANAVIGATION-ID")
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

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(SeraDataNavigationUpdateParams.DataMode.TEST)
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.spacecraftId()).isEqualTo("spacecraftId")
      assertThat(body.bodyId()).contains("SERADATANAVIGATION-ID")
      assertThat(body.areaCoverage()).contains("Worldwide")
      assertThat(body.clockType()).contains("Rubidium")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.hostedForCompanyOrgId()).contains("hostedForCompanyOrgId")
      assertThat(body.idNavigation()).contains("idNavigation")
      assertThat(body.locationAccuracy()).contains(1.23)
      assertThat(body.manufacturerOrgId()).contains("manufacturerOrgId")
      assertThat(body.modeFrequency()).contains("1234")
      assertThat(body.modes()).contains("Military")
      assertThat(body.name()).contains("WAAS GEO-5")
      assertThat(body.notes()).contains("Sample Notes")
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("ORIG")
      assertThat(body.partnerSpacecraftId()).contains("partnerSpacecraftId")
      assertThat(body.payloadType()).contains("WAAS")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = SeraDataNavigationUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(SeraDataNavigationUpdateParams.DataMode.TEST)
          .source("Bluestaq")
          .spacecraftId("spacecraftId")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(SeraDataNavigationUpdateParams.DataMode.TEST)
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.spacecraftId()).isEqualTo("spacecraftId")
    }
}
