// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitantenna

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitantennaListParamsTest {

    @Test
    fun create() {
      OnorbitantennaListParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = OnorbitantennaListParams.builder()
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
      val params = OnorbitantennaListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
