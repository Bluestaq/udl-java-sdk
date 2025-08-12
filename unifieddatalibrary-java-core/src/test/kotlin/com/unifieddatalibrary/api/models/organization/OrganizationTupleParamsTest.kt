// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organization

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.organization.OrganizationTupleParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationTupleParamsTest {

    @Test
    fun create() {
      OrganizationTupleParams.builder()
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = OrganizationTupleParams.builder()
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = OrganizationTupleParams.builder()
          .columns("columns")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .build())
    }
}
