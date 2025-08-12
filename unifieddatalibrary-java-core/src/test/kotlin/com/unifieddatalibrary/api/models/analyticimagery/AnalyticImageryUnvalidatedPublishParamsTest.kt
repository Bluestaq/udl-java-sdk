// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.analyticimagery

import com.unifieddatalibrary.api.core.MultipartField
import com.unifieddatalibrary.api.models.analyticimagery.AnalyticImageryUnvalidatedPublishParams
import java.io.ByteArrayInputStream
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticImageryUnvalidatedPublishParamsTest {

    @Test
    fun create() {
      AnalyticImageryUnvalidatedPublishParams.builder()
          .file("some content".byteInputStream())
          .build()
    }

    @Test
    fun body() {
      val params = AnalyticImageryUnvalidatedPublishParams.builder()
          .file("some content".byteInputStream())
          .build()

      val body = params._body()

      assertThat(body.filterValues { !it.value.isNull() })
          .usingRecursiveComparison()
          // TODO(AssertJ): Replace this and the `mapValues` below with:
          // https://github.com/assertj/assertj/issues/3165
          .withEqualsForType(
              { a, b -> a.readBytes() contentEquals b.readBytes() },
              InputStream::class.java,
          )
          .isEqualTo(mapOf("file" to MultipartField.of("some content".byteInputStream())).mapValues { (_, field) -> field.map { (it as? ByteArray)?.inputStream() ?: it } })
    }
}
