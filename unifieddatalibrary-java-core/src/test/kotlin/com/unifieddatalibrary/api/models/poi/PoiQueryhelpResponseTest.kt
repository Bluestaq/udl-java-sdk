// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.poi

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoiQueryhelpResponseTest {

    @Test
    fun create() {
        val poiQueryhelpResponse =
            PoiQueryhelpResponse.builder()
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

        assertThat(poiQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(poiQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(poiQueryhelpResponse.description()).contains("description")
        assertThat(poiQueryhelpResponse.historySupported()).contains(true)
        assertThat(poiQueryhelpResponse.name()).contains("name")
        assertThat(poiQueryhelpResponse.parameters().getOrNull())
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
        assertThat(poiQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(poiQueryhelpResponse.restSupported()).contains(true)
        assertThat(poiQueryhelpResponse.sortSupported()).contains(true)
        assertThat(poiQueryhelpResponse.typeName()).contains("typeName")
        assertThat(poiQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val poiQueryhelpResponse =
            PoiQueryhelpResponse.builder()
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

        val roundtrippedPoiQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(poiQueryhelpResponse),
                jacksonTypeRef<PoiQueryhelpResponse>(),
            )

        assertThat(roundtrippedPoiQueryhelpResponse).isEqualTo(poiQueryhelpResponse)
    }
}
