// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.soiobservationset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.soiobservationset.SoiObservationSetQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SoiObservationSetQueryhelpResponseTest {

    @Test
    fun create() {
      val soiObservationSetQueryhelpResponse = SoiObservationSetQueryhelpResponse.builder()
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

      assertThat(soiObservationSetQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(soiObservationSetQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(soiObservationSetQueryhelpResponse.description()).contains("description")
      assertThat(soiObservationSetQueryhelpResponse.historySupported()).contains(true)
      assertThat(soiObservationSetQueryhelpResponse.name()).contains("name")
      assertThat(soiObservationSetQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(soiObservationSetQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(soiObservationSetQueryhelpResponse.restSupported()).contains(true)
      assertThat(soiObservationSetQueryhelpResponse.sortSupported()).contains(true)
      assertThat(soiObservationSetQueryhelpResponse.typeName()).contains("typeName")
      assertThat(soiObservationSetQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val soiObservationSetQueryhelpResponse = SoiObservationSetQueryhelpResponse.builder()
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

      val roundtrippedSoiObservationSetQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(soiObservationSetQueryhelpResponse), jacksonTypeRef<SoiObservationSetQueryhelpResponse>())

      assertThat(roundtrippedSoiObservationSetQueryhelpResponse).isEqualTo(soiObservationSetQueryhelpResponse)
    }
}
