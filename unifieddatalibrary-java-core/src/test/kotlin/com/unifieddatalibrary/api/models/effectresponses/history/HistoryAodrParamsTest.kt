// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectresponses.history

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.effectresponses.history.HistoryAodrParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryAodrParamsTest {

    @Test
    fun create() {
      HistoryAodrParams.builder()
          .createdAt(LocalDate.parse("2019-12-27"))
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .notification("notification")
          .outputDelimiter("outputDelimiter")
          .outputFormat("outputFormat")
          .build()
    }

    @Test
    fun queryParams() {
      val params = HistoryAodrParams.builder()
          .createdAt(LocalDate.parse("2019-12-27"))
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .notification("notification")
          .outputDelimiter("outputDelimiter")
          .outputFormat("outputFormat")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("createdAt", "2019-12-27")
          .put("columns", "columns")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .put("notification", "notification")
          .put("outputDelimiter", "outputDelimiter")
          .put("outputFormat", "outputFormat")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = HistoryAodrParams.builder()
          .createdAt(LocalDate.parse("2019-12-27"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("createdAt", "2019-12-27")
          .build())
    }
}
