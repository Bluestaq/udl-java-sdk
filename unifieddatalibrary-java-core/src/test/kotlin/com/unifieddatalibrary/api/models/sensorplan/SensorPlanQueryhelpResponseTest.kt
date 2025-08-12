// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorplan

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.sensorplan.SensorPlanQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorPlanQueryhelpResponseTest {

    @Test
    fun create() {
      val sensorPlanQueryhelpResponse = SensorPlanQueryhelpResponse.builder()
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

      assertThat(sensorPlanQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(sensorPlanQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(sensorPlanQueryhelpResponse.description()).contains("description")
      assertThat(sensorPlanQueryhelpResponse.historySupported()).contains(true)
      assertThat(sensorPlanQueryhelpResponse.name()).contains("name")
      assertThat(sensorPlanQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(sensorPlanQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(sensorPlanQueryhelpResponse.restSupported()).contains(true)
      assertThat(sensorPlanQueryhelpResponse.sortSupported()).contains(true)
      assertThat(sensorPlanQueryhelpResponse.typeName()).contains("typeName")
      assertThat(sensorPlanQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sensorPlanQueryhelpResponse = SensorPlanQueryhelpResponse.builder()
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

      val roundtrippedSensorPlanQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(sensorPlanQueryhelpResponse), jacksonTypeRef<SensorPlanQueryhelpResponse>())

      assertThat(roundtrippedSensorPlanQueryhelpResponse).isEqualTo(sensorPlanQueryhelpResponse)
    }
}
