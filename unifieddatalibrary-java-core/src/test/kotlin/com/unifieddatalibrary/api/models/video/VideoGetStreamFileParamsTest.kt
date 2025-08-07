// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoGetStreamFileParamsTest {

    @Test
    fun create() {
        VideoGetStreamFileParams.builder()
            .sourceName("sourceName")
            .streamName("streamName")
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VideoGetStreamFileParams.builder()
                .sourceName("sourceName")
                .streamName("streamName")
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("sourceName", "sourceName")
                    .put("streamName", "streamName")
                    .put("firstResult", "0")
                    .put("maxResults", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            VideoGetStreamFileParams.builder()
                .sourceName("sourceName")
                .streamName("streamName")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("sourceName", "sourceName")
                    .put("streamName", "streamName")
                    .build()
            )
    }
}
