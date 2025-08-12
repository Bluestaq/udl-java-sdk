// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.crew

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.crew.CrewRetrieveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrewRetrieveParamsTest {

    @Test
    fun create() {
      CrewRetrieveParams.builder()
          .id("id")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun pathParams() {
      val params = CrewRetrieveParams.builder()
          .id("id")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
      val params = CrewRetrieveParams.builder()
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
      val params = CrewRetrieveParams.builder()
          .id("id")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
