// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aviationriskmanagement

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AviationRiskManagementQueryHelpResponseTest {

    @Test
    fun create() {
        val aviationRiskManagementQueryHelpResponse =
            AviationRiskManagementQueryHelpResponse.builder()
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

        assertThat(aviationRiskManagementQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(aviationRiskManagementQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(aviationRiskManagementQueryHelpResponse.description()).contains("description")
        assertThat(aviationRiskManagementQueryHelpResponse.historySupported()).contains(true)
        assertThat(aviationRiskManagementQueryHelpResponse.name()).contains("name")
        assertThat(aviationRiskManagementQueryHelpResponse.parameters().getOrNull())
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
        assertThat(aviationRiskManagementQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(aviationRiskManagementQueryHelpResponse.restSupported()).contains(true)
        assertThat(aviationRiskManagementQueryHelpResponse.sortSupported()).contains(true)
        assertThat(aviationRiskManagementQueryHelpResponse.typeName()).contains("typeName")
        assertThat(aviationRiskManagementQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aviationRiskManagementQueryHelpResponse =
            AviationRiskManagementQueryHelpResponse.builder()
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

        val roundtrippedAviationRiskManagementQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aviationRiskManagementQueryHelpResponse),
                jacksonTypeRef<AviationRiskManagementQueryHelpResponse>(),
            )

        assertThat(roundtrippedAviationRiskManagementQueryHelpResponse)
            .isEqualTo(aviationRiskManagementQueryHelpResponse)
    }
}
