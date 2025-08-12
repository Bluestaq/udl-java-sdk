// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance.country

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryListParamsTest {

    @Test
    fun create() {
      CountryListParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = CountryListParams.builder()
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
      val params = CountryListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
