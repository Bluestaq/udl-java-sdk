// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationFullTest {

    @Test
    fun create() {
        val notificationFull =
            NotificationFull.builder()
                .classificationMarking("U")
                .dataMode(NotificationFull.DataMode.TEST)
                .msgBody("msgBody")
                .msgType("msgType")
                .source("Bluestaq")
                .id("NOTIFICATION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .build()

        assertThat(notificationFull.classificationMarking()).isEqualTo("U")
        assertThat(notificationFull.dataMode()).isEqualTo(NotificationFull.DataMode.TEST)
        assertThat(notificationFull.msgBody()).isEqualTo("msgBody")
        assertThat(notificationFull.msgType()).isEqualTo("msgType")
        assertThat(notificationFull.source()).isEqualTo("Bluestaq")
        assertThat(notificationFull.id()).contains("NOTIFICATION-ID")
        assertThat(notificationFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(notificationFull.createdBy()).contains("some.user")
        assertThat(notificationFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(notificationFull.origNetwork()).contains("OPS1")
        assertThat(notificationFull.sourceDl()).contains("AXE")
        assertThat(notificationFull.tags().getOrNull()).containsExactly("TAG1", "TAG2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationFull =
            NotificationFull.builder()
                .classificationMarking("U")
                .dataMode(NotificationFull.DataMode.TEST)
                .msgBody("msgBody")
                .msgType("msgType")
                .source("Bluestaq")
                .id("NOTIFICATION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .build()

        val roundtrippedNotificationFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationFull),
                jacksonTypeRef<NotificationFull>(),
            )

        assertThat(roundtrippedNotificationFull).isEqualTo(notificationFull)
    }
}
