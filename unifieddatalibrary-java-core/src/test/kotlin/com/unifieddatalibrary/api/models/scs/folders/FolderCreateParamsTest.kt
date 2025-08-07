// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.folders

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderCreateParamsTest {

    @Test
    fun create() {
        FolderCreateParams.builder()
            .id("id")
            .classificationMarking("classificationMarking")
            .description("description")
            .read("read")
            .sendNotification(true)
            .tags("tags")
            .write("write")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FolderCreateParams.builder()
                .id("id")
                .classificationMarking("classificationMarking")
                .description("description")
                .read("read")
                .sendNotification(true)
                .tags("tags")
                .write("write")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "id")
                    .put("classificationMarking", "classificationMarking")
                    .put("description", "description")
                    .put("read", "read")
                    .put("sendNotification", "true")
                    .put("tags", "tags")
                    .put("write", "write")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FolderCreateParams.builder()
                .id("id")
                .classificationMarking("classificationMarking")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "id")
                    .put("classificationMarking", "classificationMarking")
                    .build()
            )
    }
}
