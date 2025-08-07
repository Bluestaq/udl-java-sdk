// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.elsets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElsetQueryhelpResponseTest {

    @Test
    fun create() {
        val elsetQueryhelpResponse =
            ElsetQueryhelpResponse.builder()
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

        assertThat(elsetQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(elsetQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(elsetQueryhelpResponse.description()).contains("description")
        assertThat(elsetQueryhelpResponse.historySupported()).contains(true)
        assertThat(elsetQueryhelpResponse.name()).contains("name")
        assertThat(elsetQueryhelpResponse.parameters().getOrNull())
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
        assertThat(elsetQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(elsetQueryhelpResponse.restSupported()).contains(true)
        assertThat(elsetQueryhelpResponse.sortSupported()).contains(true)
        assertThat(elsetQueryhelpResponse.typeName()).contains("typeName")
        assertThat(elsetQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elsetQueryhelpResponse =
            ElsetQueryhelpResponse.builder()
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

        val roundtrippedElsetQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elsetQueryhelpResponse),
                jacksonTypeRef<ElsetQueryhelpResponse>(),
            )

        assertThat(roundtrippedElsetQueryhelpResponse).isEqualTo(elsetQueryhelpResponse)
    }
}
