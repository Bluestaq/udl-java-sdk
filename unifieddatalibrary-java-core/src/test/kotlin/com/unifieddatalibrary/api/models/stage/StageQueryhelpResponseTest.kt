// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.stage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StageQueryhelpResponseTest {

    @Test
    fun create() {
        val stageQueryhelpResponse =
            StageQueryhelpResponse.builder()
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

        assertThat(stageQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(stageQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(stageQueryhelpResponse.description()).contains("description")
        assertThat(stageQueryhelpResponse.historySupported()).contains(true)
        assertThat(stageQueryhelpResponse.name()).contains("name")
        assertThat(stageQueryhelpResponse.parameters().getOrNull())
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
        assertThat(stageQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(stageQueryhelpResponse.restSupported()).contains(true)
        assertThat(stageQueryhelpResponse.sortSupported()).contains(true)
        assertThat(stageQueryhelpResponse.typeName()).contains("typeName")
        assertThat(stageQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stageQueryhelpResponse =
            StageQueryhelpResponse.builder()
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

        val roundtrippedStageQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stageQueryhelpResponse),
                jacksonTypeRef<StageQueryhelpResponse>(),
            )

        assertThat(roundtrippedStageQueryhelpResponse).isEqualTo(stageQueryhelpResponse)
    }
}
