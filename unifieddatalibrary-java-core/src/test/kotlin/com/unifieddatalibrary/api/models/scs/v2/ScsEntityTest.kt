// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScsEntityTest {

    @Test
    fun create() {
        val scsEntity =
            ScsEntity.builder()
                .id("id")
                .attachment(
                    Attachment.builder()
                        .author("author")
                        .content("content")
                        .contentLength(0)
                        .contentType("content_type")
                        .date("date")
                        .keywords("keywords")
                        .language("language")
                        .title("title")
                        .build()
                )
                .classificationMarking("U")
                .createdAt("createdAt")
                .createdBy("createdBy")
                .data("data")
                .deleteOn(0L)
                .description("description")
                .filename("filename")
                .filePath("filePath")
                .keywords("keywords")
                .parentPath("parentPath")
                .pathType("pathType")
                .readAcl("user.id1,group.id1")
                .size(0)
                .addTag("TAG1")
                .addTag("TAG2")
                .updatedAt("updatedAt")
                .updatedBy("updatedBy")
                .writeAcl("user.id1,group.id1")
                .build()

        assertThat(scsEntity.id()).contains("id")
        assertThat(scsEntity.attachment())
            .contains(
                Attachment.builder()
                    .author("author")
                    .content("content")
                    .contentLength(0)
                    .contentType("content_type")
                    .date("date")
                    .keywords("keywords")
                    .language("language")
                    .title("title")
                    .build()
            )
        assertThat(scsEntity.classificationMarking()).contains("U")
        assertThat(scsEntity.createdAt()).contains("createdAt")
        assertThat(scsEntity.createdBy()).contains("createdBy")
        assertThat(scsEntity.data()).contains("data")
        assertThat(scsEntity.deleteOn()).contains(0L)
        assertThat(scsEntity.description()).contains("description")
        assertThat(scsEntity.filename()).contains("filename")
        assertThat(scsEntity.filePath()).contains("filePath")
        assertThat(scsEntity.keywords()).contains("keywords")
        assertThat(scsEntity.parentPath()).contains("parentPath")
        assertThat(scsEntity.pathType()).contains("pathType")
        assertThat(scsEntity.readAcl()).contains("user.id1,group.id1")
        assertThat(scsEntity.size()).contains(0)
        assertThat(scsEntity.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(scsEntity.updatedAt()).contains("updatedAt")
        assertThat(scsEntity.updatedBy()).contains("updatedBy")
        assertThat(scsEntity.writeAcl()).contains("user.id1,group.id1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scsEntity =
            ScsEntity.builder()
                .id("id")
                .attachment(
                    Attachment.builder()
                        .author("author")
                        .content("content")
                        .contentLength(0)
                        .contentType("content_type")
                        .date("date")
                        .keywords("keywords")
                        .language("language")
                        .title("title")
                        .build()
                )
                .classificationMarking("U")
                .createdAt("createdAt")
                .createdBy("createdBy")
                .data("data")
                .deleteOn(0L)
                .description("description")
                .filename("filename")
                .filePath("filePath")
                .keywords("keywords")
                .parentPath("parentPath")
                .pathType("pathType")
                .readAcl("user.id1,group.id1")
                .size(0)
                .addTag("TAG1")
                .addTag("TAG2")
                .updatedAt("updatedAt")
                .updatedBy("updatedBy")
                .writeAcl("user.id1,group.id1")
                .build()

        val roundtrippedScsEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scsEntity),
                jacksonTypeRef<ScsEntity>(),
            )

        assertThat(roundtrippedScsEntity).isEqualTo(scsEntity)
    }
}
