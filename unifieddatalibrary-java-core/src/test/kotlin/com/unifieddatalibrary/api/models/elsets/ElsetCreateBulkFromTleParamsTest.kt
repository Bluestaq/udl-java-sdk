// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.elsets

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElsetCreateBulkFromTleParamsTest {

    @Test
    fun create() {
        ElsetCreateBulkFromTleParams.builder()
            .dataMode("dataMode")
            .makeCurrent(true)
            .source("source")
            .autoCreateSats(true)
            .control("control")
            .origin("origin")
            .tags("tags")
            .body("body")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ElsetCreateBulkFromTleParams.builder()
                .dataMode("dataMode")
                .makeCurrent(true)
                .source("source")
                .autoCreateSats(true)
                .control("control")
                .origin("origin")
                .tags("tags")
                .body("body")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("dataMode", "dataMode")
                    .put("makeCurrent", "true")
                    .put("source", "source")
                    .put("autoCreateSats", "true")
                    .put("control", "control")
                    .put("origin", "origin")
                    .put("tags", "tags")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ElsetCreateBulkFromTleParams.builder()
                .dataMode("dataMode")
                .makeCurrent(true)
                .source("source")
                .body("body")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("dataMode", "dataMode")
                    .put("makeCurrent", "true")
                    .put("source", "source")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            ElsetCreateBulkFromTleParams.builder()
                .dataMode("dataMode")
                .makeCurrent(true)
                .source("source")
                .autoCreateSats(true)
                .control("control")
                .origin("origin")
                .tags("tags")
                .body("body")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("body")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ElsetCreateBulkFromTleParams.builder()
                .dataMode("dataMode")
                .makeCurrent(true)
                .source("source")
                .body("body")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("body")
    }
}
