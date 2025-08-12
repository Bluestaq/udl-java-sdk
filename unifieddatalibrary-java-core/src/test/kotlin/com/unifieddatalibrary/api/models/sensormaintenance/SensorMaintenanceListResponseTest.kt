// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceListResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorMaintenanceListResponseTest {

    @Test
    fun create() {
      val sensorMaintenanceListResponse = SensorMaintenanceListResponse.builder()
          .classificationMarking("U")
          .dataMode(SensorMaintenanceListResponse.DataMode.TEST)
          .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .siteCode("site01")
          .source("Bluestaq")
          .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .id("SENSORMAINTENANCE-ID")
          .activity("Activity Description")
          .approver("approver")
          .changer("changer")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .duration("128:16:52")
          .eowId("eowId")
          .equipStatus("FMC")
          .idSensor("idSensor")
          .impactedFaces("impactedFaces")
          .inactiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .lineNumber("lineNumber")
          .mdOpsCap("R")
          .mwOpsCap("G")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .priority("low")
          .recall("128:16:52")
          .rel("rel")
          .remark("Remarks")
          .requestor("requestor")
          .resource("resource")
          .rev("rev")
          .ssOpsCap("Y")
          .build()

      assertThat(sensorMaintenanceListResponse.classificationMarking()).isEqualTo("U")
      assertThat(sensorMaintenanceListResponse.dataMode()).isEqualTo(SensorMaintenanceListResponse.DataMode.TEST)
      assertThat(sensorMaintenanceListResponse.endTime()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
      assertThat(sensorMaintenanceListResponse.siteCode()).isEqualTo("site01")
      assertThat(sensorMaintenanceListResponse.source()).isEqualTo("Bluestaq")
      assertThat(sensorMaintenanceListResponse.startTime()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
      assertThat(sensorMaintenanceListResponse.id()).contains("SENSORMAINTENANCE-ID")
      assertThat(sensorMaintenanceListResponse.activity()).contains("Activity Description")
      assertThat(sensorMaintenanceListResponse.approver()).contains("approver")
      assertThat(sensorMaintenanceListResponse.changer()).contains("changer")
      assertThat(sensorMaintenanceListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sensorMaintenanceListResponse.createdBy()).contains("some.user")
      assertThat(sensorMaintenanceListResponse.duration()).contains("128:16:52")
      assertThat(sensorMaintenanceListResponse.eowId()).contains("eowId")
      assertThat(sensorMaintenanceListResponse.equipStatus()).contains("FMC")
      assertThat(sensorMaintenanceListResponse.idSensor()).contains("idSensor")
      assertThat(sensorMaintenanceListResponse.impactedFaces()).contains("impactedFaces")
      assertThat(sensorMaintenanceListResponse.inactiveDate()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sensorMaintenanceListResponse.lineNumber()).contains("lineNumber")
      assertThat(sensorMaintenanceListResponse.mdOpsCap()).contains("R")
      assertThat(sensorMaintenanceListResponse.mwOpsCap()).contains("G")
      assertThat(sensorMaintenanceListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(sensorMaintenanceListResponse.origNetwork()).contains("ORIG")
      assertThat(sensorMaintenanceListResponse.priority()).contains("low")
      assertThat(sensorMaintenanceListResponse.recall()).contains("128:16:52")
      assertThat(sensorMaintenanceListResponse.rel()).contains("rel")
      assertThat(sensorMaintenanceListResponse.remark()).contains("Remarks")
      assertThat(sensorMaintenanceListResponse.requestor()).contains("requestor")
      assertThat(sensorMaintenanceListResponse.resource()).contains("resource")
      assertThat(sensorMaintenanceListResponse.rev()).contains("rev")
      assertThat(sensorMaintenanceListResponse.ssOpsCap()).contains("Y")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sensorMaintenanceListResponse = SensorMaintenanceListResponse.builder()
          .classificationMarking("U")
          .dataMode(SensorMaintenanceListResponse.DataMode.TEST)
          .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .siteCode("site01")
          .source("Bluestaq")
          .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
          .id("SENSORMAINTENANCE-ID")
          .activity("Activity Description")
          .approver("approver")
          .changer("changer")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .duration("128:16:52")
          .eowId("eowId")
          .equipStatus("FMC")
          .idSensor("idSensor")
          .impactedFaces("impactedFaces")
          .inactiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .lineNumber("lineNumber")
          .mdOpsCap("R")
          .mwOpsCap("G")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .priority("low")
          .recall("128:16:52")
          .rel("rel")
          .remark("Remarks")
          .requestor("requestor")
          .resource("resource")
          .rev("rev")
          .ssOpsCap("Y")
          .build()

      val roundtrippedSensorMaintenanceListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(sensorMaintenanceListResponse), jacksonTypeRef<SensorMaintenanceListResponse>())

      assertThat(roundtrippedSensorMaintenanceListResponse).isEqualTo(sensorMaintenanceListResponse)
    }
}
