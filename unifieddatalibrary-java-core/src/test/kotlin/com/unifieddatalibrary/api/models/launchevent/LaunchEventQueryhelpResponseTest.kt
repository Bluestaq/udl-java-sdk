// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchevent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchEventQueryhelpResponseTest {

    @Test
    fun create() {
        val launchEventQueryhelpResponse =
            LaunchEventQueryhelpResponse.builder()
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

        assertThat(launchEventQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(launchEventQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(launchEventQueryhelpResponse.description()).contains("description")
        assertThat(launchEventQueryhelpResponse.historySupported()).contains(true)
        assertThat(launchEventQueryhelpResponse.name()).contains("name")
        assertThat(launchEventQueryhelpResponse.parameters().getOrNull())
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
        assertThat(launchEventQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(launchEventQueryhelpResponse.restSupported()).contains(true)
        assertThat(launchEventQueryhelpResponse.sortSupported()).contains(true)
        assertThat(launchEventQueryhelpResponse.typeName()).contains("typeName")
        assertThat(launchEventQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val launchEventQueryhelpResponse =
            LaunchEventQueryhelpResponse.builder()
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

        val roundtrippedLaunchEventQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(launchEventQueryhelpResponse),
                jacksonTypeRef<LaunchEventQueryhelpResponse>(),
            )

        assertThat(roundtrippedLaunchEventQueryhelpResponse).isEqualTo(launchEventQueryhelpResponse)
    }
}
