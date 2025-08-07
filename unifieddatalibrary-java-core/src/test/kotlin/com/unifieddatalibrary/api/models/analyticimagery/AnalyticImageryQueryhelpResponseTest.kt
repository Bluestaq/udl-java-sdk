// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.analyticimagery

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticImageryQueryhelpResponseTest {

    @Test
    fun create() {
        val analyticImageryQueryhelpResponse =
            AnalyticImageryQueryhelpResponse.builder()
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

        assertThat(analyticImageryQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(analyticImageryQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(analyticImageryQueryhelpResponse.description()).contains("description")
        assertThat(analyticImageryQueryhelpResponse.historySupported()).contains(true)
        assertThat(analyticImageryQueryhelpResponse.name()).contains("name")
        assertThat(analyticImageryQueryhelpResponse.parameters().getOrNull())
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
        assertThat(analyticImageryQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(analyticImageryQueryhelpResponse.restSupported()).contains(true)
        assertThat(analyticImageryQueryhelpResponse.sortSupported()).contains(true)
        assertThat(analyticImageryQueryhelpResponse.typeName()).contains("typeName")
        assertThat(analyticImageryQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticImageryQueryhelpResponse =
            AnalyticImageryQueryhelpResponse.builder()
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

        val roundtrippedAnalyticImageryQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticImageryQueryhelpResponse),
                jacksonTypeRef<AnalyticImageryQueryhelpResponse>(),
            )

        assertThat(roundtrippedAnalyticImageryQueryhelpResponse)
            .isEqualTo(analyticImageryQueryhelpResponse)
    }
}
