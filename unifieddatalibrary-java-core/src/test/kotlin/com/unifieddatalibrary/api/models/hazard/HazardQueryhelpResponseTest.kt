// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.hazard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HazardQueryhelpResponseTest {

    @Test
    fun create() {
        val hazardQueryhelpResponse =
            HazardQueryhelpResponse.builder()
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

        assertThat(hazardQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(hazardQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(hazardQueryhelpResponse.description()).contains("description")
        assertThat(hazardQueryhelpResponse.historySupported()).contains(true)
        assertThat(hazardQueryhelpResponse.name()).contains("name")
        assertThat(hazardQueryhelpResponse.parameters().getOrNull())
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
        assertThat(hazardQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(hazardQueryhelpResponse.restSupported()).contains(true)
        assertThat(hazardQueryhelpResponse.sortSupported()).contains(true)
        assertThat(hazardQueryhelpResponse.typeName()).contains("typeName")
        assertThat(hazardQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hazardQueryhelpResponse =
            HazardQueryhelpResponse.builder()
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

        val roundtrippedHazardQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hazardQueryhelpResponse),
                jacksonTypeRef<HazardQueryhelpResponse>(),
            )

        assertThat(roundtrippedHazardQueryhelpResponse).isEqualTo(hazardQueryhelpResponse)
    }
}
