// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airloadplans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirLoadPlanQueryhelpResponseTest {

    @Test
    fun create() {
        val airLoadPlanQueryhelpResponse =
            AirLoadPlanQueryhelpResponse.builder()
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

        assertThat(airLoadPlanQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(airLoadPlanQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(airLoadPlanQueryhelpResponse.description()).contains("description")
        assertThat(airLoadPlanQueryhelpResponse.historySupported()).contains(true)
        assertThat(airLoadPlanQueryhelpResponse.name()).contains("name")
        assertThat(airLoadPlanQueryhelpResponse.parameters().getOrNull())
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
        assertThat(airLoadPlanQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(airLoadPlanQueryhelpResponse.restSupported()).contains(true)
        assertThat(airLoadPlanQueryhelpResponse.sortSupported()).contains(true)
        assertThat(airLoadPlanQueryhelpResponse.typeName()).contains("typeName")
        assertThat(airLoadPlanQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airLoadPlanQueryhelpResponse =
            AirLoadPlanQueryhelpResponse.builder()
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

        val roundtrippedAirLoadPlanQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airLoadPlanQueryhelpResponse),
                jacksonTypeRef<AirLoadPlanQueryhelpResponse>(),
            )

        assertThat(roundtrippedAirLoadPlanQueryhelpResponse).isEqualTo(airLoadPlanQueryhelpResponse)
    }
}
