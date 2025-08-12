// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.comm

import com.unifieddatalibrary.api.models.comm.CommAbridged
import com.unifieddatalibrary.api.models.comm.CommUpdateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommUpdateParamsTest {

    @Test
    fun create() {
      CommUpdateParams.builder()
          .pathId("id")
          .commAbridged(CommAbridged.builder()
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
              .build())
          .build()
    }

    @Test
    fun pathParams() {
      val params = CommUpdateParams.builder()
          .pathId("id")
          .commAbridged(CommAbridged.builder()
              .classificationMarking("U")
              .dataMode(CommAbridged.DataMode.TEST)
              .name("DSCS II C-7-COMM Payload")
              .source("Bluestaq")
              .build())
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
      val params = CommUpdateParams.builder()
          .pathId("id")
          .commAbridged(CommAbridged.builder()
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
              .build())
          .build()

      val body = params._body()

      assertThat(body).isEqualTo(CommAbridged.builder()
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
          .build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = CommUpdateParams.builder()
          .pathId("id")
          .commAbridged(CommAbridged.builder()
              .classificationMarking("U")
              .dataMode(CommAbridged.DataMode.TEST)
              .name("DSCS II C-7-COMM Payload")
              .source("Bluestaq")
              .build())
          .build()

      val body = params._body()

      assertThat(body).isEqualTo(CommAbridged.builder()
          .classificationMarking("U")
          .dataMode(CommAbridged.DataMode.TEST)
          .name("DSCS II C-7-COMM Payload")
          .source("Bluestaq")
          .build())
    }
}
