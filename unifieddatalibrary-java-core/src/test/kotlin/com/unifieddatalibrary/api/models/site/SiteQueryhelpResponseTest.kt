// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteQueryhelpResponseTest {

    @Test
    fun create() {
        val siteQueryhelpResponse =
            SiteQueryhelpResponse.builder()
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

        assertThat(siteQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(siteQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(siteQueryhelpResponse.description()).contains("description")
        assertThat(siteQueryhelpResponse.historySupported()).contains(true)
        assertThat(siteQueryhelpResponse.name()).contains("name")
        assertThat(siteQueryhelpResponse.parameters().getOrNull())
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
        assertThat(siteQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(siteQueryhelpResponse.restSupported()).contains(true)
        assertThat(siteQueryhelpResponse.sortSupported()).contains(true)
        assertThat(siteQueryhelpResponse.typeName()).contains("typeName")
        assertThat(siteQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siteQueryhelpResponse =
            SiteQueryhelpResponse.builder()
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

        val roundtrippedSiteQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siteQueryhelpResponse),
                jacksonTypeRef<SiteQueryhelpResponse>(),
            )

        assertThat(roundtrippedSiteQueryhelpResponse).isEqualTo(siteQueryhelpResponse)
    }
}
