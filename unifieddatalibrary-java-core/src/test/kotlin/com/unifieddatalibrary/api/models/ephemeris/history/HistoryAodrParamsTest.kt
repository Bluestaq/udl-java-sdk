// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris.history

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryAodrParamsTest {

    @Test
    fun create() {
        HistoryAodrParams.builder()
            .esId("esId")
            .columns("columns")
            .firstResult(0L)
            .maxResults(0L)
            .notification("notification")
            .outputDelimiter("outputDelimiter")
            .outputFormat("outputFormat")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HistoryAodrParams.builder()
                .esId("esId")
                .columns("columns")
                .firstResult(0L)
                .maxResults(0L)
                .notification("notification")
                .outputDelimiter("outputDelimiter")
                .outputFormat("outputFormat")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("esId", "esId")
                    .put("columns", "columns")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .put("notification", "notification")
                    .put("outputDelimiter", "outputDelimiter")
                    .put("outputFormat", "outputFormat")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HistoryAodrParams.builder().esId("esId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("esId", "esId").build())
    }
}
