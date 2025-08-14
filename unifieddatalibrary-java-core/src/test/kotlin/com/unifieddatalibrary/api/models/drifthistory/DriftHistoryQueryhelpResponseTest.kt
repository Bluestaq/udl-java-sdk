// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.drifthistory

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DriftHistoryQueryhelpResponseTest {

    @Test
    fun create() {
        val driftHistoryQueryhelpResponse =
            DriftHistoryQueryhelpResponse.builder()
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

        assertThat(driftHistoryQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(driftHistoryQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(driftHistoryQueryhelpResponse.description()).contains("description")
        assertThat(driftHistoryQueryhelpResponse.historySupported()).contains(true)
        assertThat(driftHistoryQueryhelpResponse.name()).contains("name")
        assertThat(driftHistoryQueryhelpResponse.parameters().getOrNull())
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
        assertThat(driftHistoryQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(driftHistoryQueryhelpResponse.restSupported()).contains(true)
        assertThat(driftHistoryQueryhelpResponse.sortSupported()).contains(true)
        assertThat(driftHistoryQueryhelpResponse.typeName()).contains("typeName")
        assertThat(driftHistoryQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val driftHistoryQueryhelpResponse =
            DriftHistoryQueryhelpResponse.builder()
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

        val roundtrippedDriftHistoryQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(driftHistoryQueryhelpResponse),
                jacksonTypeRef<DriftHistoryQueryhelpResponse>(),
            )

        assertThat(roundtrippedDriftHistoryQueryhelpResponse)
            .isEqualTo(driftHistoryQueryhelpResponse)
    }
}
