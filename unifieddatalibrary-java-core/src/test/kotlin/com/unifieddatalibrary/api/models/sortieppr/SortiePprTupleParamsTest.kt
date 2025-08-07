// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sortieppr

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SortiePprTupleParamsTest {

    @Test
    fun create() {
        SortiePprTupleParams.builder()
            .columns("columns")
            .idSortie("idSortie")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SortiePprTupleParams.builder()
                .columns("columns")
                .idSortie("idSortie")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("columns", "columns")
                    .put("idSortie", "idSortie")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SortiePprTupleParams.builder().columns("columns").idSortie("idSortie").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("columns", "columns").put("idSortie", "idSortie").build()
            )
    }
}
