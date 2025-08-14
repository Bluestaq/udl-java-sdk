// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missionassignment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionAssignmentQueryhelpResponseTest {

    @Test
    fun create() {
        val missionAssignmentQueryhelpResponse =
            MissionAssignmentQueryhelpResponse.builder()
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

        assertThat(missionAssignmentQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(missionAssignmentQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(missionAssignmentQueryhelpResponse.description()).contains("description")
        assertThat(missionAssignmentQueryhelpResponse.historySupported()).contains(true)
        assertThat(missionAssignmentQueryhelpResponse.name()).contains("name")
        assertThat(missionAssignmentQueryhelpResponse.parameters().getOrNull())
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
        assertThat(missionAssignmentQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(missionAssignmentQueryhelpResponse.restSupported()).contains(true)
        assertThat(missionAssignmentQueryhelpResponse.sortSupported()).contains(true)
        assertThat(missionAssignmentQueryhelpResponse.typeName()).contains("typeName")
        assertThat(missionAssignmentQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missionAssignmentQueryhelpResponse =
            MissionAssignmentQueryhelpResponse.builder()
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

        val roundtrippedMissionAssignmentQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missionAssignmentQueryhelpResponse),
                jacksonTypeRef<MissionAssignmentQueryhelpResponse>(),
            )

        assertThat(roundtrippedMissionAssignmentQueryhelpResponse)
            .isEqualTo(missionAssignmentQueryhelpResponse)
    }
}
