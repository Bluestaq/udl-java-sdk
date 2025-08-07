// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsSpecialtiesFullTest {

    @Test
    fun create() {
        val logisticsSpecialtiesFull =
            LogisticsSpecialtiesFull.builder()
                .firstName("JOHN")
                .last4Ssn("9999")
                .lastName("SMITH")
                .rankCode("MAJ")
                .roleTypeCode("TC")
                .skillLevel(3)
                .specialty("ELEN")
                .build()

        assertThat(logisticsSpecialtiesFull.firstName()).contains("JOHN")
        assertThat(logisticsSpecialtiesFull.last4Ssn()).contains("9999")
        assertThat(logisticsSpecialtiesFull.lastName()).contains("SMITH")
        assertThat(logisticsSpecialtiesFull.rankCode()).contains("MAJ")
        assertThat(logisticsSpecialtiesFull.roleTypeCode()).contains("TC")
        assertThat(logisticsSpecialtiesFull.skillLevel()).contains(3)
        assertThat(logisticsSpecialtiesFull.specialty()).contains("ELEN")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsSpecialtiesFull =
            LogisticsSpecialtiesFull.builder()
                .firstName("JOHN")
                .last4Ssn("9999")
                .lastName("SMITH")
                .rankCode("MAJ")
                .roleTypeCode("TC")
                .skillLevel(3)
                .specialty("ELEN")
                .build()

        val roundtrippedLogisticsSpecialtiesFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsSpecialtiesFull),
                jacksonTypeRef<LogisticsSpecialtiesFull>(),
            )

        assertThat(roundtrippedLogisticsSpecialtiesFull).isEqualTo(logisticsSpecialtiesFull)
    }
}
