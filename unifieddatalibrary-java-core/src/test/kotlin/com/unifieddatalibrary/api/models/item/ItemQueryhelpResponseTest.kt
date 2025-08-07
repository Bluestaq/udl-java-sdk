// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.item

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemQueryhelpResponseTest {

    @Test
    fun create() {
        val itemQueryhelpResponse =
            ItemQueryhelpResponse.builder()
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

        assertThat(itemQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(itemQueryhelpResponse.classificationMarking()).contains("classificationMarking")
        assertThat(itemQueryhelpResponse.description()).contains("description")
        assertThat(itemQueryhelpResponse.historySupported()).contains(true)
        assertThat(itemQueryhelpResponse.name()).contains("name")
        assertThat(itemQueryhelpResponse.parameters().getOrNull())
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
        assertThat(itemQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(itemQueryhelpResponse.restSupported()).contains(true)
        assertThat(itemQueryhelpResponse.sortSupported()).contains(true)
        assertThat(itemQueryhelpResponse.typeName()).contains("typeName")
        assertThat(itemQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemQueryhelpResponse =
            ItemQueryhelpResponse.builder()
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

        val roundtrippedItemQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemQueryhelpResponse),
                jacksonTypeRef<ItemQueryhelpResponse>(),
            )

        assertThat(roundtrippedItemQueryhelpResponse).isEqualTo(itemQueryhelpResponse)
    }
}
