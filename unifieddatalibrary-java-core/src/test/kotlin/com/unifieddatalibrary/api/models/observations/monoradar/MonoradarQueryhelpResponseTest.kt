// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.monoradar

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonoradarQueryhelpResponseTest {

    @Test
    fun create() {
        val monoradarQueryhelpResponse =
            MonoradarQueryhelpResponse.builder()
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

        assertThat(monoradarQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(monoradarQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(monoradarQueryhelpResponse.description()).contains("description")
        assertThat(monoradarQueryhelpResponse.historySupported()).contains(true)
        assertThat(monoradarQueryhelpResponse.name()).contains("name")
        assertThat(monoradarQueryhelpResponse.parameters().getOrNull())
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
        assertThat(monoradarQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(monoradarQueryhelpResponse.restSupported()).contains(true)
        assertThat(monoradarQueryhelpResponse.sortSupported()).contains(true)
        assertThat(monoradarQueryhelpResponse.typeName()).contains("typeName")
        assertThat(monoradarQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monoradarQueryhelpResponse =
            MonoradarQueryhelpResponse.builder()
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

        val roundtrippedMonoradarQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monoradarQueryhelpResponse),
                jacksonTypeRef<MonoradarQueryhelpResponse>(),
            )

        assertThat(roundtrippedMonoradarQueryhelpResponse).isEqualTo(monoradarQueryhelpResponse)
    }
}
