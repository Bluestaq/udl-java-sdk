// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraft

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.aircraft.AircraftQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AircraftQueryhelpResponseTest {

    @Test
    fun create() {
      val aircraftQueryhelpResponse = AircraftQueryhelpResponse.builder()
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

      assertThat(aircraftQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(aircraftQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(aircraftQueryhelpResponse.description()).contains("description")
      assertThat(aircraftQueryhelpResponse.historySupported()).contains(true)
      assertThat(aircraftQueryhelpResponse.name()).contains("name")
      assertThat(aircraftQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(aircraftQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(aircraftQueryhelpResponse.restSupported()).contains(true)
      assertThat(aircraftQueryhelpResponse.sortSupported()).contains(true)
      assertThat(aircraftQueryhelpResponse.typeName()).contains("typeName")
      assertThat(aircraftQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val aircraftQueryhelpResponse = AircraftQueryhelpResponse.builder()
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

      val roundtrippedAircraftQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(aircraftQueryhelpResponse), jacksonTypeRef<AircraftQueryhelpResponse>())

      assertThat(roundtrippedAircraftQueryhelpResponse).isEqualTo(aircraftQueryhelpResponse)
    }
}
