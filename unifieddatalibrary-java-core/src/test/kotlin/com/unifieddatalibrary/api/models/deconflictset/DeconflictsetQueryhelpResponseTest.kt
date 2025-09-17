// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.deconflictset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeconflictsetQueryhelpResponseTest {

    @Test
    fun create() {
        val deconflictsetQueryhelpResponse =
            DeconflictsetQueryhelpResponse.builder()
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

        assertThat(deconflictsetQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(deconflictsetQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(deconflictsetQueryhelpResponse.description()).contains("description")
        assertThat(deconflictsetQueryhelpResponse.historySupported()).contains(true)
        assertThat(deconflictsetQueryhelpResponse.name()).contains("name")
        assertThat(deconflictsetQueryhelpResponse.parameters().getOrNull())
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
        assertThat(deconflictsetQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(deconflictsetQueryhelpResponse.restSupported()).contains(true)
        assertThat(deconflictsetQueryhelpResponse.sortSupported()).contains(true)
        assertThat(deconflictsetQueryhelpResponse.typeName()).contains("typeName")
        assertThat(deconflictsetQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deconflictsetQueryhelpResponse =
            DeconflictsetQueryhelpResponse.builder()
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

        val roundtrippedDeconflictsetQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deconflictsetQueryhelpResponse),
                jacksonTypeRef<DeconflictsetQueryhelpResponse>(),
            )

        assertThat(roundtrippedDeconflictsetQueryhelpResponse)
            .isEqualTo(deconflictsetQueryhelpResponse)
    }
}
