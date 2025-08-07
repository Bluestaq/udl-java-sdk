// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.starcatalog

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StarCatalogTupleParamsTest {

    @Test
    fun create() {
        StarCatalogTupleParams.builder()
            .columns("columns")
            .dec(0.0)
            .firstResult(0L)
            .maxResults(0L)
            .ra(0.0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            StarCatalogTupleParams.builder()
                .columns("columns")
                .dec(0.0)
                .firstResult(0L)
                .maxResults(0L)
                .ra(0.0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("columns", "columns")
                    .put("dec", "0.0")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .put("ra", "0.0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StarCatalogTupleParams.builder().columns("columns").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("columns", "columns").build())
    }
}
