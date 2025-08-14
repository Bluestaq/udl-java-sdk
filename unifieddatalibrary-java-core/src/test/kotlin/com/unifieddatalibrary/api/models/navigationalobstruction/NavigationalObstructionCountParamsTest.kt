// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigationalobstruction

import com.unifieddatalibrary.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NavigationalObstructionCountParamsTest {

    @Test
    fun create() {
        NavigationalObstructionCountParams.builder()
            .cycleDate(LocalDate.parse("2019-12-27"))
            .firstResult(0L)
            .maxResults(0L)
            .obstacleId("obstacleId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NavigationalObstructionCountParams.builder()
                .cycleDate(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .maxResults(0L)
                .obstacleId("obstacleId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cycleDate", "2019-12-27")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .put("obstacleId", "obstacleId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NavigationalObstructionCountParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
