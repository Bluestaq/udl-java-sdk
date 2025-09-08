// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCountParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCreateParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionGetParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionTupleParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaunchDetectionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionServiceAsync = client.launchDetection()

        val future =
            launchDetectionServiceAsync.create(
                LaunchDetectionCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(LaunchDetectionCreateParams.DataMode.TEST)
                    .messageType("Example-Msg-Type")
                    .observationLatitude(45.23)
                    .observationLongitude(1.23)
                    .observationTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .sequenceNumber(5)
                    .source("Bluestaq")
                    .id("LAUNCHDETECTION-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .descriptor("Example descriptor")
                    .eventId("EVENT-ID")
                    .highZenithAzimuth(false)
                    .inclination(1.23)
                    .launchAzimuth(1.23)
                    .launchLatitude(1.23)
                    .launchLongitude(1.23)
                    .launchTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .observationAltitude(1.23)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .raan(1.23)
                    .stereoFlag(false)
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
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
        val launchDetectionServiceAsync = client.launchDetection()

        val future =
            launchDetectionServiceAsync.update(
                LaunchDetectionUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(LaunchDetectionUpdateParams.DataMode.TEST)
                    .messageType("Example-Msg-Type")
                    .observationLatitude(45.23)
                    .observationLongitude(1.23)
                    .observationTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .sequenceNumber(5)
                    .source("Bluestaq")
                    .bodyId("LAUNCHDETECTION-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .descriptor("Example descriptor")
                    .eventId("EVENT-ID")
                    .highZenithAzimuth(false)
                    .inclination(1.23)
                    .launchAzimuth(1.23)
                    .launchLatitude(1.23)
                    .launchLongitude(1.23)
                    .launchTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .observationAltitude(1.23)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .raan(1.23)
                    .stereoFlag(false)
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
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
        val launchDetectionServiceAsync = client.launchDetection()

        val pageFuture = launchDetectionServiceAsync.list()

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
        val launchDetectionServiceAsync = client.launchDetection()

        val future = launchDetectionServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionServiceAsync = client.launchDetection()

        val responseFuture =
            launchDetectionServiceAsync.count(
                LaunchDetectionCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionServiceAsync = client.launchDetection()

        val launchDetectionFuture =
            launchDetectionServiceAsync.get(
                LaunchDetectionGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val launchDetection = launchDetectionFuture.get()
        launchDetection.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionServiceAsync = client.launchDetection()

        val responseFuture = launchDetectionServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionServiceAsync = client.launchDetection()

        val responseFuture =
            launchDetectionServiceAsync.tuple(
                LaunchDetectionTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
