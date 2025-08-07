// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitlistQueryhelpResponseTest {

    @Test
    fun create() {
        val onorbitlistQueryhelpResponse =
            OnorbitlistQueryhelpResponse.builder()
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

        assertThat(onorbitlistQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(onorbitlistQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(onorbitlistQueryhelpResponse.description()).contains("description")
        assertThat(onorbitlistQueryhelpResponse.historySupported()).contains(true)
        assertThat(onorbitlistQueryhelpResponse.name()).contains("name")
        assertThat(onorbitlistQueryhelpResponse.parameters().getOrNull())
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
        assertThat(onorbitlistQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(onorbitlistQueryhelpResponse.restSupported()).contains(true)
        assertThat(onorbitlistQueryhelpResponse.sortSupported()).contains(true)
        assertThat(onorbitlistQueryhelpResponse.typeName()).contains("typeName")
        assertThat(onorbitlistQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitlistQueryhelpResponse =
            OnorbitlistQueryhelpResponse.builder()
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

        val roundtrippedOnorbitlistQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitlistQueryhelpResponse),
                jacksonTypeRef<OnorbitlistQueryhelpResponse>(),
            )

        assertThat(roundtrippedOnorbitlistQueryhelpResponse).isEqualTo(onorbitlistQueryhelpResponse)
    }
}
