// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorobservationtype

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeGetParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorObservationTypeGetParamsTest {

    @Test
    fun create() {
      SensorObservationTypeGetParams.builder()
          .id("id")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun pathParams() {
      val params = SensorObservationTypeGetParams.builder()
          .id("id")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
      val params = SensorObservationTypeGetParams.builder()
          .id("id")
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
      val params = SensorObservationTypeGetParams.builder()
          .id("id")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
