// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.antennas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AntennaQueryhelpResponseTest {

    @Test
    fun create() {
        val antennaQueryhelpResponse =
            AntennaQueryhelpResponse.builder()
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

        assertThat(antennaQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(antennaQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(antennaQueryhelpResponse.description()).contains("description")
        assertThat(antennaQueryhelpResponse.historySupported()).contains(true)
        assertThat(antennaQueryhelpResponse.name()).contains("name")
        assertThat(antennaQueryhelpResponse.parameters().getOrNull())
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
        assertThat(antennaQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(antennaQueryhelpResponse.restSupported()).contains(true)
        assertThat(antennaQueryhelpResponse.sortSupported()).contains(true)
        assertThat(antennaQueryhelpResponse.typeName()).contains("typeName")
        assertThat(antennaQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val antennaQueryhelpResponse =
            AntennaQueryhelpResponse.builder()
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

        val roundtrippedAntennaQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(antennaQueryhelpResponse),
                jacksonTypeRef<AntennaQueryhelpResponse>(),
            )

        assertThat(roundtrippedAntennaQueryhelpResponse).isEqualTo(antennaQueryhelpResponse)
    }
}
