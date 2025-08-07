// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.passiveradarobservation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PassiveRadarObservationQueryhelpResponseTest {

    @Test
    fun create() {
        val passiveRadarObservationQueryhelpResponse =
            PassiveRadarObservationQueryhelpResponse.builder()
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

        assertThat(passiveRadarObservationQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(passiveRadarObservationQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(passiveRadarObservationQueryhelpResponse.description()).contains("description")
        assertThat(passiveRadarObservationQueryhelpResponse.historySupported()).contains(true)
        assertThat(passiveRadarObservationQueryhelpResponse.name()).contains("name")
        assertThat(passiveRadarObservationQueryhelpResponse.parameters().getOrNull())
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
        assertThat(passiveRadarObservationQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(passiveRadarObservationQueryhelpResponse.restSupported()).contains(true)
        assertThat(passiveRadarObservationQueryhelpResponse.sortSupported()).contains(true)
        assertThat(passiveRadarObservationQueryhelpResponse.typeName()).contains("typeName")
        assertThat(passiveRadarObservationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val passiveRadarObservationQueryhelpResponse =
            PassiveRadarObservationQueryhelpResponse.builder()
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

        val roundtrippedPassiveRadarObservationQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passiveRadarObservationQueryhelpResponse),
                jacksonTypeRef<PassiveRadarObservationQueryhelpResponse>(),
            )

        assertThat(roundtrippedPassiveRadarObservationQueryhelpResponse)
            .isEqualTo(passiveRadarObservationQueryhelpResponse)
    }
}
