// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sortieppr.history

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListParamsTest {

    @Test
    fun create() {
        HistoryListParams.builder()
            .idSortie("idSortie")
            .columns("columns")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HistoryListParams.builder()
                .idSortie("idSortie")
                .columns("columns")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("idSortie", "idSortie")
                    .put("columns", "columns")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HistoryListParams.builder().idSortie("idSortie").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("idSortie", "idSortie").build())
    }
}
