// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris.attitudedata

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttitudeDataCountParamsTest {

    @Test
    fun create() {
        AttitudeDataCountParams.builder().asId("asId").firstResult(0L).maxResults(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            AttitudeDataCountParams.builder().asId("asId").firstResult(0L).maxResults(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("asId", "asId")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AttitudeDataCountParams.builder().asId("asId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("asId", "asId").build())
    }
}
