// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.dropzone

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DropzoneQueryHelpResponseTest {

    @Test
    fun create() {
        val dropzoneQueryHelpResponse =
            DropzoneQueryHelpResponse.builder()
                .aodrSupported(true)
                .classificationMarking("classificationMarking")
                .description("description")
                .historySupported(true)
                .name("name")
                .addParameter(
                    ParamDescriptor.builder()
                        .classificationMarking("classificationMarking")
                        .derived(true)
                        .description("description")
                        .elemMatch(true)
                        .format("format")
                        .histQuerySupported(true)
                        .histTupleSupported(true)
                        .name("name")
                        .required(true)
                        .restQuerySupported(true)
                        .restTupleSupported(true)
                        .type("type")
                        .unitOfMeasure("unitOfMeasure")
                        .utcDate(true)
                        .build()
                )
                .addRequiredRole("string")
                .restSupported(true)
                .sortSupported(true)
                .typeName("typeName")
                .uri("uri")
                .build()

        assertThat(dropzoneQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(dropzoneQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(dropzoneQueryHelpResponse.description()).contains("description")
        assertThat(dropzoneQueryHelpResponse.historySupported()).contains(true)
        assertThat(dropzoneQueryHelpResponse.name()).contains("name")
        assertThat(dropzoneQueryHelpResponse.parameters().getOrNull())
            .containsExactly(
                ParamDescriptor.builder()
                    .classificationMarking("classificationMarking")
                    .derived(true)
                    .description("description")
                    .elemMatch(true)
                    .format("format")
                    .histQuerySupported(true)
                    .histTupleSupported(true)
                    .name("name")
                    .required(true)
                    .restQuerySupported(true)
                    .restTupleSupported(true)
                    .type("type")
                    .unitOfMeasure("unitOfMeasure")
                    .utcDate(true)
                    .build()
            )
        assertThat(dropzoneQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(dropzoneQueryHelpResponse.restSupported()).contains(true)
        assertThat(dropzoneQueryHelpResponse.sortSupported()).contains(true)
        assertThat(dropzoneQueryHelpResponse.typeName()).contains("typeName")
        assertThat(dropzoneQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dropzoneQueryHelpResponse =
            DropzoneQueryHelpResponse.builder()
                .aodrSupported(true)
                .classificationMarking("classificationMarking")
                .description("description")
                .historySupported(true)
                .name("name")
                .addParameter(
                    ParamDescriptor.builder()
                        .classificationMarking("classificationMarking")
                        .derived(true)
                        .description("description")
                        .elemMatch(true)
                        .format("format")
                        .histQuerySupported(true)
                        .histTupleSupported(true)
                        .name("name")
                        .required(true)
                        .restQuerySupported(true)
                        .restTupleSupported(true)
                        .type("type")
                        .unitOfMeasure("unitOfMeasure")
                        .utcDate(true)
                        .build()
                )
                .addRequiredRole("string")
                .restSupported(true)
                .sortSupported(true)
                .typeName("typeName")
                .uri("uri")
                .build()

        val roundtrippedDropzoneQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dropzoneQueryHelpResponse),
                jacksonTypeRef<DropzoneQueryHelpResponse>(),
            )

        assertThat(roundtrippedDropzoneQueryHelpResponse).isEqualTo(dropzoneQueryHelpResponse)
    }
}
