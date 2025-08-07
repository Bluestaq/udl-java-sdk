// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.orbitdetermination

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrbitdeterminationQueryhelpResponseTest {

    @Test
    fun create() {
        val orbitdeterminationQueryhelpResponse =
            OrbitdeterminationQueryhelpResponse.builder()
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

        assertThat(orbitdeterminationQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(orbitdeterminationQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(orbitdeterminationQueryhelpResponse.description()).contains("description")
        assertThat(orbitdeterminationQueryhelpResponse.historySupported()).contains(true)
        assertThat(orbitdeterminationQueryhelpResponse.name()).contains("name")
        assertThat(orbitdeterminationQueryhelpResponse.parameters().getOrNull())
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
        assertThat(orbitdeterminationQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(orbitdeterminationQueryhelpResponse.restSupported()).contains(true)
        assertThat(orbitdeterminationQueryhelpResponse.sortSupported()).contains(true)
        assertThat(orbitdeterminationQueryhelpResponse.typeName()).contains("typeName")
        assertThat(orbitdeterminationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orbitdeterminationQueryhelpResponse =
            OrbitdeterminationQueryhelpResponse.builder()
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

        val roundtrippedOrbitdeterminationQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orbitdeterminationQueryhelpResponse),
                jacksonTypeRef<OrbitdeterminationQueryhelpResponse>(),
            )

        assertThat(roundtrippedOrbitdeterminationQueryhelpResponse)
            .isEqualTo(orbitdeterminationQueryhelpResponse)
    }
}
