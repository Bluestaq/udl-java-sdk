// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beamcontours

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamContourTupleParamsTest {

    @Test
    fun create() {
        BeamContourTupleParams.builder()
            .columns("columns")
            .idBeam("idBeam")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BeamContourTupleParams.builder()
                .columns("columns")
                .idBeam("idBeam")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("columns", "columns")
                    .put("idBeam", "idBeam")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BeamContourTupleParams.builder().columns("columns").idBeam("idBeam").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("columns", "columns").put("idBeam", "idBeam").build()
            )
    }
}
