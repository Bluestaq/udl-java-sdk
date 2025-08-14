// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PointOfContactIngestTest {

    @Test
    fun create() {
        val pointOfContactIngest =
            PointOfContactIngest.builder()
                .office("A34")
                .phone("8675309")
                .pocName("Fred Smith")
                .pocOrg("HQAF")
                .pocSequenceId(1)
                .pocTypeName("Originator")
                .rank("Capt")
                .remark("POC remark.")
                .username("fgsmith")
                .build()

        assertThat(pointOfContactIngest.office()).contains("A34")
        assertThat(pointOfContactIngest.phone()).contains("8675309")
        assertThat(pointOfContactIngest.pocName()).contains("Fred Smith")
        assertThat(pointOfContactIngest.pocOrg()).contains("HQAF")
        assertThat(pointOfContactIngest.pocSequenceId()).contains(1)
        assertThat(pointOfContactIngest.pocTypeName()).contains("Originator")
        assertThat(pointOfContactIngest.rank()).contains("Capt")
        assertThat(pointOfContactIngest.remark()).contains("POC remark.")
        assertThat(pointOfContactIngest.username()).contains("fgsmith")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pointOfContactIngest =
            PointOfContactIngest.builder()
                .office("A34")
                .phone("8675309")
                .pocName("Fred Smith")
                .pocOrg("HQAF")
                .pocSequenceId(1)
                .pocTypeName("Originator")
                .rank("Capt")
                .remark("POC remark.")
                .username("fgsmith")
                .build()

        val roundtrippedPointOfContactIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pointOfContactIngest),
                jacksonTypeRef<PointOfContactIngest>(),
            )

        assertThat(roundtrippedPointOfContactIngest).isEqualTo(pointOfContactIngest)
    }
}
