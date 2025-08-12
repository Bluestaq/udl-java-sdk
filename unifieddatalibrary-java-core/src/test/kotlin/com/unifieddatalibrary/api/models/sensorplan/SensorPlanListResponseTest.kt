// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorplan

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanListResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorPlanListResponseTest {

    @Test
    fun create() {
      val sensorPlanListResponse = SensorPlanListResponse.builder()
          .classificationMarking("U")
          .dataMode(SensorPlanListResponse.DataMode.TEST)
          .recType("COLLECT")
          .source("Bluestaq")
          .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .type("PLAN")
          .id("SENSORPLAN-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .customer("CUSTOMER")
          .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .idSensor("REF-SENSOR-ID")
          .name("EXAMPLE NAME")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origSensorId("ORIGSENSOR-ID")
          .purpose("Example purpose")
          .reqTotal(2)
          .senNetwork("NETWORK")
          .status("ACCEPTED")
          .build()

      assertThat(sensorPlanListResponse.classificationMarking()).isEqualTo("U")
      assertThat(sensorPlanListResponse.dataMode()).isEqualTo(SensorPlanListResponse.DataMode.TEST)
      assertThat(sensorPlanListResponse.recType()).isEqualTo("COLLECT")
      assertThat(sensorPlanListResponse.source()).isEqualTo("Bluestaq")
      assertThat(sensorPlanListResponse.startTime()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
      assertThat(sensorPlanListResponse.type()).isEqualTo("PLAN")
      assertThat(sensorPlanListResponse.id()).contains("SENSORPLAN-ID")
      assertThat(sensorPlanListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sensorPlanListResponse.createdBy()).contains("some.user")
      assertThat(sensorPlanListResponse.customer()).contains("CUSTOMER")
      assertThat(sensorPlanListResponse.endTime()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
      assertThat(sensorPlanListResponse.idSensor()).contains("REF-SENSOR-ID")
      assertThat(sensorPlanListResponse.name()).contains("EXAMPLE NAME")
      assertThat(sensorPlanListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(sensorPlanListResponse.origNetwork()).contains("ORIG")
      assertThat(sensorPlanListResponse.origSensorId()).contains("ORIGSENSOR-ID")
      assertThat(sensorPlanListResponse.purpose()).contains("Example purpose")
      assertThat(sensorPlanListResponse.reqTotal()).contains(2)
      assertThat(sensorPlanListResponse.senNetwork()).contains("NETWORK")
      assertThat(sensorPlanListResponse.status()).contains("ACCEPTED")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sensorPlanListResponse = SensorPlanListResponse.builder()
          .classificationMarking("U")
          .dataMode(SensorPlanListResponse.DataMode.TEST)
          .recType("COLLECT")
          .source("Bluestaq")
          .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .type("PLAN")
          .id("SENSORPLAN-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .customer("CUSTOMER")
          .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .idSensor("REF-SENSOR-ID")
          .name("EXAMPLE NAME")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origSensorId("ORIGSENSOR-ID")
          .purpose("Example purpose")
          .reqTotal(2)
          .senNetwork("NETWORK")
          .status("ACCEPTED")
          .build()

      val roundtrippedSensorPlanListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(sensorPlanListResponse), jacksonTypeRef<SensorPlanListResponse>())

      assertThat(roundtrippedSensorPlanListResponse).isEqualTo(sensorPlanListResponse)
    }
}
