// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssobservationset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GnssObservationsetQueryhelpResponseTest {

    @Test
    fun create() {
        val gnssObservationsetQueryhelpResponse =
            GnssObservationsetQueryhelpResponse.builder()
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

        assertThat(gnssObservationsetQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(gnssObservationsetQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(gnssObservationsetQueryhelpResponse.description()).contains("description")
        assertThat(gnssObservationsetQueryhelpResponse.historySupported()).contains(true)
        assertThat(gnssObservationsetQueryhelpResponse.name()).contains("name")
        assertThat(gnssObservationsetQueryhelpResponse.parameters().getOrNull())
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
        assertThat(gnssObservationsetQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(gnssObservationsetQueryhelpResponse.restSupported()).contains(true)
        assertThat(gnssObservationsetQueryhelpResponse.sortSupported()).contains(true)
        assertThat(gnssObservationsetQueryhelpResponse.typeName()).contains("typeName")
        assertThat(gnssObservationsetQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gnssObservationsetQueryhelpResponse =
            GnssObservationsetQueryhelpResponse.builder()
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

        val roundtrippedGnssObservationsetQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gnssObservationsetQueryhelpResponse),
                jacksonTypeRef<GnssObservationsetQueryhelpResponse>(),
            )

        assertThat(roundtrippedGnssObservationsetQueryhelpResponse)
            .isEqualTo(gnssObservationsetQueryhelpResponse)
    }
}
