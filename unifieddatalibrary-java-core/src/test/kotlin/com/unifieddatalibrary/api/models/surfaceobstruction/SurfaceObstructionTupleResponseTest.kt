// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surfaceobstruction

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SurfaceObstructionTupleResponseTest {

    @Test
    fun create() {
        val surfaceObstructionTupleResponse =
            SurfaceObstructionTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SurfaceObstructionTupleResponse.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(surfaceObstructionTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(surfaceObstructionTupleResponse.dataMode())
            .isEqualTo(SurfaceObstructionTupleResponse.DataMode.TEST)
        assertThat(surfaceObstructionTupleResponse.idSurface())
            .isEqualTo("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(surfaceObstructionTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(surfaceObstructionTupleResponse.id())
            .contains("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(surfaceObstructionTupleResponse.advisoryRequired().getOrNull())
            .containsExactly("C20", "C17")
        assertThat(surfaceObstructionTupleResponse.approvalRequired().getOrNull())
            .containsExactly("C20", "C17")
        assertThat(surfaceObstructionTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(surfaceObstructionTupleResponse.createdBy()).contains("some.user")
        assertThat(surfaceObstructionTupleResponse.distanceFromCenterLine()).contains(17.8)
        assertThat(surfaceObstructionTupleResponse.distanceFromEdge()).contains(15.8)
        assertThat(surfaceObstructionTupleResponse.distanceFromThreshold()).contains(19.5)
        assertThat(surfaceObstructionTupleResponse.idNavigationalObstruction())
            .contains("a2831d39-1822-da9f-7ace-6cc5643397da")
        assertThat(surfaceObstructionTupleResponse.obstructionDesc()).contains("PYLON")
        assertThat(surfaceObstructionTupleResponse.obstructionHeight()).contains(35.25)
        assertThat(surfaceObstructionTupleResponse.obstructionSideCode()).contains("F")
        assertThat(surfaceObstructionTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(surfaceObstructionTupleResponse.origNetwork()).contains("OPS1")
        assertThat(surfaceObstructionTupleResponse.sourceDl()).contains("AXE")
        assertThat(surfaceObstructionTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(surfaceObstructionTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val surfaceObstructionTupleResponse =
            SurfaceObstructionTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SurfaceObstructionTupleResponse.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSurfaceObstructionTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(surfaceObstructionTupleResponse),
                jacksonTypeRef<SurfaceObstructionTupleResponse>(),
            )

        assertThat(roundtrippedSurfaceObstructionTupleResponse)
            .isEqualTo(surfaceObstructionTupleResponse)
    }
}
