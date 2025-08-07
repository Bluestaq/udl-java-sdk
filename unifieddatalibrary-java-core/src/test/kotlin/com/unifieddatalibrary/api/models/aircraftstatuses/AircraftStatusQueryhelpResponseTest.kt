// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraftstatuses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AircraftStatusQueryhelpResponseTest {

    @Test
    fun create() {
        val aircraftStatusQueryhelpResponse =
            AircraftStatusQueryhelpResponse.builder()
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

        assertThat(aircraftStatusQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(aircraftStatusQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(aircraftStatusQueryhelpResponse.description()).contains("description")
        assertThat(aircraftStatusQueryhelpResponse.historySupported()).contains(true)
        assertThat(aircraftStatusQueryhelpResponse.name()).contains("name")
        assertThat(aircraftStatusQueryhelpResponse.parameters().getOrNull())
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
        assertThat(aircraftStatusQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(aircraftStatusQueryhelpResponse.restSupported()).contains(true)
        assertThat(aircraftStatusQueryhelpResponse.sortSupported()).contains(true)
        assertThat(aircraftStatusQueryhelpResponse.typeName()).contains("typeName")
        assertThat(aircraftStatusQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aircraftStatusQueryhelpResponse =
            AircraftStatusQueryhelpResponse.builder()
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

        val roundtrippedAircraftStatusQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aircraftStatusQueryhelpResponse),
                jacksonTypeRef<AircraftStatusQueryhelpResponse>(),
            )

        assertThat(roundtrippedAircraftStatusQueryhelpResponse)
            .isEqualTo(aircraftStatusQueryhelpResponse)
    }
}
