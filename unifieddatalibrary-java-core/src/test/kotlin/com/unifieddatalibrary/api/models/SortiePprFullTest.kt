// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.SortiePprFull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SortiePprFullTest {

    @Test
    fun create() {
      val sortiePprFull = SortiePprFull.builder()
          .classificationMarking("U")
          .dataMode(SortiePprFull.DataMode.TEST)
          .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
          .source("Bluestaq")
          .id("SORTIEPPR-ID")
          .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .endTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
          .externalId("aa714f4d52a37ab1a00b21af9566e379")
          .grantor("SMITH")
          .number("07-21-07W")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .remarks("PPR remark")
          .requestor("jsmith1")
          .sourceDl("AXE")
          .startTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
          .type(SortiePprFull.Type.M)
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .build()

      assertThat(sortiePprFull.classificationMarking()).isEqualTo("U")
      assertThat(sortiePprFull.dataMode()).isEqualTo(SortiePprFull.DataMode.TEST)
      assertThat(sortiePprFull.idSortie()).isEqualTo("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
      assertThat(sortiePprFull.source()).isEqualTo("Bluestaq")
      assertThat(sortiePprFull.id()).contains("SORTIEPPR-ID")
      assertThat(sortiePprFull.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
      assertThat(sortiePprFull.createdBy()).contains("some.user")
      assertThat(sortiePprFull.endTime()).contains(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
      assertThat(sortiePprFull.externalId()).contains("aa714f4d52a37ab1a00b21af9566e379")
      assertThat(sortiePprFull.grantor()).contains("SMITH")
      assertThat(sortiePprFull.number()).contains("07-21-07W")
      assertThat(sortiePprFull.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(sortiePprFull.origNetwork()).contains("OPS1")
      assertThat(sortiePprFull.remarks()).contains("PPR remark")
      assertThat(sortiePprFull.requestor()).contains("jsmith1")
      assertThat(sortiePprFull.sourceDl()).contains("AXE")
      assertThat(sortiePprFull.startTime()).contains(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
      assertThat(sortiePprFull.type()).contains(SortiePprFull.Type.M)
      assertThat(sortiePprFull.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sortiePprFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sortiePprFull = SortiePprFull.builder()
          .classificationMarking("U")
          .dataMode(SortiePprFull.DataMode.TEST)
          .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
          .source("Bluestaq")
          .id("SORTIEPPR-ID")
          .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .endTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
          .externalId("aa714f4d52a37ab1a00b21af9566e379")
          .grantor("SMITH")
          .number("07-21-07W")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .remarks("PPR remark")
          .requestor("jsmith1")
          .sourceDl("AXE")
          .startTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
          .type(SortiePprFull.Type.M)
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .build()

      val roundtrippedSortiePprFull = jsonMapper.readValue(jsonMapper.writeValueAsString(sortiePprFull), jacksonTypeRef<SortiePprFull>())

      assertThat(roundtrippedSortiePprFull).isEqualTo(sortiePprFull)
    }
}
