// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.itemtrackings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemTrackingQueryhelpResponseTest {

    @Test
    fun create() {
        val itemTrackingQueryhelpResponse =
            ItemTrackingQueryhelpResponse.builder()
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

        assertThat(itemTrackingQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(itemTrackingQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(itemTrackingQueryhelpResponse.description()).contains("description")
        assertThat(itemTrackingQueryhelpResponse.historySupported()).contains(true)
        assertThat(itemTrackingQueryhelpResponse.name()).contains("name")
        assertThat(itemTrackingQueryhelpResponse.parameters().getOrNull())
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
        assertThat(itemTrackingQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(itemTrackingQueryhelpResponse.restSupported()).contains(true)
        assertThat(itemTrackingQueryhelpResponse.sortSupported()).contains(true)
        assertThat(itemTrackingQueryhelpResponse.typeName()).contains("typeName")
        assertThat(itemTrackingQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemTrackingQueryhelpResponse =
            ItemTrackingQueryhelpResponse.builder()
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

        val roundtrippedItemTrackingQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemTrackingQueryhelpResponse),
                jacksonTypeRef<ItemTrackingQueryhelpResponse>(),
            )

        assertThat(roundtrippedItemTrackingQueryhelpResponse)
            .isEqualTo(itemTrackingQueryhelpResponse)
    }
}
