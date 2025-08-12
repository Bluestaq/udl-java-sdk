// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ionoobservations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.ionoobservations.IonoObservationQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IonoObservationQueryhelpResponseTest {

    @Test
    fun create() {
      val ionoObservationQueryhelpResponse = IonoObservationQueryhelpResponse.builder()
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

      assertThat(ionoObservationQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(ionoObservationQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(ionoObservationQueryhelpResponse.description()).contains("description")
      assertThat(ionoObservationQueryhelpResponse.historySupported()).contains(true)
      assertThat(ionoObservationQueryhelpResponse.name()).contains("name")
      assertThat(ionoObservationQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(ionoObservationQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(ionoObservationQueryhelpResponse.restSupported()).contains(true)
      assertThat(ionoObservationQueryhelpResponse.sortSupported()).contains(true)
      assertThat(ionoObservationQueryhelpResponse.typeName()).contains("typeName")
      assertThat(ionoObservationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val ionoObservationQueryhelpResponse = IonoObservationQueryhelpResponse.builder()
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

      val roundtrippedIonoObservationQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(ionoObservationQueryhelpResponse), jacksonTypeRef<IonoObservationQueryhelpResponse>())

      assertThat(roundtrippedIonoObservationQueryhelpResponse).isEqualTo(ionoObservationQueryhelpResponse)
    }
}
