// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureAssessmentTupleResponseTest {

    @Test
    fun create() {
        val featureAssessmentTupleResponse =
            FeatureAssessmentTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(FeatureAssessmentTupleResponse.DataMode.TEST)
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

        assertThat(featureAssessmentTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(featureAssessmentTupleResponse.dataMode())
            .isEqualTo(FeatureAssessmentTupleResponse.DataMode.TEST)
        assertThat(featureAssessmentTupleResponse.featureTs())
            .isEqualTo(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
        assertThat(featureAssessmentTupleResponse.featureUoM()).isEqualTo("MHz")
        assertThat(featureAssessmentTupleResponse.idAnalyticImagery())
            .isEqualTo("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
        assertThat(featureAssessmentTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(featureAssessmentTupleResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(featureAssessmentTupleResponse.agjson())
            .contains("{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}")
        assertThat(featureAssessmentTupleResponse.andims()).contains(1)
        assertThat(featureAssessmentTupleResponse.annLims().getOrNull())
            .containsExactly(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4))
        assertThat(featureAssessmentTupleResponse.annText().getOrNull())
            .containsExactly("rec1", "rec2")
        assertThat(featureAssessmentTupleResponse.asrid()).contains(4326)
        assertThat(featureAssessmentTupleResponse.assessment())
            .contains(
                "Vessel bigger than other small fishing boats commonly found along the coastline"
            )
        assertThat(featureAssessmentTupleResponse.atext())
            .contains("POINT(52.23486096929749 16.191937138595005)")
        assertThat(featureAssessmentTupleResponse.atype()).contains("POINT")
        assertThat(featureAssessmentTupleResponse.confidence()).contains(0.85)
        assertThat(featureAssessmentTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
        assertThat(featureAssessmentTupleResponse.createdBy()).contains("some.user")
        assertThat(featureAssessmentTupleResponse.externalId())
            .contains("2024-06-22-17-53-05_UMBRA-05_GEC")
        assertThat(featureAssessmentTupleResponse.featureArray().getOrNull())
            .containsExactly(1227.6, 1575.42)
        assertThat(featureAssessmentTupleResponse.featureBool()).contains(true)
        assertThat(featureAssessmentTupleResponse.featureString())
            .contains("TRANSMITTING FREQUENCIES")
        assertThat(featureAssessmentTupleResponse.featureStringArray().getOrNull())
            .containsExactly("String1", "String2")
        assertThat(featureAssessmentTupleResponse.featureValue()).contains(1227.6)
        assertThat(featureAssessmentTupleResponse.heading()).contains(97.1)
        assertThat(featureAssessmentTupleResponse.height()).contains(7.25)
        assertThat(featureAssessmentTupleResponse.length()).contains(10.54)
        assertThat(featureAssessmentTupleResponse.name()).contains("HEADING")
        assertThat(featureAssessmentTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(featureAssessmentTupleResponse.origNetwork()).contains("OPS1")
        assertThat(featureAssessmentTupleResponse.sourceDl()).contains("AXE")
        assertThat(featureAssessmentTupleResponse.speed()).contains(0.1)
        assertThat(featureAssessmentTupleResponse.srcIds().getOrNull())
            .containsExactly(
                "b008c63b-ad89-4493-80e0-77bc982bef77",
                "3565a6dd-654e-4969-89e0-ee7c51ab1e1b",
            )
        assertThat(featureAssessmentTupleResponse.srcTs().getOrNull())
            .containsExactly(
                OffsetDateTime.parse("2025-02-24T16:27:18.471Z"),
                OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"),
            )
        assertThat(featureAssessmentTupleResponse.srcTyps().getOrNull())
            .containsExactly("SAR", "AIS")
        assertThat(featureAssessmentTupleResponse.tags().getOrNull())
            .containsExactly("TAG1", "TAG2")
        assertThat(featureAssessmentTupleResponse.transactionId())
            .contains("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
        assertThat(featureAssessmentTupleResponse.type()).contains("VESSEL")
        assertThat(featureAssessmentTupleResponse.width()).contains(3.74)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureAssessmentTupleResponse =
            FeatureAssessmentTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(FeatureAssessmentTupleResponse.DataMode.TEST)
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

        val roundtrippedFeatureAssessmentTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureAssessmentTupleResponse),
                jacksonTypeRef<FeatureAssessmentTupleResponse>(),
            )

        assertThat(roundtrippedFeatureAssessmentTupleResponse)
            .isEqualTo(featureAssessmentTupleResponse)
    }
}
