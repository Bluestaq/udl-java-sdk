// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObscorrelationRetrieveResponseTest {

    @Test
    fun create() {
        val obscorrelationRetrieveResponse =
            ObscorrelationRetrieveResponse.builder()
                .classificationMarking("U")
                .corrType(ObscorrelationRetrieveResponse.CorrType.OBSERVATION)
                .dataMode(ObscorrelationRetrieveResponse.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(ObscorrelationRetrieveResponse.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(ObscorrelationRetrieveResponse.ReferenceOrbitType.ELSET)
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

        assertThat(obscorrelationRetrieveResponse.classificationMarking()).isEqualTo("U")
        assertThat(obscorrelationRetrieveResponse.corrType())
            .isEqualTo(ObscorrelationRetrieveResponse.CorrType.OBSERVATION)
        assertThat(obscorrelationRetrieveResponse.dataMode())
            .isEqualTo(ObscorrelationRetrieveResponse.DataMode.TEST)
        assertThat(obscorrelationRetrieveResponse.msgTs())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(obscorrelationRetrieveResponse.obId())
            .isEqualTo("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
        assertThat(obscorrelationRetrieveResponse.obType())
            .isEqualTo(ObscorrelationRetrieveResponse.ObType.EO)
        assertThat(obscorrelationRetrieveResponse.referenceOrbitId())
            .isEqualTo("21826de2-5639-4c2a-b68f-30b67753b983")
        assertThat(obscorrelationRetrieveResponse.referenceOrbitType())
            .isEqualTo(ObscorrelationRetrieveResponse.ReferenceOrbitType.ELSET)
        assertThat(obscorrelationRetrieveResponse.source()).isEqualTo("Bluestaq")
        assertThat(obscorrelationRetrieveResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(obscorrelationRetrieveResponse.algorithmCorrType()).contains("ROTAS")
        assertThat(obscorrelationRetrieveResponse.altCatalog()).contains("CATALOG")
        assertThat(obscorrelationRetrieveResponse.altNamespace()).contains("18SDS")
        assertThat(obscorrelationRetrieveResponse.altObjectId()).contains("26900")
        assertThat(obscorrelationRetrieveResponse.altUct()).contains(false)
        assertThat(obscorrelationRetrieveResponse.astat()).contains(2L)
        assertThat(obscorrelationRetrieveResponse.corrQuality()).contains(0.96)
        assertThat(obscorrelationRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
        assertThat(obscorrelationRetrieveResponse.createdBy()).contains("some.user")
        assertThat(obscorrelationRetrieveResponse.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(obscorrelationRetrieveResponse.idParentCorrelation())
            .contains("ID-PARENT-CORRELATION")
        assertThat(obscorrelationRetrieveResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(obscorrelationRetrieveResponse.origNetwork()).contains("OPS1")
        assertThat(obscorrelationRetrieveResponse.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(obscorrelationRetrieveResponse.satNo()).contains(12100)
        assertThat(obscorrelationRetrieveResponse.sourceDl()).contains("AXE")
        assertThat(obscorrelationRetrieveResponse.tags().getOrNull())
            .containsExactly("TAG1", "TAG2")
        assertThat(obscorrelationRetrieveResponse.trackId()).contains("TRACK-ID")
        assertThat(obscorrelationRetrieveResponse.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val obscorrelationRetrieveResponse =
            ObscorrelationRetrieveResponse.builder()
                .classificationMarking("U")
                .corrType(ObscorrelationRetrieveResponse.CorrType.OBSERVATION)
                .dataMode(ObscorrelationRetrieveResponse.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(ObscorrelationRetrieveResponse.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(ObscorrelationRetrieveResponse.ReferenceOrbitType.ELSET)
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

        val roundtrippedObscorrelationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(obscorrelationRetrieveResponse),
                jacksonTypeRef<ObscorrelationRetrieveResponse>(),
            )

        assertThat(roundtrippedObscorrelationRetrieveResponse)
            .isEqualTo(obscorrelationRetrieveResponse)
    }
}
