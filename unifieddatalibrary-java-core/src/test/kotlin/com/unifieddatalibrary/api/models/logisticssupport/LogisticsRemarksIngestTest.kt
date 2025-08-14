// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsRemarksIngestTest {

    @Test
    fun create() {
        val logisticsRemarksIngest =
            LogisticsRemarksIngest.builder()
                .lastChanged(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .remark("EXAMPLE REMARK")
                .username("JSMITH")
                .build()

        assertThat(logisticsRemarksIngest.lastChanged())
            .contains(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
        assertThat(logisticsRemarksIngest.remark()).contains("EXAMPLE REMARK")
        assertThat(logisticsRemarksIngest.username()).contains("JSMITH")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsRemarksIngest =
            LogisticsRemarksIngest.builder()
                .lastChanged(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .remark("EXAMPLE REMARK")
                .username("JSMITH")
                .build()

        val roundtrippedLogisticsRemarksIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsRemarksIngest),
                jacksonTypeRef<LogisticsRemarksIngest>(),
            )

        assertThat(roundtrippedLogisticsRemarksIngest).isEqualTo(logisticsRemarksIngest)
    }
}
