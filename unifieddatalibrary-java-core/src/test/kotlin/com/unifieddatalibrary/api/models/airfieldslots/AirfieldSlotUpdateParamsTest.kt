// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslots

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldSlotUpdateParamsTest {

    @Test
    fun create() {
        AirfieldSlotUpdateParams.builder()
            .pathId("id")
            .airfieldName("USAF Academy AFLD")
            .classificationMarking("U")
            .dataMode(AirfieldSlotUpdateParams.DataMode.TEST)
            .name("Apron 5")
            .source("Bluestaq")
            .bodyId("be831d39-1822-da9f-7ace-6cc5643397dc")
            .acSlotCat(AirfieldSlotUpdateParams.AcSlotCat.WIDE)
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
            .type(AirfieldSlotUpdateParams.Type.WORKING)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AirfieldSlotUpdateParams.builder()
                .pathId("id")
                .airfieldName("USAF Academy AFLD")
                .classificationMarking("U")
                .dataMode(AirfieldSlotUpdateParams.DataMode.TEST)
                .name("Apron 5")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AirfieldSlotUpdateParams.builder()
                .pathId("id")
                .airfieldName("USAF Academy AFLD")
                .classificationMarking("U")
                .dataMode(AirfieldSlotUpdateParams.DataMode.TEST)
                .name("Apron 5")
                .source("Bluestaq")
                .bodyId("be831d39-1822-da9f-7ace-6cc5643397dc")
                .acSlotCat(AirfieldSlotUpdateParams.AcSlotCat.WIDE)
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
                .type(AirfieldSlotUpdateParams.Type.WORKING)
                .build()

        val body = params._body()

        assertThat(body.airfieldName()).isEqualTo("USAF Academy AFLD")
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AirfieldSlotUpdateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("Apron 5")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(body.acSlotCat()).contains(AirfieldSlotUpdateParams.AcSlotCat.WIDE)
        assertThat(body.altAirfieldId()).contains("ALT-AIRFIELD-ID")
        assertThat(body.capacity()).contains(5)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.endTime()).contains("2359Z")
        assertThat(body.icao()).contains("KCOS")
        assertThat(body.idAirfield()).contains("3136498f-2969-3535-1432-e984b2e2e686")
        assertThat(body.minSeparation()).contains(7)
        assertThat(body.notes()).contains("Notes for an airfield slot.")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.startTime()).contains("0000Z")
        assertThat(body.type()).contains(AirfieldSlotUpdateParams.Type.WORKING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AirfieldSlotUpdateParams.builder()
                .pathId("id")
                .airfieldName("USAF Academy AFLD")
                .classificationMarking("U")
                .dataMode(AirfieldSlotUpdateParams.DataMode.TEST)
                .name("Apron 5")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.airfieldName()).isEqualTo("USAF Academy AFLD")
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AirfieldSlotUpdateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("Apron 5")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
