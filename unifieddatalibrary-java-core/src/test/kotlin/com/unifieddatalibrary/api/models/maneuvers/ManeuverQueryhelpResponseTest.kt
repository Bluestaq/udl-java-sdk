// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.maneuvers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.maneuvers.ManeuverQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManeuverQueryhelpResponseTest {

    @Test
    fun create() {
      val maneuverQueryhelpResponse = ManeuverQueryhelpResponse.builder()
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

      assertThat(maneuverQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(maneuverQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(maneuverQueryhelpResponse.description()).contains("description")
      assertThat(maneuverQueryhelpResponse.historySupported()).contains(true)
      assertThat(maneuverQueryhelpResponse.name()).contains("name")
      assertThat(maneuverQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(maneuverQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(maneuverQueryhelpResponse.restSupported()).contains(true)
      assertThat(maneuverQueryhelpResponse.sortSupported()).contains(true)
      assertThat(maneuverQueryhelpResponse.typeName()).contains("typeName")
      assertThat(maneuverQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val maneuverQueryhelpResponse = ManeuverQueryhelpResponse.builder()
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

      val roundtrippedManeuverQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(maneuverQueryhelpResponse), jacksonTypeRef<ManeuverQueryhelpResponse>())

      assertThat(roundtrippedManeuverQueryhelpResponse).isEqualTo(maneuverQueryhelpResponse)
    }
}
