// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.vessel

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VesselQueryhelpResponseTest {

    @Test
    fun create() {
        val vesselQueryhelpResponse =
            VesselQueryhelpResponse.builder()
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

        assertThat(vesselQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(vesselQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(vesselQueryhelpResponse.description()).contains("description")
        assertThat(vesselQueryhelpResponse.historySupported()).contains(true)
        assertThat(vesselQueryhelpResponse.name()).contains("name")
        assertThat(vesselQueryhelpResponse.parameters().getOrNull())
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
        assertThat(vesselQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(vesselQueryhelpResponse.restSupported()).contains(true)
        assertThat(vesselQueryhelpResponse.sortSupported()).contains(true)
        assertThat(vesselQueryhelpResponse.typeName()).contains("typeName")
        assertThat(vesselQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vesselQueryhelpResponse =
            VesselQueryhelpResponse.builder()
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

        val roundtrippedVesselQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vesselQueryhelpResponse),
                jacksonTypeRef<VesselQueryhelpResponse>(),
            )

        assertThat(roundtrippedVesselQueryhelpResponse).isEqualTo(vesselQueryhelpResponse)
    }
}
