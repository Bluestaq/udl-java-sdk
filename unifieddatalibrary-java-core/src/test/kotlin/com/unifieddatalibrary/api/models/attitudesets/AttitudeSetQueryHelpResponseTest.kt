// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.attitudesets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttitudeSetQueryHelpResponseTest {

    @Test
    fun create() {
        val attitudeSetQueryHelpResponse =
            AttitudeSetQueryHelpResponse.builder()
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

        assertThat(attitudeSetQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(attitudeSetQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(attitudeSetQueryHelpResponse.description()).contains("description")
        assertThat(attitudeSetQueryHelpResponse.historySupported()).contains(true)
        assertThat(attitudeSetQueryHelpResponse.name()).contains("name")
        assertThat(attitudeSetQueryHelpResponse.parameters().getOrNull())
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
        assertThat(attitudeSetQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(attitudeSetQueryHelpResponse.restSupported()).contains(true)
        assertThat(attitudeSetQueryHelpResponse.sortSupported()).contains(true)
        assertThat(attitudeSetQueryHelpResponse.typeName()).contains("typeName")
        assertThat(attitudeSetQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attitudeSetQueryHelpResponse =
            AttitudeSetQueryHelpResponse.builder()
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

        val roundtrippedAttitudeSetQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attitudeSetQueryHelpResponse),
                jacksonTypeRef<AttitudeSetQueryHelpResponse>(),
            )

        assertThat(roundtrippedAttitudeSetQueryHelpResponse).isEqualTo(attitudeSetQueryHelpResponse)
    }
}
