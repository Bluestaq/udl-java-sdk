// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ir

import com.unifieddatalibrary.api.models.ir.IrDeleteParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IrDeleteParamsTest {

    @Test
    fun create() {
      IrDeleteParams.builder()
          .id("id")
          .build()
    }

    @Test
    fun pathParams() {
      val params = IrDeleteParams.builder()
          .id("id")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }
}
