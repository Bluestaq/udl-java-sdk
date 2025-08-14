// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PathwayFullTest {

    @Test
    fun create() {
        val pathwayFull =
            PathwayFull.builder()
                .pwDefinition("AGP: 14L, K6, K, G (ANG APRN TO TWY K), GUARD (MAIN)")
                .pwLastChangedBy("John Smith")
                .pwLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .pwType("Taxiway")
                .pwUsage("Arrival")
                .build()

        assertThat(pathwayFull.pwDefinition())
            .contains("AGP: 14L, K6, K, G (ANG APRN TO TWY K), GUARD (MAIN)")
        assertThat(pathwayFull.pwLastChangedBy()).contains("John Smith")
        assertThat(pathwayFull.pwLastChangedDate())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
        assertThat(pathwayFull.pwType()).contains("Taxiway")
        assertThat(pathwayFull.pwUsage()).contains("Arrival")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pathwayFull =
            PathwayFull.builder()
                .pwDefinition("AGP: 14L, K6, K, G (ANG APRN TO TWY K), GUARD (MAIN)")
                .pwLastChangedBy("John Smith")
                .pwLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .pwType("Taxiway")
                .pwUsage("Arrival")
                .build()

        val roundtrippedPathwayFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pathwayFull),
                jacksonTypeRef<PathwayFull>(),
            )

        assertThat(roundtrippedPathwayFull).isEqualTo(pathwayFull)
    }
}
