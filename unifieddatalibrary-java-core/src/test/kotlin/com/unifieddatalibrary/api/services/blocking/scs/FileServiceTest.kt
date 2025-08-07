// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.file.FileListParams
import com.unifieddatalibrary.api.models.scs.file.FileRetrieveParams
import com.unifieddatalibrary.api.models.scs.file.FileUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val fileService = client.scs().file()

        val fileData =
            fileService.retrieve(
                FileRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
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
        val fileService = client.scs().file()

        fileService.update(
            FileUpdateParams.builder()
                .addFileDataList(
                    FileData.builder()
                        .id("/example/folder/example_file.txt")
                        .attributes(
                            FileData.Attributes.builder()
                                .id("id")
                                .classification("U")
                                .classificationMarking("classificationMarking")
                                .createdBy("createdBy")
                                .createdDate("createdDate")
                                .deleteOn(0L)
                                .description("A new Example description")
                                .docTitle("docTitle")
                                .docType("docType")
                                .addDoi("string")
                                .ellipseLat(0.0f)
                                .ellipseLon(0.0f)
                                .fileName("fileName")
                                .intrinsicTitle("intrinsicTitle")
                                .keywords("keywords")
                                .mediaTitle("mediaTitle")
                                .metaInfo("A new Example metaInfo")
                                .milgrid("milgrid")
                                .milgridLat(0.0f)
                                .milgridLon(0.0f)
                                .modifiedBy("modifiedBy")
                                .modifiedDate("modifiedDate")
                                .name("name")
                                .path("path")
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

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val fileService = client.scs().file()

        val page = fileService.list(FileListParams.builder().path("path").build())

        page.items().forEach { it.validate() }
    }
}
