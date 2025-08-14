// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.antennas

import com.unifieddatalibrary.api.models.AntennaIngest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AntennaCreateParamsTest {

    @Test
    fun create() {
        AntennaCreateParams.builder()
            .antennaIngest(
                AntennaIngest.builder()
                    .dataMode(AntennaIngest.DataMode.TEST)
                    .name("IRIDIUM NEXT 121-ANTENNA-10075")
                    .source("Bluestaq")
                    .id("ANTENNA-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AntennaCreateParams.builder()
                .antennaIngest(
                    AntennaIngest.builder()
                        .dataMode(AntennaIngest.DataMode.TEST)
                        .name("IRIDIUM NEXT 121-ANTENNA-10075")
                        .source("Bluestaq")
                        .id("ANTENNA-ID")
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
                AntennaIngest.builder()
                    .dataMode(AntennaIngest.DataMode.TEST)
                    .name("IRIDIUM NEXT 121-ANTENNA-10075")
                    .source("Bluestaq")
                    .id("ANTENNA-ID")
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
            AntennaCreateParams.builder()
                .antennaIngest(
                    AntennaIngest.builder()
                        .dataMode(AntennaIngest.DataMode.TEST)
                        .name("IRIDIUM NEXT 121-ANTENNA-10075")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AntennaIngest.builder()
                    .dataMode(AntennaIngest.DataMode.TEST)
                    .name("IRIDIUM NEXT 121-ANTENNA-10075")
                    .source("Bluestaq")
                    .build()
            )
    }
}
