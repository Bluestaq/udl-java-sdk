// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sgi

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.sgi.SgiQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgiQueryhelpResponseTest {

    @Test
    fun create() {
      val sgiQueryhelpResponse = SgiQueryhelpResponse.builder()
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

      assertThat(sgiQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(sgiQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(sgiQueryhelpResponse.description()).contains("description")
      assertThat(sgiQueryhelpResponse.historySupported()).contains(true)
      assertThat(sgiQueryhelpResponse.name()).contains("name")
      assertThat(sgiQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(sgiQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(sgiQueryhelpResponse.restSupported()).contains(true)
      assertThat(sgiQueryhelpResponse.sortSupported()).contains(true)
      assertThat(sgiQueryhelpResponse.typeName()).contains("typeName")
      assertThat(sgiQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sgiQueryhelpResponse = SgiQueryhelpResponse.builder()
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

      val roundtrippedSgiQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(sgiQueryhelpResponse), jacksonTypeRef<SgiQueryhelpResponse>())

      assertThat(roundtrippedSgiQueryhelpResponse).isEqualTo(sgiQueryhelpResponse)
    }
}
