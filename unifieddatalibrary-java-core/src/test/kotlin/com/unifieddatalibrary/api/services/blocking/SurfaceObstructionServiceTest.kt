// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionCountParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionCreateParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionGetParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionTupleParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.surfaceobstruction.SurfaceObstructionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SurfaceObstructionServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceObstructionService = client.surfaceObstruction()

        surfaceObstructionService.create(
            SurfaceObstructionCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SurfaceObstructionCreateParams.DataMode.TEST)
                .idSurface("be831d39-1822-da9f-7ace-6cc5643397dc")
                .source("Bluestaq")
                .id("be831d39-1822-da9f-7ace-6cc5643397dc")
                .addAdvisoryRequired("C20")
                .addAdvisoryRequired("C17")
                .addApprovalRequired("C20")
                .addApprovalRequired("C17")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .distanceFromCenterLine(17.8)
                .distanceFromEdge(15.8)
                .distanceFromThreshold(19.5)
                .idNavigationalObstruction("a2831d39-1822-da9f-7ace-6cc5643397da")
                .obstructionDesc("PYLON")
                .obstructionHeight(35.25)
                .obstructionSideCode("F")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .sourceDl("AXE")
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
        val surfaceObstructionService = client.surfaceObstruction()

        surfaceObstructionService.update(
            SurfaceObstructionUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SurfaceObstructionUpdateParams.DataMode.TEST)
                .idSurface("be831d39-1822-da9f-7ace-6cc5643397dc")
                .source("Bluestaq")
                .bodyId("be831d39-1822-da9f-7ace-6cc5643397dc")
                .addAdvisoryRequired("C20")
                .addAdvisoryRequired("C17")
                .addApprovalRequired("C20")
                .addApprovalRequired("C17")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .distanceFromCenterLine(17.8)
                .distanceFromEdge(15.8)
                .distanceFromThreshold(19.5)
                .idNavigationalObstruction("a2831d39-1822-da9f-7ace-6cc5643397da")
                .obstructionDesc("PYLON")
                .obstructionHeight(35.25)
                .obstructionSideCode("F")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .sourceDl("AXE")
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
        val surfaceObstructionService = client.surfaceObstruction()

        val page = surfaceObstructionService.list()

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
        val surfaceObstructionService = client.surfaceObstruction()

        surfaceObstructionService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceObstructionService = client.surfaceObstruction()

        surfaceObstructionService.count(
            SurfaceObstructionCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val surfaceObstructionService = client.surfaceObstruction()

        val surfaceObstruction =
            surfaceObstructionService.get(
                SurfaceObstructionGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        surfaceObstruction.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceObstructionService = client.surfaceObstruction()

        val response = surfaceObstructionService.queryhelp()

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
        val surfaceObstructionService = client.surfaceObstruction()

        val response =
            surfaceObstructionService.tuple(
                SurfaceObstructionTupleParams.builder()
                    .columns("columns")
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
        val surfaceObstructionService = client.surfaceObstruction()

        surfaceObstructionService.unvalidatedPublish(
            SurfaceObstructionUnvalidatedPublishParams.builder()
                .addBody(
                    SurfaceObstructionUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(SurfaceObstructionUnvalidatedPublishParams.Body.DataMode.TEST)
                        .idSurface("be831d39-1822-da9f-7ace-6cc5643397dc")
                        .source("Bluestaq")
                        .id("be831d39-1822-da9f-7ace-6cc5643397dc")
                        .addAdvisoryRequired("C20")
                        .addAdvisoryRequired("C17")
                        .addApprovalRequired("C20")
                        .addApprovalRequired("C17")
                        .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .distanceFromCenterLine(17.8)
                        .distanceFromEdge(15.8)
                        .distanceFromThreshold(19.5)
                        .idNavigationalObstruction("a2831d39-1822-da9f-7ace-6cc5643397da")
                        .obstructionDesc("PYLON")
                        .obstructionHeight(35.25)
                        .obstructionSideCode("F")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .sourceDl("AXE")
                        .build()
                )
                .build()
        )
    }
}
