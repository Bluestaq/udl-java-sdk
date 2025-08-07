// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemerissets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemerisSetQueryhelpResponseTest {

    @Test
    fun create() {
        val ephemerisSetQueryhelpResponse =
            EphemerisSetQueryhelpResponse.builder()
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

        assertThat(ephemerisSetQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(ephemerisSetQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(ephemerisSetQueryhelpResponse.description()).contains("description")
        assertThat(ephemerisSetQueryhelpResponse.historySupported()).contains(true)
        assertThat(ephemerisSetQueryhelpResponse.name()).contains("name")
        assertThat(ephemerisSetQueryhelpResponse.parameters().getOrNull())
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
        assertThat(ephemerisSetQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(ephemerisSetQueryhelpResponse.restSupported()).contains(true)
        assertThat(ephemerisSetQueryhelpResponse.sortSupported()).contains(true)
        assertThat(ephemerisSetQueryhelpResponse.typeName()).contains("typeName")
        assertThat(ephemerisSetQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ephemerisSetQueryhelpResponse =
            EphemerisSetQueryhelpResponse.builder()
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

        val roundtrippedEphemerisSetQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ephemerisSetQueryhelpResponse),
                jacksonTypeRef<EphemerisSetQueryhelpResponse>(),
            )

        assertThat(roundtrippedEphemerisSetQueryhelpResponse)
            .isEqualTo(ephemerisSetQueryhelpResponse)
    }
}
