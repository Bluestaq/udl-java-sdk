// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organization

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationQueryhelpResponseTest {

    @Test
    fun create() {
        val organizationQueryhelpResponse =
            OrganizationQueryhelpResponse.builder()
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

        assertThat(organizationQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(organizationQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(organizationQueryhelpResponse.description()).contains("description")
        assertThat(organizationQueryhelpResponse.historySupported()).contains(true)
        assertThat(organizationQueryhelpResponse.name()).contains("name")
        assertThat(organizationQueryhelpResponse.parameters().getOrNull())
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
        assertThat(organizationQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(organizationQueryhelpResponse.restSupported()).contains(true)
        assertThat(organizationQueryhelpResponse.sortSupported()).contains(true)
        assertThat(organizationQueryhelpResponse.typeName()).contains("typeName")
        assertThat(organizationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationQueryhelpResponse =
            OrganizationQueryhelpResponse.builder()
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

        val roundtrippedOrganizationQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationQueryhelpResponse),
                jacksonTypeRef<OrganizationQueryhelpResponse>(),
            )

        assertThat(roundtrippedOrganizationQueryhelpResponse)
            .isEqualTo(organizationQueryhelpResponse)
    }
}
