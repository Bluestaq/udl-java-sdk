// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssobservationset

import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GnssObservationsetListParamsTest {

    @Test
    fun create() {
        GnssObservationsetListParams.builder()
            .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GnssObservationsetListParams.builder()
                .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ts", "2019-12-27T18:11:19.117Z")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            GnssObservationsetListParams.builder()
                .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("ts", "2019-12-27T18:11:19.117Z").build())
    }
}
