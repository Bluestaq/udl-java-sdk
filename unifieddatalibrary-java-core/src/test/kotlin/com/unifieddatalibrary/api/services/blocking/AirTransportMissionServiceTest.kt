// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCountParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionCreateParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionRetrieveParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionTupleParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AirTransportMissionServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airTransportMissionService = client.airTransportMissions()

        airTransportMissionService.create(
            AirTransportMissionCreateParams.builder()
                .classificationMarking("U")
                .dataMode(AirTransportMissionCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .id("bdad6945-c9e4-b829-f7be-1ad075541921")
                .abp("ZZ12")
                .alias("PACIFIC DEPLOY / CHAP 3 MOVEMENT")
                .allocatedUnit("437 AEW")
                .amcMissionId("AJM7939B1123")
                .apacsId("1083034")
                .atoCallSign("CHARLIE")
                .atoMissionId("8900")
                .callSign("RCH123")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .cw(true)
                .dipWorksheetName("G2-182402-AB")
                .firstPickUp("KFAY")
                .gdssMissionId("1e6edeec-72e9-aaec-d33c-51147cb5ffdd")
                .addHazMat(
                    AirTransportMissionCreateParams.HazMat.builder()
                        .applicableNotes("11,12")
                        .cgc("A")
                        .cgn("4,5,7,8")
                        .classDiv(1.1)
                        .extHazMatId("cb6289e0f38534e01291ab6421d42724")
                        .itemName("LITHIUM METAL BATTERIES")
                        .netExpWt(12.1)
                        .offIcao("MBPV")
                        .offItin(300)
                        .onIcao("LIRQ")
                        .onItin(50)
                        .pieces(29)
                        .planned("P")
                        .unNum("0181")
                        .weight(22.1)
                        .build()
                )
                .jcsPriority("1A3")
                .lastDropOff("PGUA")
                .loadCategoryType("MIXED")
                .m1("11")
                .m2("3214")
                .m3a("6655")
                .naf("18AF")
                .nextAmcMissionId("AJM7939B1124")
                .nextMissionId("186e5658-1079-45c0-bccc-02d2fa31b663")
                .node("45TEST")
                .objective("Deliver water to island X.")
                .operation("Golden Eye")
                .origin("THIRD_PARTY_DATASOURCE")
                .origMissionId("614bebb6-a62e-053c-ca51-e79f8a402b28")
                .origNetwork("OPS1")
                .prevAmcMissionId("AJM7939B1122")
                .prevMissionId("a77055df-edc3-4047-a5fa-604f80b9fe3c")
                .purpose(
                    "People at island X need water ASAP. Two previous attempts failed due to weather."
                )
                .addRemark(
                    AirTransportMissionCreateParams.Remark.builder()
                        .date(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                        .gdssRemarkId("GDSSREMARK-ID")
                        .itineraryNum(825)
                        .text("Example mission remarks.")
                        .type("MP")
                        .user("John Doe")
                        .build()
                )
                .addRequirement(
                    AirTransportMissionCreateParams.Requirement.builder()
                        .bulkWeight(1.3)
                        .ead(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .gdssReqId("23a1fb67-cc2d-5ebe-6b99-68130cb1aa6c")
                        .lad(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .numAmbulatory(10)
                        .numAttendant(10)
                        .numLitter(10)
                        .numPax(44)
                        .offloadId(300)
                        .offloadLoCode("KHOP")
                        .onloadId(200)
                        .onloadLoCode("KCHS")
                        .oplan("5027")
                        .outsizeWeight(1.3)
                        .oversizeWeight(1.3)
                        .projName("CENTINTRA21")
                        .transReqNum("T01ME01")
                        .uln("T01ME01")
                        .build()
                )
                .sourceDl("AXE")
                .sourceSysDeviation(-90.12)
                .state("EXECUTION")
                .type("SAAM")
                .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
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
        val airTransportMissionService = client.airTransportMissions()

        val airTransportMissionFull =
            airTransportMissionService.retrieve(
                AirTransportMissionRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        airTransportMissionFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airTransportMissionService = client.airTransportMissions()

        airTransportMissionService.update(
            AirTransportMissionUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AirTransportMissionUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .bodyId("bdad6945-c9e4-b829-f7be-1ad075541921")
                .abp("ZZ12")
                .alias("PACIFIC DEPLOY / CHAP 3 MOVEMENT")
                .allocatedUnit("437 AEW")
                .amcMissionId("AJM7939B1123")
                .apacsId("1083034")
                .atoCallSign("CHARLIE")
                .atoMissionId("8900")
                .callSign("RCH123")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .cw(true)
                .dipWorksheetName("G2-182402-AB")
                .firstPickUp("KFAY")
                .gdssMissionId("1e6edeec-72e9-aaec-d33c-51147cb5ffdd")
                .addHazMat(
                    AirTransportMissionUpdateParams.HazMat.builder()
                        .applicableNotes("11,12")
                        .cgc("A")
                        .cgn("4,5,7,8")
                        .classDiv(1.1)
                        .extHazMatId("cb6289e0f38534e01291ab6421d42724")
                        .itemName("LITHIUM METAL BATTERIES")
                        .netExpWt(12.1)
                        .offIcao("MBPV")
                        .offItin(300)
                        .onIcao("LIRQ")
                        .onItin(50)
                        .pieces(29)
                        .planned("P")
                        .unNum("0181")
                        .weight(22.1)
                        .build()
                )
                .jcsPriority("1A3")
                .lastDropOff("PGUA")
                .loadCategoryType("MIXED")
                .m1("11")
                .m2("3214")
                .m3a("6655")
                .naf("18AF")
                .nextAmcMissionId("AJM7939B1124")
                .nextMissionId("186e5658-1079-45c0-bccc-02d2fa31b663")
                .node("45TEST")
                .objective("Deliver water to island X.")
                .operation("Golden Eye")
                .origin("THIRD_PARTY_DATASOURCE")
                .origMissionId("614bebb6-a62e-053c-ca51-e79f8a402b28")
                .origNetwork("OPS1")
                .prevAmcMissionId("AJM7939B1122")
                .prevMissionId("a77055df-edc3-4047-a5fa-604f80b9fe3c")
                .purpose(
                    "People at island X need water ASAP. Two previous attempts failed due to weather."
                )
                .addRemark(
                    AirTransportMissionUpdateParams.Remark.builder()
                        .date(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                        .gdssRemarkId("GDSSREMARK-ID")
                        .itineraryNum(825)
                        .text("Example mission remarks.")
                        .type("MP")
                        .user("John Doe")
                        .build()
                )
                .addRequirement(
                    AirTransportMissionUpdateParams.Requirement.builder()
                        .bulkWeight(1.3)
                        .ead(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .gdssReqId("23a1fb67-cc2d-5ebe-6b99-68130cb1aa6c")
                        .lad(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .numAmbulatory(10)
                        .numAttendant(10)
                        .numLitter(10)
                        .numPax(44)
                        .offloadId(300)
                        .offloadLoCode("KHOP")
                        .onloadId(200)
                        .onloadLoCode("KCHS")
                        .oplan("5027")
                        .outsizeWeight(1.3)
                        .oversizeWeight(1.3)
                        .projName("CENTINTRA21")
                        .transReqNum("T01ME01")
                        .uln("T01ME01")
                        .build()
                )
                .sourceDl("AXE")
                .sourceSysDeviation(-90.12)
                .state("EXECUTION")
                .type("SAAM")
                .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
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
        val airTransportMissionService = client.airTransportMissions()

        val page =
            airTransportMissionService.list(
                AirTransportMissionListParams.builder()
                    .createdAt(LocalDate.parse("2019-12-27"))
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
        val airTransportMissionService = client.airTransportMissions()

        airTransportMissionService.count(
            AirTransportMissionCountParams.builder()
                .createdAt(LocalDate.parse("2019-12-27"))
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
        val airTransportMissionService = client.airTransportMissions()

        val response = airTransportMissionService.queryhelp()

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
        val airTransportMissionService = client.airTransportMissions()

        val airTransportMissionFulls =
            airTransportMissionService.tuple(
                AirTransportMissionTupleParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        airTransportMissionFulls.forEach { it.validate() }
    }
}
