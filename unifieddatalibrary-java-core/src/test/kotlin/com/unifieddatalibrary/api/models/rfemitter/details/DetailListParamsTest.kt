// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter.details

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailListParamsTest {

    @Test
    fun create() {
        DetailListParams.builder().firstResult(0L).maxResults(0L).build()
    }

    @Test
    fun queryParams() {
        val params = DetailListParams.builder().firstResult(0L).maxResults(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("firstResult", "0").put("maxResults", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DetailListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
