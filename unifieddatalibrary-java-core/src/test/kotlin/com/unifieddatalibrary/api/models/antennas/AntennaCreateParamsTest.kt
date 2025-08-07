// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.antennas

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AntennaCreateParamsTest {

    @Test
    fun create() {
        AntennaCreateParams.builder()
            .dataMode(AntennaCreateParams.DataMode.TEST)
            .name("IRIDIUM NEXT 121-ANTENNA-10075")
            .source("Bluestaq")
            .id("ANTENNA-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun body() {
        val params =
            AntennaCreateParams.builder()
                .dataMode(AntennaCreateParams.DataMode.TEST)
                .name("IRIDIUM NEXT 121-ANTENNA-10075")
                .source("Bluestaq")
                .id("ANTENNA-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(AntennaCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("IRIDIUM NEXT 121-ANTENNA-10075")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ANTENNA-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AntennaCreateParams.builder()
                .dataMode(AntennaCreateParams.DataMode.TEST)
                .name("IRIDIUM NEXT 121-ANTENNA-10075")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(AntennaCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("IRIDIUM NEXT 121-ANTENNA-10075")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
