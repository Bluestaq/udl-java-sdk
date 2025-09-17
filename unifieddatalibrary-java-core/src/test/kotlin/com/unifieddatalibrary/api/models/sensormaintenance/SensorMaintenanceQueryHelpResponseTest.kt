// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorMaintenanceQueryHelpResponseTest {

    @Test
    fun create() {
        val sensorMaintenanceQueryHelpResponse =
            SensorMaintenanceQueryHelpResponse.builder()
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

        assertThat(sensorMaintenanceQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(sensorMaintenanceQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(sensorMaintenanceQueryHelpResponse.description()).contains("description")
        assertThat(sensorMaintenanceQueryHelpResponse.historySupported()).contains(true)
        assertThat(sensorMaintenanceQueryHelpResponse.name()).contains("name")
        assertThat(sensorMaintenanceQueryHelpResponse.parameters().getOrNull())
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
        assertThat(sensorMaintenanceQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(sensorMaintenanceQueryHelpResponse.restSupported()).contains(true)
        assertThat(sensorMaintenanceQueryHelpResponse.sortSupported()).contains(true)
        assertThat(sensorMaintenanceQueryHelpResponse.typeName()).contains("typeName")
        assertThat(sensorMaintenanceQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorMaintenanceQueryHelpResponse =
            SensorMaintenanceQueryHelpResponse.builder()
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

        val roundtrippedSensorMaintenanceQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorMaintenanceQueryHelpResponse),
                jacksonTypeRef<SensorMaintenanceQueryHelpResponse>(),
            )

        assertThat(roundtrippedSensorMaintenanceQueryHelpResponse)
            .isEqualTo(sensorMaintenanceQueryHelpResponse)
    }
}
