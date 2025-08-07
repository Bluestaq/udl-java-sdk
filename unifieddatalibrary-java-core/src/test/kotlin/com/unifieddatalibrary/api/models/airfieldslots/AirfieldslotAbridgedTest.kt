// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslots

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldslotAbridgedTest {

    @Test
    fun create() {
        val airfieldslotAbridged =
            AirfieldslotAbridged.builder()
                .airfieldName("USAF Academy AFLD")
                .classificationMarking("U")
                .dataMode(AirfieldslotAbridged.DataMode.TEST)
                .name("Apron 5")
                .source("Bluestaq")
                .id("be831d39-1822-da9f-7ace-6cc5643397dc")
                .acSlotCat(AirfieldslotAbridged.AcSlotCat.WIDE)
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
                .type(AirfieldslotAbridged.Type.WORKING)
                .build()

        assertThat(airfieldslotAbridged.airfieldName()).isEqualTo("USAF Academy AFLD")
        assertThat(airfieldslotAbridged.classificationMarking()).isEqualTo("U")
        assertThat(airfieldslotAbridged.dataMode()).isEqualTo(AirfieldslotAbridged.DataMode.TEST)
        assertThat(airfieldslotAbridged.name()).isEqualTo("Apron 5")
        assertThat(airfieldslotAbridged.source()).isEqualTo("Bluestaq")
        assertThat(airfieldslotAbridged.id()).contains("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(airfieldslotAbridged.acSlotCat()).contains(AirfieldslotAbridged.AcSlotCat.WIDE)
        assertThat(airfieldslotAbridged.altAirfieldId()).contains("ALT-AIRFIELD-ID")
        assertThat(airfieldslotAbridged.capacity()).contains(5)
        assertThat(airfieldslotAbridged.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(airfieldslotAbridged.createdBy()).contains("some.user")
        assertThat(airfieldslotAbridged.endTime()).contains("2359Z")
        assertThat(airfieldslotAbridged.icao()).contains("KCOS")
        assertThat(airfieldslotAbridged.idAirfield())
            .contains("3136498f-2969-3535-1432-e984b2e2e686")
        assertThat(airfieldslotAbridged.minSeparation()).contains(7)
        assertThat(airfieldslotAbridged.notes()).contains("Notes for an airfield slot.")
        assertThat(airfieldslotAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(airfieldslotAbridged.origNetwork()).contains("OPS1")
        assertThat(airfieldslotAbridged.sourceDl()).contains("AXE")
        assertThat(airfieldslotAbridged.startTime()).contains("0000Z")
        assertThat(airfieldslotAbridged.type()).contains(AirfieldslotAbridged.Type.WORKING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airfieldslotAbridged =
            AirfieldslotAbridged.builder()
                .airfieldName("USAF Academy AFLD")
                .classificationMarking("U")
                .dataMode(AirfieldslotAbridged.DataMode.TEST)
                .name("Apron 5")
                .source("Bluestaq")
                .id("be831d39-1822-da9f-7ace-6cc5643397dc")
                .acSlotCat(AirfieldslotAbridged.AcSlotCat.WIDE)
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
                .type(AirfieldslotAbridged.Type.WORKING)
                .build()

        val roundtrippedAirfieldslotAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airfieldslotAbridged),
                jacksonTypeRef<AirfieldslotAbridged>(),
            )

        assertThat(roundtrippedAirfieldslotAbridged).isEqualTo(airfieldslotAbridged)
    }
}
