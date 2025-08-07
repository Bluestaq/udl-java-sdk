// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitevent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbiteventQueryhelpResponseTest {

    @Test
    fun create() {
        val onorbiteventQueryhelpResponse =
            OnorbiteventQueryhelpResponse.builder()
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

        assertThat(onorbiteventQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(onorbiteventQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(onorbiteventQueryhelpResponse.description()).contains("description")
        assertThat(onorbiteventQueryhelpResponse.historySupported()).contains(true)
        assertThat(onorbiteventQueryhelpResponse.name()).contains("name")
        assertThat(onorbiteventQueryhelpResponse.parameters().getOrNull())
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
        assertThat(onorbiteventQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(onorbiteventQueryhelpResponse.restSupported()).contains(true)
        assertThat(onorbiteventQueryhelpResponse.sortSupported()).contains(true)
        assertThat(onorbiteventQueryhelpResponse.typeName()).contains("typeName")
        assertThat(onorbiteventQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbiteventQueryhelpResponse =
            OnorbiteventQueryhelpResponse.builder()
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

        val roundtrippedOnorbiteventQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbiteventQueryhelpResponse),
                jacksonTypeRef<OnorbiteventQueryhelpResponse>(),
            )

        assertThat(roundtrippedOnorbiteventQueryhelpResponse)
            .isEqualTo(onorbiteventQueryhelpResponse)
    }
}
