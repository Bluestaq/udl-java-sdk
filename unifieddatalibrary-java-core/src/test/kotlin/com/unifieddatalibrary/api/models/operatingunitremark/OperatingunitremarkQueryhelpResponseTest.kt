// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.operatingunitremark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.operatingunitremark.OperatingunitremarkQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperatingunitremarkQueryhelpResponseTest {

    @Test
    fun create() {
      val operatingunitremarkQueryhelpResponse = OperatingunitremarkQueryhelpResponse.builder()
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

      assertThat(operatingunitremarkQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(operatingunitremarkQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(operatingunitremarkQueryhelpResponse.description()).contains("description")
      assertThat(operatingunitremarkQueryhelpResponse.historySupported()).contains(true)
      assertThat(operatingunitremarkQueryhelpResponse.name()).contains("name")
      assertThat(operatingunitremarkQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(operatingunitremarkQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(operatingunitremarkQueryhelpResponse.restSupported()).contains(true)
      assertThat(operatingunitremarkQueryhelpResponse.sortSupported()).contains(true)
      assertThat(operatingunitremarkQueryhelpResponse.typeName()).contains("typeName")
      assertThat(operatingunitremarkQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val operatingunitremarkQueryhelpResponse = OperatingunitremarkQueryhelpResponse.builder()
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

      val roundtrippedOperatingunitremarkQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(operatingunitremarkQueryhelpResponse), jacksonTypeRef<OperatingunitremarkQueryhelpResponse>())

      assertThat(roundtrippedOperatingunitremarkQueryhelpResponse).isEqualTo(operatingunitremarkQueryhelpResponse)
    }
}
