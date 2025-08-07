// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.file

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListParamsTest {

    @Test
    fun create() {
        FileListParams.builder()
            .path("path")
            .count(0)
            .firstResult(0L)
            .maxResults(0L)
            .offset(0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FileListParams.builder()
                .path("path")
                .count(0)
                .firstResult(0L)
                .maxResults(0L)
                .offset(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("path", "path")
                    .put("count", "0")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .put("offset", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileListParams.builder().path("path").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("path", "path").build())
    }
}
