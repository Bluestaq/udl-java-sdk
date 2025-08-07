// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchvehicledetails

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchVehicleDetailDeleteParamsTest {

    @Test
    fun create() {
        LaunchVehicleDetailDeleteParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = LaunchVehicleDetailDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
