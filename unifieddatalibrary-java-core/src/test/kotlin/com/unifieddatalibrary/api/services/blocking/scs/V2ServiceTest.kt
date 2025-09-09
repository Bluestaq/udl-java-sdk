// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.scs.v2.V2CopyParams
import com.unifieddatalibrary.api.models.scs.v2.V2DeleteParams
import com.unifieddatalibrary.api.models.scs.v2.V2FileUploadParams
import com.unifieddatalibrary.api.models.scs.v2.V2FolderCreateParams
import com.unifieddatalibrary.api.models.scs.v2.V2ListParams
import com.unifieddatalibrary.api.models.scs.v2.V2MoveParams
import com.unifieddatalibrary.api.models.scs.v2.V2UpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V2ServiceTest {

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val v2Service = client.scs().v2()

        v2Service.update(
            V2UpdateParams.builder()
                .path("path")
                .sendNotification(true)
                .id("/my-folder/")
                .attachment(
                    V2UpdateParams.Attachment.builder()
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
                .description("A description of the updated folder.")
                .filename("my-folder")
                .filePath("/my-folder/sub-folder/")
                .keywords("keywords")
                .parentPath("/")
                .pathType(V2UpdateParams.PathType.FILE)
                .readAcl("user.id1,group.id1")
                .size(0)
                .addTag("TAG1")
                .addTag("TAG2")
                .updatedAt("2025-07-03T16:27:57.970Z")
                .updatedBy("John.Doe")
                .writeAcl("user.id1,group.id1")
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val v2Service = client.scs().v2()

        val page = v2Service.list(V2ListParams.builder().path("path").build())

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val v2Service = client.scs().v2()

        v2Service.delete(V2DeleteParams.builder().path("path").build())
    }

    @Test
    fun copy() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val v2Service = client.scs().v2()

        v2Service.copy(V2CopyParams.builder().fromPath("fromPath").toPath("toPath").build())
    }

    @Test
    fun fileUpload() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val v2Service = client.scs().v2()

        v2Service.fileUpload(
            V2FileUploadParams.builder()
                .classificationMarking("classificationMarking")
                .path("path")
                .deleteAfter("deleteAfter")
                .description("description")
                .overwrite(true)
                .sendNotification(true)
                .tags("tags")
                .fileContent("some content")
                .build()
        )
    }

    @Test
    fun folderCreate() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val v2Service = client.scs().v2()

        v2Service.folderCreate(
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
        )
    }

    @Test
    fun move() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val v2Service = client.scs().v2()

        v2Service.move(V2MoveParams.builder().fromPath("fromPath").toPath("toPath").build())
    }
}
