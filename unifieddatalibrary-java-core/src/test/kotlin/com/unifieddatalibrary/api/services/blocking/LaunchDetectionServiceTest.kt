// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCountParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionCreateParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionGetParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionTupleParams
import com.unifieddatalibrary.api.models.launchdetection.LaunchDetectionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaunchDetectionServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionService = client.launchDetection()

        launchDetectionService.create(
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionService = client.launchDetection()

        launchDetectionService.update(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionService = client.launchDetection()

        val page = launchDetectionService.list()

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
        val launchDetectionService = client.launchDetection()

        launchDetectionService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionService = client.launchDetection()

        launchDetectionService.count(
            LaunchDetectionCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val launchDetectionService = client.launchDetection()

        val launchDetection =
            launchDetectionService.get(
                LaunchDetectionGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        launchDetection.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionService = client.launchDetection()

        val response = launchDetectionService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchDetectionService = client.launchDetection()

        val response =
            launchDetectionService.tuple(
                LaunchDetectionTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
