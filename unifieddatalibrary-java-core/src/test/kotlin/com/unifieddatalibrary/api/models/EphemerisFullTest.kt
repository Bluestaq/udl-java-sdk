// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.EphemerisFull
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemerisFullTest {

    @Test
    fun create() {
      val ephemerisFull = EphemerisFull.builder()
          .classificationMarking("U")
          .dataMode(EphemerisFull.DataMode.TEST)
          .source("Bluestaq")
          .ts(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .xpos(1.1)
          .xvel(1.1)
          .ypos(1.1)
          .yvel(1.1)
          .zpos(1.1)
          .zvel(1.1)
          .id("EPHEMERIS-ID")
          .cov(listOf(
            1.1,
            2.4,
            3.8,
            4.2,
            5.5,
            6.0,
          ))
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .esId("ES-ID")
          .idOnOrbit("ONORBIT-ID")
          .origin("THIRD_PARTY_DATASOURCE")
          .origObjectId("ORIGOBJECT-ID")
          .xaccel(1.1)
          .yaccel(1.1)
          .zaccel(1.1)
          .build()

      assertThat(ephemerisFull.classificationMarking()).isEqualTo("U")
      assertThat(ephemerisFull.dataMode()).isEqualTo(EphemerisFull.DataMode.TEST)
      assertThat(ephemerisFull.source()).isEqualTo("Bluestaq")
      assertThat(ephemerisFull.ts()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
      assertThat(ephemerisFull.xpos()).isEqualTo(1.1)
      assertThat(ephemerisFull.xvel()).isEqualTo(1.1)
      assertThat(ephemerisFull.ypos()).isEqualTo(1.1)
      assertThat(ephemerisFull.yvel()).isEqualTo(1.1)
      assertThat(ephemerisFull.zpos()).isEqualTo(1.1)
      assertThat(ephemerisFull.zvel()).isEqualTo(1.1)
      assertThat(ephemerisFull.id()).contains("EPHEMERIS-ID")
      assertThat(ephemerisFull.cov().getOrNull()).containsExactly(1.1, 2.4, 3.8, 4.2, 5.5, 6.0)
      assertThat(ephemerisFull.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(ephemerisFull.createdBy()).contains("some.user")
      assertThat(ephemerisFull.esId()).contains("ES-ID")
      assertThat(ephemerisFull.idOnOrbit()).contains("ONORBIT-ID")
      assertThat(ephemerisFull.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(ephemerisFull.origObjectId()).contains("ORIGOBJECT-ID")
      assertThat(ephemerisFull.xaccel()).contains(1.1)
      assertThat(ephemerisFull.yaccel()).contains(1.1)
      assertThat(ephemerisFull.zaccel()).contains(1.1)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val ephemerisFull = EphemerisFull.builder()
          .classificationMarking("U")
          .dataMode(EphemerisFull.DataMode.TEST)
          .source("Bluestaq")
          .ts(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .xpos(1.1)
          .xvel(1.1)
          .ypos(1.1)
          .yvel(1.1)
          .zpos(1.1)
          .zvel(1.1)
          .id("EPHEMERIS-ID")
          .cov(listOf(
            1.1,
            2.4,
            3.8,
            4.2,
            5.5,
            6.0,
          ))
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .esId("ES-ID")
          .idOnOrbit("ONORBIT-ID")
          .origin("THIRD_PARTY_DATASOURCE")
          .origObjectId("ORIGOBJECT-ID")
          .xaccel(1.1)
          .yaccel(1.1)
          .zaccel(1.1)
          .build()

      val roundtrippedEphemerisFull = jsonMapper.readValue(jsonMapper.writeValueAsString(ephemerisFull), jacksonTypeRef<EphemerisFull>())

      assertThat(roundtrippedEphemerisFull).isEqualTo(ephemerisFull)
    }
}
