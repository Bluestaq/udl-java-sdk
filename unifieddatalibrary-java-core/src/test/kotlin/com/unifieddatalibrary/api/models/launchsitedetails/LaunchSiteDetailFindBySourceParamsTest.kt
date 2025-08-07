// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsitedetails

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchSiteDetailFindBySourceParamsTest {

    @Test
    fun create() {
        LaunchSiteDetailFindBySourceParams.builder()
            .source("source")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LaunchSiteDetailFindBySourceParams.builder()
                .source("source")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("source", "source")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LaunchSiteDetailFindBySourceParams.builder().source("source").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("source", "source").build())
    }
}
