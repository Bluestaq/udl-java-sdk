// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.airtaskingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirTaskingOrderQueryHelpResponseTest {

    @Test
    fun create() {
        val airTaskingOrderQueryHelpResponse =
            AirTaskingOrderQueryHelpResponse.builder()
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

        assertThat(airTaskingOrderQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(airTaskingOrderQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(airTaskingOrderQueryHelpResponse.description()).contains("description")
        assertThat(airTaskingOrderQueryHelpResponse.historySupported()).contains(true)
        assertThat(airTaskingOrderQueryHelpResponse.name()).contains("name")
        assertThat(airTaskingOrderQueryHelpResponse.parameters().getOrNull())
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
        assertThat(airTaskingOrderQueryHelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(airTaskingOrderQueryHelpResponse.restSupported()).contains(true)
        assertThat(airTaskingOrderQueryHelpResponse.sortSupported()).contains(true)
        assertThat(airTaskingOrderQueryHelpResponse.typeName()).contains("typeName")
        assertThat(airTaskingOrderQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airTaskingOrderQueryHelpResponse =
            AirTaskingOrderQueryHelpResponse.builder()
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

        val roundtrippedAirTaskingOrderQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airTaskingOrderQueryHelpResponse),
                jacksonTypeRef<AirTaskingOrderQueryHelpResponse>(),
            )

        assertThat(roundtrippedAirTaskingOrderQueryHelpResponse)
            .isEqualTo(airTaskingOrderQueryHelpResponse)
    }
}
