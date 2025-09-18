// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.folders.FolderCreateParams
import com.unifieddatalibrary.api.models.scs.folders.FolderRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FolderServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val folderServiceAsync = client.scs().folders()

        val folderFuture =
            folderServiceAsync.create(
                FolderCreateParams.builder()
                    .id("id")
                    .classificationMarking("classificationMarking")
                    .description("description")
                    .read("read")
                    .sendNotification(true)
                    .tags("tags")
                    .write("write")
                    .build()
            )

        val folder = folderFuture.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val folderServiceAsync = client.scs().folders()

        val fileDataFuture =
            folderServiceAsync.retrieve(
                FolderRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val fileData = fileDataFuture.get()
        fileData.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val folderServiceAsync = client.scs().folders()

        val future =
            folderServiceAsync.update(
                FileData.builder()
                    .id("/example/folder/")
                    .attributes(
                        FileData.Attributes.builder()
                            .id("id")
                            .classification("U")
                            .classificationMarking("classificationMarking")
                            .createdBy("createdBy")
                            .createdDate("createdDate")
                            .deleteOn(0L)
                            .description("A new Example Description")
                            .docTitle("docTitle")
                            .docType("docType")
                            .addDoi("string")
                            .ellipseLat(0.0f)
                            .ellipseLon(0.0f)
                            .fileName("fileName")
                            .intrinsicTitle("intrinsicTitle")
                            .keywords("keywords")
                            .mediaTitle("mediaTitle")
                            .metaInfo("metaInfo")
                            .milgrid("milgrid")
                            .milgridLat(0.0f)
                            .milgridLon(0.0f)
                            .modifiedBy("modifiedBy")
                            .modifiedDate("modifiedDate")
                            .name("name")
                            .path("/example/folder/")
                            .read("read")
                            .searchable(true)
                            .searchAfter("searchAfter")
                            .serialNumber("serialNumber")
                            .size(0L)
                            .addTag("exampleTag")
                            .addTag("anotherTag")
                            .write("write")
                            .build()
                    )
                    .targetName("targetName")
                    .targetPath("targetPath")
                    .type(FileData.Type.FILE)
                    .build()
            )

        val response = future.get()
    }
}
