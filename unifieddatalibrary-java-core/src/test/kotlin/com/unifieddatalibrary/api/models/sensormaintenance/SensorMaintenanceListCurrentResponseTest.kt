// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorMaintenanceListCurrentResponseTest {

    @Test
    fun create() {
        val sensorMaintenanceListCurrentResponse =
            SensorMaintenanceListCurrentResponse.builder()
                .classificationMarking("U")
                .dataMode(SensorMaintenanceListCurrentResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
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

        assertThat(sensorMaintenanceListCurrentResponse.classificationMarking()).isEqualTo("U")
        assertThat(sensorMaintenanceListCurrentResponse.dataMode())
            .isEqualTo(SensorMaintenanceListCurrentResponse.DataMode.TEST)
        assertThat(sensorMaintenanceListCurrentResponse.endTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(sensorMaintenanceListCurrentResponse.siteCode()).isEqualTo("site01")
        assertThat(sensorMaintenanceListCurrentResponse.source()).isEqualTo("Bluestaq")
        assertThat(sensorMaintenanceListCurrentResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(sensorMaintenanceListCurrentResponse.id()).contains("SENSORMAINTENANCE-ID")
        assertThat(sensorMaintenanceListCurrentResponse.activity()).contains("Activity Description")
        assertThat(sensorMaintenanceListCurrentResponse.approver()).contains("approver")
        assertThat(sensorMaintenanceListCurrentResponse.changer()).contains("changer")
        assertThat(sensorMaintenanceListCurrentResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorMaintenanceListCurrentResponse.createdBy()).contains("some.user")
        assertThat(sensorMaintenanceListCurrentResponse.duration()).contains("128:16:52")
        assertThat(sensorMaintenanceListCurrentResponse.eowId()).contains("eowId")
        assertThat(sensorMaintenanceListCurrentResponse.equipStatus()).contains("FMC")
        assertThat(sensorMaintenanceListCurrentResponse.idSensor()).contains("idSensor")
        assertThat(sensorMaintenanceListCurrentResponse.impactedFaces()).contains("impactedFaces")
        assertThat(sensorMaintenanceListCurrentResponse.inactiveDate())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorMaintenanceListCurrentResponse.lineNumber()).contains("lineNumber")
        assertThat(sensorMaintenanceListCurrentResponse.mdOpsCap()).contains("R")
        assertThat(sensorMaintenanceListCurrentResponse.mwOpsCap()).contains("G")
        assertThat(sensorMaintenanceListCurrentResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(sensorMaintenanceListCurrentResponse.origNetwork()).contains("OPS1")
        assertThat(sensorMaintenanceListCurrentResponse.priority()).contains("low")
        assertThat(sensorMaintenanceListCurrentResponse.recall()).contains("128:16:52")
        assertThat(sensorMaintenanceListCurrentResponse.rel()).contains("rel")
        assertThat(sensorMaintenanceListCurrentResponse.remark()).contains("Remarks")
        assertThat(sensorMaintenanceListCurrentResponse.requestor()).contains("requestor")
        assertThat(sensorMaintenanceListCurrentResponse.resource()).contains("resource")
        assertThat(sensorMaintenanceListCurrentResponse.rev()).contains("rev")
        assertThat(sensorMaintenanceListCurrentResponse.ssOpsCap()).contains("Y")
        assertThat(sensorMaintenanceListCurrentResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorMaintenanceListCurrentResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorMaintenanceListCurrentResponse =
            SensorMaintenanceListCurrentResponse.builder()
                .classificationMarking("U")
                .dataMode(SensorMaintenanceListCurrentResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
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

        val roundtrippedSensorMaintenanceListCurrentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorMaintenanceListCurrentResponse),
                jacksonTypeRef<SensorMaintenanceListCurrentResponse>(),
            )

        assertThat(roundtrippedSensorMaintenanceListCurrentResponse)
            .isEqualTo(sensorMaintenanceListCurrentResponse)
    }
}
