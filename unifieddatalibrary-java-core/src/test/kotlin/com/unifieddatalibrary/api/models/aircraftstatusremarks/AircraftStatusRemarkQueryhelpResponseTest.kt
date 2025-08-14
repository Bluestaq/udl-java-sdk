// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraftstatusremarks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AircraftStatusRemarkQueryhelpResponseTest {

    @Test
    fun create() {
        val aircraftStatusRemarkQueryhelpResponse =
            AircraftStatusRemarkQueryhelpResponse.builder()
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

        assertThat(aircraftStatusRemarkQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(aircraftStatusRemarkQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(aircraftStatusRemarkQueryhelpResponse.description()).contains("description")
        assertThat(aircraftStatusRemarkQueryhelpResponse.historySupported()).contains(true)
        assertThat(aircraftStatusRemarkQueryhelpResponse.name()).contains("name")
        assertThat(aircraftStatusRemarkQueryhelpResponse.parameters().getOrNull())
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
        assertThat(aircraftStatusRemarkQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(aircraftStatusRemarkQueryhelpResponse.restSupported()).contains(true)
        assertThat(aircraftStatusRemarkQueryhelpResponse.sortSupported()).contains(true)
        assertThat(aircraftStatusRemarkQueryhelpResponse.typeName()).contains("typeName")
        assertThat(aircraftStatusRemarkQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aircraftStatusRemarkQueryhelpResponse =
            AircraftStatusRemarkQueryhelpResponse.builder()
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

        val roundtrippedAircraftStatusRemarkQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aircraftStatusRemarkQueryhelpResponse),
                jacksonTypeRef<AircraftStatusRemarkQueryhelpResponse>(),
            )

        assertThat(roundtrippedAircraftStatusRemarkQueryhelpResponse)
            .isEqualTo(aircraftStatusRemarkQueryhelpResponse)
    }
}
