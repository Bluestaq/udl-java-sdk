// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatacommdetails

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataCommDetailListParamsTest {

    @Test
    fun create() {
      SeraDataCommDetailListParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = SeraDataCommDetailListParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = SeraDataCommDetailListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
