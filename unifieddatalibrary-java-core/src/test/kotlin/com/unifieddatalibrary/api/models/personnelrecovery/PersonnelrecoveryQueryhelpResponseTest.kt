// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.personnelrecovery

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PersonnelrecoveryQueryhelpResponseTest {

    @Test
    fun create() {
      val personnelrecoveryQueryhelpResponse = PersonnelrecoveryQueryhelpResponse.builder()
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

      assertThat(personnelrecoveryQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(personnelrecoveryQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(personnelrecoveryQueryhelpResponse.description()).contains("description")
      assertThat(personnelrecoveryQueryhelpResponse.historySupported()).contains(true)
      assertThat(personnelrecoveryQueryhelpResponse.name()).contains("name")
      assertThat(personnelrecoveryQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(personnelrecoveryQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(personnelrecoveryQueryhelpResponse.restSupported()).contains(true)
      assertThat(personnelrecoveryQueryhelpResponse.sortSupported()).contains(true)
      assertThat(personnelrecoveryQueryhelpResponse.typeName()).contains("typeName")
      assertThat(personnelrecoveryQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val personnelrecoveryQueryhelpResponse = PersonnelrecoveryQueryhelpResponse.builder()
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

      val roundtrippedPersonnelrecoveryQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(personnelrecoveryQueryhelpResponse), jacksonTypeRef<PersonnelrecoveryQueryhelpResponse>())

      assertThat(roundtrippedPersonnelrecoveryQueryhelpResponse).isEqualTo(personnelrecoveryQueryhelpResponse)
    }
}
