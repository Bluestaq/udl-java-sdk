// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.view

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ViewGetParamsTest {

    @Test
    fun create() {
        ViewGetParams.builder()
            .id("/Documentation/project.pdf")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ViewGetParams.builder().id("/Documentation/project.pdf").build()

        assertThat(params._pathParam(0)).isEqualTo("/Documentation/project.pdf")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ViewGetParams.builder()
                .id("/Documentation/project.pdf")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("firstResult", "0").put("maxResults", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ViewGetParams.builder().id("/Documentation/project.pdf").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
