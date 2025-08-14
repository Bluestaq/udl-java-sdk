// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aviationriskmanagement

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AviationRiskManagementCreateBulkParamsTest {

    @Test
    fun create() {
        AviationRiskManagementCreateBulkParams.builder()
            .addBody(
                AviationRiskManagementCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(AviationRiskManagementCreateBulkParams.Body.DataMode.TEST)
                    .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                    .source("Bluestaq")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .addAviationRiskManagementWorksheetRecord(
                        AviationRiskManagementCreateBulkParams.Body
                            .AviationRiskManagementWorksheetRecord
                            .builder()
                            .missionDate(LocalDate.parse("2024-11-25"))
                            .aircraftMds("E-2C HAWKEYE")
                            .approvalPending(true)
                            .approved(false)
                            .addAviationRiskManagementWorksheetScore(
                                AviationRiskManagementCreateBulkParams.Body
                                    .AviationRiskManagementWorksheetRecord
                                    .AviationRiskManagementWorksheetScore
                                    .builder()
                                    .approvalDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                                    .approvedBy("John Smith")
                                    .approvedCode(0)
                                    .addAviationRiskManagementSortie(
                                        AviationRiskManagementCreateBulkParams.Body
                                            .AviationRiskManagementWorksheetRecord
                                            .AviationRiskManagementWorksheetScore
                                            .AviationRiskManagementSortie
                                            .builder()
                                            .extSortieId("MB014313032022407540")
                                            .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                                            .legNum(100)
                                            .sortieScore(3)
                                            .build()
                                    )
                                    .extScoreId("BM022301191649232740")
                                    .riskCategory("Crew/Aircraft")
                                    .riskDescription("Upgrade training")
                                    .riskKey("26")
                                    .riskName("Crew Qualification")
                                    .score(1)
                                    .scoreRemark("Worksheet score remark.")
                                    .build()
                            )
                            .dispositionComments("Disposition comment.")
                            .extRecordId("B022401191649232716")
                            .itinerary("RJTY-PGUA-RJTY")
                            .lastUpdatedAt(OffsetDateTime.parse("2024-11-02T16:00:00.123Z"))
                            .remarks("Worksheet record remark.")
                            .severityLevel(0)
                            .submissionDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                            .tierNumber(2)
                            .totalScore(11)
                            .userId("TIER0SCORING")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .extMissionId("MCD04250106123509230")
                    .missionNumber("LVM134412001")
                    .orgId("50000002")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .sourceDl("AXE")
                    .unitId("63")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AviationRiskManagementCreateBulkParams.builder()
                .addBody(
                    AviationRiskManagementCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(AviationRiskManagementCreateBulkParams.Body.DataMode.TEST)
                        .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .addAviationRiskManagementWorksheetRecord(
                            AviationRiskManagementCreateBulkParams.Body
                                .AviationRiskManagementWorksheetRecord
                                .builder()
                                .missionDate(LocalDate.parse("2024-11-25"))
                                .aircraftMds("E-2C HAWKEYE")
                                .approvalPending(true)
                                .approved(false)
                                .addAviationRiskManagementWorksheetScore(
                                    AviationRiskManagementCreateBulkParams.Body
                                        .AviationRiskManagementWorksheetRecord
                                        .AviationRiskManagementWorksheetScore
                                        .builder()
                                        .approvalDate(
                                            OffsetDateTime.parse("2024-11-01T16:00:00.123Z")
                                        )
                                        .approvedBy("John Smith")
                                        .approvedCode(0)
                                        .addAviationRiskManagementSortie(
                                            AviationRiskManagementCreateBulkParams.Body
                                                .AviationRiskManagementWorksheetRecord
                                                .AviationRiskManagementWorksheetScore
                                                .AviationRiskManagementSortie
                                                .builder()
                                                .extSortieId("MB014313032022407540")
                                                .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                                                .legNum(100)
                                                .sortieScore(3)
                                                .build()
                                        )
                                        .extScoreId("BM022301191649232740")
                                        .riskCategory("Crew/Aircraft")
                                        .riskDescription("Upgrade training")
                                        .riskKey("26")
                                        .riskName("Crew Qualification")
                                        .score(1)
                                        .scoreRemark("Worksheet score remark.")
                                        .build()
                                )
                                .dispositionComments("Disposition comment.")
                                .extRecordId("B022401191649232716")
                                .itinerary("RJTY-PGUA-RJTY")
                                .lastUpdatedAt(OffsetDateTime.parse("2024-11-02T16:00:00.123Z"))
                                .remarks("Worksheet record remark.")
                                .severityLevel(0)
                                .submissionDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                                .tierNumber(2)
                                .totalScore(11)
                                .userId("TIER0SCORING")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .extMissionId("MCD04250106123509230")
                        .missionNumber("LVM134412001")
                        .orgId("50000002")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .sourceDl("AXE")
                        .unitId("63")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                AviationRiskManagementCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(AviationRiskManagementCreateBulkParams.Body.DataMode.TEST)
                    .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                    .source("Bluestaq")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .addAviationRiskManagementWorksheetRecord(
                        AviationRiskManagementCreateBulkParams.Body
                            .AviationRiskManagementWorksheetRecord
                            .builder()
                            .missionDate(LocalDate.parse("2024-11-25"))
                            .aircraftMds("E-2C HAWKEYE")
                            .approvalPending(true)
                            .approved(false)
                            .addAviationRiskManagementWorksheetScore(
                                AviationRiskManagementCreateBulkParams.Body
                                    .AviationRiskManagementWorksheetRecord
                                    .AviationRiskManagementWorksheetScore
                                    .builder()
                                    .approvalDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                                    .approvedBy("John Smith")
                                    .approvedCode(0)
                                    .addAviationRiskManagementSortie(
                                        AviationRiskManagementCreateBulkParams.Body
                                            .AviationRiskManagementWorksheetRecord
                                            .AviationRiskManagementWorksheetScore
                                            .AviationRiskManagementSortie
                                            .builder()
                                            .extSortieId("MB014313032022407540")
                                            .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                                            .legNum(100)
                                            .sortieScore(3)
                                            .build()
                                    )
                                    .extScoreId("BM022301191649232740")
                                    .riskCategory("Crew/Aircraft")
                                    .riskDescription("Upgrade training")
                                    .riskKey("26")
                                    .riskName("Crew Qualification")
                                    .score(1)
                                    .scoreRemark("Worksheet score remark.")
                                    .build()
                            )
                            .dispositionComments("Disposition comment.")
                            .extRecordId("B022401191649232716")
                            .itinerary("RJTY-PGUA-RJTY")
                            .lastUpdatedAt(OffsetDateTime.parse("2024-11-02T16:00:00.123Z"))
                            .remarks("Worksheet record remark.")
                            .severityLevel(0)
                            .submissionDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                            .tierNumber(2)
                            .totalScore(11)
                            .userId("TIER0SCORING")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .extMissionId("MCD04250106123509230")
                    .missionNumber("LVM134412001")
                    .orgId("50000002")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .sourceDl("AXE")
                    .unitId("63")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AviationRiskManagementCreateBulkParams.builder()
                .addBody(
                    AviationRiskManagementCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(AviationRiskManagementCreateBulkParams.Body.DataMode.TEST)
                        .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                AviationRiskManagementCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(AviationRiskManagementCreateBulkParams.Body.DataMode.TEST)
                    .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                    .source("Bluestaq")
                    .build()
            )
    }
}
