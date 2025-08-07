// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirEventQueryhelpResponseTest {

    @Test
    fun create() {
        val airEventQueryhelpResponse =
            AirEventQueryhelpResponse.builder()
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

        assertThat(airEventQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(airEventQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(airEventQueryhelpResponse.description()).contains("description")
        assertThat(airEventQueryhelpResponse.historySupported()).contains(true)
        assertThat(airEventQueryhelpResponse.name()).contains("name")
        assertThat(airEventQueryhelpResponse.parameters().getOrNull())
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
        assertThat(airEventQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(airEventQueryhelpResponse.restSupported()).contains(true)
        assertThat(airEventQueryhelpResponse.sortSupported()).contains(true)
        assertThat(airEventQueryhelpResponse.typeName()).contains("typeName")
        assertThat(airEventQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airEventQueryhelpResponse =
            AirEventQueryhelpResponse.builder()
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

        val roundtrippedAirEventQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airEventQueryhelpResponse),
                jacksonTypeRef<AirEventQueryhelpResponse>(),
            )

        assertThat(roundtrippedAirEventQueryhelpResponse).isEqualTo(airEventQueryhelpResponse)
    }
}
