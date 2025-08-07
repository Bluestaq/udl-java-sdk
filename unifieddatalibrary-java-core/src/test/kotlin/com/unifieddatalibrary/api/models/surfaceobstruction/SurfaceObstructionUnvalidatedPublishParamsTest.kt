// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surfaceobstruction

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SurfaceObstructionUnvalidatedPublishParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SurfaceObstructionUnvalidatedPublishParams.builder()
                .addBody(
                    SurfaceObstructionUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(SurfaceObstructionUnvalidatedPublishParams.Body.DataMode.TEST)
                        .idSurface("be831d39-1822-da9f-7ace-6cc5643397dc")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                SurfaceObstructionUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(SurfaceObstructionUnvalidatedPublishParams.Body.DataMode.TEST)
                    .idSurface("be831d39-1822-da9f-7ace-6cc5643397dc")
                    .source("Bluestaq")
                    .build()
            )
    }
}
