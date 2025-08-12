// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorobservationtype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorObservationTypeListResponseTest {

    @Test
    fun create() {
      val sensorObservationTypeListResponse = SensorObservationTypeListResponse.builder()
          .id("3")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origNetwork("OPS1")
          .type("5")
          .build()

      assertThat(sensorObservationTypeListResponse.id()).contains("3")
      assertThat(sensorObservationTypeListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sensorObservationTypeListResponse.createdBy()).contains("some.user")
      assertThat(sensorObservationTypeListResponse.origNetwork()).contains("OPS1")
      assertThat(sensorObservationTypeListResponse.type()).contains("5")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sensorObservationTypeListResponse = SensorObservationTypeListResponse.builder()
          .id("3")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origNetwork("OPS1")
          .type("5")
          .build()

      val roundtrippedSensorObservationTypeListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(sensorObservationTypeListResponse), jacksonTypeRef<SensorObservationTypeListResponse>())

      assertThat(roundtrippedSensorObservationTypeListResponse).isEqualTo(sensorObservationTypeListResponse)
    }
}
