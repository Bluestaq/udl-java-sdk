// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AltitudeBlocksIngestTest {

    @Test
    fun create() {
        val altitudeBlocksIngest =
            AltitudeBlocksIngest.builder()
                .altitudeSequenceId("A1")
                .lowerAltitude(27000.1)
                .upperAltitude(27200.5)
                .build()

        assertThat(altitudeBlocksIngest.altitudeSequenceId()).contains("A1")
        assertThat(altitudeBlocksIngest.lowerAltitude()).contains(27000.1)
        assertThat(altitudeBlocksIngest.upperAltitude()).contains(27200.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val altitudeBlocksIngest =
            AltitudeBlocksIngest.builder()
                .altitudeSequenceId("A1")
                .lowerAltitude(27000.1)
                .upperAltitude(27200.5)
                .build()

        val roundtrippedAltitudeBlocksIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(altitudeBlocksIngest),
                jacksonTypeRef<AltitudeBlocksIngest>(),
            )

        assertThat(roundtrippedAltitudeBlocksIngest).isEqualTo(altitudeBlocksIngest)
    }
}
