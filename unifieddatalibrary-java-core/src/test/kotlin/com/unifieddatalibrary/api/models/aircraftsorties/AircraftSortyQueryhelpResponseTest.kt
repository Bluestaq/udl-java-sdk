// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraftsorties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.aircraftsorties.AircraftSortyQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AircraftSortyQueryhelpResponseTest {

    @Test
    fun create() {
      val aircraftSortyQueryhelpResponse = AircraftSortyQueryhelpResponse.builder()
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

      assertThat(aircraftSortyQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(aircraftSortyQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(aircraftSortyQueryhelpResponse.description()).contains("description")
      assertThat(aircraftSortyQueryhelpResponse.historySupported()).contains(true)
      assertThat(aircraftSortyQueryhelpResponse.name()).contains("name")
      assertThat(aircraftSortyQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(aircraftSortyQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(aircraftSortyQueryhelpResponse.restSupported()).contains(true)
      assertThat(aircraftSortyQueryhelpResponse.sortSupported()).contains(true)
      assertThat(aircraftSortyQueryhelpResponse.typeName()).contains("typeName")
      assertThat(aircraftSortyQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val aircraftSortyQueryhelpResponse = AircraftSortyQueryhelpResponse.builder()
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

      val roundtrippedAircraftSortyQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(aircraftSortyQueryhelpResponse), jacksonTypeRef<AircraftSortyQueryhelpResponse>())

      assertThat(roundtrippedAircraftSortyQueryhelpResponse).isEqualTo(aircraftSortyQueryhelpResponse)
    }
}
