// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigationalobstruction

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NavigationalObstructionQueryhelpResponseTest {

    @Test
    fun create() {
        val navigationalObstructionQueryhelpResponse =
            NavigationalObstructionQueryhelpResponse.builder()
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

        assertThat(navigationalObstructionQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(navigationalObstructionQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(navigationalObstructionQueryhelpResponse.description()).contains("description")
        assertThat(navigationalObstructionQueryhelpResponse.historySupported()).contains(true)
        assertThat(navigationalObstructionQueryhelpResponse.name()).contains("name")
        assertThat(navigationalObstructionQueryhelpResponse.parameters().getOrNull())
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
        assertThat(navigationalObstructionQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(navigationalObstructionQueryhelpResponse.restSupported()).contains(true)
        assertThat(navigationalObstructionQueryhelpResponse.sortSupported()).contains(true)
        assertThat(navigationalObstructionQueryhelpResponse.typeName()).contains("typeName")
        assertThat(navigationalObstructionQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val navigationalObstructionQueryhelpResponse =
            NavigationalObstructionQueryhelpResponse.builder()
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

        val roundtrippedNavigationalObstructionQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(navigationalObstructionQueryhelpResponse),
                jacksonTypeRef<NavigationalObstructionQueryhelpResponse>(),
            )

        assertThat(roundtrippedNavigationalObstructionQueryhelpResponse)
            .isEqualTo(navigationalObstructionQueryhelpResponse)
    }
}
