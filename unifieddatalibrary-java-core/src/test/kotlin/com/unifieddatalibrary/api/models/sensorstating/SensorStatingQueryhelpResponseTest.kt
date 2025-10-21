// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorstating

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorStatingQueryhelpResponseTest {

    @Test
    fun create() {
        val sensorStatingQueryhelpResponse =
            SensorStatingQueryhelpResponse.builder()
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

        assertThat(sensorStatingQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(sensorStatingQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(sensorStatingQueryhelpResponse.description()).contains("description")
        assertThat(sensorStatingQueryhelpResponse.historySupported()).contains(true)
        assertThat(sensorStatingQueryhelpResponse.name()).contains("name")
        assertThat(sensorStatingQueryhelpResponse.parameters().getOrNull())
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
        assertThat(sensorStatingQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(sensorStatingQueryhelpResponse.restSupported()).contains(true)
        assertThat(sensorStatingQueryhelpResponse.sortSupported()).contains(true)
        assertThat(sensorStatingQueryhelpResponse.typeName()).contains("typeName")
        assertThat(sensorStatingQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorStatingQueryhelpResponse =
            SensorStatingQueryhelpResponse.builder()
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

        val roundtrippedSensorStatingQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorStatingQueryhelpResponse),
                jacksonTypeRef<SensorStatingQueryhelpResponse>(),
            )

        assertThat(roundtrippedSensorStatingQueryhelpResponse)
            .isEqualTo(sensorStatingQueryhelpResponse)
    }
}
