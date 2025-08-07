// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackRouteQueryhelpResponseTest {

    @Test
    fun create() {
        val trackRouteQueryhelpResponse =
            TrackRouteQueryhelpResponse.builder()
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

        assertThat(trackRouteQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(trackRouteQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(trackRouteQueryhelpResponse.description()).contains("description")
        assertThat(trackRouteQueryhelpResponse.historySupported()).contains(true)
        assertThat(trackRouteQueryhelpResponse.name()).contains("name")
        assertThat(trackRouteQueryhelpResponse.parameters().getOrNull())
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
        assertThat(trackRouteQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(trackRouteQueryhelpResponse.restSupported()).contains(true)
        assertThat(trackRouteQueryhelpResponse.sortSupported()).contains(true)
        assertThat(trackRouteQueryhelpResponse.typeName()).contains("typeName")
        assertThat(trackRouteQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trackRouteQueryhelpResponse =
            TrackRouteQueryhelpResponse.builder()
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

        val roundtrippedTrackRouteQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trackRouteQueryhelpResponse),
                jacksonTypeRef<TrackRouteQueryhelpResponse>(),
            )

        assertThat(roundtrippedTrackRouteQueryhelpResponse).isEqualTo(trackRouteQueryhelpResponse)
    }
}
