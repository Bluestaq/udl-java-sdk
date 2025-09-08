// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.folders

import com.unifieddatalibrary.api.models.FileData
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderUpdateParamsTest {

    @Test
    fun create() {
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
            .build()
    }

    @Test
    fun body() {
        val params =
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FolderUpdateParams.builder().fileData(FileData.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(FileData.builder().build())
    }
}
