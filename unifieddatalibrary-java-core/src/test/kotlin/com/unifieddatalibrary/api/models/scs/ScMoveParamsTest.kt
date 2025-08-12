// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.scs.ScMoveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScMoveParamsTest {

    @Test
    fun create() {
      ScMoveParams.builder()
          .id("id")
          .targetPath("targetPath")
          .build()
    }

    @Test
    fun queryParams() {
      val params = ScMoveParams.builder()
          .id("id")
          .targetPath("targetPath")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("id", "id")
          .put("targetPath", "targetPath")
          .build())
    }
}
