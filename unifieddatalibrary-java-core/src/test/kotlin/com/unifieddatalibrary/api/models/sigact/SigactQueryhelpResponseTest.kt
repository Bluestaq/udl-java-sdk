// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sigact

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SigactQueryhelpResponseTest {

    @Test
    fun create() {
        val sigactQueryhelpResponse =
            SigactQueryhelpResponse.builder()
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

        assertThat(sigactQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(sigactQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(sigactQueryhelpResponse.description()).contains("description")
        assertThat(sigactQueryhelpResponse.historySupported()).contains(true)
        assertThat(sigactQueryhelpResponse.name()).contains("name")
        assertThat(sigactQueryhelpResponse.parameters().getOrNull())
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
        assertThat(sigactQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(sigactQueryhelpResponse.restSupported()).contains(true)
        assertThat(sigactQueryhelpResponse.sortSupported()).contains(true)
        assertThat(sigactQueryhelpResponse.typeName()).contains("typeName")
        assertThat(sigactQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sigactQueryhelpResponse =
            SigactQueryhelpResponse.builder()
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

        val roundtrippedSigactQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sigactQueryhelpResponse),
                jacksonTypeRef<SigactQueryhelpResponse>(),
            )

        assertThat(roundtrippedSigactQueryhelpResponse).isEqualTo(sigactQueryhelpResponse)
    }
}
