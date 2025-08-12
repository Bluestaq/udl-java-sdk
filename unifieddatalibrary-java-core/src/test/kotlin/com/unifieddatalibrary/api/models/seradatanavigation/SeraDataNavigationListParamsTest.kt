// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatanavigation

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataNavigationListParamsTest {

    @Test
    fun create() {
      SeraDataNavigationListParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = SeraDataNavigationListParams.builder()
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
      val params = SeraDataNavigationListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
