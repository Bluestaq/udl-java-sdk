// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.notification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationListResponseTest {

    @Test
    fun create() {
        val notificationListResponse =
            NotificationListResponse.builder()
                .classificationMarking("U")
                .dataMode(NotificationListResponse.DataMode.TEST)
                .msgBody("msgBody")
                .msgType("msgType")
                .source("Bluestaq")
                .id("NOTIFICATION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .build()

        assertThat(notificationListResponse.classificationMarking()).isEqualTo("U")
        assertThat(notificationListResponse.dataMode())
            .isEqualTo(NotificationListResponse.DataMode.TEST)
        assertThat(notificationListResponse.msgBody()).isEqualTo("msgBody")
        assertThat(notificationListResponse.msgType()).isEqualTo("msgType")
        assertThat(notificationListResponse.source()).isEqualTo("Bluestaq")
        assertThat(notificationListResponse.id()).contains("NOTIFICATION-ID")
        assertThat(notificationListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(notificationListResponse.createdBy()).contains("some.user")
        assertThat(notificationListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(notificationListResponse.origNetwork()).contains("ORIG")
        assertThat(notificationListResponse.sourceDl()).contains("AXE")
        assertThat(notificationListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationListResponse =
            NotificationListResponse.builder()
                .classificationMarking("U")
                .dataMode(NotificationListResponse.DataMode.TEST)
                .msgBody("msgBody")
                .msgType("msgType")
                .source("Bluestaq")
                .id("NOTIFICATION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .build()

        val roundtrippedNotificationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationListResponse),
                jacksonTypeRef<NotificationListResponse>(),
            )

        assertThat(roundtrippedNotificationListResponse).isEqualTo(notificationListResponse)
    }
}
