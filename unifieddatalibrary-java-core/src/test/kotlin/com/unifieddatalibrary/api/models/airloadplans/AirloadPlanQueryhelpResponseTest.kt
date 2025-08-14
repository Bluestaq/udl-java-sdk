// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airloadplans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirloadPlanQueryhelpResponseTest {

    @Test
    fun create() {
        val airloadPlanQueryhelpResponse =
            AirloadPlanQueryhelpResponse.builder()
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

        assertThat(airloadPlanQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(airloadPlanQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(airloadPlanQueryhelpResponse.description()).contains("description")
        assertThat(airloadPlanQueryhelpResponse.historySupported()).contains(true)
        assertThat(airloadPlanQueryhelpResponse.name()).contains("name")
        assertThat(airloadPlanQueryhelpResponse.parameters().getOrNull())
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
        assertThat(airloadPlanQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(airloadPlanQueryhelpResponse.restSupported()).contains(true)
        assertThat(airloadPlanQueryhelpResponse.sortSupported()).contains(true)
        assertThat(airloadPlanQueryhelpResponse.typeName()).contains("typeName")
        assertThat(airloadPlanQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airloadPlanQueryhelpResponse =
            AirloadPlanQueryhelpResponse.builder()
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

        val roundtrippedAirloadPlanQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airloadPlanQueryhelpResponse),
                jacksonTypeRef<AirloadPlanQueryhelpResponse>(),
            )

        assertThat(roundtrippedAirloadPlanQueryhelpResponse).isEqualTo(airloadPlanQueryhelpResponse)
    }
}
