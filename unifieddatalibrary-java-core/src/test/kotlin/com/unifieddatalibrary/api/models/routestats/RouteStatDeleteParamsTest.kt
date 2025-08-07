// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.routestats

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteStatDeleteParamsTest {

    @Test
    fun create() {
        RouteStatDeleteParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = RouteStatDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
