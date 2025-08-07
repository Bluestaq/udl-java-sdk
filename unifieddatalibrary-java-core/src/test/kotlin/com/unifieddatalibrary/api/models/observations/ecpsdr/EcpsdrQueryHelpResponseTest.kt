// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.ecpsdr

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EcpsdrQueryHelpResponseTest {

    @Test
    fun create() {
        val ecpsdrQueryHelpResponse =
            EcpsdrQueryHelpResponse.builder()
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

        assertThat(ecpsdrQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(ecpsdrQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(ecpsdrQueryHelpResponse.description()).contains("description")
        assertThat(ecpsdrQueryHelpResponse.historySupported()).contains(true)
        assertThat(ecpsdrQueryHelpResponse.name()).contains("name")
        assertThat(ecpsdrQueryHelpResponse.parameters().getOrNull())
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
        assertThat(ecpsdrQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(ecpsdrQueryHelpResponse.restSupported()).contains(true)
        assertThat(ecpsdrQueryHelpResponse.sortSupported()).contains(true)
        assertThat(ecpsdrQueryHelpResponse.typeName()).contains("typeName")
        assertThat(ecpsdrQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ecpsdrQueryHelpResponse =
            EcpsdrQueryHelpResponse.builder()
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

        val roundtrippedEcpsdrQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ecpsdrQueryHelpResponse),
                jacksonTypeRef<EcpsdrQueryHelpResponse>(),
            )

        assertThat(roundtrippedEcpsdrQueryHelpResponse).isEqualTo(ecpsdrQueryHelpResponse)
    }
}
