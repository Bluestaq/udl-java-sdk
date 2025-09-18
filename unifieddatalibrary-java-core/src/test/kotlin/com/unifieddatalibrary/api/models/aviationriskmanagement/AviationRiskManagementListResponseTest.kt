// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aviationriskmanagement

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AviationRiskManagementListResponseTest {

    @Test
    fun create() {
        val aviationRiskManagementListResponse =
            AviationRiskManagementListResponse.builder()
                .classificationMarking("U")
                .dataMode(AviationRiskManagementListResponse.DataMode.TEST)
                .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .addAviationRiskManagementWorksheetRecord(
                    AviationRiskManagementListResponse.AviationRiskManagementWorksheetRecord
                        .builder()
                        .missionDate(LocalDate.parse("2024-11-25"))
                        .aircraftMds("E-2C HAWKEYE")
                        .approvalPending(true)
                        .approved(false)
                        .addAviationRiskManagementWorksheetScore(
                            AviationRiskManagementListResponse.AviationRiskManagementWorksheetRecord
                                .AviationRiskManagementWorksheetScore
                                .builder()
                                .approvalDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                                .approvedBy("John Smith")
                                .approvedCode(0)
                                .addAviationRiskManagementSortie(
                                    AviationRiskManagementListResponse
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
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .unitId("63")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(aviationRiskManagementListResponse.classificationMarking()).isEqualTo("U")
        assertThat(aviationRiskManagementListResponse.dataMode())
            .isEqualTo(AviationRiskManagementListResponse.DataMode.TEST)
        assertThat(aviationRiskManagementListResponse.idMission())
            .isEqualTo("fa18d96e-91ea-60da-a7a8-1af6500066c8")
        assertThat(aviationRiskManagementListResponse.source()).isEqualTo("Bluestaq")
        assertThat(aviationRiskManagementListResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(
                aviationRiskManagementListResponse
                    .aviationRiskManagementWorksheetRecord()
                    .getOrNull()
            )
            .containsExactly(
                AviationRiskManagementListResponse.AviationRiskManagementWorksheetRecord.builder()
                    .missionDate(LocalDate.parse("2024-11-25"))
                    .aircraftMds("E-2C HAWKEYE")
                    .approvalPending(true)
                    .approved(false)
                    .addAviationRiskManagementWorksheetScore(
                        AviationRiskManagementListResponse.AviationRiskManagementWorksheetRecord
                            .AviationRiskManagementWorksheetScore
                            .builder()
                            .approvalDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                            .approvedBy("John Smith")
                            .approvedCode(0)
                            .addAviationRiskManagementSortie(
                                AviationRiskManagementListResponse
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
        assertThat(aviationRiskManagementListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(aviationRiskManagementListResponse.createdBy()).contains("some.user")
        assertThat(aviationRiskManagementListResponse.extMissionId())
            .contains("MCD04250106123509230")
        assertThat(aviationRiskManagementListResponse.missionNumber()).contains("LVM134412001")
        assertThat(aviationRiskManagementListResponse.orgId()).contains("50000002")
        assertThat(aviationRiskManagementListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(aviationRiskManagementListResponse.origNetwork()).contains("OPS1")
        assertThat(aviationRiskManagementListResponse.sourceDl()).contains("AXE")
        assertThat(aviationRiskManagementListResponse.unitId()).contains("63")
        assertThat(aviationRiskManagementListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(aviationRiskManagementListResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aviationRiskManagementListResponse =
            AviationRiskManagementListResponse.builder()
                .classificationMarking("U")
                .dataMode(AviationRiskManagementListResponse.DataMode.TEST)
                .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .addAviationRiskManagementWorksheetRecord(
                    AviationRiskManagementListResponse.AviationRiskManagementWorksheetRecord
                        .builder()
                        .missionDate(LocalDate.parse("2024-11-25"))
                        .aircraftMds("E-2C HAWKEYE")
                        .approvalPending(true)
                        .approved(false)
                        .addAviationRiskManagementWorksheetScore(
                            AviationRiskManagementListResponse.AviationRiskManagementWorksheetRecord
                                .AviationRiskManagementWorksheetScore
                                .builder()
                                .approvalDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                                .approvedBy("John Smith")
                                .approvedCode(0)
                                .addAviationRiskManagementSortie(
                                    AviationRiskManagementListResponse
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
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .unitId("63")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedAviationRiskManagementListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aviationRiskManagementListResponse),
                jacksonTypeRef<AviationRiskManagementListResponse>(),
            )

        assertThat(roundtrippedAviationRiskManagementListResponse)
            .isEqualTo(aviationRiskManagementListResponse)
    }
}
