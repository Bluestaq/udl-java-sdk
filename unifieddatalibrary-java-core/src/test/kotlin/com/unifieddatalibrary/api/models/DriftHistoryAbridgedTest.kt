// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DriftHistoryAbridgedTest {

    @Test
    fun create() {
        val driftHistoryAbridged =
            DriftHistoryAbridged.builder()
                .classificationMarking("U")
                .dataMode(DriftHistoryAbridged.DataMode.TEST)
                .source("Bluestaq")
                .id("DRIFTHISTORY-ID")
                .createdBy("some.user")
                .driftRate(1.1)
                .effectiveUntil(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .idOnOrbit("ONORBIT-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .build()

        assertThat(driftHistoryAbridged.classificationMarking()).isEqualTo("U")
        assertThat(driftHistoryAbridged.dataMode()).isEqualTo(DriftHistoryAbridged.DataMode.TEST)
        assertThat(driftHistoryAbridged.source()).isEqualTo("Bluestaq")
        assertThat(driftHistoryAbridged.id()).contains("DRIFTHISTORY-ID")
        assertThat(driftHistoryAbridged.createdBy()).contains("some.user")
        assertThat(driftHistoryAbridged.driftRate()).contains(1.1)
        assertThat(driftHistoryAbridged.effectiveUntil())
            .contains(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(driftHistoryAbridged.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(driftHistoryAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val driftHistoryAbridged =
            DriftHistoryAbridged.builder()
                .classificationMarking("U")
                .dataMode(DriftHistoryAbridged.DataMode.TEST)
                .source("Bluestaq")
                .id("DRIFTHISTORY-ID")
                .createdBy("some.user")
                .driftRate(1.1)
                .effectiveUntil(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .idOnOrbit("ONORBIT-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .build()

        val roundtrippedDriftHistoryAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(driftHistoryAbridged),
                jacksonTypeRef<DriftHistoryAbridged>(),
            )

        assertThat(roundtrippedDriftHistoryAbridged).isEqualTo(driftHistoryAbridged)
    }
}
