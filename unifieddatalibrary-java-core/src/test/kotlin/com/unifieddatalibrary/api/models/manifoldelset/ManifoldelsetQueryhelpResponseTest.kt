// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifoldelset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldelsetQueryhelpResponseTest {

    @Test
    fun create() {
        val manifoldelsetQueryhelpResponse =
            ManifoldelsetQueryhelpResponse.builder()
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

        assertThat(manifoldelsetQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(manifoldelsetQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(manifoldelsetQueryhelpResponse.description()).contains("description")
        assertThat(manifoldelsetQueryhelpResponse.historySupported()).contains(true)
        assertThat(manifoldelsetQueryhelpResponse.name()).contains("name")
        assertThat(manifoldelsetQueryhelpResponse.parameters().getOrNull())
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
        assertThat(manifoldelsetQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(manifoldelsetQueryhelpResponse.restSupported()).contains(true)
        assertThat(manifoldelsetQueryhelpResponse.sortSupported()).contains(true)
        assertThat(manifoldelsetQueryhelpResponse.typeName()).contains("typeName")
        assertThat(manifoldelsetQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val manifoldelsetQueryhelpResponse =
            ManifoldelsetQueryhelpResponse.builder()
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

        val roundtrippedManifoldelsetQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(manifoldelsetQueryhelpResponse),
                jacksonTypeRef<ManifoldelsetQueryhelpResponse>(),
            )

        assertThat(roundtrippedManifoldelsetQueryhelpResponse)
            .isEqualTo(manifoldelsetQueryhelpResponse)
    }
}
