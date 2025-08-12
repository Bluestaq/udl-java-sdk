// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.surface

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.surface.SurfaceQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SurfaceQueryhelpResponseTest {

    @Test
    fun create() {
      val surfaceQueryhelpResponse = SurfaceQueryhelpResponse.builder()
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

      assertThat(surfaceQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(surfaceQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(surfaceQueryhelpResponse.description()).contains("description")
      assertThat(surfaceQueryhelpResponse.historySupported()).contains(true)
      assertThat(surfaceQueryhelpResponse.name()).contains("name")
      assertThat(surfaceQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(surfaceQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(surfaceQueryhelpResponse.restSupported()).contains(true)
      assertThat(surfaceQueryhelpResponse.sortSupported()).contains(true)
      assertThat(surfaceQueryhelpResponse.typeName()).contains("typeName")
      assertThat(surfaceQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val surfaceQueryhelpResponse = SurfaceQueryhelpResponse.builder()
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

      val roundtrippedSurfaceQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(surfaceQueryhelpResponse), jacksonTypeRef<SurfaceQueryhelpResponse>())

      assertThat(roundtrippedSurfaceQueryhelpResponse).isEqualTo(surfaceQueryhelpResponse)
    }
}
