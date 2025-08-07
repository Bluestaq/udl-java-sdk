// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.diplomaticclearance

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiplomaticClearanceUnvalidatedPublishParamsTest {

    @Test
    fun create() {
        DiplomaticClearanceUnvalidatedPublishParams.builder()
            .addBody(
                DiplomaticClearanceUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(DiplomaticClearanceUnvalidatedPublishParams.Body.DataMode.TEST)
                    .firstDepDate(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .idMission("0dba1363-2d09-49fa-a784-4bb4cbb1674a")
                    .source("Bluestaq")
                    .id("25059135-4afc-45c2-b78b-d6e843dbd96d")
                    .apacsId("1083034")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .addDiplomaticClearanceDetail(
                        DiplomaticClearanceUnvalidatedPublishParams.Body.DiplomaticClearanceDetail
                            .builder()
                            .action("O")
                            .altCountryCode("IZ")
                            .clearanceId("MFMW225662GHQ")
                            .clearanceRemark("Clearance remarks")
                            .clearedCallSign("FALCN09")
                            .countryCode("NL")
                            .countryName("NETHERLANDS")
                            .entryNet(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .entryPoint("LOMOS")
                            .exitNlt(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .exitPoint("BUDOP")
                            .externalClearanceId("aa714f4d52a37ab1a00b21af9566e379")
                            .idSortie("207010e0-f97d-431c-8c00-7e46acfef0f5")
                            .legNum(825)
                            .profile("T LAND/OFLY IATA COMPLIANT CARGO 23")
                            .reqIcao(true)
                            .reqPoint(true)
                            .routeString("DCT DOH P430 BAYAN/M062F150 P430 RAMKI")
                            .sequenceNum(3)
                            .status("IN WORK")
                            .validDesc("CY2023")
                            .validEndTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .validStartTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .windowRemark("Period remarks")
                            .build()
                    )
                    .addDiplomaticClearanceRemark(
                        DiplomaticClearanceUnvalidatedPublishParams.Body.DiplomaticClearanceRemark
                            .builder()
                            .date(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .gdssRemarkId("GDSSREMARK-ID")
                            .text("Example mission remarks.")
                            .user("John Doe")
                            .build()
                    )
                    .dipWorksheetName("G2-939911-AC")
                    .docDeadline(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .externalWorksheetId("990ae849089e3d6cad69655324176bb6")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .sourceDl("AXE")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DiplomaticClearanceUnvalidatedPublishParams.builder()
                .addBody(
                    DiplomaticClearanceUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(DiplomaticClearanceUnvalidatedPublishParams.Body.DataMode.TEST)
                        .firstDepDate(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                        .idMission("0dba1363-2d09-49fa-a784-4bb4cbb1674a")
                        .source("Bluestaq")
                        .id("25059135-4afc-45c2-b78b-d6e843dbd96d")
                        .apacsId("1083034")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .addDiplomaticClearanceDetail(
                            DiplomaticClearanceUnvalidatedPublishParams.Body
                                .DiplomaticClearanceDetail
                                .builder()
                                .action("O")
                                .altCountryCode("IZ")
                                .clearanceId("MFMW225662GHQ")
                                .clearanceRemark("Clearance remarks")
                                .clearedCallSign("FALCN09")
                                .countryCode("NL")
                                .countryName("NETHERLANDS")
                                .entryNet(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                                .entryPoint("LOMOS")
                                .exitNlt(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                                .exitPoint("BUDOP")
                                .externalClearanceId("aa714f4d52a37ab1a00b21af9566e379")
                                .idSortie("207010e0-f97d-431c-8c00-7e46acfef0f5")
                                .legNum(825)
                                .profile("T LAND/OFLY IATA COMPLIANT CARGO 23")
                                .reqIcao(true)
                                .reqPoint(true)
                                .routeString("DCT DOH P430 BAYAN/M062F150 P430 RAMKI")
                                .sequenceNum(3)
                                .status("IN WORK")
                                .validDesc("CY2023")
                                .validEndTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                                .validStartTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                                .windowRemark("Period remarks")
                                .build()
                        )
                        .addDiplomaticClearanceRemark(
                            DiplomaticClearanceUnvalidatedPublishParams.Body
                                .DiplomaticClearanceRemark
                                .builder()
                                .date(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                                .gdssRemarkId("GDSSREMARK-ID")
                                .text("Example mission remarks.")
                                .user("John Doe")
                                .build()
                        )
                        .dipWorksheetName("G2-939911-AC")
                        .docDeadline(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                        .externalWorksheetId("990ae849089e3d6cad69655324176bb6")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .sourceDl("AXE")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                DiplomaticClearanceUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(DiplomaticClearanceUnvalidatedPublishParams.Body.DataMode.TEST)
                    .firstDepDate(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .idMission("0dba1363-2d09-49fa-a784-4bb4cbb1674a")
                    .source("Bluestaq")
                    .id("25059135-4afc-45c2-b78b-d6e843dbd96d")
                    .apacsId("1083034")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .addDiplomaticClearanceDetail(
                        DiplomaticClearanceUnvalidatedPublishParams.Body.DiplomaticClearanceDetail
                            .builder()
                            .action("O")
                            .altCountryCode("IZ")
                            .clearanceId("MFMW225662GHQ")
                            .clearanceRemark("Clearance remarks")
                            .clearedCallSign("FALCN09")
                            .countryCode("NL")
                            .countryName("NETHERLANDS")
                            .entryNet(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .entryPoint("LOMOS")
                            .exitNlt(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .exitPoint("BUDOP")
                            .externalClearanceId("aa714f4d52a37ab1a00b21af9566e379")
                            .idSortie("207010e0-f97d-431c-8c00-7e46acfef0f5")
                            .legNum(825)
                            .profile("T LAND/OFLY IATA COMPLIANT CARGO 23")
                            .reqIcao(true)
                            .reqPoint(true)
                            .routeString("DCT DOH P430 BAYAN/M062F150 P430 RAMKI")
                            .sequenceNum(3)
                            .status("IN WORK")
                            .validDesc("CY2023")
                            .validEndTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .validStartTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .windowRemark("Period remarks")
                            .build()
                    )
                    .addDiplomaticClearanceRemark(
                        DiplomaticClearanceUnvalidatedPublishParams.Body.DiplomaticClearanceRemark
                            .builder()
                            .date(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .gdssRemarkId("GDSSREMARK-ID")
                            .text("Example mission remarks.")
                            .user("John Doe")
                            .build()
                    )
                    .dipWorksheetName("G2-939911-AC")
                    .docDeadline(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .externalWorksheetId("990ae849089e3d6cad69655324176bb6")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .sourceDl("AXE")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DiplomaticClearanceUnvalidatedPublishParams.builder()
                .addBody(
                    DiplomaticClearanceUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(DiplomaticClearanceUnvalidatedPublishParams.Body.DataMode.TEST)
                        .firstDepDate(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                        .idMission("0dba1363-2d09-49fa-a784-4bb4cbb1674a")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                DiplomaticClearanceUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(DiplomaticClearanceUnvalidatedPublishParams.Body.DataMode.TEST)
                    .firstDepDate(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .idMission("0dba1363-2d09-49fa-a784-4bb4cbb1674a")
                    .source("Bluestaq")
                    .build()
            )
    }
}
