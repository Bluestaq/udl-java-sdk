// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifoldelset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetTupleResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldelsetTupleResponseTest {

    @Test
    fun create() {
      val manifoldelsetTupleResponse = ManifoldelsetTupleResponse.builder()
          .classificationMarking("U")
          .dataMode(ManifoldelsetTupleResponse.DataMode.TEST)
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

      assertThat(manifoldelsetTupleResponse.classificationMarking()).isEqualTo("U")
      assertThat(manifoldelsetTupleResponse.dataMode()).isEqualTo(ManifoldelsetTupleResponse.DataMode.TEST)
      assertThat(manifoldelsetTupleResponse.epoch()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(manifoldelsetTupleResponse.idManifold()).isEqualTo("REF-MANIFOLD-ID")
      assertThat(manifoldelsetTupleResponse.source()).isEqualTo("Bluestaq")
      assertThat(manifoldelsetTupleResponse.tmpSatNo()).isEqualTo(10)
      assertThat(manifoldelsetTupleResponse.id()).contains("MANIFOLDELSET-ID")
      assertThat(manifoldelsetTupleResponse.apogee()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.argOfPerigee()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.bStar()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(manifoldelsetTupleResponse.createdBy()).contains("some.user")
      assertThat(manifoldelsetTupleResponse.eccentricity()).contains(0.5)
      assertThat(manifoldelsetTupleResponse.inclination()).contains(90.23)
      assertThat(manifoldelsetTupleResponse.line1()).contains("line1")
      assertThat(manifoldelsetTupleResponse.line2()).contains("line2")
      assertThat(manifoldelsetTupleResponse.meanAnomaly()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.meanMotion()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.meanMotionDDot()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.meanMotionDot()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(manifoldelsetTupleResponse.origNetwork()).contains("ORIG")
      assertThat(manifoldelsetTupleResponse.perigee()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.period()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.raan()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.revNo()).contains(123)
      assertThat(manifoldelsetTupleResponse.semiMajorAxis()).contains(10.23)
      assertThat(manifoldelsetTupleResponse.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(manifoldelsetTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val manifoldelsetTupleResponse = ManifoldelsetTupleResponse.builder()
          .classificationMarking("U")
          .dataMode(ManifoldelsetTupleResponse.DataMode.TEST)
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

      val roundtrippedManifoldelsetTupleResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(manifoldelsetTupleResponse), jacksonTypeRef<ManifoldelsetTupleResponse>())

      assertThat(roundtrippedManifoldelsetTupleResponse).isEqualTo(manifoldelsetTupleResponse)
    }
}
