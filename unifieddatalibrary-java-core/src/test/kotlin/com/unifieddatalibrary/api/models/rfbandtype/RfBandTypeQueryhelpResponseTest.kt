// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfbandtype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandTypeQueryhelpResponseTest {

    @Test
    fun create() {
      val rfBandTypeQueryhelpResponse = RfBandTypeQueryhelpResponse.builder()
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

      assertThat(rfBandTypeQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(rfBandTypeQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(rfBandTypeQueryhelpResponse.description()).contains("description")
      assertThat(rfBandTypeQueryhelpResponse.historySupported()).contains(true)
      assertThat(rfBandTypeQueryhelpResponse.name()).contains("name")
      assertThat(rfBandTypeQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(rfBandTypeQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(rfBandTypeQueryhelpResponse.restSupported()).contains(true)
      assertThat(rfBandTypeQueryhelpResponse.sortSupported()).contains(true)
      assertThat(rfBandTypeQueryhelpResponse.typeName()).contains("typeName")
      assertThat(rfBandTypeQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val rfBandTypeQueryhelpResponse = RfBandTypeQueryhelpResponse.builder()
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

      val roundtrippedRfBandTypeQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(rfBandTypeQueryhelpResponse), jacksonTypeRef<RfBandTypeQueryhelpResponse>())

      assertThat(roundtrippedRfBandTypeQueryhelpResponse).isEqualTo(rfBandTypeQueryhelpResponse)
    }
}
