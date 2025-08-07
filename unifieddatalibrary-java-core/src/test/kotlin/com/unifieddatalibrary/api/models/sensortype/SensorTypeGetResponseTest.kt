// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensortype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorTypeGetResponseTest {

    @Test
    fun create() {
        val sensorTypeGetResponse =
            SensorTypeGetResponse.builder()
                .dataMode(SensorTypeGetResponse.DataMode.TEST)
                .source("Bluestaq")
                .id(12344411)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origNetwork("OPS1")
                .type("Space Borne")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(sensorTypeGetResponse.dataMode()).isEqualTo(SensorTypeGetResponse.DataMode.TEST)
        assertThat(sensorTypeGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(sensorTypeGetResponse.id()).contains(12344411)
        assertThat(sensorTypeGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorTypeGetResponse.createdBy()).contains("some.user")
        assertThat(sensorTypeGetResponse.origNetwork()).contains("OPS1")
        assertThat(sensorTypeGetResponse.type()).contains("Space Borne")
        assertThat(sensorTypeGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorTypeGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorTypeGetResponse =
            SensorTypeGetResponse.builder()
                .dataMode(SensorTypeGetResponse.DataMode.TEST)
                .source("Bluestaq")
                .id(12344411)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origNetwork("OPS1")
                .type("Space Borne")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSensorTypeGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorTypeGetResponse),
                jacksonTypeRef<SensorTypeGetResponse>(),
            )

        assertThat(roundtrippedSensorTypeGetResponse).isEqualTo(sensorTypeGetResponse)
    }
}
