// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.status

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.status.StatusQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusQueryhelpResponseTest {

    @Test
    fun create() {
      val statusQueryhelpResponse = StatusQueryhelpResponse.builder()
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

      assertThat(statusQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(statusQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(statusQueryhelpResponse.description()).contains("description")
      assertThat(statusQueryhelpResponse.historySupported()).contains(true)
      assertThat(statusQueryhelpResponse.name()).contains("name")
      assertThat(statusQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(statusQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(statusQueryhelpResponse.restSupported()).contains(true)
      assertThat(statusQueryhelpResponse.sortSupported()).contains(true)
      assertThat(statusQueryhelpResponse.typeName()).contains("typeName")
      assertThat(statusQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val statusQueryhelpResponse = StatusQueryhelpResponse.builder()
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

      val roundtrippedStatusQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(statusQueryhelpResponse), jacksonTypeRef<StatusQueryhelpResponse>())

      assertThat(roundtrippedStatusQueryhelpResponse).isEqualTo(statusQueryhelpResponse)
    }
}
