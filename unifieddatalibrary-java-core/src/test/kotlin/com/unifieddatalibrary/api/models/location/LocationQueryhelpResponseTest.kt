// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.location

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationQueryhelpResponseTest {

    @Test
    fun create() {
        val locationQueryhelpResponse =
            LocationQueryhelpResponse.builder()
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

        assertThat(locationQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(locationQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(locationQueryhelpResponse.description()).contains("description")
        assertThat(locationQueryhelpResponse.historySupported()).contains(true)
        assertThat(locationQueryhelpResponse.name()).contains("name")
        assertThat(locationQueryhelpResponse.parameters().getOrNull())
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
        assertThat(locationQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(locationQueryhelpResponse.restSupported()).contains(true)
        assertThat(locationQueryhelpResponse.sortSupported()).contains(true)
        assertThat(locationQueryhelpResponse.typeName()).contains("typeName")
        assertThat(locationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locationQueryhelpResponse =
            LocationQueryhelpResponse.builder()
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

        val roundtrippedLocationQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locationQueryhelpResponse),
                jacksonTypeRef<LocationQueryhelpResponse>(),
            )

        assertThat(roundtrippedLocationQueryhelpResponse).isEqualTo(locationQueryhelpResponse)
    }
}
