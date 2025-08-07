// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geohexcell

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class H3GeoHexCellListParamsTest {

    @Test
    fun create() {
        H3GeoHexCellListParams.builder().idH3Geo("idH3Geo").firstResult(0L).maxResults(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            H3GeoHexCellListParams.builder()
                .idH3Geo("idH3Geo")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("idH3Geo", "idH3Geo")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = H3GeoHexCellListParams.builder().idH3Geo("idH3Geo").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("idH3Geo", "idH3Geo").build())
    }
}
