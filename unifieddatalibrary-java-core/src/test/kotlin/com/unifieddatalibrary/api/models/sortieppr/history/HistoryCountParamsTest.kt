// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sortieppr.history

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryCountParamsTest {

    @Test
    fun create() {
        HistoryCountParams.builder().idSortie("idSortie").firstResult(0L).maxResults(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            HistoryCountParams.builder().idSortie("idSortie").firstResult(0L).maxResults(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("idSortie", "idSortie")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HistoryCountParams.builder().idSortie("idSortie").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("idSortie", "idSortie").build())
    }
}
