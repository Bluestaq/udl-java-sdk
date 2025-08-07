// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorMaintenanceGetResponseTest {

    @Test
    fun create() {
        val sensorMaintenanceGetResponse =
            SensorMaintenanceGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SensorMaintenanceGetResponse.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(sensorMaintenanceGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(sensorMaintenanceGetResponse.dataMode())
            .isEqualTo(SensorMaintenanceGetResponse.DataMode.TEST)
        assertThat(sensorMaintenanceGetResponse.endTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(sensorMaintenanceGetResponse.siteCode()).isEqualTo("site01")
        assertThat(sensorMaintenanceGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(sensorMaintenanceGetResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(sensorMaintenanceGetResponse.id()).contains("SENSORMAINTENANCE-ID")
        assertThat(sensorMaintenanceGetResponse.activity()).contains("Activity Description")
        assertThat(sensorMaintenanceGetResponse.approver()).contains("approver")
        assertThat(sensorMaintenanceGetResponse.changer()).contains("changer")
        assertThat(sensorMaintenanceGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorMaintenanceGetResponse.createdBy()).contains("some.user")
        assertThat(sensorMaintenanceGetResponse.duration()).contains("128:16:52")
        assertThat(sensorMaintenanceGetResponse.eowId()).contains("eowId")
        assertThat(sensorMaintenanceGetResponse.equipStatus()).contains("FMC")
        assertThat(sensorMaintenanceGetResponse.idSensor()).contains("idSensor")
        assertThat(sensorMaintenanceGetResponse.impactedFaces()).contains("impactedFaces")
        assertThat(sensorMaintenanceGetResponse.inactiveDate())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorMaintenanceGetResponse.lineNumber()).contains("lineNumber")
        assertThat(sensorMaintenanceGetResponse.mdOpsCap()).contains("R")
        assertThat(sensorMaintenanceGetResponse.mwOpsCap()).contains("G")
        assertThat(sensorMaintenanceGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(sensorMaintenanceGetResponse.origNetwork()).contains("ORIG")
        assertThat(sensorMaintenanceGetResponse.priority()).contains("low")
        assertThat(sensorMaintenanceGetResponse.recall()).contains("128:16:52")
        assertThat(sensorMaintenanceGetResponse.rel()).contains("rel")
        assertThat(sensorMaintenanceGetResponse.remark()).contains("Remarks")
        assertThat(sensorMaintenanceGetResponse.requestor()).contains("requestor")
        assertThat(sensorMaintenanceGetResponse.resource()).contains("resource")
        assertThat(sensorMaintenanceGetResponse.rev()).contains("rev")
        assertThat(sensorMaintenanceGetResponse.ssOpsCap()).contains("Y")
        assertThat(sensorMaintenanceGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorMaintenanceGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorMaintenanceGetResponse =
            SensorMaintenanceGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SensorMaintenanceGetResponse.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSensorMaintenanceGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorMaintenanceGetResponse),
                jacksonTypeRef<SensorMaintenanceGetResponse>(),
            )

        assertThat(roundtrippedSensorMaintenanceGetResponse).isEqualTo(sensorMaintenanceGetResponse)
    }
}
