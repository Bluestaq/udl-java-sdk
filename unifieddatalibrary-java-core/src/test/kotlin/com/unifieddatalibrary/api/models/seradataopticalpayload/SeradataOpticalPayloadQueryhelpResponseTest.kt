// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataopticalpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataOpticalPayloadQueryhelpResponseTest {

    @Test
    fun create() {
        val seradataOpticalPayloadQueryhelpResponse =
            SeradataOpticalPayloadQueryhelpResponse.builder()
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

        assertThat(seradataOpticalPayloadQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(seradataOpticalPayloadQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(seradataOpticalPayloadQueryhelpResponse.description()).contains("description")
        assertThat(seradataOpticalPayloadQueryhelpResponse.historySupported()).contains(true)
        assertThat(seradataOpticalPayloadQueryhelpResponse.name()).contains("name")
        assertThat(seradataOpticalPayloadQueryhelpResponse.parameters().getOrNull())
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
        assertThat(seradataOpticalPayloadQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(seradataOpticalPayloadQueryhelpResponse.restSupported()).contains(true)
        assertThat(seradataOpticalPayloadQueryhelpResponse.sortSupported()).contains(true)
        assertThat(seradataOpticalPayloadQueryhelpResponse.typeName()).contains("typeName")
        assertThat(seradataOpticalPayloadQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val seradataOpticalPayloadQueryhelpResponse =
            SeradataOpticalPayloadQueryhelpResponse.builder()
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

        val roundtrippedSeradataOpticalPayloadQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(seradataOpticalPayloadQueryhelpResponse),
                jacksonTypeRef<SeradataOpticalPayloadQueryhelpResponse>(),
            )

        assertThat(roundtrippedSeradataOpticalPayloadQueryhelpResponse)
            .isEqualTo(seradataOpticalPayloadQueryhelpResponse)
    }
}
