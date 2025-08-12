// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batteries

import com.unifieddatalibrary.api.models.batteries.BatteryUpdateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatteryUpdateParamsTest {

    @Test
    fun create() {
      BatteryUpdateParams.builder()
          .pathId("id")
          .dataMode(BatteryUpdateParams.DataMode.TEST)
          .name("JAK-BATTERY-1479")
          .source("Bluestaq")
          .bodyId("BATTERY-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .build()
    }

    @Test
    fun pathParams() {
      val params = BatteryUpdateParams.builder()
          .pathId("id")
          .dataMode(BatteryUpdateParams.DataMode.TEST)
          .name("JAK-BATTERY-1479")
          .source("Bluestaq")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
      val params = BatteryUpdateParams.builder()
          .pathId("id")
          .dataMode(BatteryUpdateParams.DataMode.TEST)
          .name("JAK-BATTERY-1479")
          .source("Bluestaq")
          .bodyId("BATTERY-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .build()

      val body = params._body()

      assertThat(body.dataMode()).isEqualTo(BatteryUpdateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("JAK-BATTERY-1479")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.bodyId()).contains("BATTERY-ID")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = BatteryUpdateParams.builder()
          .pathId("id")
          .dataMode(BatteryUpdateParams.DataMode.TEST)
          .name("JAK-BATTERY-1479")
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.dataMode()).isEqualTo(BatteryUpdateParams.DataMode.TEST)
      assertThat(body.name()).isEqualTo("JAK-BATTERY-1479")
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
