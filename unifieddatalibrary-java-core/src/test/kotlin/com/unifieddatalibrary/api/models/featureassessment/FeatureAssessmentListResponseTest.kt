// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureAssessmentListResponseTest {

    @Test
    fun create() {
        val featureAssessmentListResponse =
            FeatureAssessmentListResponse.builder()
                .classificationMarking("U")
                .dataMode(FeatureAssessmentListResponse.DataMode.TEST)
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

        assertThat(featureAssessmentListResponse.classificationMarking()).isEqualTo("U")
        assertThat(featureAssessmentListResponse.dataMode())
            .isEqualTo(FeatureAssessmentListResponse.DataMode.TEST)
        assertThat(featureAssessmentListResponse.featureTs())
            .isEqualTo(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
        assertThat(featureAssessmentListResponse.featureUoM()).isEqualTo("MHz")
        assertThat(featureAssessmentListResponse.idAnalyticImagery())
            .isEqualTo("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
        assertThat(featureAssessmentListResponse.source()).isEqualTo("Bluestaq")
        assertThat(featureAssessmentListResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(featureAssessmentListResponse.agjson())
            .contains("{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}")
        assertThat(featureAssessmentListResponse.andims()).contains(1)
        assertThat(featureAssessmentListResponse.annLims().getOrNull())
            .containsExactly(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4))
        assertThat(featureAssessmentListResponse.annText().getOrNull())
            .containsExactly("rec1", "rec2")
        assertThat(featureAssessmentListResponse.asrid()).contains(4326)
        assertThat(featureAssessmentListResponse.assessment())
            .contains(
                "Vessel bigger than other small fishing boats commonly found along the coastline"
            )
        assertThat(featureAssessmentListResponse.atext())
            .contains("POINT(52.23486096929749 16.191937138595005)")
        assertThat(featureAssessmentListResponse.atype()).contains("POINT")
        assertThat(featureAssessmentListResponse.confidence()).contains(0.85)
        assertThat(featureAssessmentListResponse.createdAt())
            .contains(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
        assertThat(featureAssessmentListResponse.createdBy()).contains("some.user")
        assertThat(featureAssessmentListResponse.externalId())
            .contains("2024-06-22-17-53-05_UMBRA-05_GEC")
        assertThat(featureAssessmentListResponse.featureArray().getOrNull())
            .containsExactly(1227.6, 1575.42)
        assertThat(featureAssessmentListResponse.featureBool()).contains(true)
        assertThat(featureAssessmentListResponse.featureString())
            .contains("TRANSMITTING FREQUENCIES")
        assertThat(featureAssessmentListResponse.featureStringArray().getOrNull())
            .containsExactly("String1", "String2")
        assertThat(featureAssessmentListResponse.featureValue()).contains(1227.6)
        assertThat(featureAssessmentListResponse.heading()).contains(97.1)
        assertThat(featureAssessmentListResponse.height()).contains(7.25)
        assertThat(featureAssessmentListResponse.length()).contains(10.54)
        assertThat(featureAssessmentListResponse.name()).contains("HEADING")
        assertThat(featureAssessmentListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(featureAssessmentListResponse.origNetwork()).contains("OPS1")
        assertThat(featureAssessmentListResponse.sourceDl()).contains("AXE")
        assertThat(featureAssessmentListResponse.speed()).contains(0.1)
        assertThat(featureAssessmentListResponse.srcIds().getOrNull())
            .containsExactly(
                "b008c63b-ad89-4493-80e0-77bc982bef77",
                "3565a6dd-654e-4969-89e0-ee7c51ab1e1b",
            )
        assertThat(featureAssessmentListResponse.srcTs().getOrNull())
            .containsExactly(
                OffsetDateTime.parse("2025-02-24T16:27:18.471Z"),
                OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"),
            )
        assertThat(featureAssessmentListResponse.srcTyps().getOrNull())
            .containsExactly("SAR", "AIS")
        assertThat(featureAssessmentListResponse.transactionId())
            .contains("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
        assertThat(featureAssessmentListResponse.type()).contains("VESSEL")
        assertThat(featureAssessmentListResponse.width()).contains(3.74)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureAssessmentListResponse =
            FeatureAssessmentListResponse.builder()
                .classificationMarking("U")
                .dataMode(FeatureAssessmentListResponse.DataMode.TEST)
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

        val roundtrippedFeatureAssessmentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureAssessmentListResponse),
                jacksonTypeRef<FeatureAssessmentListResponse>(),
            )

        assertThat(roundtrippedFeatureAssessmentListResponse)
            .isEqualTo(featureAssessmentListResponse)
    }
}
