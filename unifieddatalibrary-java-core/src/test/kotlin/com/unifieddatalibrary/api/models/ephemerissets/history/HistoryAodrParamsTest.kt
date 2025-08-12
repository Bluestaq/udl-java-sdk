// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemerissets.history

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.ephemerissets.history.HistoryAodrParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryAodrParamsTest {

    @Test
    fun create() {
      HistoryAodrParams.builder()
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .notification("notification")
          .outputDelimiter("outputDelimiter")
          .outputFormat("outputFormat")
          .pointEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .pointStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun queryParams() {
      val params = HistoryAodrParams.builder()
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .notification("notification")
          .outputDelimiter("outputDelimiter")
          .outputFormat("outputFormat")
          .pointEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .pointStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .put("notification", "notification")
          .put("outputDelimiter", "outputDelimiter")
          .put("outputFormat", "outputFormat")
          .put("pointEndTime", "2019-12-27T18:11:19.117Z")
          .put("pointStartTime", "2019-12-27T18:11:19.117Z")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = HistoryAodrParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
