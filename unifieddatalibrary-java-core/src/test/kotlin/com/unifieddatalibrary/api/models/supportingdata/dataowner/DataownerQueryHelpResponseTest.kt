// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.supportingdata.dataowner

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataownerQueryHelpResponseTest {

    @Test
    fun create() {
        val dataownerQueryHelpResponse =
            DataownerQueryHelpResponse.builder()
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

        assertThat(dataownerQueryHelpResponse.aodrSupported()).contains(true)
        assertThat(dataownerQueryHelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(dataownerQueryHelpResponse.description()).contains("description")
        assertThat(dataownerQueryHelpResponse.historySupported()).contains(true)
        assertThat(dataownerQueryHelpResponse.name()).contains("name")
        assertThat(dataownerQueryHelpResponse.parameters().getOrNull())
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
        assertThat(dataownerQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(dataownerQueryHelpResponse.restSupported()).contains(true)
        assertThat(dataownerQueryHelpResponse.sortSupported()).contains(true)
        assertThat(dataownerQueryHelpResponse.typeName()).contains("typeName")
        assertThat(dataownerQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataownerQueryHelpResponse =
            DataownerQueryHelpResponse.builder()
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

        val roundtrippedDataownerQueryHelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataownerQueryHelpResponse),
                jacksonTypeRef<DataownerQueryHelpResponse>(),
            )

        assertThat(roundtrippedDataownerQueryHelpResponse).isEqualTo(dataownerQueryHelpResponse)
    }
}
