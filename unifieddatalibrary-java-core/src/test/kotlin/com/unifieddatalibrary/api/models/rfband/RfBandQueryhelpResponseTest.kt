// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfband

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandQueryhelpResponseTest {

    @Test
    fun create() {
        val rfBandQueryhelpResponse =
            RfBandQueryhelpResponse.builder()
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

        assertThat(rfBandQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(rfBandQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(rfBandQueryhelpResponse.description()).contains("description")
        assertThat(rfBandQueryhelpResponse.historySupported()).contains(true)
        assertThat(rfBandQueryhelpResponse.name()).contains("name")
        assertThat(rfBandQueryhelpResponse.parameters().getOrNull())
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
        assertThat(rfBandQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(rfBandQueryhelpResponse.restSupported()).contains(true)
        assertThat(rfBandQueryhelpResponse.sortSupported()).contains(true)
        assertThat(rfBandQueryhelpResponse.typeName()).contains("typeName")
        assertThat(rfBandQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfBandQueryhelpResponse =
            RfBandQueryhelpResponse.builder()
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

        val roundtrippedRfBandQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfBandQueryhelpResponse),
                jacksonTypeRef<RfBandQueryhelpResponse>(),
            )

        assertThat(roundtrippedRfBandQueryhelpResponse).isEqualTo(rfBandQueryhelpResponse)
    }
}
