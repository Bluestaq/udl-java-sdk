// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifold

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldQueryhelpResponseTest {

    @Test
    fun create() {
        val manifoldQueryhelpResponse =
            ManifoldQueryhelpResponse.builder()
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

        assertThat(manifoldQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(manifoldQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(manifoldQueryhelpResponse.description()).contains("description")
        assertThat(manifoldQueryhelpResponse.historySupported()).contains(true)
        assertThat(manifoldQueryhelpResponse.name()).contains("name")
        assertThat(manifoldQueryhelpResponse.parameters().getOrNull())
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
        assertThat(manifoldQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(manifoldQueryhelpResponse.restSupported()).contains(true)
        assertThat(manifoldQueryhelpResponse.sortSupported()).contains(true)
        assertThat(manifoldQueryhelpResponse.typeName()).contains("typeName")
        assertThat(manifoldQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val manifoldQueryhelpResponse =
            ManifoldQueryhelpResponse.builder()
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

        val roundtrippedManifoldQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(manifoldQueryhelpResponse),
                jacksonTypeRef<ManifoldQueryhelpResponse>(),
            )

        assertThat(roundtrippedManifoldQueryhelpResponse).isEqualTo(manifoldQueryhelpResponse)
    }
}
