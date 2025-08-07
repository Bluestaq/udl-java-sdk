// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararray

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolarArrayQueryhelpResponseTest {

    @Test
    fun create() {
        val solarArrayQueryhelpResponse =
            SolarArrayQueryhelpResponse.builder()
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

        assertThat(solarArrayQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(solarArrayQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(solarArrayQueryhelpResponse.description()).contains("description")
        assertThat(solarArrayQueryhelpResponse.historySupported()).contains(true)
        assertThat(solarArrayQueryhelpResponse.name()).contains("name")
        assertThat(solarArrayQueryhelpResponse.parameters().getOrNull())
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
        assertThat(solarArrayQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(solarArrayQueryhelpResponse.restSupported()).contains(true)
        assertThat(solarArrayQueryhelpResponse.sortSupported()).contains(true)
        assertThat(solarArrayQueryhelpResponse.typeName()).contains("typeName")
        assertThat(solarArrayQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val solarArrayQueryhelpResponse =
            SolarArrayQueryhelpResponse.builder()
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

        val roundtrippedSolarArrayQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(solarArrayQueryhelpResponse),
                jacksonTypeRef<SolarArrayQueryhelpResponse>(),
            )

        assertThat(roundtrippedSolarArrayQueryhelpResponse).isEqualTo(solarArrayQueryhelpResponse)
    }
}
