// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus.datalink

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.linkstatus.datalink.DatalinkQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatalinkQueryhelpResponseTest {

    @Test
    fun create() {
      val datalinkQueryhelpResponse = DatalinkQueryhelpResponse.builder()
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

      assertThat(datalinkQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(datalinkQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(datalinkQueryhelpResponse.description()).contains("description")
      assertThat(datalinkQueryhelpResponse.historySupported()).contains(true)
      assertThat(datalinkQueryhelpResponse.name()).contains("name")
      assertThat(datalinkQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(datalinkQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(datalinkQueryhelpResponse.restSupported()).contains(true)
      assertThat(datalinkQueryhelpResponse.sortSupported()).contains(true)
      assertThat(datalinkQueryhelpResponse.typeName()).contains("typeName")
      assertThat(datalinkQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val datalinkQueryhelpResponse = DatalinkQueryhelpResponse.builder()
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

      val roundtrippedDatalinkQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(datalinkQueryhelpResponse), jacksonTypeRef<DatalinkQueryhelpResponse>())

      assertThat(roundtrippedDatalinkQueryhelpResponse).isEqualTo(datalinkQueryhelpResponse)
    }
}
