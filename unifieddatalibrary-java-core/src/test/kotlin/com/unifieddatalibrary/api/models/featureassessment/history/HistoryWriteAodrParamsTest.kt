// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment.history

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryWriteAodrParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryWriteAodrParamsTest {

    @Test
    fun create() {
      HistoryWriteAodrParams.builder()
          .idAnalyticImagery("idAnalyticImagery")
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
      val params = HistoryWriteAodrParams.builder()
          .idAnalyticImagery("idAnalyticImagery")
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .notification("notification")
          .outputDelimiter("outputDelimiter")
          .outputFormat("outputFormat")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("idAnalyticImagery", "idAnalyticImagery")
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
      val params = HistoryWriteAodrParams.builder()
          .idAnalyticImagery("idAnalyticImagery")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("idAnalyticImagery", "idAnalyticImagery")
          .build())
    }
}
