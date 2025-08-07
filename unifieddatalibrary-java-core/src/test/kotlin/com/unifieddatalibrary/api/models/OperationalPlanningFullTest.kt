// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationalPlanningFullTest {

    @Test
    fun create() {
        val operationalPlanningFull =
            OperationalPlanningFull.builder()
                .opEndDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .opLastChangedBy("John Smith")
                .opLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .opRemark("Example planning remark")
                .opSource("a3")
                .opStartDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .opStatus("Verified")
                .build()

        assertThat(operationalPlanningFull.opEndDate())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
        assertThat(operationalPlanningFull.opLastChangedBy()).contains("John Smith")
        assertThat(operationalPlanningFull.opLastChangedDate())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
        assertThat(operationalPlanningFull.opRemark()).contains("Example planning remark")
        assertThat(operationalPlanningFull.opSource()).contains("a3")
        assertThat(operationalPlanningFull.opStartDate())
            .contains(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
        assertThat(operationalPlanningFull.opStatus()).contains("Verified")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val operationalPlanningFull =
            OperationalPlanningFull.builder()
                .opEndDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .opLastChangedBy("John Smith")
                .opLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .opRemark("Example planning remark")
                .opSource("a3")
                .opStartDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .opStatus("Verified")
                .build()

        val roundtrippedOperationalPlanningFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(operationalPlanningFull),
                jacksonTypeRef<OperationalPlanningFull>(),
            )

        assertThat(roundtrippedOperationalPlanningFull).isEqualTo(operationalPlanningFull)
    }
}
