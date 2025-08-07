// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsDiscrepancyInfosFullTest {

    @Test
    fun create() {
        val logisticsDiscrepancyInfosFull =
            LogisticsDiscrepancyInfosFull.builder()
                .closureTime(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .discrepancyInfo(
                    "PILOT WINDSHIELD PANEL ASSY CRACKED, AND ARCING REQ R2 IAW 56.11.10"
                )
                .jcn("231942400")
                .jobStTime(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .build()

        assertThat(logisticsDiscrepancyInfosFull.closureTime())
            .contains(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
        assertThat(logisticsDiscrepancyInfosFull.discrepancyInfo())
            .contains("PILOT WINDSHIELD PANEL ASSY CRACKED, AND ARCING REQ R2 IAW 56.11.10")
        assertThat(logisticsDiscrepancyInfosFull.jcn()).contains("231942400")
        assertThat(logisticsDiscrepancyInfosFull.jobStTime())
            .contains(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsDiscrepancyInfosFull =
            LogisticsDiscrepancyInfosFull.builder()
                .closureTime(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .discrepancyInfo(
                    "PILOT WINDSHIELD PANEL ASSY CRACKED, AND ARCING REQ R2 IAW 56.11.10"
                )
                .jcn("231942400")
                .jobStTime(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .build()

        val roundtrippedLogisticsDiscrepancyInfosFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsDiscrepancyInfosFull),
                jacksonTypeRef<LogisticsDiscrepancyInfosFull>(),
            )

        assertThat(roundtrippedLogisticsDiscrepancyInfosFull)
            .isEqualTo(logisticsDiscrepancyInfosFull)
    }
}
