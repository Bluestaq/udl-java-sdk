// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aviationriskmanagement

import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AviationRiskManagementUpdateParamsTest {

    @Test
    fun create() {
        AviationRiskManagementUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(AviationRiskManagementUpdateParams.DataMode.TEST)
            .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
            .source("Bluestaq")
            .bodyId("026dd511-8ba5-47d3-9909-836149f87686")
            .addAviationRiskManagementWorksheetRecord(
                AviationRiskManagementUpdateParams.AviationRiskManagementWorksheetRecord.builder()
                    .missionDate(LocalDate.parse("2024-11-25"))
                    .aircraftMds("E-2C HAWKEYE")
                    .approvalPending(true)
                    .approved(false)
                    .addAviationRiskManagementWorksheetScore(
                        AviationRiskManagementUpdateParams.AviationRiskManagementWorksheetRecord
                            .AviationRiskManagementWorksheetScore
                            .builder()
                            .approvalDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                            .approvedBy("John Smith")
                            .approvedCode(0)
                            .addAviationRiskManagementSortie(
                                AviationRiskManagementUpdateParams
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
    }

    @Test
    fun pathParams() {
        val params =
            AviationRiskManagementUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AviationRiskManagementUpdateParams.DataMode.TEST)
                .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AviationRiskManagementUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AviationRiskManagementUpdateParams.DataMode.TEST)
                .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                .source("Bluestaq")
                .bodyId("026dd511-8ba5-47d3-9909-836149f87686")
                .addAviationRiskManagementWorksheetRecord(
                    AviationRiskManagementUpdateParams.AviationRiskManagementWorksheetRecord
                        .builder()
                        .missionDate(LocalDate.parse("2024-11-25"))
                        .aircraftMds("E-2C HAWKEYE")
                        .approvalPending(true)
                        .approved(false)
                        .addAviationRiskManagementWorksheetScore(
                            AviationRiskManagementUpdateParams.AviationRiskManagementWorksheetRecord
                                .AviationRiskManagementWorksheetScore
                                .builder()
                                .approvalDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                                .approvedBy("John Smith")
                                .approvedCode(0)
                                .addAviationRiskManagementSortie(
                                    AviationRiskManagementUpdateParams
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AviationRiskManagementUpdateParams.DataMode.TEST)
        assertThat(body.idMission()).isEqualTo("fa18d96e-91ea-60da-a7a8-1af6500066c8")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(body.aviationRiskManagementWorksheetRecord().getOrNull())
            .containsExactly(
                AviationRiskManagementUpdateParams.AviationRiskManagementWorksheetRecord.builder()
                    .missionDate(LocalDate.parse("2024-11-25"))
                    .aircraftMds("E-2C HAWKEYE")
                    .approvalPending(true)
                    .approved(false)
                    .addAviationRiskManagementWorksheetScore(
                        AviationRiskManagementUpdateParams.AviationRiskManagementWorksheetRecord
                            .AviationRiskManagementWorksheetScore
                            .builder()
                            .approvalDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                            .approvedBy("John Smith")
                            .approvedCode(0)
                            .addAviationRiskManagementSortie(
                                AviationRiskManagementUpdateParams
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
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.extMissionId()).contains("MCD04250106123509230")
        assertThat(body.missionNumber()).contains("LVM134412001")
        assertThat(body.orgId()).contains("50000002")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.unitId()).contains("63")
        assertThat(body.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.updatedBy()).contains("some.user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AviationRiskManagementUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AviationRiskManagementUpdateParams.DataMode.TEST)
                .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AviationRiskManagementUpdateParams.DataMode.TEST)
        assertThat(body.idMission()).isEqualTo("fa18d96e-91ea-60da-a7a8-1af6500066c8")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
