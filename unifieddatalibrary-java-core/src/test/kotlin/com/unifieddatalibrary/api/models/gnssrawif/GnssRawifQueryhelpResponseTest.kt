// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssrawif

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GnssRawIfQueryhelpResponseTest {

    @Test
    fun create() {
      val gnssRawIfQueryhelpResponse = GnssRawIfQueryhelpResponse.builder()
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

      assertThat(gnssRawIfQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(gnssRawIfQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(gnssRawIfQueryhelpResponse.description()).contains("description")
      assertThat(gnssRawIfQueryhelpResponse.historySupported()).contains(true)
      assertThat(gnssRawIfQueryhelpResponse.name()).contains("name")
      assertThat(gnssRawIfQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(gnssRawIfQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(gnssRawIfQueryhelpResponse.restSupported()).contains(true)
      assertThat(gnssRawIfQueryhelpResponse.sortSupported()).contains(true)
      assertThat(gnssRawIfQueryhelpResponse.typeName()).contains("typeName")
      assertThat(gnssRawIfQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val gnssRawIfQueryhelpResponse = GnssRawIfQueryhelpResponse.builder()
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

      val roundtrippedGnssRawIfQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(gnssRawIfQueryhelpResponse), jacksonTypeRef<GnssRawIfQueryhelpResponse>())

      assertThat(roundtrippedGnssRawIfQueryhelpResponse).isEqualTo(gnssRawIfQueryhelpResponse)
    }
}
