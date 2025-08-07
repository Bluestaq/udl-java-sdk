// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldslots

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldSlotQueryhelpResponseTest {

    @Test
    fun create() {
        val airfieldSlotQueryhelpResponse =
            AirfieldSlotQueryhelpResponse.builder()
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

        assertThat(airfieldSlotQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(airfieldSlotQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(airfieldSlotQueryhelpResponse.description()).contains("description")
        assertThat(airfieldSlotQueryhelpResponse.historySupported()).contains(true)
        assertThat(airfieldSlotQueryhelpResponse.name()).contains("name")
        assertThat(airfieldSlotQueryhelpResponse.parameters().getOrNull())
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
        assertThat(airfieldSlotQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(airfieldSlotQueryhelpResponse.restSupported()).contains(true)
        assertThat(airfieldSlotQueryhelpResponse.sortSupported()).contains(true)
        assertThat(airfieldSlotQueryhelpResponse.typeName()).contains("typeName")
        assertThat(airfieldSlotQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airfieldSlotQueryhelpResponse =
            AirfieldSlotQueryhelpResponse.builder()
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

        val roundtrippedAirfieldSlotQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airfieldSlotQueryhelpResponse),
                jacksonTypeRef<AirfieldSlotQueryhelpResponse>(),
            )

        assertThat(roundtrippedAirfieldSlotQueryhelpResponse)
            .isEqualTo(airfieldSlotQueryhelpResponse)
    }
}
