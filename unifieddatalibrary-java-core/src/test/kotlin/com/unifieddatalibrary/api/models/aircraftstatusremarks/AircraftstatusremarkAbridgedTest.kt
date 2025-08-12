// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraftstatusremarks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftstatusremarkAbridged
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AircraftstatusremarkAbridgedTest {

    @Test
    fun create() {
      val aircraftstatusremarkAbridged = AircraftstatusremarkAbridged.builder()
          .classificationMarking("U")
          .dataMode(AircraftstatusremarkAbridged.DataMode.TEST)
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
          .build()

      assertThat(aircraftstatusremarkAbridged.classificationMarking()).isEqualTo("U")
      assertThat(aircraftstatusremarkAbridged.dataMode()).isEqualTo(AircraftstatusremarkAbridged.DataMode.TEST)
      assertThat(aircraftstatusremarkAbridged.idAircraftStatus()).isEqualTo("388b1f64-ccff-4113-b049-3cf5542c2a42")
      assertThat(aircraftstatusremarkAbridged.source()).isEqualTo("Bluestaq")
      assertThat(aircraftstatusremarkAbridged.text()).isEqualTo("Remark text")
      assertThat(aircraftstatusremarkAbridged.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
      assertThat(aircraftstatusremarkAbridged.altRmkId()).contains("GDSSBL022307131714250077")
      assertThat(aircraftstatusremarkAbridged.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
      assertThat(aircraftstatusremarkAbridged.createdBy()).contains("some.user")
      assertThat(aircraftstatusremarkAbridged.lastUpdatedAt()).contains(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
      assertThat(aircraftstatusremarkAbridged.lastUpdatedBy()).contains("JOHN SMITH")
      assertThat(aircraftstatusremarkAbridged.name()).contains("DISCREPANCY - 202297501")
      assertThat(aircraftstatusremarkAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(aircraftstatusremarkAbridged.origNetwork()).contains("OPS1")
      assertThat(aircraftstatusremarkAbridged.sourceDl()).contains("AXE")
      assertThat(aircraftstatusremarkAbridged.timestamp()).contains(OffsetDateTime.parse("2024-01-01T15:00:00.123Z"))
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val aircraftstatusremarkAbridged = AircraftstatusremarkAbridged.builder()
          .classificationMarking("U")
          .dataMode(AircraftstatusremarkAbridged.DataMode.TEST)
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
          .build()

      val roundtrippedAircraftstatusremarkAbridged = jsonMapper.readValue(jsonMapper.writeValueAsString(aircraftstatusremarkAbridged), jacksonTypeRef<AircraftstatusremarkAbridged>())

      assertThat(roundtrippedAircraftstatusremarkAbridged).isEqualTo(aircraftstatusremarkAbridged)
    }
}
