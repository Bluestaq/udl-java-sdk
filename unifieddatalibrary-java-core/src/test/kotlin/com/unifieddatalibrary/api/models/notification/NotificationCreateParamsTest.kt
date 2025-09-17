// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.notification

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationCreateParamsTest {

    @Test
    fun create() {
        NotificationCreateParams.builder()
            .classificationMarking("U")
            .dataMode(NotificationCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            NotificationCreateParams.builder()
                .classificationMarking("U")
                .dataMode(NotificationCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(NotificationCreateParams.DataMode.TEST)
        assertThat(body.msgBody()).isEqualTo("msgBody")
        assertThat(body.msgType()).isEqualTo("msgType")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("NOTIFICATION-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationCreateParams.builder()
                .classificationMarking("U")
                .dataMode(NotificationCreateParams.DataMode.TEST)
                .msgBody("msgBody")
                .msgType("msgType")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(NotificationCreateParams.DataMode.TEST)
        assertThat(body.msgBody()).isEqualTo("msgBody")
        assertThat(body.msgType()).isEqualTo("msgType")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
