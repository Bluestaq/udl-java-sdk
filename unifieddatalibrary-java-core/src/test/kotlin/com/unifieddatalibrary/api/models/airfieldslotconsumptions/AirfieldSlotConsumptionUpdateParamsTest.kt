// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslotconsumptions

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldSlotConsumptionUpdateParamsTest {

    @Test
    fun create() {
        AirfieldSlotConsumptionUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(AirfieldSlotConsumptionUpdateParams.DataMode.TEST)
            .idAirfieldSlot("3136498f-2969-3535-1432-e984b2e2e686")
            .numAircraft(1)
            .source("Bluestaq")
            .startTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
            .bodyId("be831d39-1822-da9f-7ace-6cc5643397dc")
            .altArrSortieId("ALT-SORTIE-ID")
            .altDepSortieId("ALT-SORTIE-ID")
            .appComment("The request was denied due to inoperable fuel pumps.")
            .appInitials("CB")
            .appOrg("KCHS/BOPS")
            .callSigns(listOf("RCH123", "ABC123", "LLS442"))
            .consumer("APRON1-230401001")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .endTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
            .idArrSortie("be831d39-1822-da9f-7ace-6cc5643397dc")
            .idDepSortie("1e6edeec-72e9-aaec-d33c-51147cb5ffdd")
            .missionId("AJM123456123")
            .occAircraftMds("C017A")
            .occStartTime(OffsetDateTime.parse("2023-01-01T01:01:03.123Z"))
            .occTailNumber("N702JG")
            .occupied(true)
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .reqComment("Sorry for the late notice.")
            .reqInitials("CB")
            .reqOrg("TACC")
            .resAircraftMds("C017A")
            .resMissionId("AJM123456123")
            .resReason("Maintenance needed")
            .resTailNumber("N702JG")
            .resType("M")
            .sourceDl("AXE")
            .status(AirfieldSlotConsumptionUpdateParams.Status.APPROVED)
            .targetTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AirfieldSlotConsumptionUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AirfieldSlotConsumptionUpdateParams.DataMode.TEST)
                .idAirfieldSlot("3136498f-2969-3535-1432-e984b2e2e686")
                .numAircraft(1)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AirfieldSlotConsumptionUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AirfieldSlotConsumptionUpdateParams.DataMode.TEST)
                .idAirfieldSlot("3136498f-2969-3535-1432-e984b2e2e686")
                .numAircraft(1)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
                .bodyId("be831d39-1822-da9f-7ace-6cc5643397dc")
                .altArrSortieId("ALT-SORTIE-ID")
                .altDepSortieId("ALT-SORTIE-ID")
                .appComment("The request was denied due to inoperable fuel pumps.")
                .appInitials("CB")
                .appOrg("KCHS/BOPS")
                .callSigns(listOf("RCH123", "ABC123", "LLS442"))
                .consumer("APRON1-230401001")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
                .idArrSortie("be831d39-1822-da9f-7ace-6cc5643397dc")
                .idDepSortie("1e6edeec-72e9-aaec-d33c-51147cb5ffdd")
                .missionId("AJM123456123")
                .occAircraftMds("C017A")
                .occStartTime(OffsetDateTime.parse("2023-01-01T01:01:03.123Z"))
                .occTailNumber("N702JG")
                .occupied(true)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .reqComment("Sorry for the late notice.")
                .reqInitials("CB")
                .reqOrg("TACC")
                .resAircraftMds("C017A")
                .resMissionId("AJM123456123")
                .resReason("Maintenance needed")
                .resTailNumber("N702JG")
                .resType("M")
                .sourceDl("AXE")
                .status(AirfieldSlotConsumptionUpdateParams.Status.APPROVED)
                .targetTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AirfieldSlotConsumptionUpdateParams.DataMode.TEST)
        assertThat(body.idAirfieldSlot()).isEqualTo("3136498f-2969-3535-1432-e984b2e2e686")
        assertThat(body.numAircraft()).isEqualTo(1)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
        assertThat(body.bodyId()).contains("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(body.altArrSortieId()).contains("ALT-SORTIE-ID")
        assertThat(body.altDepSortieId()).contains("ALT-SORTIE-ID")
        assertThat(body.appComment())
            .contains("The request was denied due to inoperable fuel pumps.")
        assertThat(body.appInitials()).contains("CB")
        assertThat(body.appOrg()).contains("KCHS/BOPS")
        assertThat(body.callSigns().getOrNull()).containsExactly("RCH123", "ABC123", "LLS442")
        assertThat(body.consumer()).contains("APRON1-230401001")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
        assertThat(body.idArrSortie()).contains("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(body.idDepSortie()).contains("1e6edeec-72e9-aaec-d33c-51147cb5ffdd")
        assertThat(body.missionId()).contains("AJM123456123")
        assertThat(body.occAircraftMds()).contains("C017A")
        assertThat(body.occStartTime()).contains(OffsetDateTime.parse("2023-01-01T01:01:03.123Z"))
        assertThat(body.occTailNumber()).contains("N702JG")
        assertThat(body.occupied()).contains(true)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.reqComment()).contains("Sorry for the late notice.")
        assertThat(body.reqInitials()).contains("CB")
        assertThat(body.reqOrg()).contains("TACC")
        assertThat(body.resAircraftMds()).contains("C017A")
        assertThat(body.resMissionId()).contains("AJM123456123")
        assertThat(body.resReason()).contains("Maintenance needed")
        assertThat(body.resTailNumber()).contains("N702JG")
        assertThat(body.resType()).contains("M")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.status()).contains(AirfieldSlotConsumptionUpdateParams.Status.APPROVED)
        assertThat(body.targetTime()).contains(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AirfieldSlotConsumptionUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AirfieldSlotConsumptionUpdateParams.DataMode.TEST)
                .idAirfieldSlot("3136498f-2969-3535-1432-e984b2e2e686")
                .numAircraft(1)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AirfieldSlotConsumptionUpdateParams.DataMode.TEST)
        assertThat(body.idAirfieldSlot()).isEqualTo("3136498f-2969-3535-1432-e984b2e2e686")
        assertThat(body.numAircraft()).isEqualTo(1)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
    }
}
