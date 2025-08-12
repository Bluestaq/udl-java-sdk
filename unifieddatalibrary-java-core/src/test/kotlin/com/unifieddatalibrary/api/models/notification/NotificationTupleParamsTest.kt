// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.notification

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.notification.NotificationTupleParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTupleParamsTest {

    @Test
    fun create() {
      NotificationTupleParams.builder()
          .columns("columns")
          .createdAt(LocalDate.parse("2019-12-27"))
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = NotificationTupleParams.builder()
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
      val params = NotificationTupleParams.builder()
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
