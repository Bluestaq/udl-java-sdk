// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surfaceobstruction

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SurfaceObstructionUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            SurfaceObstructionUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SurfaceObstructionUpdateParams.DataMode.TEST)
                .idSurface("be831d39-1822-da9f-7ace-6cc5643397dc")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SurfaceObstructionUpdateParams.DataMode.TEST)
        assertThat(body.idSurface()).isEqualTo("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(body.advisoryRequired().getOrNull()).containsExactly("C20", "C17")
        assertThat(body.approvalRequired().getOrNull()).containsExactly("C20", "C17")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.distanceFromCenterLine()).contains(17.8)
        assertThat(body.distanceFromEdge()).contains(15.8)
        assertThat(body.distanceFromThreshold()).contains(19.5)
        assertThat(body.idNavigationalObstruction())
            .contains("a2831d39-1822-da9f-7ace-6cc5643397da")
        assertThat(body.obstructionDesc()).contains("PYLON")
        assertThat(body.obstructionHeight()).contains(35.25)
        assertThat(body.obstructionSideCode()).contains("F")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.sourceDl()).contains("AXE")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SurfaceObstructionUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SurfaceObstructionUpdateParams.DataMode.TEST)
                .idSurface("be831d39-1822-da9f-7ace-6cc5643397dc")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SurfaceObstructionUpdateParams.DataMode.TEST)
        assertThat(body.idSurface()).isEqualTo("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
