// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.taiutc.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.taiutc.history.TaiutcFull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaiutcFullTest {

    @Test
    fun create() {
      val taiutcFull = TaiutcFull.builder()
          .adjustmentDate(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
          .classificationMarking("U")
          .dataMode(TaiutcFull.DataMode.TEST)
          .source("Bluestaq")
          .id("TAIUTC-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .multiplicationFactor(0.001296)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .rawFileUri("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
          .taiUtc(1.422818)
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .build()

      assertThat(taiutcFull.adjustmentDate()).isEqualTo(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
      assertThat(taiutcFull.classificationMarking()).isEqualTo("U")
      assertThat(taiutcFull.dataMode()).isEqualTo(TaiutcFull.DataMode.TEST)
      assertThat(taiutcFull.source()).isEqualTo("Bluestaq")
      assertThat(taiutcFull.id()).contains("TAIUTC-ID")
      assertThat(taiutcFull.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(taiutcFull.createdBy()).contains("some.user")
      assertThat(taiutcFull.multiplicationFactor()).contains(0.001296)
      assertThat(taiutcFull.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(taiutcFull.origNetwork()).contains("ORIG")
      assertThat(taiutcFull.rawFileUri()).contains("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
      assertThat(taiutcFull.taiUtc()).contains(1.422818)
      assertThat(taiutcFull.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(taiutcFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val taiutcFull = TaiutcFull.builder()
          .adjustmentDate(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
          .classificationMarking("U")
          .dataMode(TaiutcFull.DataMode.TEST)
          .source("Bluestaq")
          .id("TAIUTC-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .multiplicationFactor(0.001296)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .rawFileUri("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
          .taiUtc(1.422818)
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .build()

      val roundtrippedTaiutcFull = jsonMapper.readValue(jsonMapper.writeValueAsString(taiutcFull), jacksonTypeRef<TaiutcFull>())

      assertThat(roundtrippedTaiutcFull).isEqualTo(taiutcFull)
    }
}
