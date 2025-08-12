// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.swir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.swir.SwirListResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwirListResponseTest {

    @Test
    fun create() {
      val swirListResponse = SwirListResponse.builder()
          .classificationMarking("U")
          .dataMode(SwirListResponse.DataMode.TEST)
          .source("Bluestaq")
          .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .id("SWIR-ID")
          .badWave("Example Comments")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .idOnOrbit("45234")
          .lat(70.55208)
          .locationName("AeroTel")
          .lon(81.18191)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origObjectId("WildBlue-1")
          .satNo(25544)
          .solarPhaseAngle(1.23)
          .build()

      assertThat(swirListResponse.classificationMarking()).isEqualTo("U")
      assertThat(swirListResponse.dataMode()).isEqualTo(SwirListResponse.DataMode.TEST)
      assertThat(swirListResponse.source()).isEqualTo("Bluestaq")
      assertThat(swirListResponse.ts()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(swirListResponse.id()).contains("SWIR-ID")
      assertThat(swirListResponse.badWave()).contains("Example Comments")
      assertThat(swirListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(swirListResponse.createdBy()).contains("some.user")
      assertThat(swirListResponse.idOnOrbit()).contains("45234")
      assertThat(swirListResponse.lat()).contains(70.55208)
      assertThat(swirListResponse.locationName()).contains("AeroTel")
      assertThat(swirListResponse.lon()).contains(81.18191)
      assertThat(swirListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(swirListResponse.origNetwork()).contains("ORIG")
      assertThat(swirListResponse.origObjectId()).contains("WildBlue-1")
      assertThat(swirListResponse.satNo()).contains(25544)
      assertThat(swirListResponse.solarPhaseAngle()).contains(1.23)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val swirListResponse = SwirListResponse.builder()
          .classificationMarking("U")
          .dataMode(SwirListResponse.DataMode.TEST)
          .source("Bluestaq")
          .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .id("SWIR-ID")
          .badWave("Example Comments")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .idOnOrbit("45234")
          .lat(70.55208)
          .locationName("AeroTel")
          .lon(81.18191)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origObjectId("WildBlue-1")
          .satNo(25544)
          .solarPhaseAngle(1.23)
          .build()

      val roundtrippedSwirListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(swirListResponse), jacksonTypeRef<SwirListResponse>())

      assertThat(roundtrippedSwirListResponse).isEqualTo(swirListResponse)
    }
}
