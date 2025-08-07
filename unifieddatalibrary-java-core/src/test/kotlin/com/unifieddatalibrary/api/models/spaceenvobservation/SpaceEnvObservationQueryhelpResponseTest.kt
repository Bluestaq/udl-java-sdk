// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.spaceenvobservation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpaceEnvObservationQueryhelpResponseTest {

    @Test
    fun create() {
        val spaceEnvObservationQueryhelpResponse =
            SpaceEnvObservationQueryhelpResponse.builder()
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

        assertThat(spaceEnvObservationQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(spaceEnvObservationQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(spaceEnvObservationQueryhelpResponse.description()).contains("description")
        assertThat(spaceEnvObservationQueryhelpResponse.historySupported()).contains(true)
        assertThat(spaceEnvObservationQueryhelpResponse.name()).contains("name")
        assertThat(spaceEnvObservationQueryhelpResponse.parameters().getOrNull())
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
        assertThat(spaceEnvObservationQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(spaceEnvObservationQueryhelpResponse.restSupported()).contains(true)
        assertThat(spaceEnvObservationQueryhelpResponse.sortSupported()).contains(true)
        assertThat(spaceEnvObservationQueryhelpResponse.typeName()).contains("typeName")
        assertThat(spaceEnvObservationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spaceEnvObservationQueryhelpResponse =
            SpaceEnvObservationQueryhelpResponse.builder()
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

        val roundtrippedSpaceEnvObservationQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spaceEnvObservationQueryhelpResponse),
                jacksonTypeRef<SpaceEnvObservationQueryhelpResponse>(),
            )

        assertThat(roundtrippedSpaceEnvObservationQueryhelpResponse)
            .isEqualTo(spaceEnvObservationQueryhelpResponse)
    }
}
