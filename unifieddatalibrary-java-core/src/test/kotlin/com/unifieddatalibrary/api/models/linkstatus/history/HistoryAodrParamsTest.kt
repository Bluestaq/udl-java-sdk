// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus.history

import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryAodrParamsTest {

    @Test
    fun create() {
        HistoryAodrParams.builder()
            .columns("columns")
            .createdAt(LocalDate.parse("2019-12-27"))
            .firstResult(0L)
            .linkStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .linkStopTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .columns("columns")
                .createdAt(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .linkStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .linkStopTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxResults(0L)
                .notification("notification")
                .outputDelimiter("outputDelimiter")
                .outputFormat("outputFormat")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("columns", "columns")
                    .put("createdAt", "2019-12-27")
                    .put("firstResult", "0")
                    .put("linkStartTime", "2019-12-27T18:11:19.117Z")
                    .put("linkStopTime", "2019-12-27T18:11:19.117Z")
                    .put("maxResults", "0")
                    .put("notification", "notification")
                    .put("outputDelimiter", "outputDelimiter")
                    .put("outputFormat", "outputFormat")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HistoryAodrParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
