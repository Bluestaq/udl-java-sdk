// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorobservationtype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorObservationTypeGetResponseTest {

    @Test
    fun create() {
        val sensorObservationTypeGetResponse =
            SensorObservationTypeGetResponse.builder()
                .dataMode(SensorObservationTypeGetResponse.DataMode.TEST)
                .source("Bluestaq")
                .id("3")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origNetwork("OPS1")
                .type("5")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(sensorObservationTypeGetResponse.dataMode())
            .isEqualTo(SensorObservationTypeGetResponse.DataMode.TEST)
        assertThat(sensorObservationTypeGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(sensorObservationTypeGetResponse.id()).contains("3")
        assertThat(sensorObservationTypeGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorObservationTypeGetResponse.createdBy()).contains("some.user")
        assertThat(sensorObservationTypeGetResponse.origNetwork()).contains("OPS1")
        assertThat(sensorObservationTypeGetResponse.type()).contains("5")
        assertThat(sensorObservationTypeGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(sensorObservationTypeGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorObservationTypeGetResponse =
            SensorObservationTypeGetResponse.builder()
                .dataMode(SensorObservationTypeGetResponse.DataMode.TEST)
                .source("Bluestaq")
                .id("3")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origNetwork("OPS1")
                .type("5")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedSensorObservationTypeGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorObservationTypeGetResponse),
                jacksonTypeRef<SensorObservationTypeGetResponse>(),
            )

        assertThat(roundtrippedSensorObservationTypeGetResponse)
            .isEqualTo(sensorObservationTypeGetResponse)
    }
}
