// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eventevolution

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventEvolutionQueryhelpResponseTest {

    @Test
    fun create() {
        val eventEvolutionQueryhelpResponse =
            EventEvolutionQueryhelpResponse.builder()
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

        assertThat(eventEvolutionQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(eventEvolutionQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(eventEvolutionQueryhelpResponse.description()).contains("description")
        assertThat(eventEvolutionQueryhelpResponse.historySupported()).contains(true)
        assertThat(eventEvolutionQueryhelpResponse.name()).contains("name")
        assertThat(eventEvolutionQueryhelpResponse.parameters().getOrNull())
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
        assertThat(eventEvolutionQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(eventEvolutionQueryhelpResponse.restSupported()).contains(true)
        assertThat(eventEvolutionQueryhelpResponse.sortSupported()).contains(true)
        assertThat(eventEvolutionQueryhelpResponse.typeName()).contains("typeName")
        assertThat(eventEvolutionQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventEvolutionQueryhelpResponse =
            EventEvolutionQueryhelpResponse.builder()
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

        val roundtrippedEventEvolutionQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventEvolutionQueryhelpResponse),
                jacksonTypeRef<EventEvolutionQueryhelpResponse>(),
            )

        assertThat(roundtrippedEventEvolutionQueryhelpResponse)
            .isEqualTo(eventEvolutionQueryhelpResponse)
    }
}
