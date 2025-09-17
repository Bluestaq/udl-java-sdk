// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.deconflictset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeconflictsetListResponseTest {

    @Test
    fun create() {
        val deconflictsetListResponse =
            DeconflictsetListResponse.builder()
                .classificationMarking("U")
                .dataMode(DeconflictsetListResponse.DataMode.TEST)
                .eventStartTime(OffsetDateTime.parse("2023-09-27T20:49:37.812Z"))
                .numWindows(250001)
                .source("Bluestaq")
                .id("123dd511-8ba5-47d3-9909-836149f87434")
                .calculationEndTime(OffsetDateTime.parse("2023-09-25T20:00:00.123Z"))
                .calculationId("3856c0a0-585f-4232-af5d-93bad320fac6")
                .calculationStartTime(OffsetDateTime.parse("2023-09-25T18:00:00.123Z"))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .addError("ERROR1")
                .addError("ERROR2")
                .eventEndTime(OffsetDateTime.parse("2023-09-28T20:49:37.812Z"))
                .eventType("LASER")
                .idLaserDeconflictRequest("026dd511-8ba5-47d3-9909-836149f87686")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .referenceFrame("J2000")
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .addWarning("WARNING1")
                .addWarning("WARNING2")
                .build()

        assertThat(deconflictsetListResponse.classificationMarking()).isEqualTo("U")
        assertThat(deconflictsetListResponse.dataMode())
            .isEqualTo(DeconflictsetListResponse.DataMode.TEST)
        assertThat(deconflictsetListResponse.eventStartTime())
            .isEqualTo(OffsetDateTime.parse("2023-09-27T20:49:37.812Z"))
        assertThat(deconflictsetListResponse.numWindows()).isEqualTo(250001)
        assertThat(deconflictsetListResponse.source()).isEqualTo("Bluestaq")
        assertThat(deconflictsetListResponse.id()).contains("123dd511-8ba5-47d3-9909-836149f87434")
        assertThat(deconflictsetListResponse.calculationEndTime())
            .contains(OffsetDateTime.parse("2023-09-25T20:00:00.123Z"))
        assertThat(deconflictsetListResponse.calculationId())
            .contains("3856c0a0-585f-4232-af5d-93bad320fac6")
        assertThat(deconflictsetListResponse.calculationStartTime())
            .contains(OffsetDateTime.parse("2023-09-25T18:00:00.123Z"))
        assertThat(deconflictsetListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(deconflictsetListResponse.createdBy()).contains("some.user")
        assertThat(deconflictsetListResponse.errors().getOrNull())
            .containsExactly("ERROR1", "ERROR2")
        assertThat(deconflictsetListResponse.eventEndTime())
            .contains(OffsetDateTime.parse("2023-09-28T20:49:37.812Z"))
        assertThat(deconflictsetListResponse.eventType()).contains("LASER")
        assertThat(deconflictsetListResponse.idLaserDeconflictRequest())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(deconflictsetListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(deconflictsetListResponse.origNetwork()).contains("OPS1")
        assertThat(deconflictsetListResponse.referenceFrame()).contains("J2000")
        assertThat(deconflictsetListResponse.sourceDl()).contains("AXE")
        assertThat(deconflictsetListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(deconflictsetListResponse.transactionId()).contains("TRANSACTION-ID")
        assertThat(deconflictsetListResponse.warnings().getOrNull())
            .containsExactly("WARNING1", "WARNING2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deconflictsetListResponse =
            DeconflictsetListResponse.builder()
                .classificationMarking("U")
                .dataMode(DeconflictsetListResponse.DataMode.TEST)
                .eventStartTime(OffsetDateTime.parse("2023-09-27T20:49:37.812Z"))
                .numWindows(250001)
                .source("Bluestaq")
                .id("123dd511-8ba5-47d3-9909-836149f87434")
                .calculationEndTime(OffsetDateTime.parse("2023-09-25T20:00:00.123Z"))
                .calculationId("3856c0a0-585f-4232-af5d-93bad320fac6")
                .calculationStartTime(OffsetDateTime.parse("2023-09-25T18:00:00.123Z"))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .addError("ERROR1")
                .addError("ERROR2")
                .eventEndTime(OffsetDateTime.parse("2023-09-28T20:49:37.812Z"))
                .eventType("LASER")
                .idLaserDeconflictRequest("026dd511-8ba5-47d3-9909-836149f87686")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .referenceFrame("J2000")
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .addWarning("WARNING1")
                .addWarning("WARNING2")
                .build()

        val roundtrippedDeconflictsetListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deconflictsetListResponse),
                jacksonTypeRef<DeconflictsetListResponse>(),
            )

        assertThat(roundtrippedDeconflictsetListResponse).isEqualTo(deconflictsetListResponse)
    }
}
