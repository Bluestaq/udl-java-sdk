// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureAssessmentQueryResponseTest {

    @Test
    fun create() {
        val featureAssessmentQueryResponse =
            FeatureAssessmentQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(FeatureAssessmentQueryResponse.DataMode.TEST)
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
                .transactionId("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
                .type("VESSEL")
                .width(3.74)
                .build()

        assertThat(featureAssessmentQueryResponse.classificationMarking()).isEqualTo("U")
        assertThat(featureAssessmentQueryResponse.dataMode())
            .isEqualTo(FeatureAssessmentQueryResponse.DataMode.TEST)
        assertThat(featureAssessmentQueryResponse.featureTs())
            .isEqualTo(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
        assertThat(featureAssessmentQueryResponse.featureUoM()).isEqualTo("MHz")
        assertThat(featureAssessmentQueryResponse.idAnalyticImagery())
            .isEqualTo("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
        assertThat(featureAssessmentQueryResponse.source()).isEqualTo("Bluestaq")
        assertThat(featureAssessmentQueryResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(featureAssessmentQueryResponse.agjson())
            .contains("{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}")
        assertThat(featureAssessmentQueryResponse.andims()).contains(1)
        assertThat(featureAssessmentQueryResponse.annLims().getOrNull())
            .containsExactly(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4))
        assertThat(featureAssessmentQueryResponse.annText().getOrNull())
            .containsExactly("rec1", "rec2")
        assertThat(featureAssessmentQueryResponse.asrid()).contains(4326)
        assertThat(featureAssessmentQueryResponse.assessment())
            .contains(
                "Vessel bigger than other small fishing boats commonly found along the coastline"
            )
        assertThat(featureAssessmentQueryResponse.atext())
            .contains("POINT(52.23486096929749 16.191937138595005)")
        assertThat(featureAssessmentQueryResponse.atype()).contains("POINT")
        assertThat(featureAssessmentQueryResponse.confidence()).contains(0.85)
        assertThat(featureAssessmentQueryResponse.createdAt())
            .contains(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
        assertThat(featureAssessmentQueryResponse.createdBy()).contains("some.user")
        assertThat(featureAssessmentQueryResponse.externalId())
            .contains("2024-06-22-17-53-05_UMBRA-05_GEC")
        assertThat(featureAssessmentQueryResponse.featureArray().getOrNull())
            .containsExactly(1227.6, 1575.42)
        assertThat(featureAssessmentQueryResponse.featureBool()).contains(true)
        assertThat(featureAssessmentQueryResponse.featureString())
            .contains("TRANSMITTING FREQUENCIES")
        assertThat(featureAssessmentQueryResponse.featureStringArray().getOrNull())
            .containsExactly("String1", "String2")
        assertThat(featureAssessmentQueryResponse.featureValue()).contains(1227.6)
        assertThat(featureAssessmentQueryResponse.heading()).contains(97.1)
        assertThat(featureAssessmentQueryResponse.height()).contains(7.25)
        assertThat(featureAssessmentQueryResponse.length()).contains(10.54)
        assertThat(featureAssessmentQueryResponse.name()).contains("HEADING")
        assertThat(featureAssessmentQueryResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(featureAssessmentQueryResponse.origNetwork()).contains("OPS1")
        assertThat(featureAssessmentQueryResponse.sourceDl()).contains("AXE")
        assertThat(featureAssessmentQueryResponse.speed()).contains(0.1)
        assertThat(featureAssessmentQueryResponse.srcIds().getOrNull())
            .containsExactly(
                "b008c63b-ad89-4493-80e0-77bc982bef77",
                "3565a6dd-654e-4969-89e0-ee7c51ab1e1b",
            )
        assertThat(featureAssessmentQueryResponse.srcTs().getOrNull())
            .containsExactly(
                OffsetDateTime.parse("2025-02-24T16:27:18.471Z"),
                OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"),
            )
        assertThat(featureAssessmentQueryResponse.srcTyps().getOrNull())
            .containsExactly("SAR", "AIS")
        assertThat(featureAssessmentQueryResponse.transactionId())
            .contains("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
        assertThat(featureAssessmentQueryResponse.type()).contains("VESSEL")
        assertThat(featureAssessmentQueryResponse.width()).contains(3.74)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureAssessmentQueryResponse =
            FeatureAssessmentQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(FeatureAssessmentQueryResponse.DataMode.TEST)
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
                .transactionId("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
                .type("VESSEL")
                .width(3.74)
                .build()

        val roundtrippedFeatureAssessmentQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureAssessmentQueryResponse),
                jacksonTypeRef<FeatureAssessmentQueryResponse>(),
            )

        assertThat(roundtrippedFeatureAssessmentQueryResponse)
            .isEqualTo(featureAssessmentQueryResponse)
    }
}
