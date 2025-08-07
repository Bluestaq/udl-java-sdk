// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemerisQueryhelpResponseTest {

    @Test
    fun create() {
        val ephemerisQueryhelpResponse =
            EphemerisQueryhelpResponse.builder()
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

        assertThat(ephemerisQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(ephemerisQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(ephemerisQueryhelpResponse.description()).contains("description")
        assertThat(ephemerisQueryhelpResponse.historySupported()).contains(true)
        assertThat(ephemerisQueryhelpResponse.name()).contains("name")
        assertThat(ephemerisQueryhelpResponse.parameters().getOrNull())
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
        assertThat(ephemerisQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(ephemerisQueryhelpResponse.restSupported()).contains(true)
        assertThat(ephemerisQueryhelpResponse.sortSupported()).contains(true)
        assertThat(ephemerisQueryhelpResponse.typeName()).contains("typeName")
        assertThat(ephemerisQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ephemerisQueryhelpResponse =
            EphemerisQueryhelpResponse.builder()
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

        val roundtrippedEphemerisQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ephemerisQueryhelpResponse),
                jacksonTypeRef<EphemerisQueryhelpResponse>(),
            )

        assertThat(roundtrippedEphemerisQueryhelpResponse).isEqualTo(ephemerisQueryhelpResponse)
    }
}
