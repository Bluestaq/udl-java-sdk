// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beam

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamQueryHelpResponseTest {

    @Test
    fun create() {
        val beamQueryHelpResponse =
            BeamQueryHelpResponse.builder()
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

        assertThat(beamQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(beamQueryHelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(beamQueryHelpResponse.description()).contains("description")
        assertThat(beamQueryHelpResponse.historySupported()).contains(true)
        assertThat(beamQueryHelpResponse.name()).contains("name")
        assertThat(beamQueryHelpResponse.parameters().getOrNull())
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
        assertThat(beamQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(beamQueryHelpResponse.restSupported()).contains(true)
        assertThat(beamQueryHelpResponse.sortSupported()).contains(true)
        assertThat(beamQueryHelpResponse.typeName()).contains("typeName")
        assertThat(beamQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beamQueryHelpResponse =
            BeamQueryHelpResponse.builder()
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

        val roundtrippedBeamQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beamQueryHelpResponse),
                jacksonTypeRef<BeamQueryHelpResponse>(),
            )

        assertThat(roundtrippedBeamQueryHelpResponse).isEqualTo(beamQueryHelpResponse)
    }
}
