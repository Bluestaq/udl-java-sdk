// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.attitudedata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttitudeDataQueryHelpResponseTest {

    @Test
    fun create() {
        val attitudeDataQueryHelpResponse =
            AttitudeDataQueryHelpResponse.builder()
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

        assertThat(attitudeDataQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(attitudeDataQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(attitudeDataQueryHelpResponse.description()).contains("description")
        assertThat(attitudeDataQueryHelpResponse.historySupported()).contains(true)
        assertThat(attitudeDataQueryHelpResponse.name()).contains("name")
        assertThat(attitudeDataQueryHelpResponse.parameters().getOrNull())
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
        assertThat(attitudeDataQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(attitudeDataQueryHelpResponse.restSupported()).contains(true)
        assertThat(attitudeDataQueryHelpResponse.sortSupported()).contains(true)
        assertThat(attitudeDataQueryHelpResponse.typeName()).contains("typeName")
        assertThat(attitudeDataQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attitudeDataQueryHelpResponse =
            AttitudeDataQueryHelpResponse.builder()
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

        val roundtrippedAttitudeDataQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attitudeDataQueryHelpResponse),
                jacksonTypeRef<AttitudeDataQueryHelpResponse>(),
            )

        assertThat(roundtrippedAttitudeDataQueryHelpResponse)
            .isEqualTo(attitudeDataQueryHelpResponse)
    }
}
