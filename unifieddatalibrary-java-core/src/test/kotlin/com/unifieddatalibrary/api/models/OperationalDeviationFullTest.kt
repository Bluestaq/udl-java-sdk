// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationalDeviationFullTest {

    @Test
    fun create() {
        val operationalDeviationFull =
            OperationalDeviationFull.builder()
                .affectedAircraftMds("C017A")
                .affectedMog(1)
                .aircraftOnGroundTime("14:00")
                .crewRestTime("14:00")
                .odLastChangedBy("John Smith")
                .odLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .odRemark("Example remark about this operational deviation.")
                .build()

        assertThat(operationalDeviationFull.affectedAircraftMds()).contains("C017A")
        assertThat(operationalDeviationFull.affectedMog()).contains(1)
        assertThat(operationalDeviationFull.aircraftOnGroundTime()).contains("14:00")
        assertThat(operationalDeviationFull.crewRestTime()).contains("14:00")
        assertThat(operationalDeviationFull.odLastChangedBy()).contains("John Smith")
        assertThat(operationalDeviationFull.odLastChangedDate())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
        assertThat(operationalDeviationFull.odRemark())
            .contains("Example remark about this operational deviation.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val operationalDeviationFull =
            OperationalDeviationFull.builder()
                .affectedAircraftMds("C017A")
                .affectedMog(1)
                .aircraftOnGroundTime("14:00")
                .crewRestTime("14:00")
                .odLastChangedBy("John Smith")
                .odLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .odRemark("Example remark about this operational deviation.")
                .build()

        val roundtrippedOperationalDeviationFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(operationalDeviationFull),
                jacksonTypeRef<OperationalDeviationFull>(),
            )

        assertThat(roundtrippedOperationalDeviationFull).isEqualTo(operationalDeviationFull)
    }
}
