// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eventevolution

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionTupleParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventEvolutionTupleParamsTest {

    @Test
    fun create() {
      EventEvolutionTupleParams.builder()
          .columns("columns")
          .eventId("eventId")
          .firstResult(0L)
          .maxResults(0L)
          .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun queryParams() {
      val params = EventEvolutionTupleParams.builder()
          .columns("columns")
          .eventId("eventId")
          .firstResult(0L)
          .maxResults(0L)
          .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("eventId", "eventId")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .put("startTime", "2019-12-27T18:11:19.117Z")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = EventEvolutionTupleParams.builder()
          .columns("columns")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .build())
    }
}
