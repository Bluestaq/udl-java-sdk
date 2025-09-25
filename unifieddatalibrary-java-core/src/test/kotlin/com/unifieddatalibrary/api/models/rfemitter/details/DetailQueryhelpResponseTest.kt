// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter.details

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailQueryhelpResponseTest {

    @Test
    fun create() {
        val detailQueryhelpResponse =
            DetailQueryhelpResponse.builder()
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

        assertThat(detailQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(detailQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(detailQueryhelpResponse.description()).contains("description")
        assertThat(detailQueryhelpResponse.historySupported()).contains(true)
        assertThat(detailQueryhelpResponse.name()).contains("name")
        assertThat(detailQueryhelpResponse.parameters().getOrNull())
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
        assertThat(detailQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(detailQueryhelpResponse.restSupported()).contains(true)
        assertThat(detailQueryhelpResponse.sortSupported()).contains(true)
        assertThat(detailQueryhelpResponse.typeName()).contains("typeName")
        assertThat(detailQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val detailQueryhelpResponse =
            DetailQueryhelpResponse.builder()
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

        val roundtrippedDetailQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailQueryhelpResponse),
                jacksonTypeRef<DetailQueryhelpResponse>(),
            )

        assertThat(roundtrippedDetailQueryhelpResponse).isEqualTo(detailQueryhelpResponse)
    }
}
