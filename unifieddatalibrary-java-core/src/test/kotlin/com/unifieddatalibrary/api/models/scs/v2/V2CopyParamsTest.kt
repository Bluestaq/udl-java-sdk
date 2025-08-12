// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.scs.v2.V2CopyParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2CopyParamsTest {

    @Test
    fun create() {
      V2CopyParams.builder()
          .fromPath("fromPath")
          .toPath("toPath")
          .build()
    }

    @Test
    fun queryParams() {
      val params = V2CopyParams.builder()
          .fromPath("fromPath")
          .toPath("toPath")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("fromPath", "fromPath")
          .put("toPath", "toPath")
          .build())
    }
}
