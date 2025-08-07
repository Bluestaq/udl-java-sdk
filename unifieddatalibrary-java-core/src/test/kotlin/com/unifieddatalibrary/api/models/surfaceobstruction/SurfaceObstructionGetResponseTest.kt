// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surfaceobstruction

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SurfaceObstructionGetResponseTest {

    @Test
    fun create() {
        val surfaceObstructionGetResponse =
            SurfaceObstructionGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SurfaceObstructionGetResponse.DataMode.TEST)
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

        assertThat(surfaceObstructionGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(surfaceObstructionGetResponse.dataMode())
            .isEqualTo(SurfaceObstructionGetResponse.DataMode.TEST)
        assertThat(surfaceObstructionGetResponse.idSurface())
            .isEqualTo("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(surfaceObstructionGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(surfaceObstructionGetResponse.id())
            .contains("be831d39-1822-da9f-7ace-6cc5643397dc")
        assertThat(surfaceObstructionGetResponse.advisoryRequired().getOrNull())
            .containsExactly("C20", "C17")
        assertThat(surfaceObstructionGetResponse.approvalRequired().getOrNull())
            .containsExactly("C20", "C17")
        assertThat(surfaceObstructionGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(surfaceObstructionGetResponse.createdBy()).contains("some.user")
        assertThat(surfaceObstructionGetResponse.distanceFromCenterLine()).contains(17.8)
        assertThat(surfaceObstructionGetResponse.distanceFromEdge()).contains(15.8)
        assertThat(surfaceObstructionGetResponse.distanceFromThreshold()).contains(19.5)
        assertThat(surfaceObstructionGetResponse.idNavigationalObstruction())
            .contains("a2831d39-1822-da9f-7ace-6cc5643397da")
        assertThat(surfaceObstructionGetResponse.obstructionDesc()).contains("PYLON")
        assertThat(surfaceObstructionGetResponse.obstructionHeight()).contains(35.25)
        assertThat(surfaceObstructionGetResponse.obstructionSideCode()).contains("F")
        assertThat(surfaceObstructionGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(surfaceObstructionGetResponse.origNetwork()).contains("OPS1")
        assertThat(surfaceObstructionGetResponse.sourceDl()).contains("AXE")
        assertThat(surfaceObstructionGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(surfaceObstructionGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val surfaceObstructionGetResponse =
            SurfaceObstructionGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SurfaceObstructionGetResponse.DataMode.TEST)
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

        val roundtrippedSurfaceObstructionGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(surfaceObstructionGetResponse),
                jacksonTypeRef<SurfaceObstructionGetResponse>(),
            )

        assertThat(roundtrippedSurfaceObstructionGetResponse)
            .isEqualTo(surfaceObstructionGetResponse)
    }
}
