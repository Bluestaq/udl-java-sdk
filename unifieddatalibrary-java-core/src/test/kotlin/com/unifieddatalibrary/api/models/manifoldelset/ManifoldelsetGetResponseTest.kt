// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifoldelset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetGetResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldelsetGetResponseTest {

    @Test
    fun create() {
      val manifoldelsetGetResponse = ManifoldelsetGetResponse.builder()
          .classificationMarking("U")
          .dataMode(ManifoldelsetGetResponse.DataMode.TEST)
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
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .updatedBy("some.user")
          .build()

      assertThat(manifoldelsetGetResponse.classificationMarking()).isEqualTo("U")
      assertThat(manifoldelsetGetResponse.dataMode()).isEqualTo(ManifoldelsetGetResponse.DataMode.TEST)
      assertThat(manifoldelsetGetResponse.epoch()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(manifoldelsetGetResponse.idManifold()).isEqualTo("REF-MANIFOLD-ID")
      assertThat(manifoldelsetGetResponse.source()).isEqualTo("Bluestaq")
      assertThat(manifoldelsetGetResponse.tmpSatNo()).isEqualTo(10)
      assertThat(manifoldelsetGetResponse.id()).contains("MANIFOLDELSET-ID")
      assertThat(manifoldelsetGetResponse.apogee()).contains(10.23)
      assertThat(manifoldelsetGetResponse.argOfPerigee()).contains(10.23)
      assertThat(manifoldelsetGetResponse.bStar()).contains(10.23)
      assertThat(manifoldelsetGetResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(manifoldelsetGetResponse.createdBy()).contains("some.user")
      assertThat(manifoldelsetGetResponse.eccentricity()).contains(0.5)
      assertThat(manifoldelsetGetResponse.inclination()).contains(90.23)
      assertThat(manifoldelsetGetResponse.line1()).contains("line1")
      assertThat(manifoldelsetGetResponse.line2()).contains("line2")
      assertThat(manifoldelsetGetResponse.meanAnomaly()).contains(10.23)
      assertThat(manifoldelsetGetResponse.meanMotion()).contains(10.23)
      assertThat(manifoldelsetGetResponse.meanMotionDDot()).contains(10.23)
      assertThat(manifoldelsetGetResponse.meanMotionDot()).contains(10.23)
      assertThat(manifoldelsetGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(manifoldelsetGetResponse.origNetwork()).contains("ORIG")
      assertThat(manifoldelsetGetResponse.perigee()).contains(10.23)
      assertThat(manifoldelsetGetResponse.period()).contains(10.23)
      assertThat(manifoldelsetGetResponse.raan()).contains(10.23)
      assertThat(manifoldelsetGetResponse.revNo()).contains(123)
      assertThat(manifoldelsetGetResponse.semiMajorAxis()).contains(10.23)
      assertThat(manifoldelsetGetResponse.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(manifoldelsetGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val manifoldelsetGetResponse = ManifoldelsetGetResponse.builder()
          .classificationMarking("U")
          .dataMode(ManifoldelsetGetResponse.DataMode.TEST)
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
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .updatedBy("some.user")
          .build()

      val roundtrippedManifoldelsetGetResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(manifoldelsetGetResponse), jacksonTypeRef<ManifoldelsetGetResponse>())

      assertThat(roundtrippedManifoldelsetGetResponse).isEqualTo(manifoldelsetGetResponse)
    }
}
