// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.flightplan

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.flightplan.FlightplanCountParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlightplanCountParamsTest {

    @Test
    fun create() {
      FlightplanCountParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = FlightplanCountParams.builder()
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
      val params = FlightplanCountParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
