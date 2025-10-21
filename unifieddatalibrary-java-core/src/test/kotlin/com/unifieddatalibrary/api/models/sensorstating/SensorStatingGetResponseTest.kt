// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorstating

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorStatingGetResponseTest {

    @Test
    fun create() {
        val sensorStatingGetResponse =
            SensorStatingGetResponse.builder()
                .classificationMarking("U")
                .sensorName("SENSOR_NAME")
                .source("Bluestaq")
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .altitude(157.543)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .lat(48.6732)
                .locationCountry("UA")
                .lon(22.8455)
                .ownerCountry("UA")
                .sensorNumber(1234)
                .sensorObservationType("5")
                .sensorType("Space Borne")
                .shortName("SNR-1")
                .build()

        assertThat(sensorStatingGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(sensorStatingGetResponse.sensorName()).isEqualTo("SENSOR_NAME")
        assertThat(sensorStatingGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(sensorStatingGetResponse.id()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(sensorStatingGetResponse.altitude()).contains(157.543)
        assertThat(sensorStatingGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(sensorStatingGetResponse.createdBy()).contains("some.user")
        assertThat(sensorStatingGetResponse.lat()).contains(48.6732)
        assertThat(sensorStatingGetResponse.locationCountry()).contains("UA")
        assertThat(sensorStatingGetResponse.lon()).contains(22.8455)
        assertThat(sensorStatingGetResponse.ownerCountry()).contains("UA")
        assertThat(sensorStatingGetResponse.sensorNumber()).contains(1234)
        assertThat(sensorStatingGetResponse.sensorObservationType()).contains("5")
        assertThat(sensorStatingGetResponse.sensorType()).contains("Space Borne")
        assertThat(sensorStatingGetResponse.shortName()).contains("SNR-1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorStatingGetResponse =
            SensorStatingGetResponse.builder()
                .classificationMarking("U")
                .sensorName("SENSOR_NAME")
                .source("Bluestaq")
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .altitude(157.543)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .lat(48.6732)
                .locationCountry("UA")
                .lon(22.8455)
                .ownerCountry("UA")
                .sensorNumber(1234)
                .sensorObservationType("5")
                .sensorType("Space Borne")
                .shortName("SNR-1")
                .build()

        val roundtrippedSensorStatingGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorStatingGetResponse),
                jacksonTypeRef<SensorStatingGetResponse>(),
            )

        assertThat(roundtrippedSensorStatingGetResponse).isEqualTo(sensorStatingGetResponse)
    }
}
