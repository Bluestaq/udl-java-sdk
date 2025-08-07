// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surfaceobstruction

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SurfaceObstructionListResponseTest {

    @Test
    fun create() {
        val surfaceObstructionListResponse =
            SurfaceObstructionListResponse.builder()
                .classificationMarking("U")
                .dataMode(SurfaceObstructionListResponse.DataMode.TEST)
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

        assertThat(surfaceObstructionListResponse.classificationMarking()).isEqualTo("U")
        assertThat(surfaceObstructionListResponse.dataMode())
            .isEqualTo(SurfaceObstructionListResponse.DataMode.TEST)
        assertThat(surfaceObstructionListResponse.idSurface())
            .isEqualTo("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(surfaceObstructionListResponse.source()).isEqualTo("Bluestaq")
        assertThat(surfaceObstructionListResponse.id())
            .contains("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(surfaceObstructionListResponse.advisoryRequired().getOrNull())
            .containsExactly("C20", "C17")
        assertThat(surfaceObstructionListResponse.approvalRequired().getOrNull())
            .containsExactly("C20", "C17")
        assertThat(surfaceObstructionListResponse.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(surfaceObstructionListResponse.createdBy()).contains("some.user")
        assertThat(surfaceObstructionListResponse.distanceFromCenterLine()).contains(17.8)
        assertThat(surfaceObstructionListResponse.distanceFromEdge()).contains(15.8)
        assertThat(surfaceObstructionListResponse.distanceFromThreshold()).contains(19.5)
        assertThat(surfaceObstructionListResponse.idNavigationalObstruction())
            .contains("a2831d39-1822-da9f-7ace-6cc5643397da")
        assertThat(surfaceObstructionListResponse.obstructionDesc()).contains("PYLON")
        assertThat(surfaceObstructionListResponse.obstructionHeight()).contains(35.25)
        assertThat(surfaceObstructionListResponse.obstructionSideCode()).contains("F")
        assertThat(surfaceObstructionListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(surfaceObstructionListResponse.origNetwork()).contains("OPS1")
        assertThat(surfaceObstructionListResponse.sourceDl()).contains("AXE")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val surfaceObstructionListResponse =
            SurfaceObstructionListResponse.builder()
                .classificationMarking("U")
                .dataMode(SurfaceObstructionListResponse.DataMode.TEST)
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

        val roundtrippedSurfaceObstructionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(surfaceObstructionListResponse),
                jacksonTypeRef<SurfaceObstructionListResponse>(),
            )

        assertThat(roundtrippedSurfaceObstructionListResponse)
            .isEqualTo(surfaceObstructionListResponse)
    }
}
