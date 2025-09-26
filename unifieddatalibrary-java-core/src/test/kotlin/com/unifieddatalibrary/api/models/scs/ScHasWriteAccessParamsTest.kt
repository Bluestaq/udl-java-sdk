// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScHasWriteAccessParamsTest {

    @Test
    fun create() {
        ScHasWriteAccessParams.builder().path("path").firstResult(0L).maxResults(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            ScHasWriteAccessParams.builder().path("path").firstResult(0L).maxResults(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("path", "path")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ScHasWriteAccessParams.builder().path("path").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("path", "path").build())
    }
}
