// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EffectRequestQueryHelpResponseTest {

    @Test
    fun create() {
        val effectRequestQueryHelpResponse =
            EffectRequestQueryHelpResponse.builder()
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

        assertThat(effectRequestQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(effectRequestQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(effectRequestQueryHelpResponse.description()).contains("description")
        assertThat(effectRequestQueryHelpResponse.historySupported()).contains(true)
        assertThat(effectRequestQueryHelpResponse.name()).contains("name")
        assertThat(effectRequestQueryHelpResponse.parameters().getOrNull())
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
        assertThat(effectRequestQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(effectRequestQueryHelpResponse.restSupported()).contains(true)
        assertThat(effectRequestQueryHelpResponse.sortSupported()).contains(true)
        assertThat(effectRequestQueryHelpResponse.typeName()).contains("typeName")
        assertThat(effectRequestQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val effectRequestQueryHelpResponse =
            EffectRequestQueryHelpResponse.builder()
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

        val roundtrippedEffectRequestQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(effectRequestQueryHelpResponse),
                jacksonTypeRef<EffectRequestQueryHelpResponse>(),
            )

        assertThat(roundtrippedEffectRequestQueryHelpResponse)
            .isEqualTo(effectRequestQueryHelpResponse)
    }
}
