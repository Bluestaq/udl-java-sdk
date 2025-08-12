// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchsite

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchSiteQueryhelpResponseTest {

    @Test
    fun create() {
      val launchSiteQueryhelpResponse = LaunchSiteQueryhelpResponse.builder()
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

      assertThat(launchSiteQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(launchSiteQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(launchSiteQueryhelpResponse.description()).contains("description")
      assertThat(launchSiteQueryhelpResponse.historySupported()).contains(true)
      assertThat(launchSiteQueryhelpResponse.name()).contains("name")
      assertThat(launchSiteQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(launchSiteQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(launchSiteQueryhelpResponse.restSupported()).contains(true)
      assertThat(launchSiteQueryhelpResponse.sortSupported()).contains(true)
      assertThat(launchSiteQueryhelpResponse.typeName()).contains("typeName")
      assertThat(launchSiteQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val launchSiteQueryhelpResponse = LaunchSiteQueryhelpResponse.builder()
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

      val roundtrippedLaunchSiteQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(launchSiteQueryhelpResponse), jacksonTypeRef<LaunchSiteQueryhelpResponse>())

      assertThat(roundtrippedLaunchSiteQueryhelpResponse).isEqualTo(launchSiteQueryhelpResponse)
    }
}
