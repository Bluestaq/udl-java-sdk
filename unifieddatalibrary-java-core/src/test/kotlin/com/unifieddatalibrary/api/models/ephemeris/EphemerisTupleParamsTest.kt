// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemerisTupleParamsTest {

    @Test
    fun create() {
        EphemerisTupleParams.builder()
            .columns("columns")
            .esId("esId")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EphemerisTupleParams.builder()
                .columns("columns")
                .esId("esId")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("columns", "columns")
                    .put("esId", "esId")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EphemerisTupleParams.builder().columns("columns").esId("esId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("columns", "columns").put("esId", "esId").build())
    }
}
