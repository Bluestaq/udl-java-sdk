// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipmentremarks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.equipmentremarks.EquipmentRemarkQueryHelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EquipmentRemarkQueryHelpResponseTest {

    @Test
    fun create() {
      val equipmentRemarkQueryHelpResponse = EquipmentRemarkQueryHelpResponse.builder()
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

      assertThat(equipmentRemarkQueryHelpResponse.aodrSupported()).contains(true)
      assertThat(equipmentRemarkQueryHelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(equipmentRemarkQueryHelpResponse.description()).contains("description")
      assertThat(equipmentRemarkQueryHelpResponse.historySupported()).contains(true)
      assertThat(equipmentRemarkQueryHelpResponse.name()).contains("name")
      assertThat(equipmentRemarkQueryHelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(equipmentRemarkQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(equipmentRemarkQueryHelpResponse.restSupported()).contains(true)
      assertThat(equipmentRemarkQueryHelpResponse.sortSupported()).contains(true)
      assertThat(equipmentRemarkQueryHelpResponse.typeName()).contains("typeName")
      assertThat(equipmentRemarkQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val equipmentRemarkQueryHelpResponse = EquipmentRemarkQueryHelpResponse.builder()
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

      val roundtrippedEquipmentRemarkQueryHelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(equipmentRemarkQueryHelpResponse), jacksonTypeRef<EquipmentRemarkQueryHelpResponse>())

      assertThat(roundtrippedEquipmentRemarkQueryHelpResponse).isEqualTo(equipmentRemarkQueryHelpResponse)
    }
}
