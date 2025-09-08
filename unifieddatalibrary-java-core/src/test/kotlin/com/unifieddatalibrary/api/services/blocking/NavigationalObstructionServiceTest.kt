// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionCountParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionCreateBulkParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionCreateParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionGetParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionTupleParams
import com.unifieddatalibrary.api.models.navigationalobstruction.NavigationalObstructionUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NavigationalObstructionServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val navigationalObstructionService = client.navigationalObstruction()

        navigationalObstructionService.create(
            NavigationalObstructionCreateParams.builder()
                .classificationMarking("U")
                .cycleDate(LocalDate.parse("2024-06-13"))
                .dataMode(NavigationalObstructionCreateParams.DataMode.TEST)
                .obstacleId("359655")
                .obstacleType("V")
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .actDelCode("A")
                .airacCycle(2406)
                .baseAiracCycle(2405)
                .baselineCutoffDate(LocalDate.parse("2024-04-23"))
                .boundNeLat(29.1)
                .boundNeLon(99.1)
                .boundSwLat(-44.1)
                .boundSwLon(-144.1)
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .cutoffDate(LocalDate.parse("2024-05-21"))
                .dataSetRemarks("Data set remarks")
                .deletingOrg("ACME")
                .derivingOrg("ACME")
                .directivityCode(2)
                .elevation(840.1)
                .elevationAcc(17.1)
                .externalId("OU812")
                .facc("AT040")
                .featureCode("540")
                .featureDescription("Powerline Pylon, General")
                .featureName("PYLON")
                .featureType("540")
                .heightAgl(314.1)
                .heightAglAcc(30.1)
                .heightMsl(1154.1)
                .heightMslAcc(34.1)
                .horizAcc(8.1)
                .horizDatumCode("WGS-84")
                .initRecordDate(LocalDate.parse("1991-03-28"))
                .addKey("key1")
                .addKey("key2")
                .lightingCode("U")
                .lineNeLat(49.000584)
                .lineNeLon(-122.197891)
                .linesFilename("lines.txt")
                .lineSwLat(48.507027)
                .lineSwLon(-122.722946)
                .minHeightAgl(20.1)
                .multObs("S")
                .nextCycleDate(LocalDate.parse("2024-07-11"))
                .numLines(45993)
                .numObs(1)
                .numPoints(21830590)
                .obstacleRemarks("Obstacle remarks")
                .origId("L0000002289")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .ownerCountryCode("US")
                .pointLat(46.757211)
                .pointLon(-67.759494)
                .pointsFilename("points.txt")
                .processCode("OT")
                .producer("ACME")
                .provinceCode("23")
                .quality("0")
                .revDate(LocalDate.parse("2020-02-26"))
                .segEndPoint(359655)
                .segNum(1)
                .segStartPoint(359655)
                .sourceDate(LocalDate.parse("2016-04-01"))
                .sourceDl("AXE")
                .surfaceMatCode("U")
                .transactionCode("V")
                .validationCode(3)
                .addValue("value1")
                .addValue("value2")
                .vectorsFilename("vectors.txt")
                .wac("262")
                .wacInnr("0409-00039")
                .build()
        )
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val navigationalObstructionService = client.navigationalObstruction()

        navigationalObstructionService.update(
            NavigationalObstructionUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .cycleDate(LocalDate.parse("2024-06-13"))
                .dataMode(NavigationalObstructionUpdateParams.DataMode.TEST)
                .obstacleId("359655")
                .obstacleType("V")
                .source("Bluestaq")
                .bodyId("026dd511-8ba5-47d3-9909-836149f87686")
                .actDelCode("A")
                .airacCycle(2406)
                .baseAiracCycle(2405)
                .baselineCutoffDate(LocalDate.parse("2024-04-23"))
                .boundNeLat(29.1)
                .boundNeLon(99.1)
                .boundSwLat(-44.1)
                .boundSwLon(-144.1)
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .cutoffDate(LocalDate.parse("2024-05-21"))
                .dataSetRemarks("Data set remarks")
                .deletingOrg("ACME")
                .derivingOrg("ACME")
                .directivityCode(2)
                .elevation(840.1)
                .elevationAcc(17.1)
                .externalId("OU812")
                .facc("AT040")
                .featureCode("540")
                .featureDescription("Powerline Pylon, General")
                .featureName("PYLON")
                .featureType("540")
                .heightAgl(314.1)
                .heightAglAcc(30.1)
                .heightMsl(1154.1)
                .heightMslAcc(34.1)
                .horizAcc(8.1)
                .horizDatumCode("WGS-84")
                .initRecordDate(LocalDate.parse("1991-03-28"))
                .addKey("key1")
                .addKey("key2")
                .lightingCode("U")
                .lineNeLat(49.000584)
                .lineNeLon(-122.197891)
                .linesFilename("lines.txt")
                .lineSwLat(48.507027)
                .lineSwLon(-122.722946)
                .minHeightAgl(20.1)
                .multObs("S")
                .nextCycleDate(LocalDate.parse("2024-07-11"))
                .numLines(45993)
                .numObs(1)
                .numPoints(21830590)
                .obstacleRemarks("Obstacle remarks")
                .origId("L0000002289")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .ownerCountryCode("US")
                .pointLat(46.757211)
                .pointLon(-67.759494)
                .pointsFilename("points.txt")
                .processCode("OT")
                .producer("ACME")
                .provinceCode("23")
                .quality("0")
                .revDate(LocalDate.parse("2020-02-26"))
                .segEndPoint(359655)
                .segNum(1)
                .segStartPoint(359655)
                .sourceDate(LocalDate.parse("2016-04-01"))
                .sourceDl("AXE")
                .surfaceMatCode("U")
                .transactionCode("V")
                .validationCode(3)
                .addValue("value1")
                .addValue("value2")
                .vectorsFilename("vectors.txt")
                .wac("262")
                .wacInnr("0409-00039")
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
        val navigationalObstructionService = client.navigationalObstruction()

        val page = navigationalObstructionService.list()

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
        val navigationalObstructionService = client.navigationalObstruction()

        navigationalObstructionService.count(
            NavigationalObstructionCountParams.builder()
                .cycleDate(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .maxResults(0L)
                .obstacleId("obstacleId")
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
        val navigationalObstructionService = client.navigationalObstruction()

        navigationalObstructionService.createBulk(
            NavigationalObstructionCreateBulkParams.builder()
                .addBody(
                    NavigationalObstructionCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .cycleDate(LocalDate.parse("2024-06-13"))
                        .dataMode(NavigationalObstructionCreateBulkParams.Body.DataMode.TEST)
                        .obstacleId("359655")
                        .obstacleType("V")
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .actDelCode("A")
                        .airacCycle(2406)
                        .baseAiracCycle(2405)
                        .baselineCutoffDate(LocalDate.parse("2024-04-23"))
                        .boundNeLat(29.1)
                        .boundNeLon(99.1)
                        .boundSwLat(-44.1)
                        .boundSwLon(-144.1)
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .cutoffDate(LocalDate.parse("2024-05-21"))
                        .dataSetRemarks("Data set remarks")
                        .deletingOrg("ACME")
                        .derivingOrg("ACME")
                        .directivityCode(2)
                        .elevation(840.1)
                        .elevationAcc(17.1)
                        .externalId("OU812")
                        .facc("AT040")
                        .featureCode("540")
                        .featureDescription("Powerline Pylon, General")
                        .featureName("PYLON")
                        .featureType("540")
                        .heightAgl(314.1)
                        .heightAglAcc(30.1)
                        .heightMsl(1154.1)
                        .heightMslAcc(34.1)
                        .horizAcc(8.1)
                        .horizDatumCode("WGS-84")
                        .initRecordDate(LocalDate.parse("1991-03-28"))
                        .addKey("key1")
                        .addKey("key2")
                        .lightingCode("U")
                        .lineNeLat(49.000584)
                        .lineNeLon(-122.197891)
                        .linesFilename("lines.txt")
                        .lineSwLat(48.507027)
                        .lineSwLon(-122.722946)
                        .minHeightAgl(20.1)
                        .multObs("S")
                        .nextCycleDate(LocalDate.parse("2024-07-11"))
                        .numLines(45993)
                        .numObs(1)
                        .numPoints(21830590)
                        .obstacleRemarks("Obstacle remarks")
                        .origId("L0000002289")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .ownerCountryCode("US")
                        .pointLat(46.757211)
                        .pointLon(-67.759494)
                        .pointsFilename("points.txt")
                        .processCode("OT")
                        .producer("ACME")
                        .provinceCode("23")
                        .quality("0")
                        .revDate(LocalDate.parse("2020-02-26"))
                        .segEndPoint(359655)
                        .segNum(1)
                        .segStartPoint(359655)
                        .sourceDate(LocalDate.parse("2016-04-01"))
                        .sourceDl("AXE")
                        .surfaceMatCode("U")
                        .transactionCode("V")
                        .validationCode(3)
                        .addValue("value1")
                        .addValue("value2")
                        .vectorsFilename("vectors.txt")
                        .wac("262")
                        .wacInnr("0409-00039")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val navigationalObstructionService = client.navigationalObstruction()

        val navigationalObstruction =
            navigationalObstructionService.get(
                NavigationalObstructionGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        navigationalObstruction.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val navigationalObstructionService = client.navigationalObstruction()

        val response = navigationalObstructionService.queryhelp()

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
        val navigationalObstructionService = client.navigationalObstruction()

        val response =
            navigationalObstructionService.tuple(
                NavigationalObstructionTupleParams.builder()
                    .columns("columns")
                    .cycleDate(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .obstacleId("obstacleId")
                    .build()
            )

        response.forEach { it.validate() }
    }
}
