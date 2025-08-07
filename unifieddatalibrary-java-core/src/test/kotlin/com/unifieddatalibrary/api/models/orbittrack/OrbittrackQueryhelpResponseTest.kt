// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.orbittrack

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrbittrackQueryhelpResponseTest {

    @Test
    fun create() {
        val orbittrackQueryhelpResponse =
            OrbittrackQueryhelpResponse.builder()
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

        assertThat(orbittrackQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(orbittrackQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(orbittrackQueryhelpResponse.description()).contains("description")
        assertThat(orbittrackQueryhelpResponse.historySupported()).contains(true)
        assertThat(orbittrackQueryhelpResponse.name()).contains("name")
        assertThat(orbittrackQueryhelpResponse.parameters().getOrNull())
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
        assertThat(orbittrackQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(orbittrackQueryhelpResponse.restSupported()).contains(true)
        assertThat(orbittrackQueryhelpResponse.sortSupported()).contains(true)
        assertThat(orbittrackQueryhelpResponse.typeName()).contains("typeName")
        assertThat(orbittrackQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orbittrackQueryhelpResponse =
            OrbittrackQueryhelpResponse.builder()
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

        val roundtrippedOrbittrackQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orbittrackQueryhelpResponse),
                jacksonTypeRef<OrbittrackQueryhelpResponse>(),
            )

        assertThat(roundtrippedOrbittrackQueryhelpResponse).isEqualTo(orbittrackQueryhelpResponse)
    }
}
