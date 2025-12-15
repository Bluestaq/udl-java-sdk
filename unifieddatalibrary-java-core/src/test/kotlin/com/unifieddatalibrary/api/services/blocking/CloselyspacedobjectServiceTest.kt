// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCountParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCreateBulkParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectCreateParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectListParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectRetrieveParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectTupleParams
import com.unifieddatalibrary.api.models.closelyspacedobjects.CloselyspacedobjectUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CloselyspacedobjectServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val closelyspacedobjectService = client.closelyspacedobjects()

        closelyspacedobjectService.create(
            CloselyspacedobjectCreateParams.builder()
                .classificationMarking("U")
                .csoState("POSSIBLE")
                .dataMode(CloselyspacedobjectCreateParams.DataMode.TEST)
                .eventStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType("RENDEZVOUS")
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .actorSvEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .analysisDuration(60.1)
                .analysisEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .compType("LONGITUDE")
                .contextKeys(listOf("MsnID_DescLabel", "msnVer", "serVer"))
                .contextValues(listOf("MissionID Descriptive Label text", "1", "001.9b"))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .addCsoDetail(
                    CloselyspacedobjectCreateParams.CsoDetail.builder()
                        .objectEvent("MEAN")
                        .objectType("DELTA")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .apogee(1.1)
                        .classificationMarking("U")
                        .dataMode(CloselyspacedobjectCreateParams.CsoDetail.DataMode.TEST)
                        .idCso("CSO-ID")
                        .inclination(45.1)
                        .longitude(45.1)
                        .perigee(1.1)
                        .build()
                )
                .deltaVTol(0.123)
                .durationThreshold(60.1)
                .eventEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventIntervalCoverage(22.3)
                .extId("EXTERNAL-ID")
                .hohmannDeltaV(0.012)
                .idActorSv("ACTOR-SV-ID")
                .idOnOrbit1("ONORBIT1-ID")
                .idOnOrbit2("ONORBIT2-ID")
                .idTargetSv("TARGET-SV-ID")
                .inclinationDeltaV(0.012)
                .indicationSource("Manually input")
                .lonTol(30.1)
                .maxRange(233.266)
                .minPlaneSepAngle(30.1)
                .minPlaneSepEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minRange(0.5)
                .minRangeAnalysisDuration(60.1)
                .minRangeEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .notes("FREE-TEXT")
                .numSubIntervals(0)
                .orbitAlignDel(12.3)
                .orbitPlaneTol(1.23)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId1("ORIGONORBIT1-ID")
                .origObjectId2("ORIGONORBIT2-ID")
                .rangeThreshold(0.1)
                .rangeTol(0.123)
                .relPos(listOf(0.12, 0.23, -0.12))
                .relPosMag(0.12)
                .relSpeedMag(1.23)
                .relVel(listOf(0.12, 0.23, -0.12))
                .satNo1(1)
                .satNo2(2)
                .sourceDl("AXE")
                .stationLimLonTol(12.5)
                .targetSvEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .totalDeltaV(2.46)
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
        val closelyspacedobjectService = client.closelyspacedobjects()

        val closelyspacedobject =
            closelyspacedobjectService.retrieve(
                CloselyspacedobjectRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        closelyspacedobject.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val closelyspacedobjectService = client.closelyspacedobjects()

        val page =
            closelyspacedobjectService.list(
                CloselyspacedobjectListParams.builder()
                    .eventStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val closelyspacedobjectService = client.closelyspacedobjects()

        closelyspacedobjectService.count(
            CloselyspacedobjectCountParams.builder()
                .eventStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val closelyspacedobjectService = client.closelyspacedobjects()

        closelyspacedobjectService.createBulk(
            CloselyspacedobjectCreateBulkParams.builder()
                .addBody(
                    CloselyspacedobjectCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .csoState("POSSIBLE")
                        .dataMode(CloselyspacedobjectCreateBulkParams.Body.DataMode.TEST)
                        .eventStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType("RENDEZVOUS")
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .actorSvEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .analysisDuration(60.1)
                        .analysisEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .compType("LONGITUDE")
                        .contextKeys(listOf("MsnID_DescLabel", "msnVer", "serVer"))
                        .contextValues(listOf("MissionID Descriptive Label text", "1", "001.9b"))
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .addCsoDetail(
                            CloselyspacedobjectCreateBulkParams.Body.CsoDetail.builder()
                                .objectEvent("MEAN")
                                .objectType("DELTA")
                                .id("026dd511-8ba5-47d3-9909-836149f87686")
                                .apogee(1.1)
                                .classificationMarking("U")
                                .dataMode(
                                    CloselyspacedobjectCreateBulkParams.Body.CsoDetail.DataMode.TEST
                                )
                                .idCso("CSO-ID")
                                .inclination(45.1)
                                .longitude(45.1)
                                .perigee(1.1)
                                .build()
                        )
                        .deltaVTol(0.123)
                        .durationThreshold(60.1)
                        .eventEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventIntervalCoverage(22.3)
                        .extId("EXTERNAL-ID")
                        .hohmannDeltaV(0.012)
                        .idActorSv("ACTOR-SV-ID")
                        .idOnOrbit1("ONORBIT1-ID")
                        .idOnOrbit2("ONORBIT2-ID")
                        .idTargetSv("TARGET-SV-ID")
                        .inclinationDeltaV(0.012)
                        .indicationSource("Manually input")
                        .lonTol(30.1)
                        .maxRange(233.266)
                        .minPlaneSepAngle(30.1)
                        .minPlaneSepEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .minRange(0.5)
                        .minRangeAnalysisDuration(60.1)
                        .minRangeEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .notes("FREE-TEXT")
                        .numSubIntervals(0)
                        .orbitAlignDel(12.3)
                        .orbitPlaneTol(1.23)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId1("ORIGONORBIT1-ID")
                        .origObjectId2("ORIGONORBIT2-ID")
                        .rangeThreshold(0.1)
                        .rangeTol(0.123)
                        .relPos(listOf(0.12, 0.23, -0.12))
                        .relPosMag(0.12)
                        .relSpeedMag(1.23)
                        .relVel(listOf(0.12, 0.23, -0.12))
                        .satNo1(1)
                        .satNo2(2)
                        .sourceDl("AXE")
                        .stationLimLonTol(12.5)
                        .targetSvEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .totalDeltaV(2.46)
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
        val closelyspacedobjectService = client.closelyspacedobjects()

        val response = closelyspacedobjectService.queryHelp()

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
        val closelyspacedobjectService = client.closelyspacedobjects()

        val response =
            closelyspacedobjectService.tuple(
                CloselyspacedobjectTupleParams.builder()
                    .columns("columns")
                    .eventStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val closelyspacedobjectService = client.closelyspacedobjects()

        closelyspacedobjectService.unvalidatedPublish(
            CloselyspacedobjectUnvalidatedPublishParams.builder()
                .addBody(
                    CloselyspacedobjectUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .csoState("POSSIBLE")
                        .dataMode(CloselyspacedobjectUnvalidatedPublishParams.Body.DataMode.TEST)
                        .eventStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType("RENDEZVOUS")
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .actorSvEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .analysisDuration(60.1)
                        .analysisEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .compType("LONGITUDE")
                        .contextKeys(listOf("MsnID_DescLabel", "msnVer", "serVer"))
                        .contextValues(listOf("MissionID Descriptive Label text", "1", "001.9b"))
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .addCsoDetail(
                            CloselyspacedobjectUnvalidatedPublishParams.Body.CsoDetail.builder()
                                .objectEvent("MEAN")
                                .objectType("DELTA")
                                .id("026dd511-8ba5-47d3-9909-836149f87686")
                                .apogee(1.1)
                                .classificationMarking("U")
                                .dataMode(
                                    CloselyspacedobjectUnvalidatedPublishParams.Body.CsoDetail
                                        .DataMode
                                        .TEST
                                )
                                .idCso("CSO-ID")
                                .inclination(45.1)
                                .longitude(45.1)
                                .perigee(1.1)
                                .build()
                        )
                        .deltaVTol(0.123)
                        .durationThreshold(60.1)
                        .eventEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventIntervalCoverage(22.3)
                        .extId("EXTERNAL-ID")
                        .hohmannDeltaV(0.012)
                        .idActorSv("ACTOR-SV-ID")
                        .idOnOrbit1("ONORBIT1-ID")
                        .idOnOrbit2("ONORBIT2-ID")
                        .idTargetSv("TARGET-SV-ID")
                        .inclinationDeltaV(0.012)
                        .indicationSource("Manually input")
                        .lonTol(30.1)
                        .maxRange(233.266)
                        .minPlaneSepAngle(30.1)
                        .minPlaneSepEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .minRange(0.5)
                        .minRangeAnalysisDuration(60.1)
                        .minRangeEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .notes("FREE-TEXT")
                        .numSubIntervals(0)
                        .orbitAlignDel(12.3)
                        .orbitPlaneTol(1.23)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId1("ORIGONORBIT1-ID")
                        .origObjectId2("ORIGONORBIT2-ID")
                        .rangeThreshold(0.1)
                        .rangeTol(0.123)
                        .relPos(listOf(0.12, 0.23, -0.12))
                        .relPosMag(0.12)
                        .relSpeedMag(1.23)
                        .relVel(listOf(0.12, 0.23, -0.12))
                        .satNo1(1)
                        .satNo2(2)
                        .sourceDl("AXE")
                        .stationLimLonTol(12.5)
                        .targetSvEpoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .totalDeltaV(2.46)
                        .build()
                )
                .build()
        )
    }
}
