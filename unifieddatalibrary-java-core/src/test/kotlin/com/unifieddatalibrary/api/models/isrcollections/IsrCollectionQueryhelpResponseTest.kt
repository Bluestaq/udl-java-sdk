// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.isrcollections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsrCollectionQueryhelpResponseTest {

    @Test
    fun create() {
      val isrCollectionQueryhelpResponse = IsrCollectionQueryhelpResponse.builder()
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

      assertThat(isrCollectionQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(isrCollectionQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(isrCollectionQueryhelpResponse.description()).contains("description")
      assertThat(isrCollectionQueryhelpResponse.historySupported()).contains(true)
      assertThat(isrCollectionQueryhelpResponse.name()).contains("name")
      assertThat(isrCollectionQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(isrCollectionQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(isrCollectionQueryhelpResponse.restSupported()).contains(true)
      assertThat(isrCollectionQueryhelpResponse.sortSupported()).contains(true)
      assertThat(isrCollectionQueryhelpResponse.typeName()).contains("typeName")
      assertThat(isrCollectionQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val isrCollectionQueryhelpResponse = IsrCollectionQueryhelpResponse.builder()
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

      val roundtrippedIsrCollectionQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(isrCollectionQueryhelpResponse), jacksonTypeRef<IsrCollectionQueryhelpResponse>())

      assertThat(roundtrippedIsrCollectionQueryhelpResponse).isEqualTo(isrCollectionQueryhelpResponse)
    }
}
