// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit.antennadetails

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AntennaDetailListParamsTest {

    @Test
    fun create() {
      AntennaDetailListParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = AntennaDetailListParams.builder()
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
      val params = AntennaDetailListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
