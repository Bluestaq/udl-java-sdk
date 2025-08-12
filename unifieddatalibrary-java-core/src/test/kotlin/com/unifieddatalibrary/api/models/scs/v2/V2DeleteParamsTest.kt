// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.scs.v2.V2DeleteParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2DeleteParamsTest {

    @Test
    fun create() {
      V2DeleteParams.builder()
          .path("path")
          .build()
    }

    @Test
    fun queryParams() {
      val params = V2DeleteParams.builder()
          .path("path")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("path", "path")
          .build())
    }
}
