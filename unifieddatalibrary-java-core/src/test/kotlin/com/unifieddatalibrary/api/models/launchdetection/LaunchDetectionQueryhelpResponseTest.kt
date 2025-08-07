// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchdetection

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchDetectionQueryhelpResponseTest {

    @Test
    fun create() {
        val launchDetectionQueryhelpResponse =
            LaunchDetectionQueryhelpResponse.builder()
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

        assertThat(launchDetectionQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(launchDetectionQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(launchDetectionQueryhelpResponse.description()).contains("description")
        assertThat(launchDetectionQueryhelpResponse.historySupported()).contains(true)
        assertThat(launchDetectionQueryhelpResponse.name()).contains("name")
        assertThat(launchDetectionQueryhelpResponse.parameters().getOrNull())
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
        assertThat(launchDetectionQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(launchDetectionQueryhelpResponse.restSupported()).contains(true)
        assertThat(launchDetectionQueryhelpResponse.sortSupported()).contains(true)
        assertThat(launchDetectionQueryhelpResponse.typeName()).contains("typeName")
        assertThat(launchDetectionQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val launchDetectionQueryhelpResponse =
            LaunchDetectionQueryhelpResponse.builder()
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

        val roundtrippedLaunchDetectionQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(launchDetectionQueryhelpResponse),
                jacksonTypeRef<LaunchDetectionQueryhelpResponse>(),
            )

        assertThat(roundtrippedLaunchDetectionQueryhelpResponse)
            .isEqualTo(launchDetectionQueryhelpResponse)
    }
}
