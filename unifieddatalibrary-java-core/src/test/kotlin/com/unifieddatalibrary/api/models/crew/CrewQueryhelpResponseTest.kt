// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.crew

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.crew.CrewQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrewQueryhelpResponseTest {

    @Test
    fun create() {
      val crewQueryhelpResponse = CrewQueryhelpResponse.builder()
          .aodrSupported(true)
          .classificationMarking("classificationMarking")
          .description("description")
          .historySupported(true)
          .name("name")
          .addParameter(ParamDescriptor.builder()
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
              .build())
          .addRequiredRole("string")
          .restSupported(true)
          .sortSupported(true)
          .typeName("typeName")
          .uri("uri")
          .build()

      assertThat(crewQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(crewQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(crewQueryhelpResponse.description()).contains("description")
      assertThat(crewQueryhelpResponse.historySupported()).contains(true)
      assertThat(crewQueryhelpResponse.name()).contains("name")
      assertThat(crewQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
          .build())
      assertThat(crewQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(crewQueryhelpResponse.restSupported()).contains(true)
      assertThat(crewQueryhelpResponse.sortSupported()).contains(true)
      assertThat(crewQueryhelpResponse.typeName()).contains("typeName")
      assertThat(crewQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val crewQueryhelpResponse = CrewQueryhelpResponse.builder()
          .aodrSupported(true)
          .classificationMarking("classificationMarking")
          .description("description")
          .historySupported(true)
          .name("name")
          .addParameter(ParamDescriptor.builder()
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
              .build())
          .addRequiredRole("string")
          .restSupported(true)
          .sortSupported(true)
          .typeName("typeName")
          .uri("uri")
          .build()

      val roundtrippedCrewQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(crewQueryhelpResponse), jacksonTypeRef<CrewQueryhelpResponse>())

      assertThat(roundtrippedCrewQueryhelpResponse).isEqualTo(crewQueryhelpResponse)
    }
}
