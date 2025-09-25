// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObscorrelationQueryHelpResponseTest {

    @Test
    fun create() {
        val obscorrelationQueryHelpResponse =
            ObscorrelationQueryHelpResponse.builder()
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

        assertThat(obscorrelationQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(obscorrelationQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(obscorrelationQueryHelpResponse.description()).contains("description")
        assertThat(obscorrelationQueryHelpResponse.historySupported()).contains(true)
        assertThat(obscorrelationQueryHelpResponse.name()).contains("name")
        assertThat(obscorrelationQueryHelpResponse.parameters().getOrNull())
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
        assertThat(obscorrelationQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(obscorrelationQueryHelpResponse.restSupported()).contains(true)
        assertThat(obscorrelationQueryHelpResponse.sortSupported()).contains(true)
        assertThat(obscorrelationQueryHelpResponse.typeName()).contains("typeName")
        assertThat(obscorrelationQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val obscorrelationQueryHelpResponse =
            ObscorrelationQueryHelpResponse.builder()
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

        val roundtrippedObscorrelationQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(obscorrelationQueryHelpResponse),
                jacksonTypeRef<ObscorrelationQueryHelpResponse>(),
            )

        assertThat(roundtrippedObscorrelationQueryHelpResponse)
            .isEqualTo(obscorrelationQueryHelpResponse)
    }
}
