// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.FileData
import com.unifieddatalibrary.api.models.scs.file.FileListParams
import com.unifieddatalibrary.api.models.scs.file.FileRetrieveParams
import com.unifieddatalibrary.api.models.scs.file.FileUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val fileServiceAsync = client.scs().file()

        val fileDataFuture =
            fileServiceAsync.retrieve(
                FileRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
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
        val fileServiceAsync = client.scs().file()

        val future =
            fileServiceAsync.update(
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
                                    .metaInfo("metaInfo")
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
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val fileServiceAsync = client.scs().file()

        val pageFuture = fileServiceAsync.list(FileListParams.builder().path("path").build())

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
