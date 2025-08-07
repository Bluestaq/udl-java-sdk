// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batteries

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatteryCreateParamsTest {

    @Test
    fun create() {
        BatteryCreateParams.builder()
            .dataMode(BatteryCreateParams.DataMode.TEST)
            .name("JAK-BATTERY-1479")
            .source("Bluestaq")
            .id("BATTERY-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun body() {
        val params =
            BatteryCreateParams.builder()
                .dataMode(BatteryCreateParams.DataMode.TEST)
                .name("JAK-BATTERY-1479")
                .source("Bluestaq")
                .id("BATTERY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(BatteryCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("JAK-BATTERY-1479")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("BATTERY-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatteryCreateParams.builder()
                .dataMode(BatteryCreateParams.DataMode.TEST)
                .name("JAK-BATTERY-1479")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(BatteryCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("JAK-BATTERY-1479")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
