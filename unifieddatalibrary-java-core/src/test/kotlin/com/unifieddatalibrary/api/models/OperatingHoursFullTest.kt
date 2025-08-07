// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperatingHoursFullTest {

    @Test
    fun create() {
        val operatingHoursFull =
            OperatingHoursFull.builder().opStartTime("12:00").opStopTime("22:00").build()

        assertThat(operatingHoursFull.opStartTime()).contains("12:00")
        assertThat(operatingHoursFull.opStopTime()).contains("22:00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val operatingHoursFull =
            OperatingHoursFull.builder().opStartTime("12:00").opStopTime("22:00").build()

        val roundtrippedOperatingHoursFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(operatingHoursFull),
                jacksonTypeRef<OperatingHoursFull>(),
            )

        assertThat(roundtrippedOperatingHoursFull).isEqualTo(operatingHoursFull)
    }
}
