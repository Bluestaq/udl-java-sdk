// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararray

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolarArrayListResponseTest {

    @Test
    fun create() {
        val solarArrayListResponse =
            SolarArrayListResponse.builder()
                .dataMode(SolarArrayListResponse.DataMode.TEST)
                .name("Solar1")
                .source("Bluestaq")
                .id("SOLARARRAY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(solarArrayListResponse.dataMode())
            .isEqualTo(SolarArrayListResponse.DataMode.TEST)
        assertThat(solarArrayListResponse.name()).isEqualTo("Solar1")
        assertThat(solarArrayListResponse.source()).isEqualTo("Bluestaq")
        assertThat(solarArrayListResponse.id()).contains("SOLARARRAY-ID")
        assertThat(solarArrayListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(solarArrayListResponse.createdBy()).contains("some.user")
        assertThat(solarArrayListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(solarArrayListResponse.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val solarArrayListResponse =
            SolarArrayListResponse.builder()
                .dataMode(SolarArrayListResponse.DataMode.TEST)
                .name("Solar1")
                .source("Bluestaq")
                .id("SOLARARRAY-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedSolarArrayListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(solarArrayListResponse),
                jacksonTypeRef<SolarArrayListResponse>(),
            )

        assertThat(roundtrippedSolarArrayListResponse).isEqualTo(solarArrayListResponse)
    }
}
