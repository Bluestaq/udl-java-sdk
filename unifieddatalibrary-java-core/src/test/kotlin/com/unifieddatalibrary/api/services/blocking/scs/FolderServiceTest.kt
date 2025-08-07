// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.folders.FolderCreateParams
import com.unifieddatalibrary.api.models.scs.folders.FolderRetrieveParams
import com.unifieddatalibrary.api.models.scs.folders.FolderUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FolderServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val folderService = client.scs().folders()

        folderService.create(
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
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val folderService = client.scs().folders()

        val fileData =
            folderService.retrieve(
                FolderRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        fileData.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val folderService = client.scs().folders()

        folderService.update(
            FolderUpdateParams.builder()
                .fileData(
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
                                .metaInfo("A new Example Meta Info")
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
                                .addTag("string")
                                .write("write")
                                .build()
                        )
                        .contentAction(FileData.ContentAction.UPDATE)
                        .targetName("targetName")
                        .targetPath("targetPath")
                        .type(FileData.Type.FILE)
                        .build()
                )
                .build()
        )
    }
}
