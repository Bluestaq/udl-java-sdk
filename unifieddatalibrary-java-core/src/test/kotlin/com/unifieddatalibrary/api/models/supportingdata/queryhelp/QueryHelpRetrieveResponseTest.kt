// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.supportingdata.queryhelp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueryHelpRetrieveResponseTest {

    @Test
    fun create() {
        val queryHelpRetrieveResponse =
            QueryHelpRetrieveResponse.builder()
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

        assertThat(queryHelpRetrieveResponse.aodrSupported()).contains(true)
        assertThat(queryHelpRetrieveResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(queryHelpRetrieveResponse.description()).contains("description")
        assertThat(queryHelpRetrieveResponse.historySupported()).contains(true)
        assertThat(queryHelpRetrieveResponse.name()).contains("name")
        assertThat(queryHelpRetrieveResponse.parameters().getOrNull())
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
        assertThat(queryHelpRetrieveResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(queryHelpRetrieveResponse.restSupported()).contains(true)
        assertThat(queryHelpRetrieveResponse.sortSupported()).contains(true)
        assertThat(queryHelpRetrieveResponse.typeName()).contains("typeName")
        assertThat(queryHelpRetrieveResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryHelpRetrieveResponse =
            QueryHelpRetrieveResponse.builder()
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

        val roundtrippedQueryHelpRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryHelpRetrieveResponse),
                jacksonTypeRef<QueryHelpRetrieveResponse>(),
            )

        assertThat(roundtrippedQueryHelpRetrieveResponse).isEqualTo(queryHelpRetrieveResponse)
    }
}
