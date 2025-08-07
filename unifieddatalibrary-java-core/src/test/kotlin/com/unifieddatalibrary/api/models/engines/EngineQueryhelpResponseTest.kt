// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.engines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineQueryhelpResponseTest {

    @Test
    fun create() {
        val engineQueryhelpResponse =
            EngineQueryhelpResponse.builder()
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

        assertThat(engineQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(engineQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(engineQueryhelpResponse.description()).contains("description")
        assertThat(engineQueryhelpResponse.historySupported()).contains(true)
        assertThat(engineQueryhelpResponse.name()).contains("name")
        assertThat(engineQueryhelpResponse.parameters().getOrNull())
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
        assertThat(engineQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(engineQueryhelpResponse.restSupported()).contains(true)
        assertThat(engineQueryhelpResponse.sortSupported()).contains(true)
        assertThat(engineQueryhelpResponse.typeName()).contains("typeName")
        assertThat(engineQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val engineQueryhelpResponse =
            EngineQueryhelpResponse.builder()
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

        val roundtrippedEngineQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(engineQueryhelpResponse),
                jacksonTypeRef<EngineQueryhelpResponse>(),
            )

        assertThat(roundtrippedEngineQueryhelpResponse).isEqualTo(engineQueryhelpResponse)
    }
}
