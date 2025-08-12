// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifoldelset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetListResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldelsetListResponseTest {

    @Test
    fun create() {
      val manifoldelsetListResponse = ManifoldelsetListResponse.builder()
          .classificationMarking("U")
          .dataMode(ManifoldelsetListResponse.DataMode.TEST)
          .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .idManifold("REF-MANIFOLD-ID")
          .source("Bluestaq")
          .tmpSatNo(10)
          .id("MANIFOLDELSET-ID")
          .apogee(10.23)
          .argOfPerigee(10.23)
          .bStar(10.23)
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .eccentricity(0.5)
          .inclination(90.23)
          .line1("line1")
          .line2("line2")
          .meanAnomaly(10.23)
          .meanMotion(10.23)
          .meanMotionDDot(10.23)
          .meanMotionDot(10.23)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .perigee(10.23)
          .period(10.23)
          .raan(10.23)
          .revNo(123)
          .semiMajorAxis(10.23)
          .build()

      assertThat(manifoldelsetListResponse.classificationMarking()).isEqualTo("U")
      assertThat(manifoldelsetListResponse.dataMode()).isEqualTo(ManifoldelsetListResponse.DataMode.TEST)
      assertThat(manifoldelsetListResponse.epoch()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(manifoldelsetListResponse.idManifold()).isEqualTo("REF-MANIFOLD-ID")
      assertThat(manifoldelsetListResponse.source()).isEqualTo("Bluestaq")
      assertThat(manifoldelsetListResponse.tmpSatNo()).isEqualTo(10)
      assertThat(manifoldelsetListResponse.id()).contains("MANIFOLDELSET-ID")
      assertThat(manifoldelsetListResponse.apogee()).contains(10.23)
      assertThat(manifoldelsetListResponse.argOfPerigee()).contains(10.23)
      assertThat(manifoldelsetListResponse.bStar()).contains(10.23)
      assertThat(manifoldelsetListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(manifoldelsetListResponse.createdBy()).contains("some.user")
      assertThat(manifoldelsetListResponse.eccentricity()).contains(0.5)
      assertThat(manifoldelsetListResponse.inclination()).contains(90.23)
      assertThat(manifoldelsetListResponse.line1()).contains("line1")
      assertThat(manifoldelsetListResponse.line2()).contains("line2")
      assertThat(manifoldelsetListResponse.meanAnomaly()).contains(10.23)
      assertThat(manifoldelsetListResponse.meanMotion()).contains(10.23)
      assertThat(manifoldelsetListResponse.meanMotionDDot()).contains(10.23)
      assertThat(manifoldelsetListResponse.meanMotionDot()).contains(10.23)
      assertThat(manifoldelsetListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(manifoldelsetListResponse.origNetwork()).contains("ORIG")
      assertThat(manifoldelsetListResponse.perigee()).contains(10.23)
      assertThat(manifoldelsetListResponse.period()).contains(10.23)
      assertThat(manifoldelsetListResponse.raan()).contains(10.23)
      assertThat(manifoldelsetListResponse.revNo()).contains(123)
      assertThat(manifoldelsetListResponse.semiMajorAxis()).contains(10.23)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val manifoldelsetListResponse = ManifoldelsetListResponse.builder()
          .classificationMarking("U")
          .dataMode(ManifoldelsetListResponse.DataMode.TEST)
          .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .idManifold("REF-MANIFOLD-ID")
          .source("Bluestaq")
          .tmpSatNo(10)
          .id("MANIFOLDELSET-ID")
          .apogee(10.23)
          .argOfPerigee(10.23)
          .bStar(10.23)
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .eccentricity(0.5)
          .inclination(90.23)
          .line1("line1")
          .line2("line2")
          .meanAnomaly(10.23)
          .meanMotion(10.23)
          .meanMotionDDot(10.23)
          .meanMotionDot(10.23)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .perigee(10.23)
          .period(10.23)
          .raan(10.23)
          .revNo(123)
          .semiMajorAxis(10.23)
          .build()

      val roundtrippedManifoldelsetListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(manifoldelsetListResponse), jacksonTypeRef<ManifoldelsetListResponse>())

      assertThat(roundtrippedManifoldelsetListResponse).isEqualTo(manifoldelsetListResponse)
    }
}
