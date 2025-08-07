// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyRetrieveParams
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyTupleParams
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AircraftSortyServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftSortyServiceAsync = client.aircraftSorties()

        val aircraftsortieFullFuture =
            aircraftSortyServiceAsync.retrieve(
                AircraftSortyRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val aircraftsortieFull = aircraftsortieFullFuture.get()
        aircraftsortieFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftSortyServiceAsync = client.aircraftSorties()

        val future =
            aircraftSortyServiceAsync.update(
                AircraftSortyUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(AircraftSortyUpdateParams.DataMode.TEST)
                    .plannedDepTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .source("Bluestaq")
                    .bodyId("AIRCRAFTSORTIE-ID")
                    .actualArrTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .actualBlockInTime(OffsetDateTime.parse("2021-01-01T01:06:01.123Z"))
                    .actualBlockOutTime(OffsetDateTime.parse("2021-01-01T00:55:01.123Z"))
                    .actualDepTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .aircraftAdsb("AE123C")
                    .aircraftAltId("ALT-AIRCRAFT-ID")
                    .aircraftEvent("Example event")
                    .aircraftMds("C017A")
                    .aircraftRemarks("Some remark about aircraft A")
                    .alertStatus(22)
                    .alertStatusCode("C1")
                    .amcMsnNum("AJM512571333")
                    .amcMsnType("SAAM")
                    .arrFaa("FAA1")
                    .arrIata("AAA")
                    .arrIcao("KCOS")
                    .arrItinerary(101)
                    .arrPurposeCode("O")
                    .callSign("BAKER")
                    .cargoConfig("C-1")
                    .commanderName("Smith")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .currentState("Park")
                    .delayCode("500")
                    .depFaa("FAA1")
                    .depIata("AAA")
                    .depIcao("KCOS")
                    .depItinerary(100)
                    .depPurposeCode("P")
                    .dhd(OffsetDateTime.parse("2021-01-03T01:01:01.123Z"))
                    .dhdReason("Due for maintenance")
                    .estArrTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .estBlockInTime(OffsetDateTime.parse("2021-01-01T01:06:01.123Z"))
                    .estBlockOutTime(OffsetDateTime.parse("2021-01-01T00:55:01.123Z"))
                    .estDepTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .filename("ExampleFileName")
                    .filesize(12)
                    .flightTime(104.5)
                    .fmDeskNum("7198675309")
                    .fmName("Smith")
                    .fuelReq(20000.1)
                    .gndTime(387.8)
                    .idAircraft("REF-AIRCRAFT-ID")
                    .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                    .jcsPriority("1A3")
                    .legNum(14)
                    .lineNumber(99)
                    .missionId("ABLE")
                    .missionUpdate(OffsetDateTime.parse("2024-09-09T01:01:01.123Z"))
                    .objectiveRemarks("Some objective remark about aircraft A")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origSortieId("A0640")
                    .oxyOnCrew(12.3)
                    .oxyOnPax(12.3)
                    .oxyReqCrew(12.3)
                    .oxyReqPax(12.3)
                    .paperStatus(AircraftSortyUpdateParams.PaperStatus.PUBLISHED)
                    .papersVersion("1.1")
                    .parkingLoc("KCOS")
                    .passengers(17)
                    .plannedArrTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .pprStatus(AircraftSortyUpdateParams.PprStatus.PENDING)
                    .primaryScl("ABC")
                    .rawFileUri("Example URI")
                    .reqConfig("C-1")
                    .resultRemarks("Some remark about aircraft A")
                    .rvnReq(AircraftSortyUpdateParams.RvnReq.R)
                    .scheduleRemarks("Some schedule remark about aircraft A")
                    .secondaryScl("ABC")
                    .soe("OPS")
                    .sortieDate(LocalDate.parse("2021-01-01"))
                    .sourceDl("AXE")
                    .tailNumber("Tail_1")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftSortyServiceAsync = client.aircraftSorties()

        val responseFuture = aircraftSortyServiceAsync.queryhelp()

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
        val aircraftSortyServiceAsync = client.aircraftSorties()

        val aircraftsortieFullsFuture =
            aircraftSortyServiceAsync.tuple(
                AircraftSortyTupleParams.builder()
                    .columns("columns")
                    .plannedDepTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val aircraftsortieFulls = aircraftsortieFullsFuture.get()
        aircraftsortieFulls.forEach { it.validate() }
    }
}
