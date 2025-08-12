// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onboardnavigation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnboardnavigationQueryhelpResponseTest {

    @Test
    fun create() {
      val onboardnavigationQueryhelpResponse = OnboardnavigationQueryhelpResponse.builder()
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

      assertThat(onboardnavigationQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(onboardnavigationQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(onboardnavigationQueryhelpResponse.description()).contains("description")
      assertThat(onboardnavigationQueryhelpResponse.historySupported()).contains(true)
      assertThat(onboardnavigationQueryhelpResponse.name()).contains("name")
      assertThat(onboardnavigationQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(onboardnavigationQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(onboardnavigationQueryhelpResponse.restSupported()).contains(true)
      assertThat(onboardnavigationQueryhelpResponse.sortSupported()).contains(true)
      assertThat(onboardnavigationQueryhelpResponse.typeName()).contains("typeName")
      assertThat(onboardnavigationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val onboardnavigationQueryhelpResponse = OnboardnavigationQueryhelpResponse.builder()
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

      val roundtrippedOnboardnavigationQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(onboardnavigationQueryhelpResponse), jacksonTypeRef<OnboardnavigationQueryhelpResponse>())

      assertThat(roundtrippedOnboardnavigationQueryhelpResponse).isEqualTo(onboardnavigationQueryhelpResponse)
    }
}
