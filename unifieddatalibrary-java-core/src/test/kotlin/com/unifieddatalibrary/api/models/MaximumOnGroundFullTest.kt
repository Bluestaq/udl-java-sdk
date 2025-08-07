// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MaximumOnGroundFullTest {

    @Test
    fun create() {
        val maximumOnGroundFull =
            MaximumOnGroundFull.builder()
                .aircraftMds("C017A")
                .contingencyMog(3)
                .mogLastChangedBy("John Smith")
                .mogLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .wideParkingMog(1)
                .wideWorkingMog(1)
                .build()

        assertThat(maximumOnGroundFull.aircraftMds()).contains("C017A")
        assertThat(maximumOnGroundFull.contingencyMog()).contains(3)
        assertThat(maximumOnGroundFull.mogLastChangedBy()).contains("John Smith")
        assertThat(maximumOnGroundFull.mogLastChangedDate())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
        assertThat(maximumOnGroundFull.wideParkingMog()).contains(1)
        assertThat(maximumOnGroundFull.wideWorkingMog()).contains(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val maximumOnGroundFull =
            MaximumOnGroundFull.builder()
                .aircraftMds("C017A")
                .contingencyMog(3)
                .mogLastChangedBy("John Smith")
                .mogLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .wideParkingMog(1)
                .wideWorkingMog(1)
                .build()

        val roundtrippedMaximumOnGroundFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(maximumOnGroundFull),
                jacksonTypeRef<MaximumOnGroundFull>(),
            )

        assertThat(roundtrippedMaximumOnGroundFull).isEqualTo(maximumOnGroundFull)
    }
}
