// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsStocksFullTest {

    @Test
    fun create() {
        val logisticsStocksFull =
            LogisticsStocksFull.builder()
                .quantity(4)
                .sourceIcao("PHIK")
                .stockCheckTime(OffsetDateTime.parse("2023-07-13T13:47:00.123Z"))
                .stockPoc("SMITH, JOHN J")
                .build()

        assertThat(logisticsStocksFull.quantity()).contains(4)
        assertThat(logisticsStocksFull.sourceIcao()).contains("PHIK")
        assertThat(logisticsStocksFull.stockCheckTime())
            .contains(OffsetDateTime.parse("2023-07-13T13:47:00.123Z"))
        assertThat(logisticsStocksFull.stockPoc()).contains("SMITH, JOHN J")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsStocksFull =
            LogisticsStocksFull.builder()
                .quantity(4)
                .sourceIcao("PHIK")
                .stockCheckTime(OffsetDateTime.parse("2023-07-13T13:47:00.123Z"))
                .stockPoc("SMITH, JOHN J")
                .build()

        val roundtrippedLogisticsStocksFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsStocksFull),
                jacksonTypeRef<LogisticsStocksFull>(),
            )

        assertThat(roundtrippedLogisticsStocksFull).isEqualTo(logisticsStocksFull)
    }
}
