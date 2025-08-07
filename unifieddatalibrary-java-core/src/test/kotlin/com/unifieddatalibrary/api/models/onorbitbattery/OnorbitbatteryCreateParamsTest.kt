// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitbattery

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitbatteryCreateParamsTest {

    @Test
    fun create() {
        OnorbitbatteryCreateParams.builder()
            .classificationMarking("U")
            .dataMode(OnorbitbatteryCreateParams.DataMode.TEST)
            .idBattery("BATTERY-ID")
            .idOnOrbit("ONORBIT-ID")
            .source("Bluestaq")
            .id("ONORBITBATTERY-ID")
            .battery(
                OnorbitbatteryCreateParams.Battery.builder()
                    .dataMode(OnorbitbatteryCreateParams.Battery.DataMode.TEST)
                    .name("JAK-BATTERY-1479")
                    .source("Bluestaq")
                    .id("BATTERY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .quantity(5)
            .build()
    }

    @Test
    fun body() {
        val params =
            OnorbitbatteryCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitbatteryCreateParams.DataMode.TEST)
                .idBattery("BATTERY-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .id("ONORBITBATTERY-ID")
                .battery(
                    OnorbitbatteryCreateParams.Battery.builder()
                        .dataMode(OnorbitbatteryCreateParams.Battery.DataMode.TEST)
                        .name("JAK-BATTERY-1479")
                        .source("Bluestaq")
                        .id("BATTERY-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .quantity(5)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitbatteryCreateParams.DataMode.TEST)
        assertThat(body.idBattery()).isEqualTo("BATTERY-ID")
        assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ONORBITBATTERY-ID")
        assertThat(body.battery())
            .contains(
                OnorbitbatteryCreateParams.Battery.builder()
                    .dataMode(OnorbitbatteryCreateParams.Battery.DataMode.TEST)
                    .name("JAK-BATTERY-1479")
                    .source("Bluestaq")
                    .id("BATTERY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.quantity()).contains(5)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnorbitbatteryCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitbatteryCreateParams.DataMode.TEST)
                .idBattery("BATTERY-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitbatteryCreateParams.DataMode.TEST)
        assertThat(body.idBattery()).isEqualTo("BATTERY-ID")
        assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
