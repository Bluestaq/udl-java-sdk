// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitbattery

import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryUpdateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitbatteryUpdateParamsTest {

    @Test
    fun create() {
      OnorbitbatteryUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(OnorbitbatteryUpdateParams.DataMode.TEST)
          .idBattery("BATTERY-ID")
          .idOnOrbit("ONORBIT-ID")
          .source("Bluestaq")
          .bodyId("ONORBITBATTERY-ID")
          .battery(OnorbitbatteryUpdateParams.Battery.builder()
              .dataMode(OnorbitbatteryUpdateParams.Battery.DataMode.TEST)
              .name("JAK-BATTERY-1479")
              .source("Bluestaq")
              .id("BATTERY-ID")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("ORIG")
              .build())
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .quantity(5)
          .build()
    }

    @Test
    fun pathParams() {
      val params = OnorbitbatteryUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(OnorbitbatteryUpdateParams.DataMode.TEST)
          .idBattery("BATTERY-ID")
          .idOnOrbit("ONORBIT-ID")
          .source("Bluestaq")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
      val params = OnorbitbatteryUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(OnorbitbatteryUpdateParams.DataMode.TEST)
          .idBattery("BATTERY-ID")
          .idOnOrbit("ONORBIT-ID")
          .source("Bluestaq")
          .bodyId("ONORBITBATTERY-ID")
          .battery(OnorbitbatteryUpdateParams.Battery.builder()
              .dataMode(OnorbitbatteryUpdateParams.Battery.DataMode.TEST)
              .name("JAK-BATTERY-1479")
              .source("Bluestaq")
              .id("BATTERY-ID")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("ORIG")
              .build())
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .quantity(5)
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(OnorbitbatteryUpdateParams.DataMode.TEST)
      assertThat(body.idBattery()).isEqualTo("BATTERY-ID")
      assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.bodyId()).contains("ONORBITBATTERY-ID")
      assertThat(body.battery()).contains(OnorbitbatteryUpdateParams.Battery.builder()
          .dataMode(OnorbitbatteryUpdateParams.Battery.DataMode.TEST)
          .name("JAK-BATTERY-1479")
          .source("Bluestaq")
          .id("BATTERY-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .build())
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("OPS1")
      assertThat(body.quantity()).contains(5)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OnorbitbatteryUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(OnorbitbatteryUpdateParams.DataMode.TEST)
          .idBattery("BATTERY-ID")
          .idOnOrbit("ONORBIT-ID")
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(OnorbitbatteryUpdateParams.DataMode.TEST)
      assertThat(body.idBattery()).isEqualTo("BATTERY-ID")
      assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
