// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airspacecontrolorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirspaceControlOrderQueryHelpResponseTest {

    @Test
    fun create() {
        val airspaceControlOrderQueryHelpResponse =
            AirspaceControlOrderQueryHelpResponse.builder()
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

        assertThat(airspaceControlOrderQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(airspaceControlOrderQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(airspaceControlOrderQueryHelpResponse.description()).contains("description")
        assertThat(airspaceControlOrderQueryHelpResponse.historySupported()).contains(true)
        assertThat(airspaceControlOrderQueryHelpResponse.name()).contains("name")
        assertThat(airspaceControlOrderQueryHelpResponse.parameters().getOrNull())
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
        assertThat(airspaceControlOrderQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(airspaceControlOrderQueryHelpResponse.restSupported()).contains(true)
        assertThat(airspaceControlOrderQueryHelpResponse.sortSupported()).contains(true)
        assertThat(airspaceControlOrderQueryHelpResponse.typeName()).contains("typeName")
        assertThat(airspaceControlOrderQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airspaceControlOrderQueryHelpResponse =
            AirspaceControlOrderQueryHelpResponse.builder()
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

        val roundtrippedAirspaceControlOrderQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airspaceControlOrderQueryHelpResponse),
                jacksonTypeRef<AirspaceControlOrderQueryHelpResponse>(),
            )

        assertThat(roundtrippedAirspaceControlOrderQueryHelpResponse)
            .isEqualTo(airspaceControlOrderQueryHelpResponse)
    }
}
