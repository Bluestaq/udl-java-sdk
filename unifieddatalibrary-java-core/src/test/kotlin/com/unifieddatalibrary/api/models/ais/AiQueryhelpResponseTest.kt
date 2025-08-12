// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ais

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.ais.AiQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiQueryhelpResponseTest {

    @Test
    fun create() {
      val aiQueryhelpResponse = AiQueryhelpResponse.builder()
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

      assertThat(aiQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(aiQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(aiQueryhelpResponse.description()).contains("description")
      assertThat(aiQueryhelpResponse.historySupported()).contains(true)
      assertThat(aiQueryhelpResponse.name()).contains("name")
      assertThat(aiQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(aiQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(aiQueryhelpResponse.restSupported()).contains(true)
      assertThat(aiQueryhelpResponse.sortSupported()).contains(true)
      assertThat(aiQueryhelpResponse.typeName()).contains("typeName")
      assertThat(aiQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val aiQueryhelpResponse = AiQueryhelpResponse.builder()
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

      val roundtrippedAiQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(aiQueryhelpResponse), jacksonTypeRef<AiQueryhelpResponse>())

      assertThat(roundtrippedAiQueryhelpResponse).isEqualTo(aiQueryhelpResponse)
    }
}
