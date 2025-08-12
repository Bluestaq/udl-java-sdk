// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.scs.v2.V2UpdateParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2UpdateParamsTest {

    @Test
    fun create() {
      V2UpdateParams.builder()
          .path("path")
          .sendNotification(true)
          .classificationMarking("U")
          .deleteOn(0L)
          .description("A description of the updated folder.")
          .readAcl("user.id1,group.id1")
          .addTag("TAG1")
          .addTag("TAG2")
          .writeAcl("user.id1,group.id1")
          .build()
    }

    @Test
    fun queryParams() {
      val params = V2UpdateParams.builder()
          .path("path")
          .sendNotification(true)
          .classificationMarking("U")
          .deleteOn(0L)
          .description("A description of the updated folder.")
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
      val params = V2UpdateParams.builder()
          .path("path")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("path", "path")
          .build())
    }

    @Test
    fun body() {
      val params = V2UpdateParams.builder()
          .path("path")
          .sendNotification(true)
          .classificationMarking("U")
          .deleteOn(0L)
          .description("A description of the updated folder.")
          .readAcl("user.id1,group.id1")
          .addTag("TAG1")
          .addTag("TAG2")
          .writeAcl("user.id1,group.id1")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).contains("U")
      assertThat(body.deleteOn()).contains(0L)
      assertThat(body.description()).contains("A description of the updated folder.")
      assertThat(body.readAcl()).contains("user.id1,group.id1")
      assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
      assertThat(body.writeAcl()).contains("user.id1,group.id1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = V2UpdateParams.builder()
          .path("path")
          .build()

      val body = params._body()
    }
}
