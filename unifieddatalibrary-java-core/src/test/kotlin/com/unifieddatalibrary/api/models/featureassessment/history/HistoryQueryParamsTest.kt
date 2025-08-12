// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment.history

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryQueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryQueryParamsTest {

    @Test
    fun create() {
      HistoryQueryParams.builder()
          .idAnalyticImagery("idAnalyticImagery")
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = HistoryQueryParams.builder()
          .idAnalyticImagery("idAnalyticImagery")
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("idAnalyticImagery", "idAnalyticImagery")
          .put("columns", "columns")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = HistoryQueryParams.builder()
          .idAnalyticImagery("idAnalyticImagery")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("idAnalyticImagery", "idAnalyticImagery")
          .build())
    }
}
