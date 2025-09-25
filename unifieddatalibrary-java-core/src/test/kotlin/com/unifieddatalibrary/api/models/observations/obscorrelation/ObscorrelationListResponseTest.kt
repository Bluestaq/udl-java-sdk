// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObscorrelationListResponseTest {

    @Test
    fun create() {
        val obscorrelationListResponse =
            ObscorrelationListResponse.builder()
                .classificationMarking("U")
                .corrType(ObscorrelationListResponse.CorrType.OBSERVATION)
                .dataMode(ObscorrelationListResponse.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(ObscorrelationListResponse.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(ObscorrelationListResponse.ReferenceOrbitType.ELSET)
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .algorithmCorrType("ROTAS")
                .altCatalog("CATALOG")
                .altNamespace("18SDS")
                .altObjectId("26900")
                .altUct(false)
                .astat(2L)
                .corrQuality(0.96)
                .createdAt(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
                .createdBy("some.user")
                .idOnOrbit("ONORBIT-ID")
                .idParentCorrelation("ID-PARENT-CORRELATION")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .satNo(12100)
                .sourceDl("AXE")
                .trackId("TRACK-ID")
                .transactionId("TRANSACTION-ID")
                .build()

        assertThat(obscorrelationListResponse.classificationMarking()).isEqualTo("U")
        assertThat(obscorrelationListResponse.corrType())
            .isEqualTo(ObscorrelationListResponse.CorrType.OBSERVATION)
        assertThat(obscorrelationListResponse.dataMode())
            .isEqualTo(ObscorrelationListResponse.DataMode.TEST)
        assertThat(obscorrelationListResponse.msgTs())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(obscorrelationListResponse.obId())
            .isEqualTo("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
        assertThat(obscorrelationListResponse.obType())
            .isEqualTo(ObscorrelationListResponse.ObType.EO)
        assertThat(obscorrelationListResponse.referenceOrbitId())
            .isEqualTo("21826de2-5639-4c2a-b68f-30b67753b983")
        assertThat(obscorrelationListResponse.referenceOrbitType())
            .isEqualTo(ObscorrelationListResponse.ReferenceOrbitType.ELSET)
        assertThat(obscorrelationListResponse.source()).isEqualTo("Bluestaq")
        assertThat(obscorrelationListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(obscorrelationListResponse.algorithmCorrType()).contains("ROTAS")
        assertThat(obscorrelationListResponse.altCatalog()).contains("CATALOG")
        assertThat(obscorrelationListResponse.altNamespace()).contains("18SDS")
        assertThat(obscorrelationListResponse.altObjectId()).contains("26900")
        assertThat(obscorrelationListResponse.altUct()).contains(false)
        assertThat(obscorrelationListResponse.astat()).contains(2L)
        assertThat(obscorrelationListResponse.corrQuality()).contains(0.96)
        assertThat(obscorrelationListResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
        assertThat(obscorrelationListResponse.createdBy()).contains("some.user")
        assertThat(obscorrelationListResponse.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(obscorrelationListResponse.idParentCorrelation())
            .contains("ID-PARENT-CORRELATION")
        assertThat(obscorrelationListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(obscorrelationListResponse.origNetwork()).contains("OPS1")
        assertThat(obscorrelationListResponse.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(obscorrelationListResponse.satNo()).contains(12100)
        assertThat(obscorrelationListResponse.sourceDl()).contains("AXE")
        assertThat(obscorrelationListResponse.trackId()).contains("TRACK-ID")
        assertThat(obscorrelationListResponse.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val obscorrelationListResponse =
            ObscorrelationListResponse.builder()
                .classificationMarking("U")
                .corrType(ObscorrelationListResponse.CorrType.OBSERVATION)
                .dataMode(ObscorrelationListResponse.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(ObscorrelationListResponse.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(ObscorrelationListResponse.ReferenceOrbitType.ELSET)
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .algorithmCorrType("ROTAS")
                .altCatalog("CATALOG")
                .altNamespace("18SDS")
                .altObjectId("26900")
                .altUct(false)
                .astat(2L)
                .corrQuality(0.96)
                .createdAt(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
                .createdBy("some.user")
                .idOnOrbit("ONORBIT-ID")
                .idParentCorrelation("ID-PARENT-CORRELATION")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .satNo(12100)
                .sourceDl("AXE")
                .trackId("TRACK-ID")
                .transactionId("TRANSACTION-ID")
                .build()

        val roundtrippedObscorrelationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(obscorrelationListResponse),
                jacksonTypeRef<ObscorrelationListResponse>(),
            )

        assertThat(roundtrippedObscorrelationListResponse).isEqualTo(obscorrelationListResponse)
    }
}
