// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.file

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.scs.file.FileRetrieveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRetrieveParamsTest {

    @Test
    fun create() {
      FileRetrieveParams.builder()
          .id("id")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = FileRetrieveParams.builder()
          .id("id")
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("id", "id")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = FileRetrieveParams.builder()
          .id("id")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("id", "id")
          .build())
    }
}
