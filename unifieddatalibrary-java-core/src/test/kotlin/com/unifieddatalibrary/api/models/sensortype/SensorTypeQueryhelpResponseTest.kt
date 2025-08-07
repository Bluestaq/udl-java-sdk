// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensortype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorTypeQueryhelpResponseTest {

    @Test
    fun create() {
        val sensorTypeQueryhelpResponse =
            SensorTypeQueryhelpResponse.builder()
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

        assertThat(sensorTypeQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(sensorTypeQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(sensorTypeQueryhelpResponse.description()).contains("description")
        assertThat(sensorTypeQueryhelpResponse.historySupported()).contains(true)
        assertThat(sensorTypeQueryhelpResponse.name()).contains("name")
        assertThat(sensorTypeQueryhelpResponse.parameters().getOrNull())
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
        assertThat(sensorTypeQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(sensorTypeQueryhelpResponse.restSupported()).contains(true)
        assertThat(sensorTypeQueryhelpResponse.sortSupported()).contains(true)
        assertThat(sensorTypeQueryhelpResponse.typeName()).contains("typeName")
        assertThat(sensorTypeQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorTypeQueryhelpResponse =
            SensorTypeQueryhelpResponse.builder()
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

        val roundtrippedSensorTypeQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorTypeQueryhelpResponse),
                jacksonTypeRef<SensorTypeQueryhelpResponse>(),
            )

        assertThat(roundtrippedSensorTypeQueryhelpResponse).isEqualTo(sensorTypeQueryhelpResponse)
    }
}
