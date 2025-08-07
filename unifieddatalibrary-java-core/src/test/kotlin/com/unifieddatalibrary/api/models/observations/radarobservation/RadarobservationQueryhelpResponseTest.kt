// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.radarobservation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RadarobservationQueryhelpResponseTest {

    @Test
    fun create() {
        val radarobservationQueryhelpResponse =
            RadarobservationQueryhelpResponse.builder()
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

        assertThat(radarobservationQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(radarobservationQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(radarobservationQueryhelpResponse.description()).contains("description")
        assertThat(radarobservationQueryhelpResponse.historySupported()).contains(true)
        assertThat(radarobservationQueryhelpResponse.name()).contains("name")
        assertThat(radarobservationQueryhelpResponse.parameters().getOrNull())
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
        assertThat(radarobservationQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(radarobservationQueryhelpResponse.restSupported()).contains(true)
        assertThat(radarobservationQueryhelpResponse.sortSupported()).contains(true)
        assertThat(radarobservationQueryhelpResponse.typeName()).contains("typeName")
        assertThat(radarobservationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val radarobservationQueryhelpResponse =
            RadarobservationQueryhelpResponse.builder()
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

        val roundtrippedRadarobservationQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(radarobservationQueryhelpResponse),
                jacksonTypeRef<RadarobservationQueryhelpResponse>(),
            )

        assertThat(roundtrippedRadarobservationQueryhelpResponse)
            .isEqualTo(radarobservationQueryhelpResponse)
    }
}
