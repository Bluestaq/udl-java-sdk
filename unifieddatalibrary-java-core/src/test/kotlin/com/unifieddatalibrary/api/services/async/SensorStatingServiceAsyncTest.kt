// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateBulkParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingCreateParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingGetParams
import com.unifieddatalibrary.api.models.sensorstating.SensorStatingUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SensorStatingServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingServiceAsync = client.sensorStating()

        val future =
            sensorStatingServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingServiceAsync = client.sensorStating()

        val future =
            sensorStatingServiceAsync.update(
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

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingServiceAsync = client.sensorStating()

        val pageFuture = sensorStatingServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingServiceAsync = client.sensorStating()

        val future = sensorStatingServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingServiceAsync = client.sensorStating()

        val future =
            sensorStatingServiceAsync.createBulk(
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

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingServiceAsync = client.sensorStating()

        val sensorStatingFuture =
            sensorStatingServiceAsync.get(
                SensorStatingGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val sensorStating = sensorStatingFuture.get()
        sensorStating.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorStatingServiceAsync = client.sensorStating()

        val responseFuture = sensorStatingServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }
}
