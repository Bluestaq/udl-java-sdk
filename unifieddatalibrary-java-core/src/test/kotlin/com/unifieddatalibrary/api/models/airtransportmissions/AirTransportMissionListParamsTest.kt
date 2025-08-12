// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airtransportmissions

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.airtransportmissions.AirTransportMissionListParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirTransportMissionListParamsTest {

    @Test
    fun create() {
      AirTransportMissionListParams.builder()
          .createdAt(LocalDate.parse("2019-12-27"))
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = AirTransportMissionListParams.builder()
          .createdAt(LocalDate.parse("2019-12-27"))
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("createdAt", "2019-12-27")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = AirTransportMissionListParams.builder()
          .createdAt(LocalDate.parse("2019-12-27"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("createdAt", "2019-12-27")
          .build())
    }
}
