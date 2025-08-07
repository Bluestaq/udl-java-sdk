// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCreateBulkParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieCreateParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryAodrParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryCountParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieHistoryQueryParams
import com.unifieddatalibrary.api.models.airoperations.aircraftsortie.AircraftSortieListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AircraftSortieServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftSortieService = client.airOperations().aircraftSortie()

        aircraftSortieService.create(
            AircraftSortieCreateParams.builder()
                .classificationMarking("U")
                .dataMode(AircraftSortieCreateParams.DataMode.TEST)
                .plannedDepTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .source("Bluestaq")
                .id("AIRCRAFTSORTIE-ID")
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
                .paperStatus(AircraftSortieCreateParams.PaperStatus.PUBLISHED)
                .papersVersion("1.1")
                .parkingLoc("KCOS")
                .passengers(17)
                .plannedArrTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .pprStatus(AircraftSortieCreateParams.PprStatus.PENDING)
                .primaryScl("ABC")
                .rawFileUri("Example URI")
                .reqConfig("C-1")
                .resultRemarks("Some remark about aircraft A")
                .rvnReq(AircraftSortieCreateParams.RvnReq.R)
                .scheduleRemarks("Some schedule remark about aircraft A")
                .secondaryScl("ABC")
                .soe("OPS")
                .sortieDate(LocalDate.parse("2021-01-01"))
                .sourceDl("AXE")
                .tailNumber("Tail_1")
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
        val aircraftSortieService = client.airOperations().aircraftSortie()

        val page =
            aircraftSortieService.list(
                AircraftSortieListParams.builder()
                    .plannedDepTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftSortieService = client.airOperations().aircraftSortie()

        aircraftSortieService.count(
            AircraftSortieCountParams.builder()
                .plannedDepTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftSortieService = client.airOperations().aircraftSortie()

        aircraftSortieService.createBulk(
            AircraftSortieCreateBulkParams.builder()
                .addBody(
                    AircraftSortieCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(AircraftSortieCreateBulkParams.Body.DataMode.TEST)
                        .plannedDepTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                        .source("Bluestaq")
                        .id("AIRCRAFTSORTIE-ID")
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
                        .paperStatus(AircraftSortieCreateBulkParams.Body.PaperStatus.PUBLISHED)
                        .papersVersion("1.1")
                        .parkingLoc("KCOS")
                        .passengers(17)
                        .plannedArrTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                        .pprStatus(AircraftSortieCreateBulkParams.Body.PprStatus.PENDING)
                        .primaryScl("ABC")
                        .rawFileUri("Example URI")
                        .reqConfig("C-1")
                        .resultRemarks("Some remark about aircraft A")
                        .rvnReq(AircraftSortieCreateBulkParams.Body.RvnReq.R)
                        .scheduleRemarks("Some schedule remark about aircraft A")
                        .secondaryScl("ABC")
                        .soe("OPS")
                        .sortieDate(LocalDate.parse("2021-01-01"))
                        .sourceDl("AXE")
                        .tailNumber("Tail_1")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun historyAodr() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftSortieService = client.airOperations().aircraftSortie()

        aircraftSortieService.historyAodr(
            AircraftSortieHistoryAodrParams.builder()
                .plannedDepTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .columns("columns")
                .firstResult(0L)
                .maxResults(0L)
                .notification("notification")
                .outputDelimiter("outputDelimiter")
                .outputFormat("outputFormat")
                .build()
        )
    }

    @Test
    fun historyCount() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftSortieService = client.airOperations().aircraftSortie()

        aircraftSortieService.historyCount(
            AircraftSortieHistoryCountParams.builder()
                .plannedDepTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun historyQuery() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftSortieService = client.airOperations().aircraftSortie()

        val aircraftsortieFulls =
            aircraftSortieService.historyQuery(
                AircraftSortieHistoryQueryParams.builder()
                    .plannedDepTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        aircraftsortieFulls.forEach { it.validate() }
    }
}
