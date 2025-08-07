// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missiletracks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissileTrackQueryhelpResponseTest {

    @Test
    fun create() {
        val missileTrackQueryhelpResponse =
            MissileTrackQueryhelpResponse.builder()
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

        assertThat(missileTrackQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(missileTrackQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(missileTrackQueryhelpResponse.description()).contains("description")
        assertThat(missileTrackQueryhelpResponse.historySupported()).contains(true)
        assertThat(missileTrackQueryhelpResponse.name()).contains("name")
        assertThat(missileTrackQueryhelpResponse.parameters().getOrNull())
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
        assertThat(missileTrackQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(missileTrackQueryhelpResponse.restSupported()).contains(true)
        assertThat(missileTrackQueryhelpResponse.sortSupported()).contains(true)
        assertThat(missileTrackQueryhelpResponse.typeName()).contains("typeName")
        assertThat(missileTrackQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missileTrackQueryhelpResponse =
            MissileTrackQueryhelpResponse.builder()
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

        val roundtrippedMissileTrackQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missileTrackQueryhelpResponse),
                jacksonTypeRef<MissileTrackQueryhelpResponse>(),
            )

        assertThat(roundtrippedMissileTrackQueryhelpResponse)
            .isEqualTo(missileTrackQueryhelpResponse)
    }
}
