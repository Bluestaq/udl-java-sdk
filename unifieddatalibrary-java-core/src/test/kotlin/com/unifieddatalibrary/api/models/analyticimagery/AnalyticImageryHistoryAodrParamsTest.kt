// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.analyticimagery

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryHistoryAodrParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticImageryHistoryAodrParamsTest {

    @Test
    fun create() {
      AnalyticImageryHistoryAodrParams.builder()
          .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
      val params = AnalyticImageryHistoryAodrParams.builder()
          .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .notification("notification")
          .outputDelimiter("outputDelimiter")
          .outputFormat("outputFormat")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("msgTime", "2019-12-27T18:11:19.117Z")
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
      val params = AnalyticImageryHistoryAodrParams.builder()
          .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("msgTime", "2019-12-27T18:11:19.117Z")
          .build())
    }
}
