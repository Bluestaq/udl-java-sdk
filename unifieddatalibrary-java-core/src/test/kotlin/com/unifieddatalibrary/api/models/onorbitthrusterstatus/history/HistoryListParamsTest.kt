// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthrusterstatus.history

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.history.HistoryListParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListParamsTest {

    @Test
    fun create() {
      HistoryListParams.builder()
          .columns("columns")
          .firstResult(0L)
          .idOnorbitThruster("idOnorbitThruster")
          .maxResults(0L)
          .statusTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun queryParams() {
      val params = HistoryListParams.builder()
          .columns("columns")
          .firstResult(0L)
          .idOnorbitThruster("idOnorbitThruster")
          .maxResults(0L)
          .statusTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("firstResult", "0")
          .put("idOnorbitThruster", "idOnorbitThruster")
          .put("maxResults", "0")
          .put("statusTime", "2019-12-27T18:11:19.117Z")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = HistoryListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
