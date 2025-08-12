// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.comm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.comm.CommAbridged
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommAbridgedTest {

    @Test
    fun create() {
      val commAbridged = CommAbridged.builder()
          .classificationMarking("U")
          .dataMode(CommAbridged.DataMode.TEST)
          .name("DSCS II C-7-COMM Payload")
          .source("Bluestaq")
          .id("COMM-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .description("Description for comm A")
          .idEntity("ENTITY-ID")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .build()

      assertThat(commAbridged.classificationMarking()).isEqualTo("U")
      assertThat(commAbridged.dataMode()).isEqualTo(CommAbridged.DataMode.TEST)
      assertThat(commAbridged.name()).isEqualTo("DSCS II C-7-COMM Payload")
      assertThat(commAbridged.source()).isEqualTo("Bluestaq")
      assertThat(commAbridged.id()).contains("COMM-ID")
      assertThat(commAbridged.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(commAbridged.createdBy()).contains("some.user")
      assertThat(commAbridged.description()).contains("Description for comm A")
      assertThat(commAbridged.idEntity()).contains("ENTITY-ID")
      assertThat(commAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(commAbridged.origNetwork()).contains("ORIG")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val commAbridged = CommAbridged.builder()
          .classificationMarking("U")
          .dataMode(CommAbridged.DataMode.TEST)
          .name("DSCS II C-7-COMM Payload")
          .source("Bluestaq")
          .id("COMM-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .description("Description for comm A")
          .idEntity("ENTITY-ID")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .build()

      val roundtrippedCommAbridged = jsonMapper.readValue(jsonMapper.writeValueAsString(commAbridged), jacksonTypeRef<CommAbridged>())

      assertThat(roundtrippedCommAbridged).isEqualTo(commAbridged)
    }
}
