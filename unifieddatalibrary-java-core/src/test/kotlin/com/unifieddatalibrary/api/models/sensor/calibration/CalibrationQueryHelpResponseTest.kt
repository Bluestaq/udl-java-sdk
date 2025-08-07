// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensor.calibration

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalibrationQueryHelpResponseTest {

    @Test
    fun create() {
        val calibrationQueryHelpResponse =
            CalibrationQueryHelpResponse.builder()
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

        assertThat(calibrationQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(calibrationQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(calibrationQueryHelpResponse.description()).contains("description")
        assertThat(calibrationQueryHelpResponse.historySupported()).contains(true)
        assertThat(calibrationQueryHelpResponse.name()).contains("name")
        assertThat(calibrationQueryHelpResponse.parameters().getOrNull())
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
        assertThat(calibrationQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(calibrationQueryHelpResponse.restSupported()).contains(true)
        assertThat(calibrationQueryHelpResponse.sortSupported()).contains(true)
        assertThat(calibrationQueryHelpResponse.typeName()).contains("typeName")
        assertThat(calibrationQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calibrationQueryHelpResponse =
            CalibrationQueryHelpResponse.builder()
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

        val roundtrippedCalibrationQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calibrationQueryHelpResponse),
                jacksonTypeRef<CalibrationQueryHelpResponse>(),
            )

        assertThat(roundtrippedCalibrationQueryHelpResponse).isEqualTo(calibrationQueryHelpResponse)
    }
}
