// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListResponseTest {

    @Test
    fun create() {
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .corrType(HistoryListResponse.CorrType.OBSERVATION)
                .dataMode(HistoryListResponse.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(HistoryListResponse.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(HistoryListResponse.ReferenceOrbitType.ELSET)
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

        assertThat(historyListResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyListResponse.corrType())
            .isEqualTo(HistoryListResponse.CorrType.OBSERVATION)
        assertThat(historyListResponse.dataMode()).isEqualTo(HistoryListResponse.DataMode.TEST)
        assertThat(historyListResponse.msgTs())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(historyListResponse.obId()).isEqualTo("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
        assertThat(historyListResponse.obType()).isEqualTo(HistoryListResponse.ObType.EO)
        assertThat(historyListResponse.referenceOrbitId())
            .isEqualTo("21826de2-5639-4c2a-b68f-30b67753b983")
        assertThat(historyListResponse.referenceOrbitType())
            .isEqualTo(HistoryListResponse.ReferenceOrbitType.ELSET)
        assertThat(historyListResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(historyListResponse.algorithmCorrType()).contains("ROTAS")
        assertThat(historyListResponse.altCatalog()).contains("CATALOG")
        assertThat(historyListResponse.altNamespace()).contains("18SDS")
        assertThat(historyListResponse.altObjectId()).contains("26900")
        assertThat(historyListResponse.altUct()).contains(false)
        assertThat(historyListResponse.astat()).contains(2L)
        assertThat(historyListResponse.corrQuality()).contains(0.96)
        assertThat(historyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
        assertThat(historyListResponse.createdBy()).contains("some.user")
        assertThat(historyListResponse.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(historyListResponse.idParentCorrelation()).contains("ID-PARENT-CORRELATION")
        assertThat(historyListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyListResponse.origNetwork()).contains("OPS1")
        assertThat(historyListResponse.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(historyListResponse.satNo()).contains(12100)
        assertThat(historyListResponse.sourceDl()).contains("AXE")
        assertThat(historyListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(historyListResponse.trackId()).contains("TRACK-ID")
        assertThat(historyListResponse.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .corrType(HistoryListResponse.CorrType.OBSERVATION)
                .dataMode(HistoryListResponse.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(HistoryListResponse.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(HistoryListResponse.ReferenceOrbitType.ELSET)
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

        val roundtrippedHistoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyListResponse),
                jacksonTypeRef<HistoryListResponse>(),
            )

        assertThat(roundtrippedHistoryListResponse).isEqualTo(historyListResponse)
    }
}
