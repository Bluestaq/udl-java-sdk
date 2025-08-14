// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigationalobstruction

import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NavigationalObstructionTupleParamsTest {

    @Test
    fun create() {
        NavigationalObstructionTupleParams.builder()
            .columns("columns")
            .cycleDate(LocalDate.parse("2019-12-27"))
            .firstResult(0L)
            .maxResults(0L)
            .obstacleId("obstacleId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NavigationalObstructionTupleParams.builder()
                .columns("columns")
                .cycleDate(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .maxResults(0L)
                .obstacleId("obstacleId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("columns", "columns")
                    .put("cycleDate", "2019-12-27")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .put("obstacleId", "obstacleId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NavigationalObstructionTupleParams.builder().columns("columns").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("columns", "columns").build())
    }
}
