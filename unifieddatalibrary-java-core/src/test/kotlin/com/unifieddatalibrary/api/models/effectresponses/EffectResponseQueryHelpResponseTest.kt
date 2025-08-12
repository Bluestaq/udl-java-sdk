// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectresponses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseQueryHelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EffectResponseQueryHelpResponseTest {

    @Test
    fun create() {
      val effectResponseQueryHelpResponse = EffectResponseQueryHelpResponse.builder()
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

      assertThat(effectResponseQueryHelpResponse.aodrSupported()).contains(true)
      assertThat(effectResponseQueryHelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(effectResponseQueryHelpResponse.description()).contains("description")
      assertThat(effectResponseQueryHelpResponse.historySupported()).contains(true)
      assertThat(effectResponseQueryHelpResponse.name()).contains("name")
      assertThat(effectResponseQueryHelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(effectResponseQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(effectResponseQueryHelpResponse.restSupported()).contains(true)
      assertThat(effectResponseQueryHelpResponse.sortSupported()).contains(true)
      assertThat(effectResponseQueryHelpResponse.typeName()).contains("typeName")
      assertThat(effectResponseQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val effectResponseQueryHelpResponse = EffectResponseQueryHelpResponse.builder()
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

      val roundtrippedEffectResponseQueryHelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(effectResponseQueryHelpResponse), jacksonTypeRef<EffectResponseQueryHelpResponse>())

      assertThat(roundtrippedEffectResponseQueryHelpResponse).isEqualTo(effectResponseQueryHelpResponse)
    }
}
