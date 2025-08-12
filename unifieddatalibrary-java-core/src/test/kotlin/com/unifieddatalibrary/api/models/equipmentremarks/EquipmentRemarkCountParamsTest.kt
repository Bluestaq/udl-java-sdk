// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipmentremarks

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkCountParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EquipmentRemarkCountParamsTest {

    @Test
    fun create() {
      EquipmentRemarkCountParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = EquipmentRemarkCountParams.builder()
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
      val params = EquipmentRemarkCountParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
