// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryQueryResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryQueryResponseTest {

    @Test
    fun create() {
      val historyQueryResponse = HistoryQueryResponse.builder()
          .classificationMarking("U")
          .dataMode(HistoryQueryResponse.DataMode.TEST)
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

      assertThat(historyQueryResponse.classificationMarking()).isEqualTo("U")
      assertThat(historyQueryResponse.dataMode()).isEqualTo(HistoryQueryResponse.DataMode.TEST)
      assertThat(historyQueryResponse.featureTs()).isEqualTo(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
      assertThat(historyQueryResponse.featureUoM()).isEqualTo("MHz")
      assertThat(historyQueryResponse.idAnalyticImagery()).isEqualTo("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
      assertThat(historyQueryResponse.source()).isEqualTo("Bluestaq")
      assertThat(historyQueryResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
      assertThat(historyQueryResponse.agjson()).contains("{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}")
      assertThat(historyQueryResponse.andims()).contains(1)
      assertThat(historyQueryResponse.annLims().getOrNull()).containsExactly(listOf(
        1, 1
      ), listOf(
        1, 2
      ), listOf(
        1, 3
      ), listOf(
        1, 4
      ))
      assertThat(historyQueryResponse.annText().getOrNull()).containsExactly("rec1", "rec2")
      assertThat(historyQueryResponse.area()).contains("POINT(52.23486096929749 16.191937138595005)")
      assertThat(historyQueryResponse.asrid()).contains(4326)
      assertThat(historyQueryResponse.assessment()).contains("Vessel bigger than other small fishing boats commonly found along the coastline")
      assertThat(historyQueryResponse.atext()).contains("POINT(52.23486096929749 16.191937138595005)")
      assertThat(historyQueryResponse.atype()).contains("POINT")
      assertThat(historyQueryResponse.confidence()).contains(0.85)
      assertThat(historyQueryResponse.createdAt()).contains(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
      assertThat(historyQueryResponse.createdBy()).contains("some.user")
      assertThat(historyQueryResponse.externalId()).contains("2024-06-22-17-53-05_UMBRA-05_GEC")
      assertThat(historyQueryResponse.featureArray().getOrNull()).containsExactly(1227.6, 1575.42)
      assertThat(historyQueryResponse.featureBool()).contains(true)
      assertThat(historyQueryResponse.featureString()).contains("TRANSMITTING FREQUENCIES")
      assertThat(historyQueryResponse.featureStringArray().getOrNull()).containsExactly("String1", "String2")
      assertThat(historyQueryResponse.featureValue()).contains(1227.6)
      assertThat(historyQueryResponse.heading()).contains(97.1)
      assertThat(historyQueryResponse.height()).contains(7.25)
      assertThat(historyQueryResponse.length()).contains(10.54)
      assertThat(historyQueryResponse.name()).contains("HEADING")
      assertThat(historyQueryResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(historyQueryResponse.origNetwork()).contains("OPS1")
      assertThat(historyQueryResponse.sourceDl()).contains("AXE")
      assertThat(historyQueryResponse.speed()).contains(0.1)
      assertThat(historyQueryResponse.srcIds().getOrNull()).containsExactly("b008c63b-ad89-4493-80e0-77bc982bef77", "3565a6dd-654e-4969-89e0-ee7c51ab1e1b")
      assertThat(historyQueryResponse.srcTs().getOrNull()).containsExactly(OffsetDateTime.parse("2025-02-24T16:27:18.471Z"), OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"))
      assertThat(historyQueryResponse.srcTyps().getOrNull()).containsExactly("SAR", "AIS")
      assertThat(historyQueryResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
      assertThat(historyQueryResponse.transactionId()).contains("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
      assertThat(historyQueryResponse.type()).contains("VESSEL")
      assertThat(historyQueryResponse.width()).contains(3.74)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val historyQueryResponse = HistoryQueryResponse.builder()
          .classificationMarking("U")
          .dataMode(HistoryQueryResponse.DataMode.TEST)
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

      val roundtrippedHistoryQueryResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(historyQueryResponse), jacksonTypeRef<HistoryQueryResponse>())

      assertThat(roundtrippedHistoryQueryResponse).isEqualTo(historyQueryResponse)
    }
}
