// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.scs.v2.Attachment
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentTest {

    @Test
    fun create() {
      val attachment = Attachment.builder()
          .author("author")
          .content("content")
          .contentLength(0)
          .contentType("content_type")
          .date("date")
          .keywords("keywords")
          .language("language")
          .title("title")
          .build()

      assertThat(attachment.author()).contains("author")
      assertThat(attachment.content()).contains("content")
      assertThat(attachment.contentLength()).contains(0)
      assertThat(attachment.contentType()).contains("content_type")
      assertThat(attachment.date()).contains("date")
      assertThat(attachment.keywords()).contains("keywords")
      assertThat(attachment.language()).contains("language")
      assertThat(attachment.title()).contains("title")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val attachment = Attachment.builder()
          .author("author")
          .content("content")
          .contentLength(0)
          .contentType("content_type")
          .date("date")
          .keywords("keywords")
          .language("language")
          .title("title")
          .build()

      val roundtrippedAttachment = jsonMapper.readValue(jsonMapper.writeValueAsString(attachment), jacksonTypeRef<Attachment>())

      assertThat(roundtrippedAttachment).isEqualTo(attachment)
    }
}
