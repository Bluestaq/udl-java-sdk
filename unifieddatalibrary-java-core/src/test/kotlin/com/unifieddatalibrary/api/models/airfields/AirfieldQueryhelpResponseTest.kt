// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfields

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.airfields.AirfieldQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldQueryhelpResponseTest {

    @Test
    fun create() {
      val airfieldQueryhelpResponse = AirfieldQueryhelpResponse.builder()
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

      assertThat(airfieldQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(airfieldQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(airfieldQueryhelpResponse.description()).contains("description")
      assertThat(airfieldQueryhelpResponse.historySupported()).contains(true)
      assertThat(airfieldQueryhelpResponse.name()).contains("name")
      assertThat(airfieldQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(airfieldQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(airfieldQueryhelpResponse.restSupported()).contains(true)
      assertThat(airfieldQueryhelpResponse.sortSupported()).contains(true)
      assertThat(airfieldQueryhelpResponse.typeName()).contains("typeName")
      assertThat(airfieldQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val airfieldQueryhelpResponse = AirfieldQueryhelpResponse.builder()
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

      val roundtrippedAirfieldQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(airfieldQueryhelpResponse), jacksonTypeRef<AirfieldQueryhelpResponse>())

      assertThat(roundtrippedAirfieldQueryhelpResponse).isEqualTo(airfieldQueryhelpResponse)
    }
}
