// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.eoobservations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EoObservationQueryhelpResponseTest {

    @Test
    fun create() {
        val eoObservationQueryhelpResponse =
            EoObservationQueryhelpResponse.builder()
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

        assertThat(eoObservationQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(eoObservationQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(eoObservationQueryhelpResponse.description()).contains("description")
        assertThat(eoObservationQueryhelpResponse.historySupported()).contains(true)
        assertThat(eoObservationQueryhelpResponse.name()).contains("name")
        assertThat(eoObservationQueryhelpResponse.parameters().getOrNull())
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
        assertThat(eoObservationQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(eoObservationQueryhelpResponse.restSupported()).contains(true)
        assertThat(eoObservationQueryhelpResponse.sortSupported()).contains(true)
        assertThat(eoObservationQueryhelpResponse.typeName()).contains("typeName")
        assertThat(eoObservationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eoObservationQueryhelpResponse =
            EoObservationQueryhelpResponse.builder()
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

        val roundtrippedEoObservationQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eoObservationQueryhelpResponse),
                jacksonTypeRef<EoObservationQueryhelpResponse>(),
            )

        assertThat(roundtrippedEoObservationQueryhelpResponse)
            .isEqualTo(eoObservationQueryhelpResponse)
    }
}
