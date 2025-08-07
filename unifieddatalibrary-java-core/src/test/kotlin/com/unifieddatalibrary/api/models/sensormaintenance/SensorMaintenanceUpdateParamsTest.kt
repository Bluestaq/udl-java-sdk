// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorMaintenanceUpdateParamsTest {

    @Test
    fun create() {
        SensorMaintenanceUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(SensorMaintenanceUpdateParams.DataMode.TEST)
            .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
            .siteCode("site01")
            .source("Bluestaq")
            .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
            .bodyId("SENSORMAINTENANCE-ID")
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
    }

    @Test
    fun pathParams() {
        val params =
            SensorMaintenanceUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SensorMaintenanceUpdateParams.DataMode.TEST)
                .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .siteCode("site01")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SensorMaintenanceUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SensorMaintenanceUpdateParams.DataMode.TEST)
                .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .siteCode("site01")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .bodyId("SENSORMAINTENANCE-ID")
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SensorMaintenanceUpdateParams.DataMode.TEST)
        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(body.siteCode()).isEqualTo("site01")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(body.bodyId()).contains("SENSORMAINTENANCE-ID")
        assertThat(body.activity()).contains("Activity Description")
        assertThat(body.approver()).contains("approver")
        assertThat(body.changer()).contains("changer")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.duration()).contains("128:16:52")
        assertThat(body.eowId()).contains("eowId")
        assertThat(body.equipStatus()).contains("FMC")
        assertThat(body.idSensor()).contains("idSensor")
        assertThat(body.impactedFaces()).contains("impactedFaces")
        assertThat(body.inactiveDate()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.lineNumber()).contains("lineNumber")
        assertThat(body.mdOpsCap()).contains("R")
        assertThat(body.mwOpsCap()).contains("G")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.priority()).contains("low")
        assertThat(body.recall()).contains("128:16:52")
        assertThat(body.rel()).contains("rel")
        assertThat(body.remark()).contains("Remarks")
        assertThat(body.requestor()).contains("requestor")
        assertThat(body.resource()).contains("resource")
        assertThat(body.rev()).contains("rev")
        assertThat(body.ssOpsCap()).contains("Y")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SensorMaintenanceUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SensorMaintenanceUpdateParams.DataMode.TEST)
                .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .siteCode("site01")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SensorMaintenanceUpdateParams.DataMode.TEST)
        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(body.siteCode()).isEqualTo("site01")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
    }
}
