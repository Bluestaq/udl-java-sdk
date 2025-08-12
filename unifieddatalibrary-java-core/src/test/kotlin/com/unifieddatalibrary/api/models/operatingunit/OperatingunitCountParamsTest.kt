// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.operatingunit

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.operatingunit.OperatingunitCountParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperatingunitCountParamsTest {

    @Test
    fun create() {
      OperatingunitCountParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = OperatingunitCountParams.builder()
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
      val params = OperatingunitCountParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
