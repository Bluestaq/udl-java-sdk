// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eop

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EopQueryhelpResponseTest {

    @Test
    fun create() {
        val eopQueryhelpResponse =
            EopQueryhelpResponse.builder()
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

        assertThat(eopQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(eopQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(eopQueryhelpResponse.description()).contains("description")
        assertThat(eopQueryhelpResponse.historySupported()).contains(true)
        assertThat(eopQueryhelpResponse.name()).contains("name")
        assertThat(eopQueryhelpResponse.parameters().getOrNull())
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
        assertThat(eopQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(eopQueryhelpResponse.restSupported()).contains(true)
        assertThat(eopQueryhelpResponse.sortSupported()).contains(true)
        assertThat(eopQueryhelpResponse.typeName()).contains("typeName")
        assertThat(eopQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eopQueryhelpResponse =
            EopQueryhelpResponse.builder()
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

        val roundtrippedEopQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eopQueryhelpResponse),
                jacksonTypeRef<EopQueryhelpResponse>(),
            )

        assertThat(roundtrippedEopQueryhelpResponse).isEqualTo(eopQueryhelpResponse)
    }
}
