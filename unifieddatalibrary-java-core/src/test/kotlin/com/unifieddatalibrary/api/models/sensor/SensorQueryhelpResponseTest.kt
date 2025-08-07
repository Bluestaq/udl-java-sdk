// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensor

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorQueryhelpResponseTest {

    @Test
    fun create() {
        val sensorQueryhelpResponse =
            SensorQueryhelpResponse.builder()
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

        assertThat(sensorQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(sensorQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(sensorQueryhelpResponse.description()).contains("description")
        assertThat(sensorQueryhelpResponse.historySupported()).contains(true)
        assertThat(sensorQueryhelpResponse.name()).contains("name")
        assertThat(sensorQueryhelpResponse.parameters().getOrNull())
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
        assertThat(sensorQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(sensorQueryhelpResponse.restSupported()).contains(true)
        assertThat(sensorQueryhelpResponse.sortSupported()).contains(true)
        assertThat(sensorQueryhelpResponse.typeName()).contains("typeName")
        assertThat(sensorQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorQueryhelpResponse =
            SensorQueryhelpResponse.builder()
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

        val roundtrippedSensorQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorQueryhelpResponse),
                jacksonTypeRef<SensorQueryhelpResponse>(),
            )

        assertThat(roundtrippedSensorQueryhelpResponse).isEqualTo(sensorQueryhelpResponse)
    }
}
