// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eop.history

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.eop.history.HistoryCountParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryCountParamsTest {

    @Test
    fun create() {
      HistoryCountParams.builder()
          .eopDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = HistoryCountParams.builder()
          .eopDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("eopDate", "2019-12-27T18:11:19.117Z")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = HistoryCountParams.builder()
          .eopDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("eopDate", "2019-12-27T18:11:19.117Z")
          .build())
    }
}
