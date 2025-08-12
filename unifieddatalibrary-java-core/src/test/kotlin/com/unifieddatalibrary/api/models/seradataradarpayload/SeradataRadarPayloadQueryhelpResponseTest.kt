// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataradarpayload

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataRadarPayloadQueryhelpResponseTest {

    @Test
    fun create() {
      val seradataRadarPayloadQueryhelpResponse = SeradataRadarPayloadQueryhelpResponse.builder()
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

      assertThat(seradataRadarPayloadQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(seradataRadarPayloadQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(seradataRadarPayloadQueryhelpResponse.description()).contains("description")
      assertThat(seradataRadarPayloadQueryhelpResponse.historySupported()).contains(true)
      assertThat(seradataRadarPayloadQueryhelpResponse.name()).contains("name")
      assertThat(seradataRadarPayloadQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(seradataRadarPayloadQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(seradataRadarPayloadQueryhelpResponse.restSupported()).contains(true)
      assertThat(seradataRadarPayloadQueryhelpResponse.sortSupported()).contains(true)
      assertThat(seradataRadarPayloadQueryhelpResponse.typeName()).contains("typeName")
      assertThat(seradataRadarPayloadQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val seradataRadarPayloadQueryhelpResponse = SeradataRadarPayloadQueryhelpResponse.builder()
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

      val roundtrippedSeradataRadarPayloadQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(seradataRadarPayloadQueryhelpResponse), jacksonTypeRef<SeradataRadarPayloadQueryhelpResponse>())

      assertThat(roundtrippedSeradataRadarPayloadQueryhelpResponse).isEqualTo(seradataRadarPayloadQueryhelpResponse)
    }
}
