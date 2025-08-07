// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensortype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorTypeListResponseTest {

    @Test
    fun create() {
        val sensorTypeListResponse =
            SensorTypeListResponse.builder()
                .id(12344411)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origNetwork("OPS1")
                .type("Space Borne")
                .build()

        assertThat(sensorTypeListResponse.id()).contains(12344411)
        assertThat(sensorTypeListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorTypeListResponse.createdBy()).contains("some.user")
        assertThat(sensorTypeListResponse.origNetwork()).contains("OPS1")
        assertThat(sensorTypeListResponse.type()).contains("Space Borne")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorTypeListResponse =
            SensorTypeListResponse.builder()
                .id(12344411)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origNetwork("OPS1")
                .type("Space Borne")
                .build()

        val roundtrippedSensorTypeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorTypeListResponse),
                jacksonTypeRef<SensorTypeListResponse>(),
            )

        assertThat(roundtrippedSensorTypeListResponse).isEqualTo(sensorTypeListResponse)
    }
}
