// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorobservationtype

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.sensorobservationtype.SensorObservationTypeListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorObservationTypeListParamsTest {

    @Test
    fun create() {
      SensorObservationTypeListParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = SensorObservationTypeListParams.builder()
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
      val params = SensorObservationTypeListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
