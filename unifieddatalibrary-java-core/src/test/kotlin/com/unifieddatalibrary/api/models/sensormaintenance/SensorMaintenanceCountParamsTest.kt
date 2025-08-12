// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCountParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorMaintenanceCountParamsTest {

    @Test
    fun create() {
      SensorMaintenanceCountParams.builder()
          .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .firstResult(0L)
          .maxResults(0L)
          .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun queryParams() {
      val params = SensorMaintenanceCountParams.builder()
          .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .firstResult(0L)
          .maxResults(0L)
          .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("endTime", "2019-12-27T18:11:19.117Z")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .put("startTime", "2019-12-27T18:11:19.117Z")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = SensorMaintenanceCountParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
