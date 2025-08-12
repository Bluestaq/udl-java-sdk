// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.onorbit.OnorbitQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitQueryhelpResponseTest {

    @Test
    fun create() {
      val onorbitQueryhelpResponse = OnorbitQueryhelpResponse.builder()
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

      assertThat(onorbitQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(onorbitQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(onorbitQueryhelpResponse.description()).contains("description")
      assertThat(onorbitQueryhelpResponse.historySupported()).contains(true)
      assertThat(onorbitQueryhelpResponse.name()).contains("name")
      assertThat(onorbitQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(onorbitQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(onorbitQueryhelpResponse.restSupported()).contains(true)
      assertThat(onorbitQueryhelpResponse.sortSupported()).contains(true)
      assertThat(onorbitQueryhelpResponse.typeName()).contains("typeName")
      assertThat(onorbitQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val onorbitQueryhelpResponse = OnorbitQueryhelpResponse.builder()
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

      val roundtrippedOnorbitQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(onorbitQueryhelpResponse), jacksonTypeRef<OnorbitQueryhelpResponse>())

      assertThat(roundtrippedOnorbitQueryhelpResponse).isEqualTo(onorbitQueryhelpResponse)
    }
}
