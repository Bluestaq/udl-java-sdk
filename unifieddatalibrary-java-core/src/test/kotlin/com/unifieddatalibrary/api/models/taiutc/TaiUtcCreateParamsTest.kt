// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.taiutc

import com.unifieddatalibrary.api.models.taiutc.TaiUtcCreateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaiUtcCreateParamsTest {

    @Test
    fun create() {
      TaiUtcCreateParams.builder()
          .adjustmentDate(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
          .classificationMarking("U")
          .dataMode(TaiUtcCreateParams.DataMode.TEST)
          .source("Bluestaq")
          .id("TAIUTC-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .multiplicationFactor(0.001296)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .rawFileUri("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
          .taiUtc(1.422818)
          .build()
    }

    @Test
    fun body() {
      val params = TaiUtcCreateParams.builder()
          .adjustmentDate(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
          .classificationMarking("U")
          .dataMode(TaiUtcCreateParams.DataMode.TEST)
          .source("Bluestaq")
          .id("TAIUTC-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .multiplicationFactor(0.001296)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .rawFileUri("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
          .taiUtc(1.422818)
          .build()

      val body = params._body()

      assertThat(body.adjustmentDate()).isEqualTo(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(TaiUtcCreateParams.DataMode.TEST)
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.id()).contains("TAIUTC-ID")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.multiplicationFactor()).contains(0.001296)
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("ORIG")
      assertThat(body.rawFileUri()).contains("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
      assertThat(body.taiUtc()).contains(1.422818)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = TaiUtcCreateParams.builder()
          .adjustmentDate(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
          .classificationMarking("U")
          .dataMode(TaiUtcCreateParams.DataMode.TEST)
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.adjustmentDate()).isEqualTo(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(TaiUtcCreateParams.DataMode.TEST)
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
