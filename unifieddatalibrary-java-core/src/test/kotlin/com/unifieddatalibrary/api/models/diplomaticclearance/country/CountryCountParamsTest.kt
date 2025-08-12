// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance.country

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryCountParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryCountParamsTest {

    @Test
    fun create() {
      CountryCountParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = CountryCountParams.builder()
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
      val params = CountryCountParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
