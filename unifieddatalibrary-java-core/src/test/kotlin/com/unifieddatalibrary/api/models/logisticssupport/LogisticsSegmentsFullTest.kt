// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsSegmentsFullTest {

    @Test
    fun create() {
        val logisticsSegmentsFull =
            LogisticsSegmentsFull.builder()
                .arrivalIcao("YBCS")
                .departureIcao("PHIK")
                .extMissionId("2001101RF01202307062205")
                .idMission("EXAMPLE-UUID")
                .itin(200)
                .missionNumber("TAM308901196")
                .missionType("SAAM")
                .modeCode("A")
                .segActArrTime(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
                .segActDepTime(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
                .segAircraftMds("B7772E")
                .segEstArrTime(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
                .segEstDepTime(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
                .segmentNumber(3)
                .segTailNumber("N819AX")
                .build()

        assertThat(logisticsSegmentsFull.arrivalIcao()).contains("YBCS")
        assertThat(logisticsSegmentsFull.departureIcao()).contains("PHIK")
        assertThat(logisticsSegmentsFull.extMissionId()).contains("2001101RF01202307062205")
        assertThat(logisticsSegmentsFull.idMission()).contains("EXAMPLE-UUID")
        assertThat(logisticsSegmentsFull.itin()).contains(200)
        assertThat(logisticsSegmentsFull.missionNumber()).contains("TAM308901196")
        assertThat(logisticsSegmentsFull.missionType()).contains("SAAM")
        assertThat(logisticsSegmentsFull.modeCode()).contains("A")
        assertThat(logisticsSegmentsFull.segActArrTime())
            .contains(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
        assertThat(logisticsSegmentsFull.segActDepTime())
            .contains(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
        assertThat(logisticsSegmentsFull.segAircraftMds()).contains("B7772E")
        assertThat(logisticsSegmentsFull.segEstArrTime())
            .contains(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
        assertThat(logisticsSegmentsFull.segEstDepTime())
            .contains(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
        assertThat(logisticsSegmentsFull.segmentNumber()).contains(3)
        assertThat(logisticsSegmentsFull.segTailNumber()).contains("N819AX")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsSegmentsFull =
            LogisticsSegmentsFull.builder()
                .arrivalIcao("YBCS")
                .departureIcao("PHIK")
                .extMissionId("2001101RF01202307062205")
                .idMission("EXAMPLE-UUID")
                .itin(200)
                .missionNumber("TAM308901196")
                .missionType("SAAM")
                .modeCode("A")
                .segActArrTime(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
                .segActDepTime(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
                .segAircraftMds("B7772E")
                .segEstArrTime(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
                .segEstDepTime(OffsetDateTime.parse("2023-07-17T19:20:00.123Z"))
                .segmentNumber(3)
                .segTailNumber("N819AX")
                .build()

        val roundtrippedLogisticsSegmentsFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsSegmentsFull),
                jacksonTypeRef<LogisticsSegmentsFull>(),
            )

        assertThat(roundtrippedLogisticsSegmentsFull).isEqualTo(logisticsSegmentsFull)
    }
}
