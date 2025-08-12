// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCurrentParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorMaintenanceCurrentParamsTest {

    @Test
    fun create() {
      SensorMaintenanceCurrentParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = SensorMaintenanceCurrentParams.builder()
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
      val params = SensorMaintenanceCurrentParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
