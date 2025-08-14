// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.isrcollections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsrCollectionCriticalTimesFullTest {

    @Test
    fun create() {
        val isrCollectionCriticalTimesFull =
            IsrCollectionCriticalTimesFull.builder()
                .earliestImagingTime(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                .latestImagingTime(OffsetDateTime.parse("2021-01-19T01:11:15.001Z"))
                .build()

        assertThat(isrCollectionCriticalTimesFull.earliestImagingTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
        assertThat(isrCollectionCriticalTimesFull.latestImagingTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-19T01:11:15.001Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isrCollectionCriticalTimesFull =
            IsrCollectionCriticalTimesFull.builder()
                .earliestImagingTime(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                .latestImagingTime(OffsetDateTime.parse("2021-01-19T01:11:15.001Z"))
                .build()

        val roundtrippedIsrCollectionCriticalTimesFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isrCollectionCriticalTimesFull),
                jacksonTypeRef<IsrCollectionCriticalTimesFull>(),
            )

        assertThat(roundtrippedIsrCollectionCriticalTimesFull)
            .isEqualTo(isrCollectionCriticalTimesFull)
    }
}
