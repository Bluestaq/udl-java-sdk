// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.conjunctions

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.conjunctions.ConjunctionUploadConjunctionDataMessageParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConjunctionUploadConjunctionDataMessageParamsTest {

    @Test
    fun create() {
      ConjunctionUploadConjunctionDataMessageParams.builder()
          .classification("classification")
          .dataMode(ConjunctionUploadConjunctionDataMessageParams.DataMode.REAL)
          .filename("filename")
          .source("source")
          .tags("tags")
          .fileContent("some content")
          .build()
    }

    @Test
    fun queryParams() {
      val params = ConjunctionUploadConjunctionDataMessageParams.builder()
          .classification("classification")
          .dataMode(ConjunctionUploadConjunctionDataMessageParams.DataMode.REAL)
          .filename("filename")
          .source("source")
          .tags("tags")
          .fileContent("some content")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("classification", "classification")
          .put("dataMode", "REAL")
          .put("filename", "filename")
          .put("source", "source")
          .put("tags", "tags")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = ConjunctionUploadConjunctionDataMessageParams.builder()
          .classification("classification")
          .dataMode(ConjunctionUploadConjunctionDataMessageParams.DataMode.REAL)
          .filename("filename")
          .source("source")
          .fileContent("some content")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("classification", "classification")
          .put("dataMode", "REAL")
          .put("filename", "filename")
          .put("source", "source")
          .build())
    }

    @Test
    fun body() {
      val params = ConjunctionUploadConjunctionDataMessageParams.builder()
          .classification("classification")
          .dataMode(ConjunctionUploadConjunctionDataMessageParams.DataMode.REAL)
          .filename("filename")
          .source("source")
          .tags("tags")
          .fileContent("some content")
          .build()

      val body = params._body().getOrNull()

      assertThat(body).isEqualTo("some content")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = ConjunctionUploadConjunctionDataMessageParams.builder()
          .classification("classification")
          .dataMode(ConjunctionUploadConjunctionDataMessageParams.DataMode.REAL)
          .filename("filename")
          .source("source")
          .fileContent("some content")
          .build()

      val body = params._body().getOrNull()

      assertThat(body).isEqualTo("some content")
    }
}
