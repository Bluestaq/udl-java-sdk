// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.scs.v2.V2FolderCreateParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2FolderCreateParamsTest {

    @Test
    fun create() {
      V2FolderCreateParams.builder()
          .path("path")
          .sendNotification(true)
          .classificationMarking("U")
          .deleteOn(0L)
          .description("My first folder")
          .readAcl("user.id1,group.id1")
          .addTag("TAG1")
          .addTag("TAG2")
          .writeAcl("user.id1,group.id1")
          .build()
    }

    @Test
    fun queryParams() {
      val params = V2FolderCreateParams.builder()
          .path("path")
          .sendNotification(true)
          .classificationMarking("U")
          .deleteOn(0L)
          .description("My first folder")
          .readAcl("user.id1,group.id1")
          .addTag("TAG1")
          .addTag("TAG2")
          .writeAcl("user.id1,group.id1")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("path", "path")
          .put("sendNotification", "true")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = V2FolderCreateParams.builder()
          .path("path")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("path", "path")
          .build())
    }

    @Test
    fun body() {
      val params = V2FolderCreateParams.builder()
          .path("path")
          .sendNotification(true)
          .classificationMarking("U")
          .deleteOn(0L)
          .description("My first folder")
          .readAcl("user.id1,group.id1")
          .addTag("TAG1")
          .addTag("TAG2")
          .writeAcl("user.id1,group.id1")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).contains("U")
      assertThat(body.deleteOn()).contains(0L)
      assertThat(body.description()).contains("My first folder")
      assertThat(body.readAcl()).contains("user.id1,group.id1")
      assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
      assertThat(body.writeAcl()).contains("user.id1,group.id1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = V2FolderCreateParams.builder()
          .path("path")
          .build()

      val body = params._body()
    }
}
