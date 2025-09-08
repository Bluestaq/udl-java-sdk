// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryRetrieveResponseTest {

    @Test
    fun create() {
        val historyRetrieveResponse =
            HistoryRetrieveResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryRetrieveResponse.DataMode.TEST)
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

        assertThat(historyRetrieveResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyRetrieveResponse.dataMode())
            .isEqualTo(HistoryRetrieveResponse.DataMode.TEST)
        assertThat(historyRetrieveResponse.endTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(historyRetrieveResponse.siteCode()).isEqualTo("site01")
        assertThat(historyRetrieveResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyRetrieveResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(historyRetrieveResponse.id()).contains("SENSORMAINTENANCE-ID")
        assertThat(historyRetrieveResponse.activity()).contains("Activity Description")
        assertThat(historyRetrieveResponse.approver()).contains("approver")
        assertThat(historyRetrieveResponse.changer()).contains("changer")
        assertThat(historyRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyRetrieveResponse.createdBy()).contains("some.user")
        assertThat(historyRetrieveResponse.duration()).contains("128:16:52")
        assertThat(historyRetrieveResponse.eowId()).contains("eowId")
        assertThat(historyRetrieveResponse.equipStatus()).contains("FMC")
        assertThat(historyRetrieveResponse.idSensor()).contains("idSensor")
        assertThat(historyRetrieveResponse.impactedFaces()).contains("impactedFaces")
        assertThat(historyRetrieveResponse.inactiveDate())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyRetrieveResponse.lineNumber()).contains("lineNumber")
        assertThat(historyRetrieveResponse.mdOpsCap()).contains("R")
        assertThat(historyRetrieveResponse.mwOpsCap()).contains("G")
        assertThat(historyRetrieveResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyRetrieveResponse.origNetwork()).contains("OPS1")
        assertThat(historyRetrieveResponse.priority()).contains("low")
        assertThat(historyRetrieveResponse.recall()).contains("128:16:52")
        assertThat(historyRetrieveResponse.rel()).contains("rel")
        assertThat(historyRetrieveResponse.remark()).contains("Remarks")
        assertThat(historyRetrieveResponse.requestor()).contains("requestor")
        assertThat(historyRetrieveResponse.resource()).contains("resource")
        assertThat(historyRetrieveResponse.rev()).contains("rev")
        assertThat(historyRetrieveResponse.ssOpsCap()).contains("Y")
        assertThat(historyRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyRetrieveResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyRetrieveResponse =
            HistoryRetrieveResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryRetrieveResponse.DataMode.TEST)
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

        val roundtrippedHistoryRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyRetrieveResponse),
                jacksonTypeRef<HistoryRetrieveResponse>(),
            )

        assertThat(roundtrippedHistoryRetrieveResponse).isEqualTo(historyRetrieveResponse)
    }
}
