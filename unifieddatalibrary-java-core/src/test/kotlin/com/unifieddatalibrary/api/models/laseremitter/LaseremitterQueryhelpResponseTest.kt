// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laseremitter

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaseremitterQueryhelpResponseTest {

    @Test
    fun create() {
        val laseremitterQueryhelpResponse =
            LaseremitterQueryhelpResponse.builder()
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

        assertThat(laseremitterQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(laseremitterQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(laseremitterQueryhelpResponse.description()).contains("description")
        assertThat(laseremitterQueryhelpResponse.historySupported()).contains(true)
        assertThat(laseremitterQueryhelpResponse.name()).contains("name")
        assertThat(laseremitterQueryhelpResponse.parameters().getOrNull())
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
        assertThat(laseremitterQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(laseremitterQueryhelpResponse.restSupported()).contains(true)
        assertThat(laseremitterQueryhelpResponse.sortSupported()).contains(true)
        assertThat(laseremitterQueryhelpResponse.typeName()).contains("typeName")
        assertThat(laseremitterQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val laseremitterQueryhelpResponse =
            LaseremitterQueryhelpResponse.builder()
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

        val roundtrippedLaseremitterQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(laseremitterQueryhelpResponse),
                jacksonTypeRef<LaseremitterQueryhelpResponse>(),
            )

        assertThat(roundtrippedLaseremitterQueryhelpResponse)
            .isEqualTo(laseremitterQueryhelpResponse)
    }
}
