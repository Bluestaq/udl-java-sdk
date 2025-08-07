// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.elsets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElsetQueryCurrentElsetHelpResponseTest {

    @Test
    fun create() {
        val elsetQueryCurrentElsetHelpResponse =
            ElsetQueryCurrentElsetHelpResponse.builder()
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

        assertThat(elsetQueryCurrentElsetHelpResponse.aodrSupported()).contains(true)
        assertThat(elsetQueryCurrentElsetHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(elsetQueryCurrentElsetHelpResponse.description()).contains("description")
        assertThat(elsetQueryCurrentElsetHelpResponse.historySupported()).contains(true)
        assertThat(elsetQueryCurrentElsetHelpResponse.name()).contains("name")
        assertThat(elsetQueryCurrentElsetHelpResponse.parameters().getOrNull())
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
        assertThat(elsetQueryCurrentElsetHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(elsetQueryCurrentElsetHelpResponse.restSupported()).contains(true)
        assertThat(elsetQueryCurrentElsetHelpResponse.sortSupported()).contains(true)
        assertThat(elsetQueryCurrentElsetHelpResponse.typeName()).contains("typeName")
        assertThat(elsetQueryCurrentElsetHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elsetQueryCurrentElsetHelpResponse =
            ElsetQueryCurrentElsetHelpResponse.builder()
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

        val roundtrippedElsetQueryCurrentElsetHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elsetQueryCurrentElsetHelpResponse),
                jacksonTypeRef<ElsetQueryCurrentElsetHelpResponse>(),
            )

        assertThat(roundtrippedElsetQueryCurrentElsetHelpResponse)
            .isEqualTo(elsetQueryCurrentElsetHelpResponse)
    }
}
