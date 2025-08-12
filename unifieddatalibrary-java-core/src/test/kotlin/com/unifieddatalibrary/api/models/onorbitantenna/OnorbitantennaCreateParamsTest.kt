// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitantenna

import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaCreateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitantennaCreateParamsTest {

    @Test
    fun create() {
      OnorbitantennaCreateParams.builder()
          .classificationMarking("U")
          .dataMode(OnorbitantennaCreateParams.DataMode.TEST)
          .idAntenna("ANTENNA-ID")
          .idOnOrbit("ONORBIT-ID")
          .source("Bluestaq")
          .id("ONORBITANTENNA-ID")
          .antenna(OnorbitantennaCreateParams.Antenna.builder()
              .dataMode(OnorbitantennaCreateParams.Antenna.DataMode.TEST)
              .name("IRIDIUM NEXT 121-ANTENNA-10075")
              .source("Bluestaq")
              .id("ANTENNA-ID")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("ORIG")
              .build())
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .build()
    }

    @Test
    fun body() {
      val params = OnorbitantennaCreateParams.builder()
          .classificationMarking("U")
          .dataMode(OnorbitantennaCreateParams.DataMode.TEST)
          .idAntenna("ANTENNA-ID")
          .idOnOrbit("ONORBIT-ID")
          .source("Bluestaq")
          .id("ONORBITANTENNA-ID")
          .antenna(OnorbitantennaCreateParams.Antenna.builder()
              .dataMode(OnorbitantennaCreateParams.Antenna.DataMode.TEST)
              .name("IRIDIUM NEXT 121-ANTENNA-10075")
              .source("Bluestaq")
              .id("ANTENNA-ID")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("ORIG")
              .build())
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(OnorbitantennaCreateParams.DataMode.TEST)
      assertThat(body.idAntenna()).isEqualTo("ANTENNA-ID")
      assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.id()).contains("ONORBITANTENNA-ID")
      assertThat(body.antenna()).contains(OnorbitantennaCreateParams.Antenna.builder()
          .dataMode(OnorbitantennaCreateParams.Antenna.DataMode.TEST)
          .name("IRIDIUM NEXT 121-ANTENNA-10075")
          .source("Bluestaq")
          .id("ANTENNA-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .build())
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("OPS1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OnorbitantennaCreateParams.builder()
          .classificationMarking("U")
          .dataMode(OnorbitantennaCreateParams.DataMode.TEST)
          .idAntenna("ANTENNA-ID")
          .idOnOrbit("ONORBIT-ID")
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(OnorbitantennaCreateParams.DataMode.TEST)
      assertThat(body.idAntenna()).isEqualTo("ANTENNA-ID")
      assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
