// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.statevector

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StateVectorQueryhelpResponseTest {

    @Test
    fun create() {
        val stateVectorQueryhelpResponse =
            StateVectorQueryhelpResponse.builder()
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

        assertThat(stateVectorQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(stateVectorQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(stateVectorQueryhelpResponse.description()).contains("description")
        assertThat(stateVectorQueryhelpResponse.historySupported()).contains(true)
        assertThat(stateVectorQueryhelpResponse.name()).contains("name")
        assertThat(stateVectorQueryhelpResponse.parameters().getOrNull())
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
        assertThat(stateVectorQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(stateVectorQueryhelpResponse.restSupported()).contains(true)
        assertThat(stateVectorQueryhelpResponse.sortSupported()).contains(true)
        assertThat(stateVectorQueryhelpResponse.typeName()).contains("typeName")
        assertThat(stateVectorQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stateVectorQueryhelpResponse =
            StateVectorQueryhelpResponse.builder()
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

        val roundtrippedStateVectorQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stateVectorQueryhelpResponse),
                jacksonTypeRef<StateVectorQueryhelpResponse>(),
            )

        assertThat(roundtrippedStateVectorQueryhelpResponse).isEqualTo(stateVectorQueryhelpResponse)
    }
}
