// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatteryIngestTest {

    @Test
    fun create() {
        val batteryIngest =
            BatteryIngest.builder()
                .dataMode(BatteryIngest.DataMode.TEST)
                .name("JAK-BATTERY-1479")
                .source("Bluestaq")
                .id("BATTERY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(batteryIngest.dataMode()).isEqualTo(BatteryIngest.DataMode.TEST)
        assertThat(batteryIngest.name()).isEqualTo("JAK-BATTERY-1479")
        assertThat(batteryIngest.source()).isEqualTo("Bluestaq")
        assertThat(batteryIngest.id()).contains("BATTERY-ID")
        assertThat(batteryIngest.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(batteryIngest.createdBy()).contains("some.user")
        assertThat(batteryIngest.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(batteryIngest.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batteryIngest =
            BatteryIngest.builder()
                .dataMode(BatteryIngest.DataMode.TEST)
                .name("JAK-BATTERY-1479")
                .source("Bluestaq")
                .id("BATTERY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedBatteryIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batteryIngest),
                jacksonTypeRef<BatteryIngest>(),
            )

        assertThat(roundtrippedBatteryIngest).isEqualTo(batteryIngest)
    }
}
