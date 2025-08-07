// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.skyimagery

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkyImageryQueryhelpResponseTest {

    @Test
    fun create() {
        val skyImageryQueryhelpResponse =
            SkyImageryQueryhelpResponse.builder()
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

        assertThat(skyImageryQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(skyImageryQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(skyImageryQueryhelpResponse.description()).contains("description")
        assertThat(skyImageryQueryhelpResponse.historySupported()).contains(true)
        assertThat(skyImageryQueryhelpResponse.name()).contains("name")
        assertThat(skyImageryQueryhelpResponse.parameters().getOrNull())
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
        assertThat(skyImageryQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(skyImageryQueryhelpResponse.restSupported()).contains(true)
        assertThat(skyImageryQueryhelpResponse.sortSupported()).contains(true)
        assertThat(skyImageryQueryhelpResponse.typeName()).contains("typeName")
        assertThat(skyImageryQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val skyImageryQueryhelpResponse =
            SkyImageryQueryhelpResponse.builder()
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

        val roundtrippedSkyImageryQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(skyImageryQueryhelpResponse),
                jacksonTypeRef<SkyImageryQueryhelpResponse>(),
            )

        assertThat(roundtrippedSkyImageryQueryhelpResponse).isEqualTo(skyImageryQueryhelpResponse)
    }
}
