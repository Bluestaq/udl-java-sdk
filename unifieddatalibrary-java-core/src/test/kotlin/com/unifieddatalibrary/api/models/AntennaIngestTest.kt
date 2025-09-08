// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AntennaIngestTest {

    @Test
    fun create() {
        val antennaIngest =
            AntennaIngest.builder()
                .dataMode(AntennaIngest.DataMode.TEST)
                .name("IRIDIUM NEXT 121-ANTENNA-10075")
                .source("Bluestaq")
                .id("ANTENNA-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(antennaIngest.dataMode()).isEqualTo(AntennaIngest.DataMode.TEST)
        assertThat(antennaIngest.name()).isEqualTo("IRIDIUM NEXT 121-ANTENNA-10075")
        assertThat(antennaIngest.source()).isEqualTo("Bluestaq")
        assertThat(antennaIngest.id()).contains("ANTENNA-ID")
        assertThat(antennaIngest.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(antennaIngest.createdBy()).contains("some.user")
        assertThat(antennaIngest.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(antennaIngest.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val antennaIngest =
            AntennaIngest.builder()
                .dataMode(AntennaIngest.DataMode.TEST)
                .name("IRIDIUM NEXT 121-ANTENNA-10075")
                .source("Bluestaq")
                .id("ANTENNA-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedAntennaIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(antennaIngest),
                jacksonTypeRef<AntennaIngest>(),
            )

        assertThat(roundtrippedAntennaIngest).isEqualTo(antennaIngest)
    }
}
