// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.operatingunit

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperatingunitQueryhelpResponseTest {

    @Test
    fun create() {
        val operatingunitQueryhelpResponse =
            OperatingunitQueryhelpResponse.builder()
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

        assertThat(operatingunitQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(operatingunitQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(operatingunitQueryhelpResponse.description()).contains("description")
        assertThat(operatingunitQueryhelpResponse.historySupported()).contains(true)
        assertThat(operatingunitQueryhelpResponse.name()).contains("name")
        assertThat(operatingunitQueryhelpResponse.parameters().getOrNull())
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
        assertThat(operatingunitQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(operatingunitQueryhelpResponse.restSupported()).contains(true)
        assertThat(operatingunitQueryhelpResponse.sortSupported()).contains(true)
        assertThat(operatingunitQueryhelpResponse.typeName()).contains("typeName")
        assertThat(operatingunitQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val operatingunitQueryhelpResponse =
            OperatingunitQueryhelpResponse.builder()
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

        val roundtrippedOperatingunitQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(operatingunitQueryhelpResponse),
                jacksonTypeRef<OperatingunitQueryhelpResponse>(),
            )

        assertThat(roundtrippedOperatingunitQueryhelpResponse)
            .isEqualTo(operatingunitQueryhelpResponse)
    }
}
