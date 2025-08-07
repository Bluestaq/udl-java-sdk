// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsPartsFullTest {

    @Test
    fun create() {
        val logisticsPartsFull =
            LogisticsPartsFull.builder()
                .figureNumber("3")
                .indexNumber("4")
                .locationVerifier("JANE DOE")
                .addLogisticsStock(
                    LogisticsStocksFull.builder()
                        .quantity(4)
                        .sourceIcao("PHIK")
                        .stockCheckTime(OffsetDateTime.parse("2023-07-13T13:47:00.123Z"))
                        .stockPoc("SMITH, JOHN J")
                        .build()
                )
                .measurementUnitCode("EA")
                .nationalStockNumber("5310-00-045-3299")
                .partNumber("MS35338-42")
                .requestVerifier("JOHN SMITH")
                .supplyDocumentNumber("J223FU31908300")
                .technicalOrderText("1C-17A-4")
                .workUnitCode("5611UU001")
                .build()

        assertThat(logisticsPartsFull.figureNumber()).contains("3")
        assertThat(logisticsPartsFull.indexNumber()).contains("4")
        assertThat(logisticsPartsFull.locationVerifier()).contains("JANE DOE")
        assertThat(logisticsPartsFull.logisticsStocks().getOrNull())
            .containsExactly(
                LogisticsStocksFull.builder()
                    .quantity(4)
                    .sourceIcao("PHIK")
                    .stockCheckTime(OffsetDateTime.parse("2023-07-13T13:47:00.123Z"))
                    .stockPoc("SMITH, JOHN J")
                    .build()
            )
        assertThat(logisticsPartsFull.measurementUnitCode()).contains("EA")
        assertThat(logisticsPartsFull.nationalStockNumber()).contains("5310-00-045-3299")
        assertThat(logisticsPartsFull.partNumber()).contains("MS35338-42")
        assertThat(logisticsPartsFull.requestVerifier()).contains("JOHN SMITH")
        assertThat(logisticsPartsFull.supplyDocumentNumber()).contains("J223FU31908300")
        assertThat(logisticsPartsFull.technicalOrderText()).contains("1C-17A-4")
        assertThat(logisticsPartsFull.workUnitCode()).contains("5611UU001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsPartsFull =
            LogisticsPartsFull.builder()
                .figureNumber("3")
                .indexNumber("4")
                .locationVerifier("JANE DOE")
                .addLogisticsStock(
                    LogisticsStocksFull.builder()
                        .quantity(4)
                        .sourceIcao("PHIK")
                        .stockCheckTime(OffsetDateTime.parse("2023-07-13T13:47:00.123Z"))
                        .stockPoc("SMITH, JOHN J")
                        .build()
                )
                .measurementUnitCode("EA")
                .nationalStockNumber("5310-00-045-3299")
                .partNumber("MS35338-42")
                .requestVerifier("JOHN SMITH")
                .supplyDocumentNumber("J223FU31908300")
                .technicalOrderText("1C-17A-4")
                .workUnitCode("5611UU001")
                .build()

        val roundtrippedLogisticsPartsFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsPartsFull),
                jacksonTypeRef<LogisticsPartsFull>(),
            )

        assertThat(roundtrippedLogisticsPartsFull).isEqualTo(logisticsPartsFull)
    }
}
