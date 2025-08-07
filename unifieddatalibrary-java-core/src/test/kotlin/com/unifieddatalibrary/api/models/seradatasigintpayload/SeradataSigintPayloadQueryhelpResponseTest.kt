// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatasigintpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataSigintPayloadQueryhelpResponseTest {

    @Test
    fun create() {
        val seradataSigintPayloadQueryhelpResponse =
            SeradataSigintPayloadQueryhelpResponse.builder()
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

        assertThat(seradataSigintPayloadQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(seradataSigintPayloadQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(seradataSigintPayloadQueryhelpResponse.description()).contains("description")
        assertThat(seradataSigintPayloadQueryhelpResponse.historySupported()).contains(true)
        assertThat(seradataSigintPayloadQueryhelpResponse.name()).contains("name")
        assertThat(seradataSigintPayloadQueryhelpResponse.parameters().getOrNull())
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
        assertThat(seradataSigintPayloadQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(seradataSigintPayloadQueryhelpResponse.restSupported()).contains(true)
        assertThat(seradataSigintPayloadQueryhelpResponse.sortSupported()).contains(true)
        assertThat(seradataSigintPayloadQueryhelpResponse.typeName()).contains("typeName")
        assertThat(seradataSigintPayloadQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seradataSigintPayloadQueryhelpResponse =
            SeradataSigintPayloadQueryhelpResponse.builder()
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

        val roundtrippedSeradataSigintPayloadQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seradataSigintPayloadQueryhelpResponse),
                jacksonTypeRef<SeradataSigintPayloadQueryhelpResponse>(),
            )

        assertThat(roundtrippedSeradataSigintPayloadQueryhelpResponse)
            .isEqualTo(seradataSigintPayloadQueryhelpResponse)
    }
}
