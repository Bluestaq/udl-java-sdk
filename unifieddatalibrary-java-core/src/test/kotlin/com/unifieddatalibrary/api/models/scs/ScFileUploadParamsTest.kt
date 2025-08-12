// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.scs.ScFileUploadParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScFileUploadParamsTest {

    @Test
    fun create() {
      ScFileUploadParams.builder()
          .classificationMarking("classificationMarking")
          .fileName("fileName")
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
      val params = ScFileUploadParams.builder()
          .classificationMarking("classificationMarking")
          .fileName("fileName")
          .path("path")
          .deleteAfter("deleteAfter")
          .description("description")
          .overwrite(true)
          .sendNotification(true)
          .tags("tags")
          .fileContent("some content")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("classificationMarking", "classificationMarking")
          .put("fileName", "fileName")
          .put("path", "path")
          .put("deleteAfter", "deleteAfter")
          .put("description", "description")
          .put("overwrite", "true")
          .put("sendNotification", "true")
          .put("tags", "tags")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = ScFileUploadParams.builder()
          .classificationMarking("classificationMarking")
          .fileName("fileName")
          .path("path")
          .fileContent("some content")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("classificationMarking", "classificationMarking")
          .put("fileName", "fileName")
          .put("path", "path")
          .build())
    }

    @Test
    fun body() {
      val params = ScFileUploadParams.builder()
          .classificationMarking("classificationMarking")
          .fileName("fileName")
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
      val params = ScFileUploadParams.builder()
          .classificationMarking("classificationMarking")
          .fileName("fileName")
          .path("path")
          .fileContent("some content")
          .build()

      val body = params._body().getOrNull()

      assertThat(body).isEqualTo("some content")
    }
}
