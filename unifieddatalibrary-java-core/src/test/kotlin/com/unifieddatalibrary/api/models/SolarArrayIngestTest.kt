// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolarArrayIngestTest {

    @Test
    fun create() {
        val solarArrayIngest =
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

        assertThat(solarArrayIngest.dataMode()).isEqualTo(SolarArrayIngest.DataMode.TEST)
        assertThat(solarArrayIngest.name()).isEqualTo("Solar1")
        assertThat(solarArrayIngest.source()).isEqualTo("Bluestaq")
        assertThat(solarArrayIngest.id()).contains("SOLARARRAY-ID")
        assertThat(solarArrayIngest.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(solarArrayIngest.createdBy()).contains("some.user")
        assertThat(solarArrayIngest.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(solarArrayIngest.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val solarArrayIngest =
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

        val roundtrippedSolarArrayIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(solarArrayIngest),
                jacksonTypeRef<SolarArrayIngest>(),
            )

        assertThat(roundtrippedSolarArrayIngest).isEqualTo(solarArrayIngest)
    }
}
