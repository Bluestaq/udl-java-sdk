// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileDataTest {

    @Test
    fun create() {
        val fileData =
            FileData.builder()
                .id("id")
                .attributes(
                    FileData.Attributes.builder()
                        .id("id")
                        .classification("classification")
                        .classificationMarking("classificationMarking")
                        .createdBy("createdBy")
                        .createdDate("createdDate")
                        .deleteOn(0L)
                        .description("description")
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
                        .addTag("string")
                        .write("write")
                        .build()
                )
                .targetName("targetName")
                .targetPath("targetPath")
                .type(FileData.Type.FILE)
                .build()

        assertThat(fileData.id()).contains("id")
        assertThat(fileData.attributes())
            .contains(
                FileData.Attributes.builder()
                    .id("id")
                    .classification("classification")
                    .classificationMarking("classificationMarking")
                    .createdBy("createdBy")
                    .createdDate("createdDate")
                    .deleteOn(0L)
                    .description("description")
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
                    .addTag("string")
                    .write("write")
                    .build()
            )
        assertThat(fileData.targetName()).contains("targetName")
        assertThat(fileData.targetPath()).contains("targetPath")
        assertThat(fileData.type()).contains(FileData.Type.FILE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileData =
            FileData.builder()
                .id("id")
                .attributes(
                    FileData.Attributes.builder()
                        .id("id")
                        .classification("classification")
                        .classificationMarking("classificationMarking")
                        .createdBy("createdBy")
                        .createdDate("createdDate")
                        .deleteOn(0L)
                        .description("description")
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
                        .addTag("string")
                        .write("write")
                        .build()
                )
                .targetName("targetName")
                .targetPath("targetPath")
                .type(FileData.Type.FILE)
                .build()

        val roundtrippedFileData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileData),
                jacksonTypeRef<FileData>(),
            )

        assertThat(roundtrippedFileData).isEqualTo(fileData)
    }
}
