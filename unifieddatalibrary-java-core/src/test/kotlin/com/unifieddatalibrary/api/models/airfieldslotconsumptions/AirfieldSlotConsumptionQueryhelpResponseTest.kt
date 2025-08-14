// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslotconsumptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldSlotConsumptionQueryhelpResponseTest {

    @Test
    fun create() {
        val airfieldSlotConsumptionQueryhelpResponse =
            AirfieldSlotConsumptionQueryhelpResponse.builder()
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

        assertThat(airfieldSlotConsumptionQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(airfieldSlotConsumptionQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(airfieldSlotConsumptionQueryhelpResponse.description()).contains("description")
        assertThat(airfieldSlotConsumptionQueryhelpResponse.historySupported()).contains(true)
        assertThat(airfieldSlotConsumptionQueryhelpResponse.name()).contains("name")
        assertThat(airfieldSlotConsumptionQueryhelpResponse.parameters().getOrNull())
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
        assertThat(airfieldSlotConsumptionQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(airfieldSlotConsumptionQueryhelpResponse.restSupported()).contains(true)
        assertThat(airfieldSlotConsumptionQueryhelpResponse.sortSupported()).contains(true)
        assertThat(airfieldSlotConsumptionQueryhelpResponse.typeName()).contains("typeName")
        assertThat(airfieldSlotConsumptionQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airfieldSlotConsumptionQueryhelpResponse =
            AirfieldSlotConsumptionQueryhelpResponse.builder()
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

        val roundtrippedAirfieldSlotConsumptionQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airfieldSlotConsumptionQueryhelpResponse),
                jacksonTypeRef<AirfieldSlotConsumptionQueryhelpResponse>(),
            )

        assertThat(roundtrippedAirfieldSlotConsumptionQueryhelpResponse)
            .isEqualTo(airfieldSlotConsumptionQueryhelpResponse)
    }
}
