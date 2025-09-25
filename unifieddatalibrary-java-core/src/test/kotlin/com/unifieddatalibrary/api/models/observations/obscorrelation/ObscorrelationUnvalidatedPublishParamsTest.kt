// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObscorrelationUnvalidatedPublishParamsTest {

    @Test
    fun create() {
        ObscorrelationUnvalidatedPublishParams.builder()
            .addBody(
                ObscorrelationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .corrType(ObscorrelationUnvalidatedPublishParams.Body.CorrType.OBSERVATION)
                    .dataMode(ObscorrelationUnvalidatedPublishParams.Body.DataMode.TEST)
                    .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                    .obType(ObscorrelationUnvalidatedPublishParams.Body.ObType.EO)
                    .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                    .referenceOrbitType(
                        ObscorrelationUnvalidatedPublishParams.Body.ReferenceOrbitType.ELSET
                    )
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ObscorrelationUnvalidatedPublishParams.builder()
                .addBody(
                    ObscorrelationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .corrType(ObscorrelationUnvalidatedPublishParams.Body.CorrType.OBSERVATION)
                        .dataMode(ObscorrelationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                        .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                        .obType(ObscorrelationUnvalidatedPublishParams.Body.ObType.EO)
                        .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                        .referenceOrbitType(
                            ObscorrelationUnvalidatedPublishParams.Body.ReferenceOrbitType.ELSET
                        )
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                ObscorrelationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .corrType(ObscorrelationUnvalidatedPublishParams.Body.CorrType.OBSERVATION)
                    .dataMode(ObscorrelationUnvalidatedPublishParams.Body.DataMode.TEST)
                    .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                    .obType(ObscorrelationUnvalidatedPublishParams.Body.ObType.EO)
                    .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                    .referenceOrbitType(
                        ObscorrelationUnvalidatedPublishParams.Body.ReferenceOrbitType.ELSET
                    )
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ObscorrelationUnvalidatedPublishParams.builder()
                .addBody(
                    ObscorrelationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .corrType(ObscorrelationUnvalidatedPublishParams.Body.CorrType.OBSERVATION)
                        .dataMode(ObscorrelationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                        .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                        .obType(ObscorrelationUnvalidatedPublishParams.Body.ObType.EO)
                        .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                        .referenceOrbitType(
                            ObscorrelationUnvalidatedPublishParams.Body.ReferenceOrbitType.ELSET
                        )
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                ObscorrelationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .corrType(ObscorrelationUnvalidatedPublishParams.Body.CorrType.OBSERVATION)
                    .dataMode(ObscorrelationUnvalidatedPublishParams.Body.DataMode.TEST)
                    .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                    .obType(ObscorrelationUnvalidatedPublishParams.Body.ObType.EO)
                    .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                    .referenceOrbitType(
                        ObscorrelationUnvalidatedPublishParams.Body.ReferenceOrbitType.ELSET
                    )
                    .source("Bluestaq")
                    .build()
            )
    }
}
