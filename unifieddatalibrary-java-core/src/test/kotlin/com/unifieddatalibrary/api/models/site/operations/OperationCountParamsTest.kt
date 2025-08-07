// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site.operations

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationCountParamsTest {

    @Test
    fun create() {
        OperationCountParams.builder().idSite("idSite").firstResult(0L).maxResults(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            OperationCountParams.builder().idSite("idSite").firstResult(0L).maxResults(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("idSite", "idSite")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OperationCountParams.builder().idSite("idSite").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("idSite", "idSite").build())
    }
}
