// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityQueryHelpResponseTest {

    @Test
    fun create() {
        val entityQueryHelpResponse =
            EntityQueryHelpResponse.builder()
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

        assertThat(entityQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(entityQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(entityQueryHelpResponse.description()).contains("description")
        assertThat(entityQueryHelpResponse.historySupported()).contains(true)
        assertThat(entityQueryHelpResponse.name()).contains("name")
        assertThat(entityQueryHelpResponse.parameters().getOrNull())
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
        assertThat(entityQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(entityQueryHelpResponse.restSupported()).contains(true)
        assertThat(entityQueryHelpResponse.sortSupported()).contains(true)
        assertThat(entityQueryHelpResponse.typeName()).contains("typeName")
        assertThat(entityQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityQueryHelpResponse =
            EntityQueryHelpResponse.builder()
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

        val roundtrippedEntityQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityQueryHelpResponse),
                jacksonTypeRef<EntityQueryHelpResponse>(),
            )

        assertThat(roundtrippedEntityQueryHelpResponse).isEqualTo(entityQueryHelpResponse)
    }
}
