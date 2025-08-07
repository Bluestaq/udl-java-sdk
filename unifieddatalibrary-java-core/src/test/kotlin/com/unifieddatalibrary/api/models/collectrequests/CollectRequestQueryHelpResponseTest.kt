// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectRequestQueryHelpResponseTest {

    @Test
    fun create() {
        val collectRequestQueryHelpResponse =
            CollectRequestQueryHelpResponse.builder()
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

        assertThat(collectRequestQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(collectRequestQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(collectRequestQueryHelpResponse.description()).contains("description")
        assertThat(collectRequestQueryHelpResponse.historySupported()).contains(true)
        assertThat(collectRequestQueryHelpResponse.name()).contains("name")
        assertThat(collectRequestQueryHelpResponse.parameters().getOrNull())
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
        assertThat(collectRequestQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(collectRequestQueryHelpResponse.restSupported()).contains(true)
        assertThat(collectRequestQueryHelpResponse.sortSupported()).contains(true)
        assertThat(collectRequestQueryHelpResponse.typeName()).contains("typeName")
        assertThat(collectRequestQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectRequestQueryHelpResponse =
            CollectRequestQueryHelpResponse.builder()
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

        val roundtrippedCollectRequestQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectRequestQueryHelpResponse),
                jacksonTypeRef<CollectRequestQueryHelpResponse>(),
            )

        assertThat(roundtrippedCollectRequestQueryHelpResponse)
            .isEqualTo(collectRequestQueryHelpResponse)
    }
}
