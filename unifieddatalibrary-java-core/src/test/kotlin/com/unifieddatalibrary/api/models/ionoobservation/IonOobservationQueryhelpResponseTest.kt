// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ionoobservation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IonOobservationQueryhelpResponseTest {

    @Test
    fun create() {
        val ionOobservationQueryhelpResponse =
            IonOobservationQueryhelpResponse.builder()
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

        assertThat(ionOobservationQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(ionOobservationQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(ionOobservationQueryhelpResponse.description()).contains("description")
        assertThat(ionOobservationQueryhelpResponse.historySupported()).contains(true)
        assertThat(ionOobservationQueryhelpResponse.name()).contains("name")
        assertThat(ionOobservationQueryhelpResponse.parameters().getOrNull())
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
        assertThat(ionOobservationQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(ionOobservationQueryhelpResponse.restSupported()).contains(true)
        assertThat(ionOobservationQueryhelpResponse.sortSupported()).contains(true)
        assertThat(ionOobservationQueryhelpResponse.typeName()).contains("typeName")
        assertThat(ionOobservationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ionOobservationQueryhelpResponse =
            IonOobservationQueryhelpResponse.builder()
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

        val roundtrippedIonOobservationQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ionOobservationQueryhelpResponse),
                jacksonTypeRef<IonOobservationQueryhelpResponse>(),
            )

        assertThat(roundtrippedIonOobservationQueryhelpResponse)
            .isEqualTo(ionOobservationQueryhelpResponse)
    }
}
