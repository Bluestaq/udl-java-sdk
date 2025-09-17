// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararray

import com.unifieddatalibrary.api.models.SolarArrayIngest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolarArrayUpdateParamsTest {

    @Test
    fun create() {
        SolarArrayUpdateParams.builder()
            .pathId("id")
            .solarArrayIngest(
                SolarArrayIngest.builder()
                    .dataMode(SolarArrayIngest.DataMode.TEST)
                    .name("Solar1")
                    .source("Bluestaq")
                    .id("SOLARARRAY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SolarArrayUpdateParams.builder()
                .pathId("id")
                .solarArrayIngest(
                    SolarArrayIngest.builder()
                        .dataMode(SolarArrayIngest.DataMode.TEST)
                        .name("Solar1")
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
            SolarArrayUpdateParams.builder()
                .pathId("id")
                .solarArrayIngest(
                    SolarArrayIngest.builder()
                        .dataMode(SolarArrayIngest.DataMode.TEST)
                        .name("Solar1")
                        .source("Bluestaq")
                        .id("SOLARARRAY-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SolarArrayIngest.builder()
                    .dataMode(SolarArrayIngest.DataMode.TEST)
                    .name("Solar1")
                    .source("Bluestaq")
                    .id("SOLARARRAY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SolarArrayUpdateParams.builder()
                .pathId("id")
                .solarArrayIngest(
                    SolarArrayIngest.builder()
                        .dataMode(SolarArrayIngest.DataMode.TEST)
                        .name("Solar1")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SolarArrayIngest.builder()
                    .dataMode(SolarArrayIngest.DataMode.TEST)
                    .name("Solar1")
                    .source("Bluestaq")
                    .build()
            )
    }
}
