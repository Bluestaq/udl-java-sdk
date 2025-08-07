// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2FileUploadParamsTest {

    @Test
    fun create() {
        V2FileUploadParams.builder()
            .classificationMarking("classificationMarking")
            .path("path")
            .deleteAfter("deleteAfter")
            .description("description")
            .overwrite(true)
            .sendNotification(true)
            .tags("tags")
            .fileContent("some content")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V2FileUploadParams.builder()
                .classificationMarking("classificationMarking")
                .path("path")
                .deleteAfter("deleteAfter")
                .description("description")
                .overwrite(true)
                .sendNotification(true)
                .tags("tags")
                .fileContent("some content")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("classificationMarking", "classificationMarking")
                    .put("path", "path")
                    .put("deleteAfter", "deleteAfter")
                    .put("description", "description")
                    .put("overwrite", "true")
                    .put("sendNotification", "true")
                    .put("tags", "tags")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            V2FileUploadParams.builder()
                .classificationMarking("classificationMarking")
                .path("path")
                .fileContent("some content")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("classificationMarking", "classificationMarking")
                    .put("path", "path")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            V2FileUploadParams.builder()
                .classificationMarking("classificationMarking")
                .path("path")
                .deleteAfter("deleteAfter")
                .description("description")
                .overwrite(true)
                .sendNotification(true)
                .tags("tags")
                .fileContent("some content")
                .build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo("some content")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V2FileUploadParams.builder()
                .classificationMarking("classificationMarking")
                .path("path")
                .fileContent("some content")
                .build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo("some content")
    }
}
