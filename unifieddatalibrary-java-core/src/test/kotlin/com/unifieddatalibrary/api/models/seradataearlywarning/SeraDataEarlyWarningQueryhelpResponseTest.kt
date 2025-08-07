// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataearlywarning

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataEarlyWarningQueryhelpResponseTest {

    @Test
    fun create() {
        val seraDataEarlyWarningQueryhelpResponse =
            SeraDataEarlyWarningQueryhelpResponse.builder()
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

        assertThat(seraDataEarlyWarningQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(seraDataEarlyWarningQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(seraDataEarlyWarningQueryhelpResponse.description()).contains("description")
        assertThat(seraDataEarlyWarningQueryhelpResponse.historySupported()).contains(true)
        assertThat(seraDataEarlyWarningQueryhelpResponse.name()).contains("name")
        assertThat(seraDataEarlyWarningQueryhelpResponse.parameters().getOrNull())
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
        assertThat(seraDataEarlyWarningQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(seraDataEarlyWarningQueryhelpResponse.restSupported()).contains(true)
        assertThat(seraDataEarlyWarningQueryhelpResponse.sortSupported()).contains(true)
        assertThat(seraDataEarlyWarningQueryhelpResponse.typeName()).contains("typeName")
        assertThat(seraDataEarlyWarningQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seraDataEarlyWarningQueryhelpResponse =
            SeraDataEarlyWarningQueryhelpResponse.builder()
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

        val roundtrippedSeraDataEarlyWarningQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seraDataEarlyWarningQueryhelpResponse),
                jacksonTypeRef<SeraDataEarlyWarningQueryhelpResponse>(),
            )

        assertThat(roundtrippedSeraDataEarlyWarningQueryhelpResponse)
            .isEqualTo(seraDataEarlyWarningQueryhelpResponse)
    }
}
