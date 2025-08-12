// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.scs.ScRenameParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScRenameParamsTest {

    @Test
    fun create() {
      ScRenameParams.builder()
          .id("id")
          .newName("newName")
          .build()
    }

    @Test
    fun queryParams() {
      val params = ScRenameParams.builder()
          .id("id")
          .newName("newName")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("id", "id")
          .put("newName", "newName")
          .build())
    }
}
