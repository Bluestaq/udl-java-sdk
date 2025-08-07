// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalAtmosphericModelQueryHelpResponseTest {

    @Test
    fun create() {
        val globalAtmosphericModelQueryHelpResponse =
            GlobalAtmosphericModelQueryHelpResponse.builder()
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

        assertThat(globalAtmosphericModelQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(globalAtmosphericModelQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(globalAtmosphericModelQueryHelpResponse.description()).contains("description")
        assertThat(globalAtmosphericModelQueryHelpResponse.historySupported()).contains(true)
        assertThat(globalAtmosphericModelQueryHelpResponse.name()).contains("name")
        assertThat(globalAtmosphericModelQueryHelpResponse.parameters().getOrNull())
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
        assertThat(globalAtmosphericModelQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(globalAtmosphericModelQueryHelpResponse.restSupported()).contains(true)
        assertThat(globalAtmosphericModelQueryHelpResponse.sortSupported()).contains(true)
        assertThat(globalAtmosphericModelQueryHelpResponse.typeName()).contains("typeName")
        assertThat(globalAtmosphericModelQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalAtmosphericModelQueryHelpResponse =
            GlobalAtmosphericModelQueryHelpResponse.builder()
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

        val roundtrippedGlobalAtmosphericModelQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalAtmosphericModelQueryHelpResponse),
                jacksonTypeRef<GlobalAtmosphericModelQueryHelpResponse>(),
            )

        assertThat(roundtrippedGlobalAtmosphericModelQueryHelpResponse)
            .isEqualTo(globalAtmosphericModelQueryHelpResponse)
    }
}
