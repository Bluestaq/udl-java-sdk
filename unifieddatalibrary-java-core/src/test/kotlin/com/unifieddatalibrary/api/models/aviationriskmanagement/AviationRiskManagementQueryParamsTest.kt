// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aviationriskmanagement

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.aviationriskmanagement.AviationRiskManagementQueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AviationRiskManagementQueryParamsTest {

    @Test
    fun create() {
      AviationRiskManagementQueryParams.builder()
          .idMission("idMission")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = AviationRiskManagementQueryParams.builder()
          .idMission("idMission")
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("idMission", "idMission")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = AviationRiskManagementQueryParams.builder()
          .idMission("idMission")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("idMission", "idMission")
          .build())
    }
}
