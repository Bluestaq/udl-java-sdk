// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorobservationtype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorObservationTypeQueryhelpResponseTest {

    @Test
    fun create() {
        val sensorObservationTypeQueryhelpResponse =
            SensorObservationTypeQueryhelpResponse.builder()
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

        assertThat(sensorObservationTypeQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(sensorObservationTypeQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(sensorObservationTypeQueryhelpResponse.description()).contains("description")
        assertThat(sensorObservationTypeQueryhelpResponse.historySupported()).contains(true)
        assertThat(sensorObservationTypeQueryhelpResponse.name()).contains("name")
        assertThat(sensorObservationTypeQueryhelpResponse.parameters().getOrNull())
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
        assertThat(sensorObservationTypeQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(sensorObservationTypeQueryhelpResponse.restSupported()).contains(true)
        assertThat(sensorObservationTypeQueryhelpResponse.sortSupported()).contains(true)
        assertThat(sensorObservationTypeQueryhelpResponse.typeName()).contains("typeName")
        assertThat(sensorObservationTypeQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorObservationTypeQueryhelpResponse =
            SensorObservationTypeQueryhelpResponse.builder()
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

        val roundtrippedSensorObservationTypeQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorObservationTypeQueryhelpResponse),
                jacksonTypeRef<SensorObservationTypeQueryhelpResponse>(),
            )

        assertThat(roundtrippedSensorObservationTypeQueryhelpResponse)
            .isEqualTo(sensorObservationTypeQueryhelpResponse)
    }
}
