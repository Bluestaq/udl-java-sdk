// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laserdeconflictrequest

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaserdeconflictrequestQueryhelpResponseTest {

    @Test
    fun create() {
        val laserdeconflictrequestQueryhelpResponse =
            LaserdeconflictrequestQueryhelpResponse.builder()
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

        assertThat(laserdeconflictrequestQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(laserdeconflictrequestQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(laserdeconflictrequestQueryhelpResponse.description()).contains("description")
        assertThat(laserdeconflictrequestQueryhelpResponse.historySupported()).contains(true)
        assertThat(laserdeconflictrequestQueryhelpResponse.name()).contains("name")
        assertThat(laserdeconflictrequestQueryhelpResponse.parameters().getOrNull())
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
        assertThat(laserdeconflictrequestQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(laserdeconflictrequestQueryhelpResponse.restSupported()).contains(true)
        assertThat(laserdeconflictrequestQueryhelpResponse.sortSupported()).contains(true)
        assertThat(laserdeconflictrequestQueryhelpResponse.typeName()).contains("typeName")
        assertThat(laserdeconflictrequestQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val laserdeconflictrequestQueryhelpResponse =
            LaserdeconflictrequestQueryhelpResponse.builder()
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

        val roundtrippedLaserdeconflictrequestQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(laserdeconflictrequestQueryhelpResponse),
                jacksonTypeRef<LaserdeconflictrequestQueryhelpResponse>(),
            )

        assertThat(roundtrippedLaserdeconflictrequestQueryhelpResponse)
            .isEqualTo(laserdeconflictrequestQueryhelpResponse)
    }
}
