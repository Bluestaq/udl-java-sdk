// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScDeleteParamsTest {

    @Test
    fun create() {
        ScDeleteParams.builder().id("id").build()
    }

    @Test
    fun queryParams() {
        val params = ScDeleteParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("id", "id").build())
    }
}
