// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsSupportQueryhelpResponseTest {

    @Test
    fun create() {
        val logisticsSupportQueryhelpResponse =
            LogisticsSupportQueryhelpResponse.builder()
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

        assertThat(logisticsSupportQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(logisticsSupportQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(logisticsSupportQueryhelpResponse.description()).contains("description")
        assertThat(logisticsSupportQueryhelpResponse.historySupported()).contains(true)
        assertThat(logisticsSupportQueryhelpResponse.name()).contains("name")
        assertThat(logisticsSupportQueryhelpResponse.parameters().getOrNull())
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
        assertThat(logisticsSupportQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(logisticsSupportQueryhelpResponse.restSupported()).contains(true)
        assertThat(logisticsSupportQueryhelpResponse.sortSupported()).contains(true)
        assertThat(logisticsSupportQueryhelpResponse.typeName()).contains("typeName")
        assertThat(logisticsSupportQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsSupportQueryhelpResponse =
            LogisticsSupportQueryhelpResponse.builder()
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

        val roundtrippedLogisticsSupportQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsSupportQueryhelpResponse),
                jacksonTypeRef<LogisticsSupportQueryhelpResponse>(),
            )

        assertThat(roundtrippedLogisticsSupportQueryhelpResponse)
            .isEqualTo(logisticsSupportQueryhelpResponse)
    }
}
