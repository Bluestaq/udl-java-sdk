// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.swir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwirQueryhelpResponseTest {

    @Test
    fun create() {
        val swirQueryhelpResponse =
            SwirQueryhelpResponse.builder()
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

        assertThat(swirQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(swirQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(swirQueryhelpResponse.description()).contains("description")
        assertThat(swirQueryhelpResponse.historySupported()).contains(true)
        assertThat(swirQueryhelpResponse.name()).contains("name")
        assertThat(swirQueryhelpResponse.parameters().getOrNull())
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
        assertThat(swirQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(swirQueryhelpResponse.restSupported()).contains(true)
        assertThat(swirQueryhelpResponse.sortSupported()).contains(true)
        assertThat(swirQueryhelpResponse.typeName()).contains("typeName")
        assertThat(swirQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val swirQueryhelpResponse =
            SwirQueryhelpResponse.builder()
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

        val roundtrippedSwirQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(swirQueryhelpResponse),
                jacksonTypeRef<SwirQueryhelpResponse>(),
            )

        assertThat(roundtrippedSwirQueryhelpResponse).isEqualTo(swirQueryhelpResponse)
    }
}
