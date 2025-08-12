// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraft

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.aircraft.AircraftAbridged
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AircraftAbridgedTest {

    @Test
    fun create() {
      val aircraftAbridged = AircraftAbridged.builder()
          .aircraftMds("E-2C HAWKEYE")
          .classificationMarking("U")
          .dataMode(AircraftAbridged.DataMode.TEST)
          .source("Bluestaq")
          .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
          .category("M")
          .command("HQACC")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .cruiseSpeed(915.0)
          .dtd("005")
          .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
          .maxSpeed(2655.1)
          .minReqRunwayFt(3000)
          .minReqRunwayM(1000)
          .nominalTaTime(500)
          .notes("Notes for this aircraft")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .owner("437AW")
          .serialNumber("7007187")
          .sourceDl("AXE")
          .tailNumber("N702JG")
          .build()

      assertThat(aircraftAbridged.aircraftMds()).isEqualTo("E-2C HAWKEYE")
      assertThat(aircraftAbridged.classificationMarking()).isEqualTo("U")
      assertThat(aircraftAbridged.dataMode()).isEqualTo(AircraftAbridged.DataMode.TEST)
      assertThat(aircraftAbridged.source()).isEqualTo("Bluestaq")
      assertThat(aircraftAbridged.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
      assertThat(aircraftAbridged.category()).contains("M")
      assertThat(aircraftAbridged.command()).contains("HQACC")
      assertThat(aircraftAbridged.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(aircraftAbridged.createdBy()).contains("some.user")
      assertThat(aircraftAbridged.cruiseSpeed()).contains(915.0)
      assertThat(aircraftAbridged.dtd()).contains("005")
      assertThat(aircraftAbridged.idEntity()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
      assertThat(aircraftAbridged.maxSpeed()).contains(2655.1)
      assertThat(aircraftAbridged.minReqRunwayFt()).contains(3000)
      assertThat(aircraftAbridged.minReqRunwayM()).contains(1000)
      assertThat(aircraftAbridged.nominalTaTime()).contains(500)
      assertThat(aircraftAbridged.notes()).contains("Notes for this aircraft")
      assertThat(aircraftAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(aircraftAbridged.origNetwork()).contains("OPS1")
      assertThat(aircraftAbridged.owner()).contains("437AW")
      assertThat(aircraftAbridged.serialNumber()).contains("7007187")
      assertThat(aircraftAbridged.sourceDl()).contains("AXE")
      assertThat(aircraftAbridged.tailNumber()).contains("N702JG")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val aircraftAbridged = AircraftAbridged.builder()
          .aircraftMds("E-2C HAWKEYE")
          .classificationMarking("U")
          .dataMode(AircraftAbridged.DataMode.TEST)
          .source("Bluestaq")
          .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
          .category("M")
          .command("HQACC")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .cruiseSpeed(915.0)
          .dtd("005")
          .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
          .maxSpeed(2655.1)
          .minReqRunwayFt(3000)
          .minReqRunwayM(1000)
          .nominalTaTime(500)
          .notes("Notes for this aircraft")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .owner("437AW")
          .serialNumber("7007187")
          .sourceDl("AXE")
          .tailNumber("N702JG")
          .build()

      val roundtrippedAircraftAbridged = jsonMapper.readValue(jsonMapper.writeValueAsString(aircraftAbridged), jacksonTypeRef<AircraftAbridged>())

      assertThat(roundtrippedAircraftAbridged).isEqualTo(aircraftAbridged)
    }
}
