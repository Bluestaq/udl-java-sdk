// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.buses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusQueryHelpResponseTest {

    @Test
    fun create() {
        val busQueryHelpResponse =
            BusQueryHelpResponse.builder()
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

        assertThat(busQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(busQueryHelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(busQueryHelpResponse.description()).contains("description")
        assertThat(busQueryHelpResponse.historySupported()).contains(true)
        assertThat(busQueryHelpResponse.name()).contains("name")
        assertThat(busQueryHelpResponse.parameters().getOrNull())
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
        assertThat(busQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(busQueryHelpResponse.restSupported()).contains(true)
        assertThat(busQueryHelpResponse.sortSupported()).contains(true)
        assertThat(busQueryHelpResponse.typeName()).contains("typeName")
        assertThat(busQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val busQueryHelpResponse =
            BusQueryHelpResponse.builder()
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

        val roundtrippedBusQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(busQueryHelpResponse),
                jacksonTypeRef<BusQueryHelpResponse>(),
            )

        assertThat(roundtrippedBusQueryHelpResponse).isEqualTo(busQueryHelpResponse)
    }
}
