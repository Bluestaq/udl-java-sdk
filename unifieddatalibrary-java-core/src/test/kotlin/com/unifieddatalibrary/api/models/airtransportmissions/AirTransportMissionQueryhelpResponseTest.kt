// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airtransportmissions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirTransportMissionQueryhelpResponseTest {

    @Test
    fun create() {
        val airTransportMissionQueryhelpResponse =
            AirTransportMissionQueryhelpResponse.builder()
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

        assertThat(airTransportMissionQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(airTransportMissionQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(airTransportMissionQueryhelpResponse.description()).contains("description")
        assertThat(airTransportMissionQueryhelpResponse.historySupported()).contains(true)
        assertThat(airTransportMissionQueryhelpResponse.name()).contains("name")
        assertThat(airTransportMissionQueryhelpResponse.parameters().getOrNull())
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
        assertThat(airTransportMissionQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(airTransportMissionQueryhelpResponse.restSupported()).contains(true)
        assertThat(airTransportMissionQueryhelpResponse.sortSupported()).contains(true)
        assertThat(airTransportMissionQueryhelpResponse.typeName()).contains("typeName")
        assertThat(airTransportMissionQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airTransportMissionQueryhelpResponse =
            AirTransportMissionQueryhelpResponse.builder()
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

        val roundtrippedAirTransportMissionQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airTransportMissionQueryhelpResponse),
                jacksonTypeRef<AirTransportMissionQueryhelpResponse>(),
            )

        assertThat(roundtrippedAirTransportMissionQueryhelpResponse)
            .isEqualTo(airTransportMissionQueryhelpResponse)
    }
}
