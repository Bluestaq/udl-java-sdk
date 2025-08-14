// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.taiutc

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaiUtcQueryhelpResponseTest {

    @Test
    fun create() {
        val taiUtcQueryhelpResponse =
            TaiUtcQueryhelpResponse.builder()
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

        assertThat(taiUtcQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(taiUtcQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(taiUtcQueryhelpResponse.description()).contains("description")
        assertThat(taiUtcQueryhelpResponse.historySupported()).contains(true)
        assertThat(taiUtcQueryhelpResponse.name()).contains("name")
        assertThat(taiUtcQueryhelpResponse.parameters().getOrNull())
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
        assertThat(taiUtcQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(taiUtcQueryhelpResponse.restSupported()).contains(true)
        assertThat(taiUtcQueryhelpResponse.sortSupported()).contains(true)
        assertThat(taiUtcQueryhelpResponse.typeName()).contains("typeName")
        assertThat(taiUtcQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val taiUtcQueryhelpResponse =
            TaiUtcQueryhelpResponse.builder()
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

        val roundtrippedTaiUtcQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(taiUtcQueryhelpResponse),
                jacksonTypeRef<TaiUtcQueryhelpResponse>(),
            )

        assertThat(roundtrippedTaiUtcQueryhelpResponse).isEqualTo(taiUtcQueryhelpResponse)
    }
}
