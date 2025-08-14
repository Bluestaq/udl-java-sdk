// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batteries

import com.unifieddatalibrary.api.models.BatteryIngest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatteryUpdateParamsTest {

    @Test
    fun create() {
        BatteryUpdateParams.builder()
            .pathId("id")
            .batteryIngest(
                BatteryIngest.builder()
                    .dataMode(BatteryIngest.DataMode.TEST)
                    .name("JAK-BATTERY-1479")
                    .source("Bluestaq")
                    .id("BATTERY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatteryUpdateParams.builder()
                .pathId("id")
                .batteryIngest(
                    BatteryIngest.builder()
                        .dataMode(BatteryIngest.DataMode.TEST)
                        .name("JAK-BATTERY-1479")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BatteryUpdateParams.builder()
                .pathId("id")
                .batteryIngest(
                    BatteryIngest.builder()
                        .dataMode(BatteryIngest.DataMode.TEST)
                        .name("JAK-BATTERY-1479")
                        .source("Bluestaq")
                        .id("BATTERY-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatteryIngest.builder()
                    .dataMode(BatteryIngest.DataMode.TEST)
                    .name("JAK-BATTERY-1479")
                    .source("Bluestaq")
                    .id("BATTERY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatteryUpdateParams.builder()
                .pathId("id")
                .batteryIngest(
                    BatteryIngest.builder()
                        .dataMode(BatteryIngest.DataMode.TEST)
                        .name("JAK-BATTERY-1479")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatteryIngest.builder()
                    .dataMode(BatteryIngest.DataMode.TEST)
                    .name("JAK-BATTERY-1479")
                    .source("Bluestaq")
                    .build()
            )
    }
}
