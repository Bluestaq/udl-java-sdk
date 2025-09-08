// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCountParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateBulkParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementCreateParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementRetrieveParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementTupleParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AviationRiskManagementServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val future =
            aviationRiskManagementServiceAsync.create(
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
                                AviationRiskManagementCreateParams
                                    .AviationRiskManagementWorksheetRecord
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
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val aviationRiskManagementFuture =
            aviationRiskManagementServiceAsync.retrieve(
                AviationRiskManagementRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val aviationRiskManagement = aviationRiskManagementFuture.get()
        aviationRiskManagement.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val future =
            aviationRiskManagementServiceAsync.update(
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
                                AviationRiskManagementUpdateParams
                                    .AviationRiskManagementWorksheetRecord
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

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val future = aviationRiskManagementServiceAsync.delete("id")

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
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val responseFuture =
            aviationRiskManagementServiceAsync.count(
                AviationRiskManagementCountParams.builder()
                    .idMission("idMission")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val future =
            aviationRiskManagementServiceAsync.createBulk(
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
                                                    .idSortie(
                                                        "4ef3d1e8-ab08-ab70-498f-edc479734e5c"
                                                    )
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
                                    .submissionDate(
                                        OffsetDateTime.parse("2024-11-01T16:00:00.123Z")
                                    )
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

        val response = future.get()
    }

    @Test
    fun query() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val responseFuture =
            aviationRiskManagementServiceAsync.query(
                AviationRiskManagementQueryParams.builder()
                    .idMission("idMission")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val responseFuture = aviationRiskManagementServiceAsync.queryHelp()

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
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val responseFuture =
            aviationRiskManagementServiceAsync.tuple(
                AviationRiskManagementTupleParams.builder()
                    .columns("columns")
                    .idMission("idMission")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aviationRiskManagementServiceAsync = client.aviationRiskManagement()

        val future =
            aviationRiskManagementServiceAsync.unvalidatedPublish(
                AviationRiskManagementUnvalidatedPublishParams.builder()
                    .addBody(
                        AviationRiskManagementUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(
                                AviationRiskManagementUnvalidatedPublishParams.Body.DataMode.TEST
                            )
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
                                                    .idSortie(
                                                        "4ef3d1e8-ab08-ab70-498f-edc479734e5c"
                                                    )
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
                                    .submissionDate(
                                        OffsetDateTime.parse("2024-11-01T16:00:00.123Z")
                                    )
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

        val response = future.get()
    }
}
