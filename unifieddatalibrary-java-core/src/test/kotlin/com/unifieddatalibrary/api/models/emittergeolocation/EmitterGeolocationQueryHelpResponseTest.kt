// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emittergeolocation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmitterGeolocationQueryHelpResponseTest {

    @Test
    fun create() {
        val emitterGeolocationQueryHelpResponse =
            EmitterGeolocationQueryHelpResponse.builder()
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

        assertThat(emitterGeolocationQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(emitterGeolocationQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(emitterGeolocationQueryHelpResponse.description()).contains("description")
        assertThat(emitterGeolocationQueryHelpResponse.historySupported()).contains(true)
        assertThat(emitterGeolocationQueryHelpResponse.name()).contains("name")
        assertThat(emitterGeolocationQueryHelpResponse.parameters().getOrNull())
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
        assertThat(emitterGeolocationQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(emitterGeolocationQueryHelpResponse.restSupported()).contains(true)
        assertThat(emitterGeolocationQueryHelpResponse.sortSupported()).contains(true)
        assertThat(emitterGeolocationQueryHelpResponse.typeName()).contains("typeName")
        assertThat(emitterGeolocationQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emitterGeolocationQueryHelpResponse =
            EmitterGeolocationQueryHelpResponse.builder()
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

        val roundtrippedEmitterGeolocationQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emitterGeolocationQueryHelpResponse),
                jacksonTypeRef<EmitterGeolocationQueryHelpResponse>(),
            )

        assertThat(roundtrippedEmitterGeolocationQueryHelpResponse)
            .isEqualTo(emitterGeolocationQueryHelpResponse)
    }
}
