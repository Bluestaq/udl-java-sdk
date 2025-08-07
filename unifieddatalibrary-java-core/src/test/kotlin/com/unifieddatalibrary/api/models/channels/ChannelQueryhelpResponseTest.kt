// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.channels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelQueryhelpResponseTest {

    @Test
    fun create() {
        val channelQueryhelpResponse =
            ChannelQueryhelpResponse.builder()
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

        assertThat(channelQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(channelQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(channelQueryhelpResponse.description()).contains("description")
        assertThat(channelQueryhelpResponse.historySupported()).contains(true)
        assertThat(channelQueryhelpResponse.name()).contains("name")
        assertThat(channelQueryhelpResponse.parameters().getOrNull())
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
        assertThat(channelQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(channelQueryhelpResponse.restSupported()).contains(true)
        assertThat(channelQueryhelpResponse.sortSupported()).contains(true)
        assertThat(channelQueryhelpResponse.typeName()).contains("typeName")
        assertThat(channelQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelQueryhelpResponse =
            ChannelQueryhelpResponse.builder()
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

        val roundtrippedChannelQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelQueryhelpResponse),
                jacksonTypeRef<ChannelQueryhelpResponse>(),
            )

        assertThat(roundtrippedChannelQueryhelpResponse).isEqualTo(channelQueryhelpResponse)
    }
}
