// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCountParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateBulkParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementListParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementRetrieveParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementTupleParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AviationRiskManagementServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementService = client.aviationRiskManagement()

        aviationRiskManagementService.create(
            AviationRiskManagementCreateParams.builder()
                .classificationMarking("U")
                .dataMode(AviationRiskManagementCreateParams.DataMode.TEST)
                .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .addAviationRiskManagementWorksheetRecord(
                    AviationRiskManagementCreateParams.AviationRiskManagementWorksheetRecord
                        .builder()
                        .missionDate(LocalDate.parse("2024-11-25"))
                        .aircraftMds("E-2C HAWKEYE")
                        .approvalPending(true)
                        .approved(false)
                        .addAviationRiskManagementWorksheetScore(
                            AviationRiskManagementCreateParams.AviationRiskManagementWorksheetRecord
                                .AviationRiskManagementWorksheetScore
                                .builder()
                                .approvalDate(OffsetDateTime.parse("2024-11-01T16:00:00.123Z"))
                                .approvedBy("John Smith")
                                .approvedCode(0)
                                .addAviationRiskManagementSortie(
                                    AviationRiskManagementCreateParams
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
        val aviationRiskManagementService = client.aviationRiskManagement()

        val aviationRiskManagement =
            aviationRiskManagementService.retrieve(
                AviationRiskManagementRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        aviationRiskManagement.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementService = client.aviationRiskManagement()

        aviationRiskManagementService.update(
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
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .unitId("63")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
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
        val aviationRiskManagementService = client.aviationRiskManagement()

        val page =
            aviationRiskManagementService.list(
                AviationRiskManagementListParams.builder().idMission("idMission").build()
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
        val aviationRiskManagementService = client.aviationRiskManagement()

        aviationRiskManagementService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementService = client.aviationRiskManagement()

        aviationRiskManagementService.count(
            AviationRiskManagementCountParams.builder()
                .idMission("idMission")
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
        val aviationRiskManagementService = client.aviationRiskManagement()

        aviationRiskManagementService.createBulk(
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
                        .origNetwork("OPS1")
                        .sourceDl("AXE")
                        .unitId("63")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementService = client.aviationRiskManagement()

        val response = aviationRiskManagementService.queryHelp()

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
        val aviationRiskManagementService = client.aviationRiskManagement()

        val response =
            aviationRiskManagementService.tuple(
                AviationRiskManagementTupleParams.builder()
                    .columns("columns")
                    .idMission("idMission")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementService = client.aviationRiskManagement()

        aviationRiskManagementService.unvalidatedPublish(
            AviationRiskManagementUnvalidatedPublishParams.builder()
                .addBody(
                    AviationRiskManagementUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(AviationRiskManagementUnvalidatedPublishParams.Body.DataMode.TEST)
                        .idMission("fa18d96e-91ea-60da-a7a8-1af6500066c8")
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .addAviationRiskManagementWorksheetRecord(
                            AviationRiskManagementUnvalidatedPublishParams.Body
                                .AviationRiskManagementWorksheetRecord
                                .builder()
                                .missionDate(LocalDate.parse("2024-11-25"))
                                .aircraftMds("E-2C HAWKEYE")
                                .approvalPending(true)
                                .approved(false)
                                .addAviationRiskManagementWorksheetScore(
                                    AviationRiskManagementUnvalidatedPublishParams.Body
                                        .AviationRiskManagementWorksheetRecord
                                        .AviationRiskManagementWorksheetScore
                                        .builder()
                                        .approvalDate(
                                            OffsetDateTime.parse("2024-11-01T16:00:00.123Z")
                                        )
                                        .approvedBy("John Smith")
                                        .approvedCode(0)
                                        .addAviationRiskManagementSortie(
                                            AviationRiskManagementUnvalidatedPublishParams.Body
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
                )
                .build()
        )
    }
}
