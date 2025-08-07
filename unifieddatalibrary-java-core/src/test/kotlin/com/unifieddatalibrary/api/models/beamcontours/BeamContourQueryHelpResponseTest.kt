// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beamcontours

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamContourQueryHelpResponseTest {

    @Test
    fun create() {
        val beamContourQueryHelpResponse =
            BeamContourQueryHelpResponse.builder()
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

        assertThat(beamContourQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(beamContourQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(beamContourQueryHelpResponse.description()).contains("description")
        assertThat(beamContourQueryHelpResponse.historySupported()).contains(true)
        assertThat(beamContourQueryHelpResponse.name()).contains("name")
        assertThat(beamContourQueryHelpResponse.parameters().getOrNull())
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
        assertThat(beamContourQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(beamContourQueryHelpResponse.restSupported()).contains(true)
        assertThat(beamContourQueryHelpResponse.sortSupported()).contains(true)
        assertThat(beamContourQueryHelpResponse.typeName()).contains("typeName")
        assertThat(beamContourQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beamContourQueryHelpResponse =
            BeamContourQueryHelpResponse.builder()
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

        val roundtrippedBeamContourQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beamContourQueryHelpResponse),
                jacksonTypeRef<BeamContourQueryHelpResponse>(),
            )

        assertThat(roundtrippedBeamContourQueryHelpResponse).isEqualTo(beamContourQueryHelpResponse)
    }
}
