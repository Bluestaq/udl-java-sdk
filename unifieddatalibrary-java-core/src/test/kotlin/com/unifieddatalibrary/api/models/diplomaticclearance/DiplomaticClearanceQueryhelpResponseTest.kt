// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiplomaticClearanceQueryhelpResponseTest {

    @Test
    fun create() {
        val diplomaticClearanceQueryhelpResponse =
            DiplomaticClearanceQueryhelpResponse.builder()
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

        assertThat(diplomaticClearanceQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(diplomaticClearanceQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(diplomaticClearanceQueryhelpResponse.description()).contains("description")
        assertThat(diplomaticClearanceQueryhelpResponse.historySupported()).contains(true)
        assertThat(diplomaticClearanceQueryhelpResponse.name()).contains("name")
        assertThat(diplomaticClearanceQueryhelpResponse.parameters().getOrNull())
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
        assertThat(diplomaticClearanceQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(diplomaticClearanceQueryhelpResponse.restSupported()).contains(true)
        assertThat(diplomaticClearanceQueryhelpResponse.sortSupported()).contains(true)
        assertThat(diplomaticClearanceQueryhelpResponse.typeName()).contains("typeName")
        assertThat(diplomaticClearanceQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val diplomaticClearanceQueryhelpResponse =
            DiplomaticClearanceQueryhelpResponse.builder()
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

        val roundtrippedDiplomaticClearanceQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(diplomaticClearanceQueryhelpResponse),
                jacksonTypeRef<DiplomaticClearanceQueryhelpResponse>(),
            )

        assertThat(roundtrippedDiplomaticClearanceQueryhelpResponse)
            .isEqualTo(diplomaticClearanceQueryhelpResponse)
    }
}
