// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateBulkParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingGetParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SensorStatingServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingService = client.sensorStating()

        sensorStatingService.create(
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
        )
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingService = client.sensorStating()

        sensorStatingService.update(
            SensorStatingUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .sensorName("SENSOR_NAME")
                .source("Bluestaq")
                .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
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
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingService = client.sensorStating()

        val page = sensorStatingService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingService = client.sensorStating()

        sensorStatingService.delete("id")
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingService = client.sensorStating()

        sensorStatingService.createBulk(
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
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingService = client.sensorStating()

        val sensorStating =
            sensorStatingService.get(
                SensorStatingGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        sensorStating.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingService = client.sensorStating()

        val response = sensorStatingService.queryhelp()

        response.validate()
    }
}
