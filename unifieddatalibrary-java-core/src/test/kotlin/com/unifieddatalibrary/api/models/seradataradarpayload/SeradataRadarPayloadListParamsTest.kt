// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataradarpayload

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataRadarPayloadListParamsTest {

    @Test
    fun create() {
      SeradataRadarPayloadListParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = SeradataRadarPayloadListParams.builder()
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
      val params = SeradataRadarPayloadListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
