// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.countries

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryRetrieveParamsTest {

    @Test
    fun create() {
        CountryRetrieveParams.builder().code("code").firstResult(0L).maxResults(0L).build()
    }

    @Test
    fun pathParams() {
        val params = CountryRetrieveParams.builder().code("code").build()

        assertThat(params._pathParam(0)).isEqualTo("code")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CountryRetrieveParams.builder().code("code").firstResult(0L).maxResults(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("firstResult", "0").put("maxResults", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CountryRetrieveParams.builder().code("code").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
