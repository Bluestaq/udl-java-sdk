// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusCountParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusCreateParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusRetrieveParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusTupleParams
import com.unifieddatalibrary.api.models.aircraftstatuses.AircraftStatusUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AircraftStatusServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusServiceAsync = client.aircraftStatuses()

        val future =
            aircraftStatusServiceAsync.create(
                AircraftStatusCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(AircraftStatusCreateParams.DataMode.TEST)
                    .idAircraft("29232269-e4c2-45c9-aa21-039a33209340")
                    .source("Bluestaq")
                    .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .additionalSys(listOf("ATOMS", "TUDL", "BLOS1"))
                    .airToAirStatus(AircraftStatusCreateParams.AirToAirStatus.OPERATIONAL)
                    .airToGroundStatus(AircraftStatusCreateParams.AirToGroundStatus.OPERATIONAL)
                    .alphaStatusCode("A2")
                    .altAircraftId("ORIG-AIRCRAFT-ID")
                    .contaminationStatus("CLEAR")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .currentIcao("KCHS")
                    .currentState("AVAILABLE")
                    .earliestTaEndTime(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .etic(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .flightPhase("Landing")
                    .fuel(10)
                    .fuelFunction("Burn")
                    .fuelStatus("DELIVERED")
                    .geoLoc("AJJY")
                    .groundStatus("ALERT")
                    .gunCapable(true)
                    .gunRdsMax(550)
                    .gunRdsMin(150)
                    .gunRdsType("7.62 MM")
                    .idAirfield("b89430e3-97d9-408c-9c89-fd3840c4b84d")
                    .idPoi("0e52f081-a2e3-4b73-b822-88b882232691")
                    .addInventory("AIM-9 SIDEWINDER")
                    .addInventory("AIM-120 AMRAAM")
                    .addInventoryMax(2)
                    .addInventoryMax(2)
                    .addInventoryMin(1)
                    .addInventoryMin(2)
                    .lastInspectionDate(OffsetDateTime.parse("2024-09-09T16:00:00.123Z"))
                    .lastUpdatedBy("some.user")
                    .maintPoc("PSUP NIGHT SHIFT 800-555-4412")
                    .maintPriority("1")
                    .maintStatus("maintenance status")
                    .maintStatusDriver("SCREW STUCK IN LEFT NLG TIRE")
                    .maintStatusUpdate(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .missionReadiness("ABLE")
                    .mxRemark("COM2 INOP")
                    .nextIcao("PHNL")
                    .notes("Some notes for aircraft A")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .parkLocation("B1")
                    .parkLocationSystem("GDSS")
                    .previousIcao("EGLL")
                    .sourceDl("AXE")
                    .taStartTime(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .troubleshootEtic(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .addUnavailableSy("CMDS")
                    .addUnavailableSy("AOC")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusServiceAsync = client.aircraftStatuses()

        val aircraftstatusFullFuture =
            aircraftStatusServiceAsync.retrieve(
                AircraftStatusRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val aircraftstatusFull = aircraftstatusFullFuture.get()
        aircraftstatusFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusServiceAsync = client.aircraftStatuses()

        val future =
            aircraftStatusServiceAsync.update(
                AircraftStatusUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(AircraftStatusUpdateParams.DataMode.TEST)
                    .idAircraft("29232269-e4c2-45c9-aa21-039a33209340")
                    .source("Bluestaq")
                    .bodyId("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .additionalSys(listOf("ATOMS", "TUDL", "BLOS1"))
                    .airToAirStatus(AircraftStatusUpdateParams.AirToAirStatus.OPERATIONAL)
                    .airToGroundStatus(AircraftStatusUpdateParams.AirToGroundStatus.OPERATIONAL)
                    .alphaStatusCode("A2")
                    .altAircraftId("ORIG-AIRCRAFT-ID")
                    .contaminationStatus("CLEAR")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .currentIcao("KCHS")
                    .currentState("AVAILABLE")
                    .earliestTaEndTime(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .etic(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .flightPhase("Landing")
                    .fuel(10)
                    .fuelFunction("Burn")
                    .fuelStatus("DELIVERED")
                    .geoLoc("AJJY")
                    .groundStatus("ALERT")
                    .gunCapable(true)
                    .gunRdsMax(550)
                    .gunRdsMin(150)
                    .gunRdsType("7.62 MM")
                    .idAirfield("b89430e3-97d9-408c-9c89-fd3840c4b84d")
                    .idPoi("0e52f081-a2e3-4b73-b822-88b882232691")
                    .addInventory("AIM-9 SIDEWINDER")
                    .addInventory("AIM-120 AMRAAM")
                    .addInventoryMax(2)
                    .addInventoryMax(2)
                    .addInventoryMin(1)
                    .addInventoryMin(2)
                    .lastInspectionDate(OffsetDateTime.parse("2024-09-09T16:00:00.123Z"))
                    .lastUpdatedBy("some.user")
                    .maintPoc("PSUP NIGHT SHIFT 800-555-4412")
                    .maintPriority("1")
                    .maintStatus("maintenance status")
                    .maintStatusDriver("SCREW STUCK IN LEFT NLG TIRE")
                    .maintStatusUpdate(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .missionReadiness("ABLE")
                    .mxRemark("COM2 INOP")
                    .nextIcao("PHNL")
                    .notes("Some notes for aircraft A")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .parkLocation("B1")
                    .parkLocationSystem("GDSS")
                    .previousIcao("EGLL")
                    .sourceDl("AXE")
                    .taStartTime(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .troubleshootEtic(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .addUnavailableSy("CMDS")
                    .addUnavailableSy("AOC")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusServiceAsync = client.aircraftStatuses()

        val pageFuture = aircraftStatusServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusServiceAsync = client.aircraftStatuses()

        val future = aircraftStatusServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusServiceAsync = client.aircraftStatuses()

        val responseFuture =
            aircraftStatusServiceAsync.count(
                AircraftStatusCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusServiceAsync = client.aircraftStatuses()

        val responseFuture = aircraftStatusServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusServiceAsync = client.aircraftStatuses()

        val aircraftstatusFullsFuture =
            aircraftStatusServiceAsync.tuple(
                AircraftStatusTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val aircraftstatusFulls = aircraftstatusFullsFuture.get()
        aircraftstatusFulls.forEach { it.validate() }
    }
}
