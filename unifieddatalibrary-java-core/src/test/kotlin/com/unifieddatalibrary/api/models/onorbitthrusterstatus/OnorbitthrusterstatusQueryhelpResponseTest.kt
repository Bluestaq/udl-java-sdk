// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthrusterstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitthrusterstatusQueryhelpResponseTest {

    @Test
    fun create() {
        val onorbitthrusterstatusQueryhelpResponse =
            OnorbitthrusterstatusQueryhelpResponse.builder()
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

        assertThat(onorbitthrusterstatusQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(onorbitthrusterstatusQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(onorbitthrusterstatusQueryhelpResponse.description()).contains("description")
        assertThat(onorbitthrusterstatusQueryhelpResponse.historySupported()).contains(true)
        assertThat(onorbitthrusterstatusQueryhelpResponse.name()).contains("name")
        assertThat(onorbitthrusterstatusQueryhelpResponse.parameters().getOrNull())
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
        assertThat(onorbitthrusterstatusQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(onorbitthrusterstatusQueryhelpResponse.restSupported()).contains(true)
        assertThat(onorbitthrusterstatusQueryhelpResponse.sortSupported()).contains(true)
        assertThat(onorbitthrusterstatusQueryhelpResponse.typeName()).contains("typeName")
        assertThat(onorbitthrusterstatusQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitthrusterstatusQueryhelpResponse =
            OnorbitthrusterstatusQueryhelpResponse.builder()
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

        val roundtrippedOnorbitthrusterstatusQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitthrusterstatusQueryhelpResponse),
                jacksonTypeRef<OnorbitthrusterstatusQueryhelpResponse>(),
            )

        assertThat(roundtrippedOnorbitthrusterstatusQueryhelpResponse)
            .isEqualTo(onorbitthrusterstatusQueryhelpResponse)
    }
}
