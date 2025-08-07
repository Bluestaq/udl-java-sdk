// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.attitudedata

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttitudeDataTupleParamsTest {

    @Test
    fun create() {
        AttitudeDataTupleParams.builder()
            .asId("asId")
            .columns("columns")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AttitudeDataTupleParams.builder()
                .asId("asId")
                .columns("columns")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("asId", "asId")
                    .put("columns", "columns")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AttitudeDataTupleParams.builder().asId("asId").columns("columns").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("asId", "asId").put("columns", "columns").build())
    }
}
