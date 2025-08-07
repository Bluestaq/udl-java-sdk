// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsRemarksFullTest {

    @Test
    fun create() {
        val logisticsRemarksFull =
            LogisticsRemarksFull.builder()
                .lastChanged(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .remark("EXAMPLE REMARK")
                .username("JSMITH")
                .build()

        assertThat(logisticsRemarksFull.lastChanged())
            .contains(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
        assertThat(logisticsRemarksFull.remark()).contains("EXAMPLE REMARK")
        assertThat(logisticsRemarksFull.username()).contains("JSMITH")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsRemarksFull =
            LogisticsRemarksFull.builder()
                .lastChanged(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                .remark("EXAMPLE REMARK")
                .username("JSMITH")
                .build()

        val roundtrippedLogisticsRemarksFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsRemarksFull),
                jacksonTypeRef<LogisticsRemarksFull>(),
            )

        assertThat(roundtrippedLogisticsRemarksFull).isEqualTo(logisticsRemarksFull)
    }
}
