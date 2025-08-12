// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organization

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetOrganizationTypesParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationGetOrganizationTypesParamsTest {

    @Test
    fun create() {
      OrganizationGetOrganizationTypesParams.builder()
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = OrganizationGetOrganizationTypesParams.builder()
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
      val params = OrganizationGetOrganizationTypesParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
