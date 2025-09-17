// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment.history

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
                .dataMode(HistoryListResponse.DataMode.TEST)
                .featureTs(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
                .featureUoM("MHz")
                .idAnalyticImagery("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .agjson(
                    "{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}"
                )
                .andims(1)
                .annLims(listOf(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4)))
                .addAnnText("rec1")
                .addAnnText("rec2")
                .asrid(4326)
                .assessment(
                    "Vessel bigger than other small fishing boats commonly found along the coastline"
                )
                .atext("POINT(52.23486096929749 16.191937138595005)")
                .atype("POINT")
                .confidence(0.85)
                .createdAt(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
                .createdBy("some.user")
                .externalId("2024-06-22-17-53-05_UMBRA-05_GEC")
                .addFeatureArray(1227.6)
                .addFeatureArray(1575.42)
                .featureBool(true)
                .featureString("TRANSMITTING FREQUENCIES")
                .addFeatureStringArray("String1")
                .addFeatureStringArray("String2")
                .featureValue(1227.6)
                .heading(97.1)
                .height(7.25)
                .length(10.54)
                .name("HEADING")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .speed(0.1)
                .addSrcId("b008c63b-ad89-4493-80e0-77bc982bef77")
                .addSrcId("3565a6dd-654e-4969-89e0-ee7c51ab1e1b")
                .addSrcT(OffsetDateTime.parse("2025-02-24T16:27:18.471Z"))
                .addSrcT(OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"))
                .addSrcTyp("SAR")
                .addSrcTyp("AIS")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
                .type("VESSEL")
                .width(3.74)
                .build()

        assertThat(historyListResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyListResponse.dataMode()).isEqualTo(HistoryListResponse.DataMode.TEST)
        assertThat(historyListResponse.featureTs())
            .isEqualTo(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
        assertThat(historyListResponse.featureUoM()).isEqualTo("MHz")
        assertThat(historyListResponse.idAnalyticImagery())
            .isEqualTo("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
        assertThat(historyListResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(historyListResponse.agjson())
            .contains("{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}")
        assertThat(historyListResponse.andims()).contains(1)
        assertThat(historyListResponse.annLims().getOrNull())
            .containsExactly(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4))
        assertThat(historyListResponse.annText().getOrNull()).containsExactly("rec1", "rec2")
        assertThat(historyListResponse.asrid()).contains(4326)
        assertThat(historyListResponse.assessment())
            .contains(
                "Vessel bigger than other small fishing boats commonly found along the coastline"
            )
        assertThat(historyListResponse.atext())
            .contains("POINT(52.23486096929749 16.191937138595005)")
        assertThat(historyListResponse.atype()).contains("POINT")
        assertThat(historyListResponse.confidence()).contains(0.85)
        assertThat(historyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
        assertThat(historyListResponse.createdBy()).contains("some.user")
        assertThat(historyListResponse.externalId()).contains("2024-06-22-17-53-05_UMBRA-05_GEC")
        assertThat(historyListResponse.featureArray().getOrNull()).containsExactly(1227.6, 1575.42)
        assertThat(historyListResponse.featureBool()).contains(true)
        assertThat(historyListResponse.featureString()).contains("TRANSMITTING FREQUENCIES")
        assertThat(historyListResponse.featureStringArray().getOrNull())
            .containsExactly("String1", "String2")
        assertThat(historyListResponse.featureValue()).contains(1227.6)
        assertThat(historyListResponse.heading()).contains(97.1)
        assertThat(historyListResponse.height()).contains(7.25)
        assertThat(historyListResponse.length()).contains(10.54)
        assertThat(historyListResponse.name()).contains("HEADING")
        assertThat(historyListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyListResponse.origNetwork()).contains("OPS1")
        assertThat(historyListResponse.sourceDl()).contains("AXE")
        assertThat(historyListResponse.speed()).contains(0.1)
        assertThat(historyListResponse.srcIds().getOrNull())
            .containsExactly(
                "b008c63b-ad89-4493-80e0-77bc982bef77",
                "3565a6dd-654e-4969-89e0-ee7c51ab1e1b",
            )
        assertThat(historyListResponse.srcTs().getOrNull())
            .containsExactly(
                OffsetDateTime.parse("2025-02-24T16:27:18.471Z"),
                OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"),
            )
        assertThat(historyListResponse.srcTyps().getOrNull()).containsExactly("SAR", "AIS")
        assertThat(historyListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(historyListResponse.transactionId())
            .contains("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
        assertThat(historyListResponse.type()).contains("VESSEL")
        assertThat(historyListResponse.width()).contains(3.74)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
                .featureTs(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
                .featureUoM("MHz")
                .idAnalyticImagery("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .agjson(
                    "{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}"
                )
                .andims(1)
                .annLims(listOf(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4)))
                .addAnnText("rec1")
                .addAnnText("rec2")
                .asrid(4326)
                .assessment(
                    "Vessel bigger than other small fishing boats commonly found along the coastline"
                )
                .atext("POINT(52.23486096929749 16.191937138595005)")
                .atype("POINT")
                .confidence(0.85)
                .createdAt(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
                .createdBy("some.user")
                .externalId("2024-06-22-17-53-05_UMBRA-05_GEC")
                .addFeatureArray(1227.6)
                .addFeatureArray(1575.42)
                .featureBool(true)
                .featureString("TRANSMITTING FREQUENCIES")
                .addFeatureStringArray("String1")
                .addFeatureStringArray("String2")
                .featureValue(1227.6)
                .heading(97.1)
                .height(7.25)
                .length(10.54)
                .name("HEADING")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .speed(0.1)
                .addSrcId("b008c63b-ad89-4493-80e0-77bc982bef77")
                .addSrcId("3565a6dd-654e-4969-89e0-ee7c51ab1e1b")
                .addSrcT(OffsetDateTime.parse("2025-02-24T16:27:18.471Z"))
                .addSrcT(OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"))
                .addSrcTyp("SAR")
                .addSrcTyp("AIS")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
                .type("VESSEL")
                .width(3.74)
                .build()

        val roundtrippedHistoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyListResponse),
                jacksonTypeRef<HistoryListResponse>(),
            )

        assertThat(roundtrippedHistoryListResponse).isEqualTo(historyListResponse)
    }
}
