// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beam

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamAbridgedTest {

    @Test
    fun create() {
        val beamAbridged =
            BeamAbridged.builder()
                .beamName("BEAMNAME-ID")
                .classificationMarking("U")
                .dataMode(BeamAbridged.DataMode.TEST)
                .source("Bluestaq")
                .id("BEAM-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(beamAbridged.beamName()).isEqualTo("BEAMNAME-ID")
        assertThat(beamAbridged.classificationMarking()).isEqualTo("U")
        assertThat(beamAbridged.dataMode()).isEqualTo(BeamAbridged.DataMode.TEST)
        assertThat(beamAbridged.source()).isEqualTo("Bluestaq")
        assertThat(beamAbridged.id()).contains("BEAM-ID")
        assertThat(beamAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(beamAbridged.createdBy()).contains("some.user")
        assertThat(beamAbridged.notes()).contains("Example notes")
        assertThat(beamAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(beamAbridged.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beamAbridged =
            BeamAbridged.builder()
                .beamName("BEAMNAME-ID")
                .classificationMarking("U")
                .dataMode(BeamAbridged.DataMode.TEST)
                .source("Bluestaq")
                .id("BEAM-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedBeamAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beamAbridged),
                jacksonTypeRef<BeamAbridged>(),
            )

        assertThat(roundtrippedBeamAbridged).isEqualTo(beamAbridged)
    }
}
