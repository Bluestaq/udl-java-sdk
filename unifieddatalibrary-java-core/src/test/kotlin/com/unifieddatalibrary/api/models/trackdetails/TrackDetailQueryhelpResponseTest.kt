// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackdetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackDetailQueryhelpResponseTest {

    @Test
    fun create() {
        val trackDetailQueryhelpResponse =
            TrackDetailQueryhelpResponse.builder()
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

        assertThat(trackDetailQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(trackDetailQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(trackDetailQueryhelpResponse.description()).contains("description")
        assertThat(trackDetailQueryhelpResponse.historySupported()).contains(true)
        assertThat(trackDetailQueryhelpResponse.name()).contains("name")
        assertThat(trackDetailQueryhelpResponse.parameters().getOrNull())
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
        assertThat(trackDetailQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(trackDetailQueryhelpResponse.restSupported()).contains(true)
        assertThat(trackDetailQueryhelpResponse.sortSupported()).contains(true)
        assertThat(trackDetailQueryhelpResponse.typeName()).contains("typeName")
        assertThat(trackDetailQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trackDetailQueryhelpResponse =
            TrackDetailQueryhelpResponse.builder()
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

        val roundtrippedTrackDetailQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trackDetailQueryhelpResponse),
                jacksonTypeRef<TrackDetailQueryhelpResponse>(),
            )

        assertThat(roundtrippedTrackDetailQueryhelpResponse).isEqualTo(trackDetailQueryhelpResponse)
    }
}
