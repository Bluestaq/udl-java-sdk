// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkStatusQueryhelpResponseTest {

    @Test
    fun create() {
        val linkStatusQueryhelpResponse =
            LinkStatusQueryhelpResponse.builder()
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

        assertThat(linkStatusQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(linkStatusQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(linkStatusQueryhelpResponse.description()).contains("description")
        assertThat(linkStatusQueryhelpResponse.historySupported()).contains(true)
        assertThat(linkStatusQueryhelpResponse.name()).contains("name")
        assertThat(linkStatusQueryhelpResponse.parameters().getOrNull())
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
        assertThat(linkStatusQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(linkStatusQueryhelpResponse.restSupported()).contains(true)
        assertThat(linkStatusQueryhelpResponse.sortSupported()).contains(true)
        assertThat(linkStatusQueryhelpResponse.typeName()).contains("typeName")
        assertThat(linkStatusQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkStatusQueryhelpResponse =
            LinkStatusQueryhelpResponse.builder()
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

        val roundtrippedLinkStatusQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkStatusQueryhelpResponse),
                jacksonTypeRef<LinkStatusQueryhelpResponse>(),
            )

        assertThat(roundtrippedLinkStatusQueryhelpResponse).isEqualTo(linkStatusQueryhelpResponse)
    }
}
