// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batteries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatteryAbridgedTest {

    @Test
    fun create() {
        val batteryAbridged =
            BatteryAbridged.builder()
                .dataMode(BatteryAbridged.DataMode.TEST)
                .name("JAK-BATTERY-1479")
                .source("Bluestaq")
                .id("BATTERY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(batteryAbridged.dataMode()).isEqualTo(BatteryAbridged.DataMode.TEST)
        assertThat(batteryAbridged.name()).isEqualTo("JAK-BATTERY-1479")
        assertThat(batteryAbridged.source()).isEqualTo("Bluestaq")
        assertThat(batteryAbridged.id()).contains("BATTERY-ID")
        assertThat(batteryAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(batteryAbridged.createdBy()).contains("some.user")
        assertThat(batteryAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(batteryAbridged.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batteryAbridged =
            BatteryAbridged.builder()
                .dataMode(BatteryAbridged.DataMode.TEST)
                .name("JAK-BATTERY-1479")
                .source("Bluestaq")
                .id("BATTERY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedBatteryAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batteryAbridged),
                jacksonTypeRef<BatteryAbridged>(),
            )

        assertThat(roundtrippedBatteryAbridged).isEqualTo(batteryAbridged)
    }
}
