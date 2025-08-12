// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParamDescriptorTest {

    @Test
    fun create() {
      val paramDescriptor = ParamDescriptor.builder()
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
          .build()

      assertThat(paramDescriptor.classificationMarking()).contains("classificationMarking")
      assertThat(paramDescriptor.derived()).contains(true)
      assertThat(paramDescriptor.description()).contains("description")
      assertThat(paramDescriptor.elemMatch()).contains(true)
      assertThat(paramDescriptor.format()).contains("format")
      assertThat(paramDescriptor.histQuerySupported()).contains(true)
      assertThat(paramDescriptor.histTupleSupported()).contains(true)
      assertThat(paramDescriptor.name()).contains("name")
      assertThat(paramDescriptor.required()).contains(true)
      assertThat(paramDescriptor.restQuerySupported()).contains(true)
      assertThat(paramDescriptor.restTupleSupported()).contains(true)
      assertThat(paramDescriptor.type()).contains("type")
      assertThat(paramDescriptor.unitOfMeasure()).contains("unitOfMeasure")
      assertThat(paramDescriptor.utcDate()).contains(true)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val paramDescriptor = ParamDescriptor.builder()
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
          .build()

      val roundtrippedParamDescriptor = jsonMapper.readValue(jsonMapper.writeValueAsString(paramDescriptor), jacksonTypeRef<ParamDescriptor>())

      assertThat(roundtrippedParamDescriptor).isEqualTo(paramDescriptor)
    }
}
