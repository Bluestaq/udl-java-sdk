// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentTest {

    @Test
    fun create() {
        val attachment =
            Attachment.builder()
                .author("John.Doe")
                .contentLength(0)
                .contentType("text/plain")
                .date("2025-07-03T16:27:57.970Z")
                .keywords("keywords")
                .language("en")
                .title("title")
                .build()

        assertThat(attachment.author()).contains("John.Doe")
        assertThat(attachment.contentLength()).contains(0)
        assertThat(attachment.contentType()).contains("text/plain")
        assertThat(attachment.date()).contains("2025-07-03T16:27:57.970Z")
        assertThat(attachment.keywords()).contains("keywords")
        assertThat(attachment.language()).contains("en")
        assertThat(attachment.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachment =
            Attachment.builder()
                .author("John.Doe")
                .contentLength(0)
                .contentType("text/plain")
                .date("2025-07-03T16:27:57.970Z")
                .keywords("keywords")
                .language("en")
                .title("title")
                .build()

        val roundtrippedAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachment),
                jacksonTypeRef<Attachment>(),
            )

        assertThat(roundtrippedAttachment).isEqualTo(attachment)
    }
}
