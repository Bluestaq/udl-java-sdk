// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.navigation.NavigationQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NavigationQueryhelpResponseTest {

    @Test
    fun create() {
      val navigationQueryhelpResponse = NavigationQueryhelpResponse.builder()
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

      assertThat(navigationQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(navigationQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(navigationQueryhelpResponse.description()).contains("description")
      assertThat(navigationQueryhelpResponse.historySupported()).contains(true)
      assertThat(navigationQueryhelpResponse.name()).contains("name")
      assertThat(navigationQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(navigationQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(navigationQueryhelpResponse.restSupported()).contains(true)
      assertThat(navigationQueryhelpResponse.sortSupported()).contains(true)
      assertThat(navigationQueryhelpResponse.typeName()).contains("typeName")
      assertThat(navigationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val navigationQueryhelpResponse = NavigationQueryhelpResponse.builder()
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

      val roundtrippedNavigationQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(navigationQueryhelpResponse), jacksonTypeRef<NavigationQueryhelpResponse>())

      assertThat(roundtrippedNavigationQueryhelpResponse).isEqualTo(navigationQueryhelpResponse)
    }
}
