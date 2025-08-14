// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus

import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkStatusTupleParamsTest {

    @Test
    fun create() {
        LinkStatusTupleParams.builder()
            .columns("columns")
            .createdAt(LocalDate.parse("2019-12-27"))
            .firstResult(0L)
            .linkStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .linkStopTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LinkStatusTupleParams.builder()
                .columns("columns")
                .createdAt(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .linkStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .linkStopTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxResults(0L)
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
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LinkStatusTupleParams.builder().columns("columns").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("columns", "columns").build())
    }
}
