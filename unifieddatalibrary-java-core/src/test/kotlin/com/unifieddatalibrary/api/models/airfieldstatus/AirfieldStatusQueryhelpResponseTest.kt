// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldStatusQueryhelpResponseTest {

    @Test
    fun create() {
      val airfieldStatusQueryhelpResponse = AirfieldStatusQueryhelpResponse.builder()
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

      assertThat(airfieldStatusQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(airfieldStatusQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(airfieldStatusQueryhelpResponse.description()).contains("description")
      assertThat(airfieldStatusQueryhelpResponse.historySupported()).contains(true)
      assertThat(airfieldStatusQueryhelpResponse.name()).contains("name")
      assertThat(airfieldStatusQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(airfieldStatusQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(airfieldStatusQueryhelpResponse.restSupported()).contains(true)
      assertThat(airfieldStatusQueryhelpResponse.sortSupported()).contains(true)
      assertThat(airfieldStatusQueryhelpResponse.typeName()).contains("typeName")
      assertThat(airfieldStatusQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val airfieldStatusQueryhelpResponse = AirfieldStatusQueryhelpResponse.builder()
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

      val roundtrippedAirfieldStatusQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(airfieldStatusQueryhelpResponse), jacksonTypeRef<AirfieldStatusQueryhelpResponse>())

      assertThat(roundtrippedAirfieldStatusQueryhelpResponse).isEqualTo(airfieldStatusQueryhelpResponse)
    }
}
