// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.siteremark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteRemarkQueryhelpResponseTest {

    @Test
    fun create() {
        val siteRemarkQueryhelpResponse =
            SiteRemarkQueryhelpResponse.builder()
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

        assertThat(siteRemarkQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(siteRemarkQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(siteRemarkQueryhelpResponse.description()).contains("description")
        assertThat(siteRemarkQueryhelpResponse.historySupported()).contains(true)
        assertThat(siteRemarkQueryhelpResponse.name()).contains("name")
        assertThat(siteRemarkQueryhelpResponse.parameters().getOrNull())
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
        assertThat(siteRemarkQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(siteRemarkQueryhelpResponse.restSupported()).contains(true)
        assertThat(siteRemarkQueryhelpResponse.sortSupported()).contains(true)
        assertThat(siteRemarkQueryhelpResponse.typeName()).contains("typeName")
        assertThat(siteRemarkQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siteRemarkQueryhelpResponse =
            SiteRemarkQueryhelpResponse.builder()
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

        val roundtrippedSiteRemarkQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siteRemarkQueryhelpResponse),
                jacksonTypeRef<SiteRemarkQueryhelpResponse>(),
            )

        assertThat(roundtrippedSiteRemarkQueryhelpResponse).isEqualTo(siteRemarkQueryhelpResponse)
    }
}
