// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.starcatalog

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StarCatalogQueryhelpResponseTest {

    @Test
    fun create() {
        val starCatalogQueryhelpResponse =
            StarCatalogQueryhelpResponse.builder()
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

        assertThat(starCatalogQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(starCatalogQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(starCatalogQueryhelpResponse.description()).contains("description")
        assertThat(starCatalogQueryhelpResponse.historySupported()).contains(true)
        assertThat(starCatalogQueryhelpResponse.name()).contains("name")
        assertThat(starCatalogQueryhelpResponse.parameters().getOrNull())
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
        assertThat(starCatalogQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(starCatalogQueryhelpResponse.restSupported()).contains(true)
        assertThat(starCatalogQueryhelpResponse.sortSupported()).contains(true)
        assertThat(starCatalogQueryhelpResponse.typeName()).contains("typeName")
        assertThat(starCatalogQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val starCatalogQueryhelpResponse =
            StarCatalogQueryhelpResponse.builder()
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

        val roundtrippedStarCatalogQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(starCatalogQueryhelpResponse),
                jacksonTypeRef<StarCatalogQueryhelpResponse>(),
            )

        assertThat(roundtrippedStarCatalogQueryhelpResponse).isEqualTo(starCatalogQueryhelpResponse)
    }
}
