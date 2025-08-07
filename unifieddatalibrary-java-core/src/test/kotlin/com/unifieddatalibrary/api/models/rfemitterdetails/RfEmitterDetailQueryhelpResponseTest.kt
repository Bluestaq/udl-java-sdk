// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitterdetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfEmitterDetailQueryhelpResponseTest {

    @Test
    fun create() {
        val rfEmitterDetailQueryhelpResponse =
            RfEmitterDetailQueryhelpResponse.builder()
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

        assertThat(rfEmitterDetailQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(rfEmitterDetailQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(rfEmitterDetailQueryhelpResponse.description()).contains("description")
        assertThat(rfEmitterDetailQueryhelpResponse.historySupported()).contains(true)
        assertThat(rfEmitterDetailQueryhelpResponse.name()).contains("name")
        assertThat(rfEmitterDetailQueryhelpResponse.parameters().getOrNull())
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
        assertThat(rfEmitterDetailQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(rfEmitterDetailQueryhelpResponse.restSupported()).contains(true)
        assertThat(rfEmitterDetailQueryhelpResponse.sortSupported()).contains(true)
        assertThat(rfEmitterDetailQueryhelpResponse.typeName()).contains("typeName")
        assertThat(rfEmitterDetailQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfEmitterDetailQueryhelpResponse =
            RfEmitterDetailQueryhelpResponse.builder()
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

        val roundtrippedRfEmitterDetailQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfEmitterDetailQueryhelpResponse),
                jacksonTypeRef<RfEmitterDetailQueryhelpResponse>(),
            )

        assertThat(roundtrippedRfEmitterDetailQueryhelpResponse)
            .isEqualTo(rfEmitterDetailQueryhelpResponse)
    }
}
