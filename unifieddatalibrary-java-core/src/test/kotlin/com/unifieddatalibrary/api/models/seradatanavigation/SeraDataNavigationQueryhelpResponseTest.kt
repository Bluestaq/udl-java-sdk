// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradatanavigation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeraDataNavigationQueryhelpResponseTest {

    @Test
    fun create() {
      val seraDataNavigationQueryhelpResponse = SeraDataNavigationQueryhelpResponse.builder()
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

      assertThat(seraDataNavigationQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(seraDataNavigationQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(seraDataNavigationQueryhelpResponse.description()).contains("description")
      assertThat(seraDataNavigationQueryhelpResponse.historySupported()).contains(true)
      assertThat(seraDataNavigationQueryhelpResponse.name()).contains("name")
      assertThat(seraDataNavigationQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(seraDataNavigationQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(seraDataNavigationQueryhelpResponse.restSupported()).contains(true)
      assertThat(seraDataNavigationQueryhelpResponse.sortSupported()).contains(true)
      assertThat(seraDataNavigationQueryhelpResponse.typeName()).contains("typeName")
      assertThat(seraDataNavigationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val seraDataNavigationQueryhelpResponse = SeraDataNavigationQueryhelpResponse.builder()
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

      val roundtrippedSeraDataNavigationQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(seraDataNavigationQueryhelpResponse), jacksonTypeRef<SeraDataNavigationQueryhelpResponse>())

      assertThat(roundtrippedSeraDataNavigationQueryhelpResponse).isEqualTo(seraDataNavigationQueryhelpResponse)
    }
}
