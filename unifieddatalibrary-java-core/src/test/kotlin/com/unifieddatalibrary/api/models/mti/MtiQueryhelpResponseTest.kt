// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.mti

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MtiQueryhelpResponseTest {

    @Test
    fun create() {
        val mtiQueryhelpResponse =
            MtiQueryhelpResponse.builder()
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

        assertThat(mtiQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(mtiQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(mtiQueryhelpResponse.description()).contains("description")
        assertThat(mtiQueryhelpResponse.historySupported()).contains(true)
        assertThat(mtiQueryhelpResponse.name()).contains("name")
        assertThat(mtiQueryhelpResponse.parameters().getOrNull())
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
        assertThat(mtiQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(mtiQueryhelpResponse.restSupported()).contains(true)
        assertThat(mtiQueryhelpResponse.sortSupported()).contains(true)
        assertThat(mtiQueryhelpResponse.typeName()).contains("typeName")
        assertThat(mtiQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mtiQueryhelpResponse =
            MtiQueryhelpResponse.builder()
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

        val roundtrippedMtiQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mtiQueryhelpResponse),
                jacksonTypeRef<MtiQueryhelpResponse>(),
            )

        assertThat(roundtrippedMtiQueryhelpResponse).isEqualTo(mtiQueryhelpResponse)
    }
}
