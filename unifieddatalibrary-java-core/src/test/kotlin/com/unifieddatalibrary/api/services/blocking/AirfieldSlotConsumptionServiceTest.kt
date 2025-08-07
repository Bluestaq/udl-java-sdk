// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionCountParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionCreateParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionListParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionRetrieveParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionTupleParams
import com.unifieddatalibrary.api.models.airfieldslotconsumptions.AirfieldSlotConsumptionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AirfieldSlotConsumptionServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotConsumptionService = client.airfieldSlotConsumptions()

        airfieldSlotConsumptionService.create(
            AirfieldSlotConsumptionCreateParams.builder()
                .classificationMarking("U")
                .dataMode(AirfieldSlotConsumptionCreateParams.DataMode.TEST)
                .idAirfieldSlot("3136498f-2969-3535-1432-e984b2e2e686")
                .numAircraft(1)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
                .id("be831d39-1822-da9f-7ace-6cc5643397dc")
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
                .status(AirfieldSlotConsumptionCreateParams.Status.APPROVED)
                .targetTime(OffsetDateTime.parse("2023-01-01T01:01:01.123Z"))
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotConsumptionService = client.airfieldSlotConsumptions()

        val airfieldslotconsumptionFull =
            airfieldSlotConsumptionService.retrieve(
                AirfieldSlotConsumptionRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        airfieldslotconsumptionFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotConsumptionService = client.airfieldSlotConsumptions()

        airfieldSlotConsumptionService.update(
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
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotConsumptionService = client.airfieldSlotConsumptions()

        val page =
            airfieldSlotConsumptionService.list(
                AirfieldSlotConsumptionListParams.builder()
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotConsumptionService = client.airfieldSlotConsumptions()

        airfieldSlotConsumptionService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotConsumptionService = client.airfieldSlotConsumptions()

        airfieldSlotConsumptionService.count(
            AirfieldSlotConsumptionCountParams.builder()
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotConsumptionService = client.airfieldSlotConsumptions()

        val response = airfieldSlotConsumptionService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotConsumptionService = client.airfieldSlotConsumptions()

        val airfieldslotconsumptionFulls =
            airfieldSlotConsumptionService.tuple(
                AirfieldSlotConsumptionTupleParams.builder()
                    .columns("columns")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        airfieldslotconsumptionFulls.forEach { it.validate() }
    }
}
