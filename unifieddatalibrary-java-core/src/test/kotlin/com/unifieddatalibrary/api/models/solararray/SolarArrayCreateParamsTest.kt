// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararray

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolarArrayCreateParamsTest {

    @Test
    fun create() {
        SolarArrayCreateParams.builder()
            .dataMode(SolarArrayCreateParams.DataMode.TEST)
            .name("Solar1")
            .source("Bluestaq")
            .id("SOLARARRAY-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun body() {
        val params =
            SolarArrayCreateParams.builder()
                .dataMode(SolarArrayCreateParams.DataMode.TEST)
                .name("Solar1")
                .source("Bluestaq")
                .id("SOLARARRAY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(SolarArrayCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("Solar1")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("SOLARARRAY-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SolarArrayCreateParams.builder()
                .dataMode(SolarArrayCreateParams.DataMode.TEST)
                .name("Solar1")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(SolarArrayCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("Solar1")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
