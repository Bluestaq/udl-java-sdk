// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitGetSignatureParamsTest {

    @Test
    fun create() {
        OnorbitGetSignatureParams.builder()
            .idOnOrbit("idOnOrbit")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OnorbitGetSignatureParams.builder()
                .idOnOrbit("idOnOrbit")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("idOnOrbit", "idOnOrbit")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OnorbitGetSignatureParams.builder().idOnOrbit("idOnOrbit").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("idOnOrbit", "idOnOrbit").build())
    }
}
