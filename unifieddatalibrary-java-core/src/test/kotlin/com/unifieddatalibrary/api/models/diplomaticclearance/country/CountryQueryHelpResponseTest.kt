// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance.country

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.diplomaticclearance.country.CountryQueryHelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryQueryHelpResponseTest {

    @Test
    fun create() {
      val countryQueryHelpResponse = CountryQueryHelpResponse.builder()
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

      assertThat(countryQueryHelpResponse.aodrSupported()).contains(true)
      assertThat(countryQueryHelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(countryQueryHelpResponse.description()).contains("description")
      assertThat(countryQueryHelpResponse.historySupported()).contains(true)
      assertThat(countryQueryHelpResponse.name()).contains("name")
      assertThat(countryQueryHelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(countryQueryHelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(countryQueryHelpResponse.restSupported()).contains(true)
      assertThat(countryQueryHelpResponse.sortSupported()).contains(true)
      assertThat(countryQueryHelpResponse.typeName()).contains("typeName")
      assertThat(countryQueryHelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val countryQueryHelpResponse = CountryQueryHelpResponse.builder()
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

      val roundtrippedCountryQueryHelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(countryQueryHelpResponse), jacksonTypeRef<CountryQueryHelpResponse>())

      assertThat(roundtrippedCountryQueryHelpResponse).isEqualTo(countryQueryHelpResponse)
    }
}
