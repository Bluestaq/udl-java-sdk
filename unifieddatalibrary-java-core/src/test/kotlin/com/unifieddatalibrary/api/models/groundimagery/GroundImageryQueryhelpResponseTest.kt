// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.groundimagery

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroundImageryQueryhelpResponseTest {

    @Test
    fun create() {
        val groundImageryQueryhelpResponse =
            GroundImageryQueryhelpResponse.builder()
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

        assertThat(groundImageryQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(groundImageryQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(groundImageryQueryhelpResponse.description()).contains("description")
        assertThat(groundImageryQueryhelpResponse.historySupported()).contains(true)
        assertThat(groundImageryQueryhelpResponse.name()).contains("name")
        assertThat(groundImageryQueryhelpResponse.parameters().getOrNull())
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
        assertThat(groundImageryQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(groundImageryQueryhelpResponse.restSupported()).contains(true)
        assertThat(groundImageryQueryhelpResponse.sortSupported()).contains(true)
        assertThat(groundImageryQueryhelpResponse.typeName()).contains("typeName")
        assertThat(groundImageryQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groundImageryQueryhelpResponse =
            GroundImageryQueryhelpResponse.builder()
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

        val roundtrippedGroundImageryQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groundImageryQueryhelpResponse),
                jacksonTypeRef<GroundImageryQueryhelpResponse>(),
            )

        assertThat(roundtrippedGroundImageryQueryhelpResponse)
            .isEqualTo(groundImageryQueryhelpResponse)
    }
}
