// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geo

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class H3GeoQueryhelpResponseTest {

    @Test
    fun create() {
        val h3GeoQueryhelpResponse =
            H3GeoQueryhelpResponse.builder()
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

        assertThat(h3GeoQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(h3GeoQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(h3GeoQueryhelpResponse.description()).contains("description")
        assertThat(h3GeoQueryhelpResponse.historySupported()).contains(true)
        assertThat(h3GeoQueryhelpResponse.name()).contains("name")
        assertThat(h3GeoQueryhelpResponse.parameters().getOrNull())
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
        assertThat(h3GeoQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(h3GeoQueryhelpResponse.restSupported()).contains(true)
        assertThat(h3GeoQueryhelpResponse.sortSupported()).contains(true)
        assertThat(h3GeoQueryhelpResponse.typeName()).contains("typeName")
        assertThat(h3GeoQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val h3GeoQueryhelpResponse =
            H3GeoQueryhelpResponse.builder()
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

        val roundtrippedH3GeoQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(h3GeoQueryhelpResponse),
                jacksonTypeRef<H3GeoQueryhelpResponse>(),
            )

        assertThat(roundtrippedH3GeoQueryhelpResponse).isEqualTo(h3GeoQueryhelpResponse)
    }
}
