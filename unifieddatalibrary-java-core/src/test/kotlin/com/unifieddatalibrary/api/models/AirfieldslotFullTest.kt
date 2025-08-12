// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.AirfieldslotFull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldslotFullTest {

    @Test
    fun create() {
      val airfieldslotFull = AirfieldslotFull.builder()
          .airfieldName("USAF Academy AFLD")
          .classificationMarking("U")
          .dataMode(AirfieldslotFull.DataMode.TEST)
          .name("Apron 5")
          .source("Bluestaq")
          .id("be831d39-1822-da9f-7ace-6cc5643397dc")
          .acSlotCat(AirfieldslotFull.AcSlotCat.WIDE)
          .altAirfieldId("ALT-AIRFIELD-ID")
          .capacity(5)
          .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .endTime("2359Z")
          .icao("KCOS")
          .idAirfield("3136498f-2969-3535-1432-e984b2e2e686")
          .minSeparation(7)
          .notes("Notes for an airfield slot.")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .sourceDl("AXE")
          .startTime("0000Z")
          .type(AirfieldslotFull.Type.WORKING)
          .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .build()

      assertThat(airfieldslotFull.airfieldName()).isEqualTo("USAF Academy AFLD")
      assertThat(airfieldslotFull.classificationMarking()).isEqualTo("U")
      assertThat(airfieldslotFull.dataMode()).isEqualTo(AirfieldslotFull.DataMode.TEST)
      assertThat(airfieldslotFull.name()).isEqualTo("Apron 5")
      assertThat(airfieldslotFull.source()).isEqualTo("Bluestaq")
      assertThat(airfieldslotFull.id()).contains("be831d39-1822-da9f-7ace-6cc5643397dc")
      assertThat(airfieldslotFull.acSlotCat()).contains(AirfieldslotFull.AcSlotCat.WIDE)
      assertThat(airfieldslotFull.altAirfieldId()).contains("ALT-AIRFIELD-ID")
      assertThat(airfieldslotFull.capacity()).contains(5)
      assertThat(airfieldslotFull.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
      assertThat(airfieldslotFull.createdBy()).contains("some.user")
      assertThat(airfieldslotFull.endTime()).contains("2359Z")
      assertThat(airfieldslotFull.icao()).contains("KCOS")
      assertThat(airfieldslotFull.idAirfield()).contains("3136498f-2969-3535-1432-e984b2e2e686")
      assertThat(airfieldslotFull.minSeparation()).contains(7)
      assertThat(airfieldslotFull.notes()).contains("Notes for an airfield slot.")
      assertThat(airfieldslotFull.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(airfieldslotFull.origNetwork()).contains("OPS1")
      assertThat(airfieldslotFull.sourceDl()).contains("AXE")
      assertThat(airfieldslotFull.startTime()).contains("0000Z")
      assertThat(airfieldslotFull.type()).contains(AirfieldslotFull.Type.WORKING)
      assertThat(airfieldslotFull.updatedAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
      assertThat(airfieldslotFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val airfieldslotFull = AirfieldslotFull.builder()
          .airfieldName("USAF Academy AFLD")
          .classificationMarking("U")
          .dataMode(AirfieldslotFull.DataMode.TEST)
          .name("Apron 5")
          .source("Bluestaq")
          .id("be831d39-1822-da9f-7ace-6cc5643397dc")
          .acSlotCat(AirfieldslotFull.AcSlotCat.WIDE)
          .altAirfieldId("ALT-AIRFIELD-ID")
          .capacity(5)
          .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .endTime("2359Z")
          .icao("KCOS")
          .idAirfield("3136498f-2969-3535-1432-e984b2e2e686")
          .minSeparation(7)
          .notes("Notes for an airfield slot.")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .sourceDl("AXE")
          .startTime("0000Z")
          .type(AirfieldslotFull.Type.WORKING)
          .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .build()

      val roundtrippedAirfieldslotFull = jsonMapper.readValue(jsonMapper.writeValueAsString(airfieldslotFull), jacksonTypeRef<AirfieldslotFull>())

      assertThat(roundtrippedAirfieldslotFull).isEqualTo(airfieldslotFull)
    }
}
