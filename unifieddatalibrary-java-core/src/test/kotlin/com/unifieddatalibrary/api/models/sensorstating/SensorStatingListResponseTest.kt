// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorstating

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorStatingListResponseTest {

    @Test
    fun create() {
        val sensorStatingListResponse =
            SensorStatingListResponse.builder()
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

        assertThat(sensorStatingListResponse.classificationMarking()).isEqualTo("U")
        assertThat(sensorStatingListResponse.sensorName()).isEqualTo("SENSOR_NAME")
        assertThat(sensorStatingListResponse.source()).isEqualTo("Bluestaq")
        assertThat(sensorStatingListResponse.id()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(sensorStatingListResponse.altitude()).contains(157.543)
        assertThat(sensorStatingListResponse.createdAt())
            .contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(sensorStatingListResponse.createdBy()).contains("some.user")
        assertThat(sensorStatingListResponse.lat()).contains(48.6732)
        assertThat(sensorStatingListResponse.locationCountry()).contains("UA")
        assertThat(sensorStatingListResponse.lon()).contains(22.8455)
        assertThat(sensorStatingListResponse.ownerCountry()).contains("UA")
        assertThat(sensorStatingListResponse.sensorNumber()).contains(1234)
        assertThat(sensorStatingListResponse.sensorObservationType()).contains("5")
        assertThat(sensorStatingListResponse.sensorType()).contains("Space Borne")
        assertThat(sensorStatingListResponse.shortName()).contains("SNR-1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorStatingListResponse =
            SensorStatingListResponse.builder()
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

        val roundtrippedSensorStatingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorStatingListResponse),
                jacksonTypeRef<SensorStatingListResponse>(),
            )

        assertThat(roundtrippedSensorStatingListResponse).isEqualTo(sensorStatingListResponse)
    }
}
