// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sarobservation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.sarobservation.SarObservationQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SarObservationQueryhelpResponseTest {

    @Test
    fun create() {
      val sarObservationQueryhelpResponse = SarObservationQueryhelpResponse.builder()
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

      assertThat(sarObservationQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(sarObservationQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(sarObservationQueryhelpResponse.description()).contains("description")
      assertThat(sarObservationQueryhelpResponse.historySupported()).contains(true)
      assertThat(sarObservationQueryhelpResponse.name()).contains("name")
      assertThat(sarObservationQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(sarObservationQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(sarObservationQueryhelpResponse.restSupported()).contains(true)
      assertThat(sarObservationQueryhelpResponse.sortSupported()).contains(true)
      assertThat(sarObservationQueryhelpResponse.typeName()).contains("typeName")
      assertThat(sarObservationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sarObservationQueryhelpResponse = SarObservationQueryhelpResponse.builder()
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

      val roundtrippedSarObservationQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(sarObservationQueryhelpResponse), jacksonTypeRef<SarObservationQueryhelpResponse>())

      assertThat(roundtrippedSarObservationQueryhelpResponse).isEqualTo(sarObservationQueryhelpResponse)
    }
}
