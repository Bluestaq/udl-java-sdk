// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scientific

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScientificQueryhelpResponseTest {

    @Test
    fun create() {
        val scientificQueryhelpResponse =
            ScientificQueryhelpResponse.builder()
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

        assertThat(scientificQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(scientificQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(scientificQueryhelpResponse.description()).contains("description")
        assertThat(scientificQueryhelpResponse.historySupported()).contains(true)
        assertThat(scientificQueryhelpResponse.name()).contains("name")
        assertThat(scientificQueryhelpResponse.parameters().getOrNull())
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
        assertThat(scientificQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(scientificQueryhelpResponse.restSupported()).contains(true)
        assertThat(scientificQueryhelpResponse.sortSupported()).contains(true)
        assertThat(scientificQueryhelpResponse.typeName()).contains("typeName")
        assertThat(scientificQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scientificQueryhelpResponse =
            ScientificQueryhelpResponse.builder()
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

        val roundtrippedScientificQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scientificQueryhelpResponse),
                jacksonTypeRef<ScientificQueryhelpResponse>(),
            )

        assertThat(roundtrippedScientificQueryhelpResponse).isEqualTo(scientificQueryhelpResponse)
    }
}
