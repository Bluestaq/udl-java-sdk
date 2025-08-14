// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatacommdetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataCommDetailQueryhelpResponseTest {

    @Test
    fun create() {
        val seraDataCommDetailQueryhelpResponse =
            SeraDataCommDetailQueryhelpResponse.builder()
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

        assertThat(seraDataCommDetailQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(seraDataCommDetailQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(seraDataCommDetailQueryhelpResponse.description()).contains("description")
        assertThat(seraDataCommDetailQueryhelpResponse.historySupported()).contains(true)
        assertThat(seraDataCommDetailQueryhelpResponse.name()).contains("name")
        assertThat(seraDataCommDetailQueryhelpResponse.parameters().getOrNull())
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
        assertThat(seraDataCommDetailQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(seraDataCommDetailQueryhelpResponse.restSupported()).contains(true)
        assertThat(seraDataCommDetailQueryhelpResponse.sortSupported()).contains(true)
        assertThat(seraDataCommDetailQueryhelpResponse.typeName()).contains("typeName")
        assertThat(seraDataCommDetailQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seraDataCommDetailQueryhelpResponse =
            SeraDataCommDetailQueryhelpResponse.builder()
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

        val roundtrippedSeraDataCommDetailQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seraDataCommDetailQueryhelpResponse),
                jacksonTypeRef<SeraDataCommDetailQueryhelpResponse>(),
            )

        assertThat(roundtrippedSeraDataCommDetailQueryhelpResponse)
            .isEqualTo(seraDataCommDetailQueryhelpResponse)
    }
}
