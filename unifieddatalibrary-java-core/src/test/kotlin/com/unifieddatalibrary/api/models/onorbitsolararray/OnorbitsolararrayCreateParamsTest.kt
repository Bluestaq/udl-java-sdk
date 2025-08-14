// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitsolararray

import com.unifieddatalibrary.api.models.SolarArrayIngest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitsolararrayCreateParamsTest {

    @Test
    fun create() {
        OnorbitsolararrayCreateParams.builder()
            .classificationMarking("U")
            .dataMode(OnorbitsolararrayCreateParams.DataMode.TEST)
            .idOnOrbit("ONORBIT-ID")
            .idSolarArray("SOLARARRAY-ID")
            .source("Bluestaq")
            .id("ONORBITSOLARARRAY-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .quantity(10)
            .solarArray(
                SolarArrayIngest.builder()
                    .dataMode(SolarArrayIngest.DataMode.TEST)
                    .name("Solar1")
                    .source("Bluestaq")
                    .id("SOLARARRAY-ID")
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
            OnorbitsolararrayCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitsolararrayCreateParams.DataMode.TEST)
                .idOnOrbit("ONORBIT-ID")
                .idSolarArray("SOLARARRAY-ID")
                .source("Bluestaq")
                .id("ONORBITSOLARARRAY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .quantity(10)
                .solarArray(
                    SolarArrayIngest.builder()
                        .dataMode(SolarArrayIngest.DataMode.TEST)
                        .name("Solar1")
                        .source("Bluestaq")
                        .id("SOLARARRAY-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitsolararrayCreateParams.DataMode.TEST)
        assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(body.idSolarArray()).isEqualTo("SOLARARRAY-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ONORBITSOLARARRAY-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.quantity()).contains(10)
        assertThat(body.solarArray())
            .contains(
                SolarArrayIngest.builder()
                    .dataMode(SolarArrayIngest.DataMode.TEST)
                    .name("Solar1")
                    .source("Bluestaq")
                    .id("SOLARARRAY-ID")
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
            OnorbitsolararrayCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitsolararrayCreateParams.DataMode.TEST)
                .idOnOrbit("ONORBIT-ID")
                .idSolarArray("SOLARARRAY-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitsolararrayCreateParams.DataMode.TEST)
        assertThat(body.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(body.idSolarArray()).isEqualTo("SOLARARRAY-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
