// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.comm

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.comm.CommTupleParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommTupleParamsTest {

    @Test
    fun create() {
      CommTupleParams.builder()
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = CommTupleParams.builder()
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = CommTupleParams.builder()
          .columns("columns")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .build())
    }
}
