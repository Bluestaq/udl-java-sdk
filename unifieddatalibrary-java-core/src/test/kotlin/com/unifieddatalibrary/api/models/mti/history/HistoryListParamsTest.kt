// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.mti.history

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.mti.history.HistoryListParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListParamsTest {

    @Test
    fun create() {
      HistoryListParams.builder()
          .createdAt(LocalDate.parse("2019-12-27"))
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = HistoryListParams.builder()
          .createdAt(LocalDate.parse("2019-12-27"))
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("createdAt", "2019-12-27")
          .put("columns", "columns")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = HistoryListParams.builder()
          .createdAt(LocalDate.parse("2019-12-27"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("createdAt", "2019-12-27")
          .build())
    }
}
