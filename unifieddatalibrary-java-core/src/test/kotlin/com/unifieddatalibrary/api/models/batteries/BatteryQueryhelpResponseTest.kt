// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batteries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.batteries.BatteryQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatteryQueryhelpResponseTest {

    @Test
    fun create() {
      val batteryQueryhelpResponse = BatteryQueryhelpResponse.builder()
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

      assertThat(batteryQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(batteryQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(batteryQueryhelpResponse.description()).contains("description")
      assertThat(batteryQueryhelpResponse.historySupported()).contains(true)
      assertThat(batteryQueryhelpResponse.name()).contains("name")
      assertThat(batteryQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(batteryQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(batteryQueryhelpResponse.restSupported()).contains(true)
      assertThat(batteryQueryhelpResponse.sortSupported()).contains(true)
      assertThat(batteryQueryhelpResponse.typeName()).contains("typeName")
      assertThat(batteryQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val batteryQueryhelpResponse = BatteryQueryhelpResponse.builder()
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

      val roundtrippedBatteryQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(batteryQueryhelpResponse), jacksonTypeRef<BatteryQueryhelpResponse>())

      assertThat(roundtrippedBatteryQueryhelpResponse).isEqualTo(batteryQueryhelpResponse)
    }
}
