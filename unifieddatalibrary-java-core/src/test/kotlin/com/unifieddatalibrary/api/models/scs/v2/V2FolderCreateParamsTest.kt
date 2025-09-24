// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2FolderCreateParamsTest {

    @Test
    fun create() {
        V2FolderCreateParams.builder()
            .path("path")
            .sendNotification(true)
            .id("/my-folder/")
            .attachment(
                V2FolderCreateParams.Attachment.builder()
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
            .description("My first folder")
            .filename("my-folder")
            .filePath("/my-folder/sub-folder/")
            .keywords("keywords")
            .parentPath("/")
            .pathType(V2FolderCreateParams.PathType.FILE)
            .readAcl("user.id1,group.id1")
            .size(0)
            .addTag("TAG1")
            .addTag("TAG2")
            .updatedAt("2025-07-03T16:27:57.970Z")
            .updatedBy("John.Doe")
            .writeAcl("user.id1,group.id1")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V2FolderCreateParams.builder()
                .path("path")
                .sendNotification(true)
                .id("/my-folder/")
                .attachment(
                    V2FolderCreateParams.Attachment.builder()
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
                .description("My first folder")
                .filename("my-folder")
                .filePath("/my-folder/sub-folder/")
                .keywords("keywords")
                .parentPath("/")
                .pathType(V2FolderCreateParams.PathType.FILE)
                .readAcl("user.id1,group.id1")
                .size(0)
                .addTag("TAG1")
                .addTag("TAG2")
                .updatedAt("2025-07-03T16:27:57.970Z")
                .updatedBy("John.Doe")
                .writeAcl("user.id1,group.id1")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("path", "path").put("sendNotification", "true").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V2FolderCreateParams.builder().path("path").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("path", "path").build())
    }

    @Test
    fun body() {
        val params =
            V2FolderCreateParams.builder()
                .path("path")
                .sendNotification(true)
                .id("/my-folder/")
                .attachment(
                    V2FolderCreateParams.Attachment.builder()
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
                .description("My first folder")
                .filename("my-folder")
                .filePath("/my-folder/sub-folder/")
                .keywords("keywords")
                .parentPath("/")
                .pathType(V2FolderCreateParams.PathType.FILE)
                .readAcl("user.id1,group.id1")
                .size(0)
                .addTag("TAG1")
                .addTag("TAG2")
                .updatedAt("2025-07-03T16:27:57.970Z")
                .updatedBy("John.Doe")
                .writeAcl("user.id1,group.id1")
                .build()

        val body = params._body()

        assertThat(body.id()).contains("/my-folder/")
        assertThat(body.attachment())
            .contains(
                V2FolderCreateParams.Attachment.builder()
                    .author("John.Doe")
                    .contentLength(0)
                    .contentType("text/plain")
                    .date("2025-07-03T16:27:57.970Z")
                    .keywords("keywords")
                    .language("en")
                    .title("title")
                    .build()
            )
        assertThat(body.classificationMarking()).contains("U")
        assertThat(body.createdAt()).contains("2025-07-03T16:27:57.970Z")
        assertThat(body.createdBy()).contains("John.Doe")
        assertThat(body.deleteOn()).contains(0L)
        assertThat(body.description()).contains("My first folder")
        assertThat(body.filename()).contains("my-folder")
        assertThat(body.filePath()).contains("/my-folder/sub-folder/")
        assertThat(body.keywords()).contains("keywords")
        assertThat(body.parentPath()).contains("/")
        assertThat(body.pathType()).contains(V2FolderCreateParams.PathType.FILE)
        assertThat(body.readAcl()).contains("user.id1,group.id1")
        assertThat(body.size()).contains(0)
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(body.updatedAt()).contains("2025-07-03T16:27:57.970Z")
        assertThat(body.updatedBy()).contains("John.Doe")
        assertThat(body.writeAcl()).contains("user.id1,group.id1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V2FolderCreateParams.builder().path("path").build()

        val body = params._body()
    }
}
