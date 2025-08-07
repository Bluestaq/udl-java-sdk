// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site.operations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationQueryHelpResponseTest {

    @Test
    fun create() {
        val operationQueryHelpResponse =
            OperationQueryHelpResponse.builder()
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

        assertThat(operationQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(operationQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(operationQueryHelpResponse.description()).contains("description")
        assertThat(operationQueryHelpResponse.historySupported()).contains(true)
        assertThat(operationQueryHelpResponse.name()).contains("name")
        assertThat(operationQueryHelpResponse.parameters().getOrNull())
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
        assertThat(operationQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(operationQueryHelpResponse.restSupported()).contains(true)
        assertThat(operationQueryHelpResponse.sortSupported()).contains(true)
        assertThat(operationQueryHelpResponse.typeName()).contains("typeName")
        assertThat(operationQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val operationQueryHelpResponse =
            OperationQueryHelpResponse.builder()
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

        val roundtrippedOperationQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(operationQueryHelpResponse),
                jacksonTypeRef<OperationQueryHelpResponse>(),
            )

        assertThat(roundtrippedOperationQueryHelpResponse).isEqualTo(operationQueryHelpResponse)
    }
}
