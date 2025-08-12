// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfbandtype

import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCreateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandTypeCreateParamsTest {

    @Test
    fun create() {
      RfBandTypeCreateParams.builder()
          .id("Ku")
          .classificationMarking("U")
          .dataMode(RfBandTypeCreateParams.DataMode.TEST)
          .description("Example description")
          .source("Bluestaq")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .endFreq(123.4)
          .origin("THIRD_PARTY_DATASOURCE")
          .startFreq(123.4)
          .build()
    }

    @Test
    fun body() {
      val params = RfBandTypeCreateParams.builder()
          .id("Ku")
          .classificationMarking("U")
          .dataMode(RfBandTypeCreateParams.DataMode.TEST)
          .description("Example description")
          .source("Bluestaq")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .endFreq(123.4)
          .origin("THIRD_PARTY_DATASOURCE")
          .startFreq(123.4)
          .build()

      val body = params._body()

      assertThat(body.id()).isEqualTo("Ku")
      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(RfBandTypeCreateParams.DataMode.TEST)
      assertThat(body.description()).isEqualTo("Example description")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.endFreq()).contains(123.4)
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.startFreq()).contains(123.4)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = RfBandTypeCreateParams.builder()
          .id("Ku")
          .classificationMarking("U")
          .dataMode(RfBandTypeCreateParams.DataMode.TEST)
          .description("Example description")
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.id()).isEqualTo("Ku")
      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(RfBandTypeCreateParams.DataMode.TEST)
      assertThat(body.description()).isEqualTo("Example description")
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
