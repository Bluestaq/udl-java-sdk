// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitbattery

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.batteries.BatteryAbridged
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryListResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitbatteryListResponseTest {

    @Test
    fun create() {
      val onorbitbatteryListResponse = OnorbitbatteryListResponse.builder()
          .classificationMarking("U")
          .dataMode(OnorbitbatteryListResponse.DataMode.TEST)
          .idBattery("BATTERY-ID")
          .idOnOrbit("ONORBIT-ID")
          .source("Bluestaq")
          .id("ONORBITBATTERY-ID")
          .battery(BatteryAbridged.builder()
              .dataMode(BatteryAbridged.DataMode.TEST)
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

      assertThat(onorbitbatteryListResponse.classificationMarking()).isEqualTo("U")
      assertThat(onorbitbatteryListResponse.dataMode()).isEqualTo(OnorbitbatteryListResponse.DataMode.TEST)
      assertThat(onorbitbatteryListResponse.idBattery()).isEqualTo("BATTERY-ID")
      assertThat(onorbitbatteryListResponse.idOnOrbit()).isEqualTo("ONORBIT-ID")
      assertThat(onorbitbatteryListResponse.source()).isEqualTo("Bluestaq")
      assertThat(onorbitbatteryListResponse.id()).contains("ONORBITBATTERY-ID")
      assertThat(onorbitbatteryListResponse.battery()).contains(BatteryAbridged.builder()
          .dataMode(BatteryAbridged.DataMode.TEST)
          .name("JAK-BATTERY-1479")
          .source("Bluestaq")
          .id("BATTERY-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .build())
      assertThat(onorbitbatteryListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(onorbitbatteryListResponse.createdBy()).contains("some.user")
      assertThat(onorbitbatteryListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(onorbitbatteryListResponse.origNetwork()).contains("OPS1")
      assertThat(onorbitbatteryListResponse.quantity()).contains(5)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val onorbitbatteryListResponse = OnorbitbatteryListResponse.builder()
          .classificationMarking("U")
          .dataMode(OnorbitbatteryListResponse.DataMode.TEST)
          .idBattery("BATTERY-ID")
          .idOnOrbit("ONORBIT-ID")
          .source("Bluestaq")
          .id("ONORBITBATTERY-ID")
          .battery(BatteryAbridged.builder()
              .dataMode(BatteryAbridged.DataMode.TEST)
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

      val roundtrippedOnorbitbatteryListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(onorbitbatteryListResponse), jacksonTypeRef<OnorbitbatteryListResponse>())

      assertThat(roundtrippedOnorbitbatteryListResponse).isEqualTo(onorbitbatteryListResponse)
    }
}
