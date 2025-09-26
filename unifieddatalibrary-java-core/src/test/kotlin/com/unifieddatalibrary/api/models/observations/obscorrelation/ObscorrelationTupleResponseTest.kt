// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObscorrelationTupleResponseTest {

    @Test
    fun create() {
        val obscorrelationTupleResponse =
            ObscorrelationTupleResponse.builder()
                .classificationMarking("U")
                .corrType(ObscorrelationTupleResponse.CorrType.OBSERVATION)
                .dataMode(ObscorrelationTupleResponse.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(ObscorrelationTupleResponse.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(ObscorrelationTupleResponse.ReferenceOrbitType.ELSET)
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
                .addTag("TAG1")
                .addTag("TAG2")
                .trackId("TRACK-ID")
                .transactionId("TRANSACTION-ID")
                .build()

        assertThat(obscorrelationTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(obscorrelationTupleResponse.corrType())
            .isEqualTo(ObscorrelationTupleResponse.CorrType.OBSERVATION)
        assertThat(obscorrelationTupleResponse.dataMode())
            .isEqualTo(ObscorrelationTupleResponse.DataMode.TEST)
        assertThat(obscorrelationTupleResponse.msgTs())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(obscorrelationTupleResponse.obId())
            .isEqualTo("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
        assertThat(obscorrelationTupleResponse.obType())
            .isEqualTo(ObscorrelationTupleResponse.ObType.EO)
        assertThat(obscorrelationTupleResponse.referenceOrbitId())
            .isEqualTo("21826de2-5639-4c2a-b68f-30b67753b983")
        assertThat(obscorrelationTupleResponse.referenceOrbitType())
            .isEqualTo(ObscorrelationTupleResponse.ReferenceOrbitType.ELSET)
        assertThat(obscorrelationTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(obscorrelationTupleResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(obscorrelationTupleResponse.algorithmCorrType()).contains("ROTAS")
        assertThat(obscorrelationTupleResponse.altCatalog()).contains("CATALOG")
        assertThat(obscorrelationTupleResponse.altNamespace()).contains("18SDS")
        assertThat(obscorrelationTupleResponse.altObjectId()).contains("26900")
        assertThat(obscorrelationTupleResponse.altUct()).contains(false)
        assertThat(obscorrelationTupleResponse.astat()).contains(2L)
        assertThat(obscorrelationTupleResponse.corrQuality()).contains(0.96)
        assertThat(obscorrelationTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
        assertThat(obscorrelationTupleResponse.createdBy()).contains("some.user")
        assertThat(obscorrelationTupleResponse.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(obscorrelationTupleResponse.idParentCorrelation())
            .contains("ID-PARENT-CORRELATION")
        assertThat(obscorrelationTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(obscorrelationTupleResponse.origNetwork()).contains("OPS1")
        assertThat(obscorrelationTupleResponse.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(obscorrelationTupleResponse.satNo()).contains(12100)
        assertThat(obscorrelationTupleResponse.sourceDl()).contains("AXE")
        assertThat(obscorrelationTupleResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(obscorrelationTupleResponse.trackId()).contains("TRACK-ID")
        assertThat(obscorrelationTupleResponse.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val obscorrelationTupleResponse =
            ObscorrelationTupleResponse.builder()
                .classificationMarking("U")
                .corrType(ObscorrelationTupleResponse.CorrType.OBSERVATION)
                .dataMode(ObscorrelationTupleResponse.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(ObscorrelationTupleResponse.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(ObscorrelationTupleResponse.ReferenceOrbitType.ELSET)
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
                .addTag("TAG1")
                .addTag("TAG2")
                .trackId("TRACK-ID")
                .transactionId("TRANSACTION-ID")
                .build()

        val roundtrippedObscorrelationTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(obscorrelationTupleResponse),
                jacksonTypeRef<ObscorrelationTupleResponse>(),
            )

        assertThat(roundtrippedObscorrelationTupleResponse).isEqualTo(obscorrelationTupleResponse)
    }
}
