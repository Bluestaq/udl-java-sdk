// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surfaceobstruction

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SurfaceObstructionQueryhelpResponseTest {

    @Test
    fun create() {
        val surfaceObstructionQueryhelpResponse =
            SurfaceObstructionQueryhelpResponse.builder()
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

        assertThat(surfaceObstructionQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(surfaceObstructionQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(surfaceObstructionQueryhelpResponse.description()).contains("description")
        assertThat(surfaceObstructionQueryhelpResponse.historySupported()).contains(true)
        assertThat(surfaceObstructionQueryhelpResponse.name()).contains("name")
        assertThat(surfaceObstructionQueryhelpResponse.parameters().getOrNull())
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
        assertThat(surfaceObstructionQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(surfaceObstructionQueryhelpResponse.restSupported()).contains(true)
        assertThat(surfaceObstructionQueryhelpResponse.sortSupported()).contains(true)
        assertThat(surfaceObstructionQueryhelpResponse.typeName()).contains("typeName")
        assertThat(surfaceObstructionQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val surfaceObstructionQueryhelpResponse =
            SurfaceObstructionQueryhelpResponse.builder()
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

        val roundtrippedSurfaceObstructionQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(surfaceObstructionQueryhelpResponse),
                jacksonTypeRef<SurfaceObstructionQueryhelpResponse>(),
            )

        assertThat(roundtrippedSurfaceObstructionQueryhelpResponse)
            .isEqualTo(surfaceObstructionQueryhelpResponse)
    }
}
