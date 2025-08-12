// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.notification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import com.unifieddatalibrary.api.models.notification.NotificationQueryhelpResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationQueryhelpResponseTest {

    @Test
    fun create() {
      val notificationQueryhelpResponse = NotificationQueryhelpResponse.builder()
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

      assertThat(notificationQueryhelpResponse.aodrSupported()).contains(true)
      assertThat(notificationQueryhelpResponse.classificationMarking()).contains("classificationMarking")
      assertThat(notificationQueryhelpResponse.description()).contains("description")
      assertThat(notificationQueryhelpResponse.historySupported()).contains(true)
      assertThat(notificationQueryhelpResponse.name()).contains("name")
      assertThat(notificationQueryhelpResponse.parameters().getOrNull()).containsExactly(ParamDescriptor.builder()
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
      assertThat(notificationQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
      assertThat(notificationQueryhelpResponse.restSupported()).contains(true)
      assertThat(notificationQueryhelpResponse.sortSupported()).contains(true)
      assertThat(notificationQueryhelpResponse.typeName()).contains("typeName")
      assertThat(notificationQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val notificationQueryhelpResponse = NotificationQueryhelpResponse.builder()
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

      val roundtrippedNotificationQueryhelpResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(notificationQueryhelpResponse), jacksonTypeRef<NotificationQueryhelpResponse>())

      assertThat(roundtrippedNotificationQueryhelpResponse).isEqualTo(notificationQueryhelpResponse)
    }
}
