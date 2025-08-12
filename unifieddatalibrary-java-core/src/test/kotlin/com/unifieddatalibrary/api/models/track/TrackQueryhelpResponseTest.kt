// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.track

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.track.TrackQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackQueryhelpResponseTest {

    @Test
    fun create() {
      val trackQueryhelpResponse = TrackQueryhelpResponse.builder()
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

      assertThat(trackQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(trackQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(trackQueryhelpResponse.description()).contains("description")
      assertThat(trackQueryhelpResponse.historySupported()).contains(true)
      assertThat(trackQueryhelpResponse.name()).contains("name")
      assertThat(trackQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(trackQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(trackQueryhelpResponse.restSupported()).contains(true)
      assertThat(trackQueryhelpResponse.sortSupported()).contains(true)
      assertThat(trackQueryhelpResponse.typeName()).contains("typeName")
      assertThat(trackQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val trackQueryhelpResponse = TrackQueryhelpResponse.builder()
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

      val roundtrippedTrackQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(trackQueryhelpResponse), jacksonTypeRef<TrackQueryhelpResponse>())

      assertThat(roundtrippedTrackQueryhelpResponse).isEqualTo(trackQueryhelpResponse)
    }
}
