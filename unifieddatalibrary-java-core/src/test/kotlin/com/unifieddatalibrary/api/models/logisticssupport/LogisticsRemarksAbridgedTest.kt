// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsRemarksAbridgedTest {

    @Test
    fun create() {
        val logisticsRemarksAbridged =
            LogisticsRemarksAbridged.builder()
                .lastChanged(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .remark("EXAMPLE REMARK")
                .username("JSMITH")
                .build()

        assertThat(logisticsRemarksAbridged.lastChanged())
            .contains(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
        assertThat(logisticsRemarksAbridged.remark()).contains("EXAMPLE REMARK")
        assertThat(logisticsRemarksAbridged.username()).contains("JSMITH")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsRemarksAbridged =
            LogisticsRemarksAbridged.builder()
                .lastChanged(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .remark("EXAMPLE REMARK")
                .username("JSMITH")
                .build()

        val roundtrippedLogisticsRemarksAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsRemarksAbridged),
                jacksonTypeRef<LogisticsRemarksAbridged>(),
            )

        assertThat(roundtrippedLogisticsRemarksAbridged).isEqualTo(logisticsRemarksAbridged)
    }
}
