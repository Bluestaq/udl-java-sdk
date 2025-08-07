// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.countries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryDeleteParamsTest {

    @Test
    fun create() {
        CountryDeleteParams.builder().code("code").build()
    }

    @Test
    fun pathParams() {
        val params = CountryDeleteParams.builder().code("code").build()

        assertThat(params._pathParam(0)).isEqualTo("code")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
