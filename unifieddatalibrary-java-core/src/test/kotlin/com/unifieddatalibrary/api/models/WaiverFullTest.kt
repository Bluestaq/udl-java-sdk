// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WaiverFullTest {

    @Test
    fun create() {
        val waiverFull =
            WaiverFull.builder()
                .expirationDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .hasExpired(false)
                .issueDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .issuerName("John Smith")
                .requesterName("Jane Doe")
                .requesterPhoneNumber("808-123-4567")
                .requestingUnit("2A1")
                .waiverAppliesTo("C017A")
                .waiverDescription("Example waiver description")
                .waiverLastChangedBy("J. Appleseed")
                .waiverLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .build()

        assertThat(waiverFull.expirationDate())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
        assertThat(waiverFull.hasExpired()).contains(false)
        assertThat(waiverFull.issueDate())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
        assertThat(waiverFull.issuerName()).contains("John Smith")
        assertThat(waiverFull.requesterName()).contains("Jane Doe")
        assertThat(waiverFull.requesterPhoneNumber()).contains("808-123-4567")
        assertThat(waiverFull.requestingUnit()).contains("2A1")
        assertThat(waiverFull.waiverAppliesTo()).contains("C017A")
        assertThat(waiverFull.waiverDescription()).contains("Example waiver description")
        assertThat(waiverFull.waiverLastChangedBy()).contains("J. Appleseed")
        assertThat(waiverFull.waiverLastChangedDate())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val waiverFull =
            WaiverFull.builder()
                .expirationDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .hasExpired(false)
                .issueDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .issuerName("John Smith")
                .requesterName("Jane Doe")
                .requesterPhoneNumber("808-123-4567")
                .requestingUnit("2A1")
                .waiverAppliesTo("C017A")
                .waiverDescription("Example waiver description")
                .waiverLastChangedBy("J. Appleseed")
                .waiverLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .build()

        val roundtrippedWaiverFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(waiverFull),
                jacksonTypeRef<WaiverFull>(),
            )

        assertThat(roundtrippedWaiverFull).isEqualTo(waiverFull)
    }
}
