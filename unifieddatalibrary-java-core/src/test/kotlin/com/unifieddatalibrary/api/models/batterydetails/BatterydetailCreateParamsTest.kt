// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.batterydetails

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatterydetailCreateParamsTest {

    @Test
    fun create() {
        BatterydetailCreateParams.builder()
            .classificationMarking("U")
            .dataMode(BatterydetailCreateParams.DataMode.TEST)
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
            .addTag("PROVIDER_TAG1")
            .addTag("PROVIDER_TAG2")
            .technology("Ni-Cd")
            .build()
    }

    @Test
    fun body() {
        val params =
            BatterydetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(BatterydetailCreateParams.DataMode.TEST)
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
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .technology("Ni-Cd")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(BatterydetailCreateParams.DataMode.TEST)
        assertThat(body.idBattery()).isEqualTo("BATTERY-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("BATTERYDETAILS-ID")
        assertThat(body.capacity()).contains(10.1)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.description()).contains("example notes")
        assertThat(body.dischargeDepth()).contains(0.2)
        assertThat(body.manufacturerOrgId()).contains("MANUFACTURERORG-ID")
        assertThat(body.model()).contains("11212")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.tags().getOrNull()).containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(body.technology()).contains("Ni-Cd")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatterydetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(BatterydetailCreateParams.DataMode.TEST)
                .idBattery("BATTERY-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(BatterydetailCreateParams.DataMode.TEST)
        assertThat(body.idBattery()).isEqualTo("BATTERY-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
