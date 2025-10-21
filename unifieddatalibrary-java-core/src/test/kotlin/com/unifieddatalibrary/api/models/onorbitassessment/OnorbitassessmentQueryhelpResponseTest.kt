// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitassessment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitassessmentQueryhelpResponseTest {

    @Test
    fun create() {
        val onorbitassessmentQueryhelpResponse =
            OnorbitassessmentQueryhelpResponse.builder()
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

        assertThat(onorbitassessmentQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(onorbitassessmentQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(onorbitassessmentQueryhelpResponse.description()).contains("description")
        assertThat(onorbitassessmentQueryhelpResponse.historySupported()).contains(true)
        assertThat(onorbitassessmentQueryhelpResponse.name()).contains("name")
        assertThat(onorbitassessmentQueryhelpResponse.parameters().getOrNull())
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
        assertThat(onorbitassessmentQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(onorbitassessmentQueryhelpResponse.restSupported()).contains(true)
        assertThat(onorbitassessmentQueryhelpResponse.sortSupported()).contains(true)
        assertThat(onorbitassessmentQueryhelpResponse.typeName()).contains("typeName")
        assertThat(onorbitassessmentQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitassessmentQueryhelpResponse =
            OnorbitassessmentQueryhelpResponse.builder()
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

        val roundtrippedOnorbitassessmentQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitassessmentQueryhelpResponse),
                jacksonTypeRef<OnorbitassessmentQueryhelpResponse>(),
            )

        assertThat(roundtrippedOnorbitassessmentQueryhelpResponse)
            .isEqualTo(onorbitassessmentQueryhelpResponse)
    }
}
