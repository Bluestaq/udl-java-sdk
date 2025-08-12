// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sgi

import com.unifieddatalibrary.api.models.sgi.SgiDeleteParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgiDeleteParamsTest {

    @Test
    fun create() {
      SgiDeleteParams.builder()
          .id("id")
          .build()
    }

    @Test
    fun pathParams() {
      val params = SgiDeleteParams.builder()
          .id("id")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }
}
