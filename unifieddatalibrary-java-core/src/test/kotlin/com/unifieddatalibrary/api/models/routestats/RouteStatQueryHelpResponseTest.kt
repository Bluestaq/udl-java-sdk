// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.routestats

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteStatQueryHelpResponseTest {

    @Test
    fun create() {
        val routeStatQueryHelpResponse =
            RouteStatQueryHelpResponse.builder()
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

        assertThat(routeStatQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(routeStatQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(routeStatQueryHelpResponse.description()).contains("description")
        assertThat(routeStatQueryHelpResponse.historySupported()).contains(true)
        assertThat(routeStatQueryHelpResponse.name()).contains("name")
        assertThat(routeStatQueryHelpResponse.parameters().getOrNull())
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
        assertThat(routeStatQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(routeStatQueryHelpResponse.restSupported()).contains(true)
        assertThat(routeStatQueryHelpResponse.sortSupported()).contains(true)
        assertThat(routeStatQueryHelpResponse.typeName()).contains("typeName")
        assertThat(routeStatQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeStatQueryHelpResponse =
            RouteStatQueryHelpResponse.builder()
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

        val roundtrippedRouteStatQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeStatQueryHelpResponse),
                jacksonTypeRef<RouteStatQueryHelpResponse>(),
            )

        assertThat(roundtrippedRouteStatQueryHelpResponse).isEqualTo(routeStatQueryHelpResponse)
    }
}
