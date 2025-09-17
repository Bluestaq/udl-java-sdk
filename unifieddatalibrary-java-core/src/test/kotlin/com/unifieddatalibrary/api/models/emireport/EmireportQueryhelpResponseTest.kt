// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emireport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmireportQueryhelpResponseTest {

    @Test
    fun create() {
        val emireportQueryhelpResponse =
            EmireportQueryhelpResponse.builder()
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

        assertThat(emireportQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(emireportQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(emireportQueryhelpResponse.description()).contains("description")
        assertThat(emireportQueryhelpResponse.historySupported()).contains(true)
        assertThat(emireportQueryhelpResponse.name()).contains("name")
        assertThat(emireportQueryhelpResponse.parameters().getOrNull())
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
        assertThat(emireportQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(emireportQueryhelpResponse.restSupported()).contains(true)
        assertThat(emireportQueryhelpResponse.sortSupported()).contains(true)
        assertThat(emireportQueryhelpResponse.typeName()).contains("typeName")
        assertThat(emireportQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emireportQueryhelpResponse =
            EmireportQueryhelpResponse.builder()
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

        val roundtrippedEmireportQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emireportQueryhelpResponse),
                jacksonTypeRef<EmireportQueryhelpResponse>(),
            )

        assertThat(roundtrippedEmireportQueryhelpResponse).isEqualTo(emireportQueryhelpResponse)
    }
}
