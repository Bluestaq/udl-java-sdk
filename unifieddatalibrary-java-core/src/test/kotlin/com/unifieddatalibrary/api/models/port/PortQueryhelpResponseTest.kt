// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.port

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortQueryhelpResponseTest {

    @Test
    fun create() {
        val portQueryhelpResponse =
            PortQueryhelpResponse.builder()
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

        assertThat(portQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(portQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(portQueryhelpResponse.description()).contains("description")
        assertThat(portQueryhelpResponse.historySupported()).contains(true)
        assertThat(portQueryhelpResponse.name()).contains("name")
        assertThat(portQueryhelpResponse.parameters().getOrNull())
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
        assertThat(portQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(portQueryhelpResponse.restSupported()).contains(true)
        assertThat(portQueryhelpResponse.sortSupported()).contains(true)
        assertThat(portQueryhelpResponse.typeName()).contains("typeName")
        assertThat(portQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portQueryhelpResponse =
            PortQueryhelpResponse.builder()
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

        val roundtrippedPortQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portQueryhelpResponse),
                jacksonTypeRef<PortQueryhelpResponse>(),
            )

        assertThat(roundtrippedPortQueryhelpResponse).isEqualTo(portQueryhelpResponse)
    }
}
