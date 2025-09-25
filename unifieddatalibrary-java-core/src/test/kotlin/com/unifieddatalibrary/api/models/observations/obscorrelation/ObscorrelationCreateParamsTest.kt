// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObscorrelationCreateParamsTest {

    @Test
    fun create() {
        ObscorrelationCreateParams.builder()
            .classificationMarking("U")
            .corrType(ObscorrelationCreateParams.CorrType.OBSERVATION)
            .dataMode(ObscorrelationCreateParams.DataMode.TEST)
            .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
            .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
            .obType(ObscorrelationCreateParams.ObType.EO)
            .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
            .referenceOrbitType(ObscorrelationCreateParams.ReferenceOrbitType.ELSET)
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
    }

    @Test
    fun body() {
        val params =
            ObscorrelationCreateParams.builder()
                .classificationMarking("U")
                .corrType(ObscorrelationCreateParams.CorrType.OBSERVATION)
                .dataMode(ObscorrelationCreateParams.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(ObscorrelationCreateParams.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(ObscorrelationCreateParams.ReferenceOrbitType.ELSET)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.corrType()).isEqualTo(ObscorrelationCreateParams.CorrType.OBSERVATION)
        assertThat(body.dataMode()).isEqualTo(ObscorrelationCreateParams.DataMode.TEST)
        assertThat(body.msgTs()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(body.obId()).isEqualTo("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
        assertThat(body.obType()).isEqualTo(ObscorrelationCreateParams.ObType.EO)
        assertThat(body.referenceOrbitId()).isEqualTo("21826de2-5639-4c2a-b68f-30b67753b983")
        assertThat(body.referenceOrbitType())
            .isEqualTo(ObscorrelationCreateParams.ReferenceOrbitType.ELSET)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(body.algorithmCorrType()).contains("ROTAS")
        assertThat(body.altCatalog()).contains("CATALOG")
        assertThat(body.altNamespace()).contains("18SDS")
        assertThat(body.altObjectId()).contains("26900")
        assertThat(body.altUct()).contains(false)
        assertThat(body.astat()).contains(2L)
        assertThat(body.corrQuality()).contains(0.96)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(body.idParentCorrelation()).contains("ID-PARENT-CORRELATION")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(body.satNo()).contains(12100)
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(body.trackId()).contains("TRACK-ID")
        assertThat(body.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ObscorrelationCreateParams.builder()
                .classificationMarking("U")
                .corrType(ObscorrelationCreateParams.CorrType.OBSERVATION)
                .dataMode(ObscorrelationCreateParams.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(ObscorrelationCreateParams.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(ObscorrelationCreateParams.ReferenceOrbitType.ELSET)
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.corrType()).isEqualTo(ObscorrelationCreateParams.CorrType.OBSERVATION)
        assertThat(body.dataMode()).isEqualTo(ObscorrelationCreateParams.DataMode.TEST)
        assertThat(body.msgTs()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(body.obId()).isEqualTo("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
        assertThat(body.obType()).isEqualTo(ObscorrelationCreateParams.ObType.EO)
        assertThat(body.referenceOrbitId()).isEqualTo("21826de2-5639-4c2a-b68f-30b67753b983")
        assertThat(body.referenceOrbitType())
            .isEqualTo(ObscorrelationCreateParams.ReferenceOrbitType.ELSET)
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
