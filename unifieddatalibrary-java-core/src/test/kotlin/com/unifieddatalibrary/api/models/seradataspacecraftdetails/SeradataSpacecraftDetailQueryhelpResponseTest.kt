// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.seradataspacecraftdetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.seradataspacecraftdetails.SeradataSpacecraftDetailQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeradataSpacecraftDetailQueryhelpResponseTest {

    @Test
    fun create() {
      val seradataSpacecraftDetailQueryhelpResponse = SeradataSpacecraftDetailQueryhelpResponse.builder()
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

      assertThat(seradataSpacecraftDetailQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(seradataSpacecraftDetailQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(seradataSpacecraftDetailQueryhelpResponse.description()).contains("description")
      assertThat(seradataSpacecraftDetailQueryhelpResponse.historySupported()).contains(true)
      assertThat(seradataSpacecraftDetailQueryhelpResponse.name()).contains("name")
      assertThat(seradataSpacecraftDetailQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(seradataSpacecraftDetailQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(seradataSpacecraftDetailQueryhelpResponse.restSupported()).contains(true)
      assertThat(seradataSpacecraftDetailQueryhelpResponse.sortSupported()).contains(true)
      assertThat(seradataSpacecraftDetailQueryhelpResponse.typeName()).contains("typeName")
      assertThat(seradataSpacecraftDetailQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val seradataSpacecraftDetailQueryhelpResponse = SeradataSpacecraftDetailQueryhelpResponse.builder()
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

      val roundtrippedSeradataSpacecraftDetailQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(seradataSpacecraftDetailQueryhelpResponse), jacksonTypeRef<SeradataSpacecraftDetailQueryhelpResponse>())

      assertThat(roundtrippedSeradataSpacecraftDetailQueryhelpResponse).isEqualTo(seradataSpacecraftDetailQueryhelpResponse)
    }
}
