// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitsolararray

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitsolararrayListResponseTest {

    @Test
    fun create() {
        val onorbitsolararrayListResponse =
            OnorbitsolararrayListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitsolararrayListResponse.DataMode.TEST)
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
                    OnorbitsolararrayListResponse.SolarArray.builder()
                        .dataMode(OnorbitsolararrayListResponse.SolarArray.DataMode.TEST)
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

        assertThat(onorbitsolararrayListResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitsolararrayListResponse.dataMode())
            .isEqualTo(OnorbitsolararrayListResponse.DataMode.TEST)
        assertThat(onorbitsolararrayListResponse.idOnOrbit()).isEqualTo("ONORBIT-ID")
        assertThat(onorbitsolararrayListResponse.idSolarArray()).isEqualTo("SOLARARRAY-ID")
        assertThat(onorbitsolararrayListResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitsolararrayListResponse.id()).contains("ONORBITSOLARARRAY-ID")
        assertThat(onorbitsolararrayListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitsolararrayListResponse.createdBy()).contains("some.user")
        assertThat(onorbitsolararrayListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitsolararrayListResponse.origNetwork()).contains("OPS1")
        assertThat(onorbitsolararrayListResponse.quantity()).contains(10)
        assertThat(onorbitsolararrayListResponse.solarArray())
            .contains(
                OnorbitsolararrayListResponse.SolarArray.builder()
                    .dataMode(OnorbitsolararrayListResponse.SolarArray.DataMode.TEST)
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
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitsolararrayListResponse =
            OnorbitsolararrayListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitsolararrayListResponse.DataMode.TEST)
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
                    OnorbitsolararrayListResponse.SolarArray.builder()
                        .dataMode(OnorbitsolararrayListResponse.SolarArray.DataMode.TEST)
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

        val roundtrippedOnorbitsolararrayListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitsolararrayListResponse),
                jacksonTypeRef<OnorbitsolararrayListResponse>(),
            )

        assertThat(roundtrippedOnorbitsolararrayListResponse)
            .isEqualTo(onorbitsolararrayListResponse)
    }
}
