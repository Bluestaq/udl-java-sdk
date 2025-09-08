// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batterydetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatterydetailsAbridgedTest {

    @Test
    fun create() {
        val batterydetailsAbridged =
            BatterydetailsAbridged.builder()
                .classificationMarking("U")
                .dataMode(BatterydetailsAbridged.DataMode.TEST)
                .idBattery("BATTERY-ID")
                .source("Bluestaq")
                .id("BATTERYDETAILS-ID")
                .capacity(10.1)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("example notes")
                .dischargeDepth(0.2)
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .model("11212")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .technology("Ni-Cd")
                .build()

        assertThat(batterydetailsAbridged.classificationMarking()).isEqualTo("U")
        assertThat(batterydetailsAbridged.dataMode())
            .isEqualTo(BatterydetailsAbridged.DataMode.TEST)
        assertThat(batterydetailsAbridged.idBattery()).isEqualTo("BATTERY-ID")
        assertThat(batterydetailsAbridged.source()).isEqualTo("Bluestaq")
        assertThat(batterydetailsAbridged.id()).contains("BATTERYDETAILS-ID")
        assertThat(batterydetailsAbridged.capacity()).contains(10.1)
        assertThat(batterydetailsAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(batterydetailsAbridged.createdBy()).contains("some.user")
        assertThat(batterydetailsAbridged.description()).contains("example notes")
        assertThat(batterydetailsAbridged.dischargeDepth()).contains(0.2)
        assertThat(batterydetailsAbridged.manufacturerOrgId()).contains("MANUFACTURERORG-ID")
        assertThat(batterydetailsAbridged.model()).contains("11212")
        assertThat(batterydetailsAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(batterydetailsAbridged.origNetwork()).contains("OPS1")
        assertThat(batterydetailsAbridged.technology()).contains("Ni-Cd")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batterydetailsAbridged =
            BatterydetailsAbridged.builder()
                .classificationMarking("U")
                .dataMode(BatterydetailsAbridged.DataMode.TEST)
                .idBattery("BATTERY-ID")
                .source("Bluestaq")
                .id("BATTERYDETAILS-ID")
                .capacity(10.1)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("example notes")
                .dischargeDepth(0.2)
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .model("11212")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .technology("Ni-Cd")
                .build()

        val roundtrippedBatterydetailsAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batterydetailsAbridged),
                jacksonTypeRef<BatterydetailsAbridged>(),
            )

        assertThat(roundtrippedBatterydetailsAbridged).isEqualTo(batterydetailsAbridged)
    }
}
