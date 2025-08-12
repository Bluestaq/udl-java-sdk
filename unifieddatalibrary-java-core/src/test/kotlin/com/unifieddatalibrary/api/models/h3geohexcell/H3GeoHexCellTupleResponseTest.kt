// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geohexcell

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class H3GeoHexCellTupleResponseTest {

    @Test
    fun create() {
      val h3GeoHexCellTupleResponse = H3GeoHexCellTupleResponse.builder()
          .cellId("830b90fffffffff")
          .classificationMarking("U")
          .dataMode(H3GeoHexCellTupleResponse.DataMode.TEST)
          .source("Bluestaq")
          .id("443fg911-4ab6-3d74-1991-372149d87f89")
          .altMean(450.1)
          .altSigma(400.1)
          .anomScoreInterference(0.125)
          .anomScoreSpoofing(0.125)
          .changeScore(12.34)
          .coverage(8)
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .idH3Geo("026dd511-8ba5-47d3-9909-836149f87686")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .rpmMax(50.1)
          .rpmMean(47.953125)
          .rpmMedian(48.375)
          .rpmMin(43.1)
          .rpmSigma(1.23)
          .sourceDl("AXE")
          .build()

      assertThat(h3GeoHexCellTupleResponse.cellId()).isEqualTo("830b90fffffffff")
      assertThat(h3GeoHexCellTupleResponse.classificationMarking()).isEqualTo("U")
      assertThat(h3GeoHexCellTupleResponse.dataMode()).isEqualTo(H3GeoHexCellTupleResponse.DataMode.TEST)
      assertThat(h3GeoHexCellTupleResponse.source()).isEqualTo("Bluestaq")
      assertThat(h3GeoHexCellTupleResponse.id()).contains("443fg911-4ab6-3d74-1991-372149d87f89")
      assertThat(h3GeoHexCellTupleResponse.altMean()).contains(450.1)
      assertThat(h3GeoHexCellTupleResponse.altSigma()).contains(400.1)
      assertThat(h3GeoHexCellTupleResponse.anomScoreInterference()).contains(0.125)
      assertThat(h3GeoHexCellTupleResponse.anomScoreSpoofing()).contains(0.125)
      assertThat(h3GeoHexCellTupleResponse.changeScore()).contains(12.34)
      assertThat(h3GeoHexCellTupleResponse.coverage()).contains(8)
      assertThat(h3GeoHexCellTupleResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(h3GeoHexCellTupleResponse.createdBy()).contains("some.user")
      assertThat(h3GeoHexCellTupleResponse.idH3Geo()).contains("026dd511-8ba5-47d3-9909-836149f87686")
      assertThat(h3GeoHexCellTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(h3GeoHexCellTupleResponse.origNetwork()).contains("OPS1")
      assertThat(h3GeoHexCellTupleResponse.rpmMax()).contains(50.1)
      assertThat(h3GeoHexCellTupleResponse.rpmMean()).contains(47.953125)
      assertThat(h3GeoHexCellTupleResponse.rpmMedian()).contains(48.375)
      assertThat(h3GeoHexCellTupleResponse.rpmMin()).contains(43.1)
      assertThat(h3GeoHexCellTupleResponse.rpmSigma()).contains(1.23)
      assertThat(h3GeoHexCellTupleResponse.sourceDl()).contains("AXE")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val h3GeoHexCellTupleResponse = H3GeoHexCellTupleResponse.builder()
          .cellId("830b90fffffffff")
          .classificationMarking("U")
          .dataMode(H3GeoHexCellTupleResponse.DataMode.TEST)
          .source("Bluestaq")
          .id("443fg911-4ab6-3d74-1991-372149d87f89")
          .altMean(450.1)
          .altSigma(400.1)
          .anomScoreInterference(0.125)
          .anomScoreSpoofing(0.125)
          .changeScore(12.34)
          .coverage(8)
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .idH3Geo("026dd511-8ba5-47d3-9909-836149f87686")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .rpmMax(50.1)
          .rpmMean(47.953125)
          .rpmMedian(48.375)
          .rpmMin(43.1)
          .rpmSigma(1.23)
          .sourceDl("AXE")
          .build()

      val roundtrippedH3GeoHexCellTupleResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(h3GeoHexCellTupleResponse), jacksonTypeRef<H3GeoHexCellTupleResponse>())

      assertThat(roundtrippedH3GeoHexCellTupleResponse).isEqualTo(h3GeoHexCellTupleResponse)
    }
}
