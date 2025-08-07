// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfEmitterTupleParamsTest {

    @Test
    fun create() {
        RfEmitterTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            RfEmitterTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("columns", "columns")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RfEmitterTupleParams.builder().columns("columns").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("columns", "columns").build())
    }
}
