// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.h3geohexcell

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class H3GeoHexCellQueryhelpResponseTest {

    @Test
    fun create() {
        val h3GeoHexCellQueryhelpResponse =
            H3GeoHexCellQueryhelpResponse.builder()
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

        assertThat(h3GeoHexCellQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(h3GeoHexCellQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(h3GeoHexCellQueryhelpResponse.description()).contains("description")
        assertThat(h3GeoHexCellQueryhelpResponse.historySupported()).contains(true)
        assertThat(h3GeoHexCellQueryhelpResponse.name()).contains("name")
        assertThat(h3GeoHexCellQueryhelpResponse.parameters().getOrNull())
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
        assertThat(h3GeoHexCellQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(h3GeoHexCellQueryhelpResponse.restSupported()).contains(true)
        assertThat(h3GeoHexCellQueryhelpResponse.sortSupported()).contains(true)
        assertThat(h3GeoHexCellQueryhelpResponse.typeName()).contains("typeName")
        assertThat(h3GeoHexCellQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val h3GeoHexCellQueryhelpResponse =
            H3GeoHexCellQueryhelpResponse.builder()
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

        val roundtrippedH3GeoHexCellQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(h3GeoHexCellQueryhelpResponse),
                jacksonTypeRef<H3GeoHexCellQueryhelpResponse>(),
            )

        assertThat(roundtrippedH3GeoHexCellQueryhelpResponse)
            .isEqualTo(h3GeoHexCellQueryhelpResponse)
    }
}
