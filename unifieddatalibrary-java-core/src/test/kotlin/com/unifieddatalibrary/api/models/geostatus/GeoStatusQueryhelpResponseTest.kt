// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.geostatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeoStatusQueryhelpResponseTest {

    @Test
    fun create() {
        val geoStatusQueryhelpResponse =
            GeoStatusQueryhelpResponse.builder()
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

        assertThat(geoStatusQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(geoStatusQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(geoStatusQueryhelpResponse.description()).contains("description")
        assertThat(geoStatusQueryhelpResponse.historySupported()).contains(true)
        assertThat(geoStatusQueryhelpResponse.name()).contains("name")
        assertThat(geoStatusQueryhelpResponse.parameters().getOrNull())
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
        assertThat(geoStatusQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(geoStatusQueryhelpResponse.restSupported()).contains(true)
        assertThat(geoStatusQueryhelpResponse.sortSupported()).contains(true)
        assertThat(geoStatusQueryhelpResponse.typeName()).contains("typeName")
        assertThat(geoStatusQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geoStatusQueryhelpResponse =
            GeoStatusQueryhelpResponse.builder()
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

        val roundtrippedGeoStatusQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geoStatusQueryhelpResponse),
                jacksonTypeRef<GeoStatusQueryhelpResponse>(),
            )

        assertThat(roundtrippedGeoStatusQueryhelpResponse).isEqualTo(geoStatusQueryhelpResponse)
    }
}
