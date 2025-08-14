// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DriftHistoryFullTest {

    @Test
    fun create() {
        val driftHistoryFull =
            DriftHistoryFull.builder()
                .classificationMarking("U")
                .dataMode(DriftHistoryFull.DataMode.TEST)
                .source("Bluestaq")
                .id("DRIFTHISTORY-ID")
                .createdBy("some.user")
                .driftRate(1.1)
                .effectiveUntil(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .idOnOrbit("ONORBIT-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .build()

        assertThat(driftHistoryFull.classificationMarking()).isEqualTo("U")
        assertThat(driftHistoryFull.dataMode()).isEqualTo(DriftHistoryFull.DataMode.TEST)
        assertThat(driftHistoryFull.source()).isEqualTo("Bluestaq")
        assertThat(driftHistoryFull.id()).contains("DRIFTHISTORY-ID")
        assertThat(driftHistoryFull.createdBy()).contains("some.user")
        assertThat(driftHistoryFull.driftRate()).contains(1.1)
        assertThat(driftHistoryFull.effectiveUntil())
            .contains(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(driftHistoryFull.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(driftHistoryFull.origin()).contains("THIRD_PARTY_DATASOURCE")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val driftHistoryFull =
            DriftHistoryFull.builder()
                .classificationMarking("U")
                .dataMode(DriftHistoryFull.DataMode.TEST)
                .source("Bluestaq")
                .id("DRIFTHISTORY-ID")
                .createdBy("some.user")
                .driftRate(1.1)
                .effectiveUntil(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .idOnOrbit("ONORBIT-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .build()

        val roundtrippedDriftHistoryFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(driftHistoryFull),
                jacksonTypeRef<DriftHistoryFull>(),
            )

        assertThat(roundtrippedDriftHistoryFull).isEqualTo(driftHistoryFull)
    }
}
