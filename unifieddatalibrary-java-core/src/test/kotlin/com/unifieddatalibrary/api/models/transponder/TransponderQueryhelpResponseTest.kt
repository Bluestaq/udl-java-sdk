// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.transponder

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransponderQueryhelpResponseTest {

    @Test
    fun create() {
        val transponderQueryhelpResponse =
            TransponderQueryhelpResponse.builder()
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

        assertThat(transponderQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(transponderQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(transponderQueryhelpResponse.description()).contains("description")
        assertThat(transponderQueryhelpResponse.historySupported()).contains(true)
        assertThat(transponderQueryhelpResponse.name()).contains("name")
        assertThat(transponderQueryhelpResponse.parameters().getOrNull())
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
        assertThat(transponderQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(transponderQueryhelpResponse.restSupported()).contains(true)
        assertThat(transponderQueryhelpResponse.sortSupported()).contains(true)
        assertThat(transponderQueryhelpResponse.typeName()).contains("typeName")
        assertThat(transponderQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transponderQueryhelpResponse =
            TransponderQueryhelpResponse.builder()
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

        val roundtrippedTransponderQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transponderQueryhelpResponse),
                jacksonTypeRef<TransponderQueryhelpResponse>(),
            )

        assertThat(roundtrippedTransponderQueryhelpResponse).isEqualTo(transponderQueryhelpResponse)
    }
}
