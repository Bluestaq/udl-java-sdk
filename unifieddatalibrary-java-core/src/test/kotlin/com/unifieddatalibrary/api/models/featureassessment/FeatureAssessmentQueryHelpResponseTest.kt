// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureAssessmentQueryHelpResponseTest {

    @Test
    fun create() {
        val featureAssessmentQueryHelpResponse =
            FeatureAssessmentQueryHelpResponse.builder()
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

        assertThat(featureAssessmentQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(featureAssessmentQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(featureAssessmentQueryHelpResponse.description()).contains("description")
        assertThat(featureAssessmentQueryHelpResponse.historySupported()).contains(true)
        assertThat(featureAssessmentQueryHelpResponse.name()).contains("name")
        assertThat(featureAssessmentQueryHelpResponse.parameters().getOrNull())
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
        assertThat(featureAssessmentQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(featureAssessmentQueryHelpResponse.restSupported()).contains(true)
        assertThat(featureAssessmentQueryHelpResponse.sortSupported()).contains(true)
        assertThat(featureAssessmentQueryHelpResponse.typeName()).contains("typeName")
        assertThat(featureAssessmentQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val featureAssessmentQueryHelpResponse =
            FeatureAssessmentQueryHelpResponse.builder()
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

        val roundtrippedFeatureAssessmentQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(featureAssessmentQueryHelpResponse),
                jacksonTypeRef<FeatureAssessmentQueryHelpResponse>(),
            )

        assertThat(roundtrippedFeatureAssessmentQueryHelpResponse)
            .isEqualTo(featureAssessmentQueryHelpResponse)
    }
}
