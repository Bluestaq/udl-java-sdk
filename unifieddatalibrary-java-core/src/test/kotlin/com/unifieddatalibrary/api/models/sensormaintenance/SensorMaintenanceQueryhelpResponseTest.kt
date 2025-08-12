// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensormaintenance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorMaintenanceQueryhelpResponseTest {

    @Test
    fun create() {
      val sensorMaintenanceQueryhelpResponse = SensorMaintenanceQueryhelpResponse.builder()
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

      assertThat(sensorMaintenanceQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(sensorMaintenanceQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(sensorMaintenanceQueryhelpResponse.description()).contains("description")
      assertThat(sensorMaintenanceQueryhelpResponse.historySupported()).contains(true)
      assertThat(sensorMaintenanceQueryhelpResponse.name()).contains("name")
      assertThat(sensorMaintenanceQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(sensorMaintenanceQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(sensorMaintenanceQueryhelpResponse.restSupported()).contains(true)
      assertThat(sensorMaintenanceQueryhelpResponse.sortSupported()).contains(true)
      assertThat(sensorMaintenanceQueryhelpResponse.typeName()).contains("typeName")
      assertThat(sensorMaintenanceQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sensorMaintenanceQueryhelpResponse = SensorMaintenanceQueryhelpResponse.builder()
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

      val roundtrippedSensorMaintenanceQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(sensorMaintenanceQueryhelpResponse), jacksonTypeRef<SensorMaintenanceQueryhelpResponse>())

      assertThat(roundtrippedSensorMaintenanceQueryhelpResponse).isEqualTo(sensorMaintenanceQueryhelpResponse)
    }
}
