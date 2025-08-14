// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoQueryhelpResponseTest {

    @Test
    fun create() {
        val videoQueryhelpResponse =
            VideoQueryhelpResponse.builder()
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

        assertThat(videoQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(videoQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(videoQueryhelpResponse.description()).contains("description")
        assertThat(videoQueryhelpResponse.historySupported()).contains(true)
        assertThat(videoQueryhelpResponse.name()).contains("name")
        assertThat(videoQueryhelpResponse.parameters().getOrNull())
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
        assertThat(videoQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(videoQueryhelpResponse.restSupported()).contains(true)
        assertThat(videoQueryhelpResponse.sortSupported()).contains(true)
        assertThat(videoQueryhelpResponse.typeName()).contains("typeName")
        assertThat(videoQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val videoQueryhelpResponse =
            VideoQueryhelpResponse.builder()
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

        val roundtrippedVideoQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(videoQueryhelpResponse),
                jacksonTypeRef<VideoQueryhelpResponse>(),
            )

        assertThat(roundtrippedVideoQueryhelpResponse).isEqualTo(videoQueryhelpResponse)
    }
}
