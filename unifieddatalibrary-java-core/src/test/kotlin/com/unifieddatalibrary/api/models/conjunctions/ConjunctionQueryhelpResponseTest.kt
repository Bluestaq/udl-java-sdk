// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.conjunctions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConjunctionQueryhelpResponseTest {

    @Test
    fun create() {
        val conjunctionQueryhelpResponse =
            ConjunctionQueryhelpResponse.builder()
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

        assertThat(conjunctionQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(conjunctionQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(conjunctionQueryhelpResponse.description()).contains("description")
        assertThat(conjunctionQueryhelpResponse.historySupported()).contains(true)
        assertThat(conjunctionQueryhelpResponse.name()).contains("name")
        assertThat(conjunctionQueryhelpResponse.parameters().getOrNull())
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
        assertThat(conjunctionQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(conjunctionQueryhelpResponse.restSupported()).contains(true)
        assertThat(conjunctionQueryhelpResponse.sortSupported()).contains(true)
        assertThat(conjunctionQueryhelpResponse.typeName()).contains("typeName")
        assertThat(conjunctionQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conjunctionQueryhelpResponse =
            ConjunctionQueryhelpResponse.builder()
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

        val roundtrippedConjunctionQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conjunctionQueryhelpResponse),
                jacksonTypeRef<ConjunctionQueryhelpResponse>(),
            )

        assertThat(roundtrippedConjunctionQueryhelpResponse).isEqualTo(conjunctionQueryhelpResponse)
    }
}
