// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.flightplan

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.flightplan.FlightplanQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlightplanQueryhelpResponseTest {

    @Test
    fun create() {
      val flightplanQueryhelpResponse = FlightplanQueryhelpResponse.builder()
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

      assertThat(flightplanQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(flightplanQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(flightplanQueryhelpResponse.description()).contains("description")
      assertThat(flightplanQueryhelpResponse.historySupported()).contains(true)
      assertThat(flightplanQueryhelpResponse.name()).contains("name")
      assertThat(flightplanQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(flightplanQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(flightplanQueryhelpResponse.restSupported()).contains(true)
      assertThat(flightplanQueryhelpResponse.sortSupported()).contains(true)
      assertThat(flightplanQueryhelpResponse.typeName()).contains("typeName")
      assertThat(flightplanQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val flightplanQueryhelpResponse = FlightplanQueryhelpResponse.builder()
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

      val roundtrippedFlightplanQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(flightplanQueryhelpResponse), jacksonTypeRef<FlightplanQueryhelpResponse>())

      assertThat(roundtrippedFlightplanQueryhelpResponse).isEqualTo(flightplanQueryhelpResponse)
    }
}
