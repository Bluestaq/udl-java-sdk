// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectresponses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseQueryHelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectResponseQueryHelpResponseTest {

    @Test
    fun create() {
      val collectResponseQueryHelpResponse = CollectResponseQueryHelpResponse.builder()
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

      assertThat(collectResponseQueryHelpResponse.aodrSupported()).contains(true)
      assertThat(collectResponseQueryHelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(collectResponseQueryHelpResponse.description()).contains("description")
      assertThat(collectResponseQueryHelpResponse.historySupported()).contains(true)
      assertThat(collectResponseQueryHelpResponse.name()).contains("name")
      assertThat(collectResponseQueryHelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(collectResponseQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(collectResponseQueryHelpResponse.restSupported()).contains(true)
      assertThat(collectResponseQueryHelpResponse.sortSupported()).contains(true)
      assertThat(collectResponseQueryHelpResponse.typeName()).contains("typeName")
      assertThat(collectResponseQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val collectResponseQueryHelpResponse = CollectResponseQueryHelpResponse.builder()
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

      val roundtrippedCollectResponseQueryHelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(collectResponseQueryHelpResponse), jacksonTypeRef<CollectResponseQueryHelpResponse>())

      assertThat(roundtrippedCollectResponseQueryHelpResponse).isEqualTo(collectResponseQueryHelpResponse)
    }
}
