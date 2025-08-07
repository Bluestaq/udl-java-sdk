// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
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
internal class SurfaceObstructionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceObstructionServiceAsync = client.surfaceObstruction()

        val future =
            surfaceObstructionServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceObstructionServiceAsync = client.surfaceObstruction()

        val future =
            surfaceObstructionServiceAsync.update(
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

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceObstructionServiceAsync = client.surfaceObstruction()

        val pageFuture = surfaceObstructionServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceObstructionServiceAsync = client.surfaceObstruction()

        val future = surfaceObstructionServiceAsync.delete("id")

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
        val surfaceObstructionServiceAsync = client.surfaceObstruction()

        val responseFuture =
            surfaceObstructionServiceAsync.count(
                SurfaceObstructionCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceObstructionServiceAsync = client.surfaceObstruction()

        val surfaceObstructionFuture =
            surfaceObstructionServiceAsync.get(
                SurfaceObstructionGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val surfaceObstruction = surfaceObstructionFuture.get()
        surfaceObstruction.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceObstructionServiceAsync = client.surfaceObstruction()

        val responseFuture = surfaceObstructionServiceAsync.queryhelp()

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
        val surfaceObstructionServiceAsync = client.surfaceObstruction()

        val responseFuture =
            surfaceObstructionServiceAsync.tuple(
                SurfaceObstructionTupleParams.builder()
                    .columns("columns")
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
        val surfaceObstructionServiceAsync = client.surfaceObstruction()

        val future =
            surfaceObstructionServiceAsync.unvalidatedPublish(
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

        val response = future.get()
    }
}
