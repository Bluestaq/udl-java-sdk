// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararraydetails

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolarArrayDetailListParamsTest {

    @Test
    fun create() {
        SolarArrayDetailListParams.builder()
            .classificationMarking("classificationMarking")
            .dataMode("dataMode")
            .firstResult(0L)
            .maxResults(0L)
            .source("source")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SolarArrayDetailListParams.builder()
                .classificationMarking("classificationMarking")
                .dataMode("dataMode")
                .firstResult(0L)
                .maxResults(0L)
                .source("source")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("classificationMarking", "classificationMarking")
                    .put("dataMode", "dataMode")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .put("source", "source")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SolarArrayDetailListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
