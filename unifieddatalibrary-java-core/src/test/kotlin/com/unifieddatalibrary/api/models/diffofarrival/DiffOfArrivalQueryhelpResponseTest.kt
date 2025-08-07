// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diffofarrival

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiffOfArrivalQueryhelpResponseTest {

    @Test
    fun create() {
        val diffOfArrivalQueryhelpResponse =
            DiffOfArrivalQueryhelpResponse.builder()
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

        assertThat(diffOfArrivalQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(diffOfArrivalQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(diffOfArrivalQueryhelpResponse.description()).contains("description")
        assertThat(diffOfArrivalQueryhelpResponse.historySupported()).contains(true)
        assertThat(diffOfArrivalQueryhelpResponse.name()).contains("name")
        assertThat(diffOfArrivalQueryhelpResponse.parameters().getOrNull())
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
        assertThat(diffOfArrivalQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(diffOfArrivalQueryhelpResponse.restSupported()).contains(true)
        assertThat(diffOfArrivalQueryhelpResponse.sortSupported()).contains(true)
        assertThat(diffOfArrivalQueryhelpResponse.typeName()).contains("typeName")
        assertThat(diffOfArrivalQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val diffOfArrivalQueryhelpResponse =
            DiffOfArrivalQueryhelpResponse.builder()
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

        val roundtrippedDiffOfArrivalQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(diffOfArrivalQueryhelpResponse),
                jacksonTypeRef<DiffOfArrivalQueryhelpResponse>(),
            )

        assertThat(roundtrippedDiffOfArrivalQueryhelpResponse)
            .isEqualTo(diffOfArrivalQueryhelpResponse)
    }
}
