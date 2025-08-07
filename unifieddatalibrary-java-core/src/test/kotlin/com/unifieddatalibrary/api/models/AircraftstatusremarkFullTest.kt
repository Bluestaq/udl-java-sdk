// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AircraftstatusremarkFullTest {

    @Test
    fun create() {
        val aircraftstatusremarkFull =
            AircraftstatusremarkFull.builder()
                .classificationMarking("U")
                .dataMode(AircraftstatusremarkFull.DataMode.TEST)
                .idAircraftStatus("388b1f64-ccff-4113-b049-3cf5542c2a42")
                .source("Bluestaq")
                .text("Remark text")
                .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .altRmkId("GDSSBL022307131714250077")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .lastUpdatedAt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                .lastUpdatedBy("JOHN SMITH")
                .name("DISCREPANCY - 202297501")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .timestamp(OffsetDateTime.parse("2024-01-01T15:00:00.123Z"))
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(aircraftstatusremarkFull.classificationMarking()).isEqualTo("U")
        assertThat(aircraftstatusremarkFull.dataMode())
            .isEqualTo(AircraftstatusremarkFull.DataMode.TEST)
        assertThat(aircraftstatusremarkFull.idAircraftStatus())
            .isEqualTo("388b1f64-ccff-4113-b049-3cf5542c2a42")
        assertThat(aircraftstatusremarkFull.source()).isEqualTo("Bluestaq")
        assertThat(aircraftstatusremarkFull.text()).isEqualTo("Remark text")
        assertThat(aircraftstatusremarkFull.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(aircraftstatusremarkFull.altRmkId()).contains("GDSSBL022307131714250077")
        assertThat(aircraftstatusremarkFull.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(aircraftstatusremarkFull.createdBy()).contains("some.user")
        assertThat(aircraftstatusremarkFull.lastUpdatedAt())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
        assertThat(aircraftstatusremarkFull.lastUpdatedBy()).contains("JOHN SMITH")
        assertThat(aircraftstatusremarkFull.name()).contains("DISCREPANCY - 202297501")
        assertThat(aircraftstatusremarkFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(aircraftstatusremarkFull.origNetwork()).contains("OPS1")
        assertThat(aircraftstatusremarkFull.sourceDl()).contains("AXE")
        assertThat(aircraftstatusremarkFull.timestamp())
            .contains(OffsetDateTime.parse("2024-01-01T15:00:00.123Z"))
        assertThat(aircraftstatusremarkFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(aircraftstatusremarkFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aircraftstatusremarkFull =
            AircraftstatusremarkFull.builder()
                .classificationMarking("U")
                .dataMode(AircraftstatusremarkFull.DataMode.TEST)
                .idAircraftStatus("388b1f64-ccff-4113-b049-3cf5542c2a42")
                .source("Bluestaq")
                .text("Remark text")
                .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .altRmkId("GDSSBL022307131714250077")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .lastUpdatedAt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                .lastUpdatedBy("JOHN SMITH")
                .name("DISCREPANCY - 202297501")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .timestamp(OffsetDateTime.parse("2024-01-01T15:00:00.123Z"))
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedAircraftstatusremarkFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aircraftstatusremarkFull),
                jacksonTypeRef<AircraftstatusremarkFull>(),
            )

        assertThat(roundtrippedAircraftstatusremarkFull).isEqualTo(aircraftstatusremarkFull)
    }
}
