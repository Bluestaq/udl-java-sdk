// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ecpedr

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EcpedrQueryhelpResponseTest {

    @Test
    fun create() {
        val ecpedrQueryhelpResponse =
            EcpedrQueryhelpResponse.builder()
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

        assertThat(ecpedrQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(ecpedrQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(ecpedrQueryhelpResponse.description()).contains("description")
        assertThat(ecpedrQueryhelpResponse.historySupported()).contains(true)
        assertThat(ecpedrQueryhelpResponse.name()).contains("name")
        assertThat(ecpedrQueryhelpResponse.parameters().getOrNull())
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
        assertThat(ecpedrQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(ecpedrQueryhelpResponse.restSupported()).contains(true)
        assertThat(ecpedrQueryhelpResponse.sortSupported()).contains(true)
        assertThat(ecpedrQueryhelpResponse.typeName()).contains("typeName")
        assertThat(ecpedrQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ecpedrQueryhelpResponse =
            EcpedrQueryhelpResponse.builder()
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

        val roundtrippedEcpedrQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ecpedrQueryhelpResponse),
                jacksonTypeRef<EcpedrQueryhelpResponse>(),
            )

        assertThat(roundtrippedEcpedrQueryhelpResponse).isEqualTo(ecpedrQueryhelpResponse)
    }
}
