// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.objectofinterest

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectOfInterestQueryhelpResponseTest {

    @Test
    fun create() {
        val objectOfInterestQueryhelpResponse =
            ObjectOfInterestQueryhelpResponse.builder()
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

        assertThat(objectOfInterestQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(objectOfInterestQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(objectOfInterestQueryhelpResponse.description()).contains("description")
        assertThat(objectOfInterestQueryhelpResponse.historySupported()).contains(true)
        assertThat(objectOfInterestQueryhelpResponse.name()).contains("name")
        assertThat(objectOfInterestQueryhelpResponse.parameters().getOrNull())
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
        assertThat(objectOfInterestQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(objectOfInterestQueryhelpResponse.restSupported()).contains(true)
        assertThat(objectOfInterestQueryhelpResponse.sortSupported()).contains(true)
        assertThat(objectOfInterestQueryhelpResponse.typeName()).contains("typeName")
        assertThat(objectOfInterestQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectOfInterestQueryhelpResponse =
            ObjectOfInterestQueryhelpResponse.builder()
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

        val roundtrippedObjectOfInterestQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectOfInterestQueryhelpResponse),
                jacksonTypeRef<ObjectOfInterestQueryhelpResponse>(),
            )

        assertThat(roundtrippedObjectOfInterestQueryhelpResponse)
            .isEqualTo(objectOfInterestQueryhelpResponse)
    }
}
