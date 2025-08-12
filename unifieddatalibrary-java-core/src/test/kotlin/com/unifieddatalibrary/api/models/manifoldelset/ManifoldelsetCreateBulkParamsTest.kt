// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifoldelset

import com.unifieddatalibrary.api.models.manifoldelset.ManifoldelsetCreateBulkParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldelsetCreateBulkParamsTest {

    @Test
    fun create() {
      ManifoldelsetCreateBulkParams.builder()
          .addBody(ManifoldelsetCreateBulkParams.Body.builder()
              .classificationMarking("U")
              .dataMode(ManifoldelsetCreateBulkParams.Body.DataMode.TEST)
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
              .build())
          .build()
    }

    @Test
    fun body() {
      val params = ManifoldelsetCreateBulkParams.builder()
          .addBody(ManifoldelsetCreateBulkParams.Body.builder()
              .classificationMarking("U")
              .dataMode(ManifoldelsetCreateBulkParams.Body.DataMode.TEST)
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
              .build())
          .build()

      val body = params._body()

      assertThat(body).containsExactly(ManifoldelsetCreateBulkParams.Body.builder()
          .classificationMarking("U")
          .dataMode(ManifoldelsetCreateBulkParams.Body.DataMode.TEST)
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
          .build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = ManifoldelsetCreateBulkParams.builder()
          .addBody(ManifoldelsetCreateBulkParams.Body.builder()
              .classificationMarking("U")
              .dataMode(ManifoldelsetCreateBulkParams.Body.DataMode.TEST)
              .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
              .idManifold("REF-MANIFOLD-ID")
              .source("Bluestaq")
              .tmpSatNo(10)
              .build())
          .build()

      val body = params._body()

      assertThat(body).containsExactly(ManifoldelsetCreateBulkParams.Body.builder()
          .classificationMarking("U")
          .dataMode(ManifoldelsetCreateBulkParams.Body.DataMode.TEST)
          .epoch(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .idManifold("REF-MANIFOLD-ID")
          .source("Bluestaq")
          .tmpSatNo(10)
          .build())
    }
}
