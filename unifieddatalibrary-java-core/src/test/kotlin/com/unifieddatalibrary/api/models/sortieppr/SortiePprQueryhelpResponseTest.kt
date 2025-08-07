// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sortieppr

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SortiePprQueryhelpResponseTest {

    @Test
    fun create() {
        val sortiePprQueryhelpResponse =
            SortiePprQueryhelpResponse.builder()
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

        assertThat(sortiePprQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(sortiePprQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(sortiePprQueryhelpResponse.description()).contains("description")
        assertThat(sortiePprQueryhelpResponse.historySupported()).contains(true)
        assertThat(sortiePprQueryhelpResponse.name()).contains("name")
        assertThat(sortiePprQueryhelpResponse.parameters().getOrNull())
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
        assertThat(sortiePprQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(sortiePprQueryhelpResponse.restSupported()).contains(true)
        assertThat(sortiePprQueryhelpResponse.sortSupported()).contains(true)
        assertThat(sortiePprQueryhelpResponse.typeName()).contains("typeName")
        assertThat(sortiePprQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sortiePprQueryhelpResponse =
            SortiePprQueryhelpResponse.builder()
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

        val roundtrippedSortiePprQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sortiePprQueryhelpResponse),
                jacksonTypeRef<SortiePprQueryhelpResponse>(),
            )

        assertThat(roundtrippedSortiePprQueryhelpResponse).isEqualTo(sortiePprQueryhelpResponse)
    }
}
