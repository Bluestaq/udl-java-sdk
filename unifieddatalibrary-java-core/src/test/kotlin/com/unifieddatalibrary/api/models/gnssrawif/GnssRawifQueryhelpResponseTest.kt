// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssrawif

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GnssRawifQueryhelpResponseTest {

    @Test
    fun create() {
        val gnssRawifQueryhelpResponse =
            GnssRawifQueryhelpResponse.builder()
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

        assertThat(gnssRawifQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(gnssRawifQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(gnssRawifQueryhelpResponse.description()).contains("description")
        assertThat(gnssRawifQueryhelpResponse.historySupported()).contains(true)
        assertThat(gnssRawifQueryhelpResponse.name()).contains("name")
        assertThat(gnssRawifQueryhelpResponse.parameters().getOrNull())
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
        assertThat(gnssRawifQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(gnssRawifQueryhelpResponse.restSupported()).contains(true)
        assertThat(gnssRawifQueryhelpResponse.sortSupported()).contains(true)
        assertThat(gnssRawifQueryhelpResponse.typeName()).contains("typeName")
        assertThat(gnssRawifQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gnssRawifQueryhelpResponse =
            GnssRawifQueryhelpResponse.builder()
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

        val roundtrippedGnssRawifQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gnssRawifQueryhelpResponse),
                jacksonTypeRef<GnssRawifQueryhelpResponse>(),
            )

        assertThat(roundtrippedGnssRawifQueryhelpResponse).isEqualTo(gnssRawifQueryhelpResponse)
    }
}
