// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.evac

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvacQueryHelpResponseTest {

    @Test
    fun create() {
        val evacQueryHelpResponse =
            EvacQueryHelpResponse.builder()
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

        assertThat(evacQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(evacQueryHelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(evacQueryHelpResponse.description()).contains("description")
        assertThat(evacQueryHelpResponse.historySupported()).contains(true)
        assertThat(evacQueryHelpResponse.name()).contains("name")
        assertThat(evacQueryHelpResponse.parameters().getOrNull())
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
        assertThat(evacQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(evacQueryHelpResponse.restSupported()).contains(true)
        assertThat(evacQueryHelpResponse.sortSupported()).contains(true)
        assertThat(evacQueryHelpResponse.typeName()).contains("typeName")
        assertThat(evacQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evacQueryHelpResponse =
            EvacQueryHelpResponse.builder()
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

        val roundtrippedEvacQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evacQueryHelpResponse),
                jacksonTypeRef<EvacQueryHelpResponse>(),
            )

        assertThat(roundtrippedEvacQueryHelpResponse).isEqualTo(evacQueryHelpResponse)
    }
}
