// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorstating

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorStatingCreateParamsTest {

    @Test
    fun create() {
        SensorStatingCreateParams.builder()
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
    }

    @Test
    fun body() {
        val params =
            SensorStatingCreateParams.builder()
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.sensorName()).isEqualTo("SENSOR_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(body.altitude()).contains(157.543)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.lat()).contains(48.6732)
        assertThat(body.locationCountry()).contains("UA")
        assertThat(body.lon()).contains(22.8455)
        assertThat(body.ownerCountry()).contains("UA")
        assertThat(body.sensorNumber()).contains(1234)
        assertThat(body.sensorObservationType()).contains("5")
        assertThat(body.sensorType()).contains("Space Borne")
        assertThat(body.shortName()).contains("SNR-1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SensorStatingCreateParams.builder()
                .classificationMarking("U")
                .sensorName("SENSOR_NAME")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.sensorName()).isEqualTo("SENSOR_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
