// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment

import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCreateParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureAssessmentCreateParamsTest {

    @Test
    fun create() {
      FeatureAssessmentCreateParams.builder()
          .classificationMarking("U")
          .dataMode(FeatureAssessmentCreateParams.DataMode.TEST)
          .featureTs(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
          .featureUoM("MHz")
          .idAnalyticImagery("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
          .source("Bluestaq")
          .id("026dd511-8ba5-47d3-9909-836149f87686")
          .agjson("{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}")
          .andims(1)
          .annLims(listOf(
            listOf(
              1, 1
            ),
            listOf(
              1, 2
            ),
            listOf(
              1, 3
            ),
            listOf(
              1, 4
            ),
          ))
          .addAnnText("rec1")
          .addAnnText("rec2")
          .area("POINT(52.23486096929749 16.191937138595005)")
          .asrid(4326)
          .assessment("Vessel bigger than other small fishing boats commonly found along the coastline")
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
    }

    @Test
    fun body() {
      val params = FeatureAssessmentCreateParams.builder()
          .classificationMarking("U")
          .dataMode(FeatureAssessmentCreateParams.DataMode.TEST)
          .featureTs(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
          .featureUoM("MHz")
          .idAnalyticImagery("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
          .source("Bluestaq")
          .id("026dd511-8ba5-47d3-9909-836149f87686")
          .agjson("{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}")
          .andims(1)
          .annLims(listOf(
            listOf(
              1, 1
            ),
            listOf(
              1, 2
            ),
            listOf(
              1, 3
            ),
            listOf(
              1, 4
            ),
          ))
          .addAnnText("rec1")
          .addAnnText("rec2")
          .area("POINT(52.23486096929749 16.191937138595005)")
          .asrid(4326)
          .assessment("Vessel bigger than other small fishing boats commonly found along the coastline")
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

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(FeatureAssessmentCreateParams.DataMode.TEST)
      assertThat(body.featureTs()).isEqualTo(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
      assertThat(body.featureUoM()).isEqualTo("MHz")
      assertThat(body.idAnalyticImagery()).isEqualTo("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
      assertThat(body.agjson()).contains("{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}")
      assertThat(body.andims()).contains(1)
      assertThat(body.annLims().getOrNull()).containsExactly(listOf(
        1, 1
      ), listOf(
        1, 2
      ), listOf(
        1, 3
      ), listOf(
        1, 4
      ))
      assertThat(body.annText().getOrNull()).containsExactly("rec1", "rec2")
      assertThat(body.area()).contains("POINT(52.23486096929749 16.191937138595005)")
      assertThat(body.asrid()).contains(4326)
      assertThat(body.assessment()).contains("Vessel bigger than other small fishing boats commonly found along the coastline")
      assertThat(body.atext()).contains("POINT(52.23486096929749 16.191937138595005)")
      assertThat(body.atype()).contains("POINT")
      assertThat(body.confidence()).contains(0.85)
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.externalId()).contains("2024-06-22-17-53-05_UMBRA-05_GEC")
      assertThat(body.featureArray().getOrNull()).containsExactly(1227.6, 1575.42)
      assertThat(body.featureBool()).contains(true)
      assertThat(body.featureString()).contains("TRANSMITTING FREQUENCIES")
      assertThat(body.featureStringArray().getOrNull()).containsExactly("String1", "String2")
      assertThat(body.featureValue()).contains(1227.6)
      assertThat(body.heading()).contains(97.1)
      assertThat(body.height()).contains(7.25)
      assertThat(body.length()).contains(10.54)
      assertThat(body.name()).contains("HEADING")
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("OPS1")
      assertThat(body.sourceDl()).contains("AXE")
      assertThat(body.speed()).contains(0.1)
      assertThat(body.srcIds().getOrNull()).containsExactly("b008c63b-ad89-4493-80e0-77bc982bef77", "3565a6dd-654e-4969-89e0-ee7c51ab1e1b")
      assertThat(body.srcTs().getOrNull()).containsExactly(OffsetDateTime.parse("2025-02-24T16:27:18.471Z"), OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"))
      assertThat(body.srcTyps().getOrNull()).containsExactly("SAR", "AIS")
      assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
      assertThat(body.transactionId()).contains("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
      assertThat(body.type()).contains("VESSEL")
      assertThat(body.width()).contains(3.74)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = FeatureAssessmentCreateParams.builder()
          .classificationMarking("U")
          .dataMode(FeatureAssessmentCreateParams.DataMode.TEST)
          .featureTs(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
          .featureUoM("MHz")
          .idAnalyticImagery("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(FeatureAssessmentCreateParams.DataMode.TEST)
      assertThat(body.featureTs()).isEqualTo(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
      assertThat(body.featureUoM()).isEqualTo("MHz")
      assertThat(body.idAnalyticImagery()).isEqualTo("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
