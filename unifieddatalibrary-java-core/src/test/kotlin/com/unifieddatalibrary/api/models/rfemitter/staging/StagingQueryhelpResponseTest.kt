// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter.staging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StagingQueryhelpResponseTest {

    @Test
    fun create() {
        val stagingQueryhelpResponse =
            StagingQueryhelpResponse.builder()
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

        assertThat(stagingQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(stagingQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(stagingQueryhelpResponse.description()).contains("description")
        assertThat(stagingQueryhelpResponse.historySupported()).contains(true)
        assertThat(stagingQueryhelpResponse.name()).contains("name")
        assertThat(stagingQueryhelpResponse.parameters().getOrNull())
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
        assertThat(stagingQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(stagingQueryhelpResponse.restSupported()).contains(true)
        assertThat(stagingQueryhelpResponse.sortSupported()).contains(true)
        assertThat(stagingQueryhelpResponse.typeName()).contains("typeName")
        assertThat(stagingQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stagingQueryhelpResponse =
            StagingQueryhelpResponse.builder()
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

        val roundtrippedStagingQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stagingQueryhelpResponse),
                jacksonTypeRef<StagingQueryhelpResponse>(),
            )

        assertThat(roundtrippedStagingQueryhelpResponse).isEqualTo(stagingQueryhelpResponse)
    }
}
