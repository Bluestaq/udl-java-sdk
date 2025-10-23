// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sensorstating

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorStatingCreateBulkParamsTest {

    @Test
    fun create() {
        SensorStatingCreateBulkParams.builder()
            .addBody(
                SensorStatingCreateBulkParams.Body.builder()
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SensorStatingCreateBulkParams.builder()
                .addBody(
                    SensorStatingCreateBulkParams.Body.builder()
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                SensorStatingCreateBulkParams.Body.builder()
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SensorStatingCreateBulkParams.builder()
                .addBody(
                    SensorStatingCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .sensorName("SENSOR_NAME")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                SensorStatingCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .sensorName("SENSOR_NAME")
                    .source("Bluestaq")
                    .build()
            )
    }
}
