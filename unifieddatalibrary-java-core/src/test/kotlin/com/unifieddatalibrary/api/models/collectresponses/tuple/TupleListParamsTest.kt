// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectresponses.tuple

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.collectresponses.tuple.TupleListParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TupleListParamsTest {

    @Test
    fun create() {
      TupleListParams.builder()
          .columns("columns")
          .createdAt(LocalDate.parse("2019-12-27"))
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = TupleListParams.builder()
          .columns("columns")
          .createdAt(LocalDate.parse("2019-12-27"))
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("createdAt", "2019-12-27")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = TupleListParams.builder()
          .columns("columns")
          .createdAt(LocalDate.parse("2019-12-27"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("createdAt", "2019-12-27")
          .build())
    }
}
