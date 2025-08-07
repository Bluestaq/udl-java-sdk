// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.antennas

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AntennaUpdateParamsTest {

    @Test
    fun create() {
        AntennaUpdateParams.builder()
            .pathId("id")
            .dataMode(AntennaUpdateParams.DataMode.TEST)
            .name("IRIDIUM NEXT 121-ANTENNA-10075")
            .source("Bluestaq")
            .bodyId("ANTENNA-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AntennaUpdateParams.builder()
                .pathId("id")
                .dataMode(AntennaUpdateParams.DataMode.TEST)
                .name("IRIDIUM NEXT 121-ANTENNA-10075")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AntennaUpdateParams.builder()
                .pathId("id")
                .dataMode(AntennaUpdateParams.DataMode.TEST)
                .name("IRIDIUM NEXT 121-ANTENNA-10075")
                .source("Bluestaq")
                .bodyId("ANTENNA-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(AntennaUpdateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("IRIDIUM NEXT 121-ANTENNA-10075")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("ANTENNA-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AntennaUpdateParams.builder()
                .pathId("id")
                .dataMode(AntennaUpdateParams.DataMode.TEST)
                .name("IRIDIUM NEXT 121-ANTENNA-10075")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(AntennaUpdateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("IRIDIUM NEXT 121-ANTENNA-10075")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
