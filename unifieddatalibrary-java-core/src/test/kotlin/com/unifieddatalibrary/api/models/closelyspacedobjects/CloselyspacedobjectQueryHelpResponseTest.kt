// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.closelyspacedobjects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloselyspacedobjectQueryHelpResponseTest {

    @Test
    fun create() {
        val closelyspacedobjectQueryHelpResponse =
            CloselyspacedobjectQueryHelpResponse.builder()
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

        assertThat(closelyspacedobjectQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(closelyspacedobjectQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(closelyspacedobjectQueryHelpResponse.description()).contains("description")
        assertThat(closelyspacedobjectQueryHelpResponse.historySupported()).contains(true)
        assertThat(closelyspacedobjectQueryHelpResponse.name()).contains("name")
        assertThat(closelyspacedobjectQueryHelpResponse.parameters().getOrNull())
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
        assertThat(closelyspacedobjectQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(closelyspacedobjectQueryHelpResponse.restSupported()).contains(true)
        assertThat(closelyspacedobjectQueryHelpResponse.sortSupported()).contains(true)
        assertThat(closelyspacedobjectQueryHelpResponse.typeName()).contains("typeName")
        assertThat(closelyspacedobjectQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val closelyspacedobjectQueryHelpResponse =
            CloselyspacedobjectQueryHelpResponse.builder()
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

        val roundtrippedCloselyspacedobjectQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(closelyspacedobjectQueryHelpResponse),
                jacksonTypeRef<CloselyspacedobjectQueryHelpResponse>(),
            )

        assertThat(roundtrippedCloselyspacedobjectQueryHelpResponse)
            .isEqualTo(closelyspacedobjectQueryHelpResponse)
    }
}
