// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.antennas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AntennaAbridgedTest {

    @Test
    fun create() {
        val antennaAbridged =
            AntennaAbridged.builder()
                .dataMode(AntennaAbridged.DataMode.TEST)
                .name("IRIDIUM NEXT 121-ANTENNA-10075")
                .source("Bluestaq")
                .id("ANTENNA-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        assertThat(antennaAbridged.dataMode()).isEqualTo(AntennaAbridged.DataMode.TEST)
        assertThat(antennaAbridged.name()).isEqualTo("IRIDIUM NEXT 121-ANTENNA-10075")
        assertThat(antennaAbridged.source()).isEqualTo("Bluestaq")
        assertThat(antennaAbridged.id()).contains("ANTENNA-ID")
        assertThat(antennaAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(antennaAbridged.createdBy()).contains("some.user")
        assertThat(antennaAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(antennaAbridged.origNetwork()).contains("ORIG")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val antennaAbridged =
            AntennaAbridged.builder()
                .dataMode(AntennaAbridged.DataMode.TEST)
                .name("IRIDIUM NEXT 121-ANTENNA-10075")
                .source("Bluestaq")
                .id("ANTENNA-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val roundtrippedAntennaAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(antennaAbridged),
                jacksonTypeRef<AntennaAbridged>(),
            )

        assertThat(roundtrippedAntennaAbridged).isEqualTo(antennaAbridged)
    }
}
