// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.weatherreport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.weatherreport.WeatherReportQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WeatherReportQueryhelpResponseTest {

    @Test
    fun create() {
      val weatherReportQueryhelpResponse = WeatherReportQueryhelpResponse.builder()
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

      assertThat(weatherReportQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(weatherReportQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(weatherReportQueryhelpResponse.description()).contains("description")
      assertThat(weatherReportQueryhelpResponse.historySupported()).contains(true)
      assertThat(weatherReportQueryhelpResponse.name()).contains("name")
      assertThat(weatherReportQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(weatherReportQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(weatherReportQueryhelpResponse.restSupported()).contains(true)
      assertThat(weatherReportQueryhelpResponse.sortSupported()).contains(true)
      assertThat(weatherReportQueryhelpResponse.typeName()).contains("typeName")
      assertThat(weatherReportQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val weatherReportQueryhelpResponse = WeatherReportQueryhelpResponse.builder()
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

      val roundtrippedWeatherReportQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(weatherReportQueryhelpResponse), jacksonTypeRef<WeatherReportQueryhelpResponse>())

      assertThat(roundtrippedWeatherReportQueryhelpResponse).isEqualTo(weatherReportQueryhelpResponse)
    }
}
