// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.status

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusGetByEntityTypeParamsTest {

    @Test
    fun create() {
        StatusGetByEntityTypeParams.builder()
            .entityType("entityType")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = StatusGetByEntityTypeParams.builder().entityType("entityType").build()

        assertThat(params._pathParam(0)).isEqualTo("entityType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            StatusGetByEntityTypeParams.builder()
                .entityType("entityType")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("firstResult", "0").put("maxResults", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StatusGetByEntityTypeParams.builder().entityType("entityType").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
