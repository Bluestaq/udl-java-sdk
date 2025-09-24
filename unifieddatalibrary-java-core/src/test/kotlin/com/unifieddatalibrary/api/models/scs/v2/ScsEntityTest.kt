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
                .id("/my-folder/")
                .attachment(
                    Attachment.builder()
                        .author("John.Doe")
                        .contentLength(0)
                        .contentType("text/plain")
                        .date("2025-07-03T16:27:57.970Z")
                        .keywords("keywords")
                        .language("en")
                        .title("title")
                        .build()
                )
                .classificationMarking("U")
                .createdAt("2025-07-03T16:27:57.970Z")
                .createdBy("John.Doe")
                .deleteOn(0L)
                .description("description")
                .filename("my-folder")
                .filePath("/my-folder/sub-folder/")
                .keywords("keywords")
                .parentPath("/")
                .pathType(ScsEntity.PathType.FILE)
                .readAcl("user.id1,group.id1")
                .size(0)
                .addTag("TAG1")
                .addTag("TAG2")
                .updatedAt("2025-07-03T16:27:57.970Z")
                .updatedBy("John.Doe")
                .writeAcl("user.id1,group.id1")
                .build()

        assertThat(scsEntity.id()).contains("/my-folder/")
        assertThat(scsEntity.attachment())
            .contains(
                Attachment.builder()
                    .author("John.Doe")
                    .contentLength(0)
                    .contentType("text/plain")
                    .date("2025-07-03T16:27:57.970Z")
                    .keywords("keywords")
                    .language("en")
                    .title("title")
                    .build()
            )
        assertThat(scsEntity.classificationMarking()).contains("U")
        assertThat(scsEntity.createdAt()).contains("2025-07-03T16:27:57.970Z")
        assertThat(scsEntity.createdBy()).contains("John.Doe")
        assertThat(scsEntity.deleteOn()).contains(0L)
        assertThat(scsEntity.description()).contains("description")
        assertThat(scsEntity.filename()).contains("my-folder")
        assertThat(scsEntity.filePath()).contains("/my-folder/sub-folder/")
        assertThat(scsEntity.keywords()).contains("keywords")
        assertThat(scsEntity.parentPath()).contains("/")
        assertThat(scsEntity.pathType()).contains(ScsEntity.PathType.FILE)
        assertThat(scsEntity.readAcl()).contains("user.id1,group.id1")
        assertThat(scsEntity.size()).contains(0)
        assertThat(scsEntity.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(scsEntity.updatedAt()).contains("2025-07-03T16:27:57.970Z")
        assertThat(scsEntity.updatedBy()).contains("John.Doe")
        assertThat(scsEntity.writeAcl()).contains("user.id1,group.id1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scsEntity =
            ScsEntity.builder()
                .id("/my-folder/")
                .attachment(
                    Attachment.builder()
                        .author("John.Doe")
                        .contentLength(0)
                        .contentType("text/plain")
                        .date("2025-07-03T16:27:57.970Z")
                        .keywords("keywords")
                        .language("en")
                        .title("title")
                        .build()
                )
                .classificationMarking("U")
                .createdAt("2025-07-03T16:27:57.970Z")
                .createdBy("John.Doe")
                .deleteOn(0L)
                .description("description")
                .filename("my-folder")
                .filePath("/my-folder/sub-folder/")
                .keywords("keywords")
                .parentPath("/")
                .pathType(ScsEntity.PathType.FILE)
                .readAcl("user.id1,group.id1")
                .size(0)
                .addTag("TAG1")
                .addTag("TAG2")
                .updatedAt("2025-07-03T16:27:57.970Z")
                .updatedBy("John.Doe")
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
