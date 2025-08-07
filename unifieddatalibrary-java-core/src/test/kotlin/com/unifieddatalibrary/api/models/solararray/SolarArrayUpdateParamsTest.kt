// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararray

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolarArrayUpdateParamsTest {

    @Test
    fun create() {
        SolarArrayUpdateParams.builder()
            .pathId("id")
            .dataMode(SolarArrayUpdateParams.DataMode.TEST)
            .name("Solar1")
            .source("Bluestaq")
            .bodyId("SOLARARRAY-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SolarArrayUpdateParams.builder()
                .pathId("id")
                .dataMode(SolarArrayUpdateParams.DataMode.TEST)
                .name("Solar1")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SolarArrayUpdateParams.builder()
                .pathId("id")
                .dataMode(SolarArrayUpdateParams.DataMode.TEST)
                .name("Solar1")
                .source("Bluestaq")
                .bodyId("SOLARARRAY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(SolarArrayUpdateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("Solar1")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("SOLARARRAY-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SolarArrayUpdateParams.builder()
                .pathId("id")
                .dataMode(SolarArrayUpdateParams.DataMode.TEST)
                .name("Solar1")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.dataMode()).isEqualTo(SolarArrayUpdateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("Solar1")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
