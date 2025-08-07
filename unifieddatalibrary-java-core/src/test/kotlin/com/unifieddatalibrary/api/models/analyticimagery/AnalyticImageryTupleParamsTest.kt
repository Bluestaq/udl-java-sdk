// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.analyticimagery

import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticImageryTupleParamsTest {

    @Test
    fun create() {
        AnalyticImageryTupleParams.builder()
            .columns("columns")
            .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AnalyticImageryTupleParams.builder()
                .columns("columns")
                .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("columns", "columns")
                    .put("msgTime", "2019-12-27T18:11:19.117Z")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AnalyticImageryTupleParams.builder()
                .columns("columns")
                .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("columns", "columns")
                    .put("msgTime", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }
}
