// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sitestatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteStatusQueryhelpResponseTest {

    @Test
    fun create() {
        val siteStatusQueryhelpResponse =
            SiteStatusQueryhelpResponse.builder()
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

        assertThat(siteStatusQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(siteStatusQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(siteStatusQueryhelpResponse.description()).contains("description")
        assertThat(siteStatusQueryhelpResponse.historySupported()).contains(true)
        assertThat(siteStatusQueryhelpResponse.name()).contains("name")
        assertThat(siteStatusQueryhelpResponse.parameters().getOrNull())
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
        assertThat(siteStatusQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(siteStatusQueryhelpResponse.restSupported()).contains(true)
        assertThat(siteStatusQueryhelpResponse.sortSupported()).contains(true)
        assertThat(siteStatusQueryhelpResponse.typeName()).contains("typeName")
        assertThat(siteStatusQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siteStatusQueryhelpResponse =
            SiteStatusQueryhelpResponse.builder()
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

        val roundtrippedSiteStatusQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siteStatusQueryhelpResponse),
                jacksonTypeRef<SiteStatusQueryhelpResponse>(),
            )

        assertThat(roundtrippedSiteStatusQueryhelpResponse).isEqualTo(siteStatusQueryhelpResponse)
    }
}
