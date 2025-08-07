// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.rfobservation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfObservationQueryhelpResponseTest {

    @Test
    fun create() {
        val rfObservationQueryhelpResponse =
            RfObservationQueryhelpResponse.builder()
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

        assertThat(rfObservationQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(rfObservationQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(rfObservationQueryhelpResponse.description()).contains("description")
        assertThat(rfObservationQueryhelpResponse.historySupported()).contains(true)
        assertThat(rfObservationQueryhelpResponse.name()).contains("name")
        assertThat(rfObservationQueryhelpResponse.parameters().getOrNull())
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
        assertThat(rfObservationQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(rfObservationQueryhelpResponse.restSupported()).contains(true)
        assertThat(rfObservationQueryhelpResponse.sortSupported()).contains(true)
        assertThat(rfObservationQueryhelpResponse.typeName()).contains("typeName")
        assertThat(rfObservationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfObservationQueryhelpResponse =
            RfObservationQueryhelpResponse.builder()
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

        val roundtrippedRfObservationQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfObservationQueryhelpResponse),
                jacksonTypeRef<RfObservationQueryhelpResponse>(),
            )

        assertThat(roundtrippedRfObservationQueryhelpResponse)
            .isEqualTo(rfObservationQueryhelpResponse)
    }
}
