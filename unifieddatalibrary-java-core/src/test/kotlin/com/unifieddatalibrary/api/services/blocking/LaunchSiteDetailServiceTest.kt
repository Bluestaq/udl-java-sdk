// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailCreateParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailFindBySourceParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailGetParams
import com.unifieddatalibrary.api.models.launchsitedetails.LaunchSiteDetailUpdateParams
import com.unifieddatalibrary.api.models.location.LocationIngest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaunchSiteDetailServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchSiteDetailService = client.launchSiteDetails()

        launchSiteDetailService.create(
            LaunchSiteDetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailCreateParams.DataMode.TEST)
                .idLaunchSite("LAUNCHSITE-ID")
                .source("Bluestaq")
                .id("LAUNCHSITEDETAILS-ID")
                .availableInclinations(listOf(10.23, 10.23, 12.23, 14.23))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example notes")
                .idLocation("LOCATION-ID")
                .launchGroup("Example-group-name")
                .location(
                    LocationIngest.builder()
                        .classificationMarking("U")
                        .dataMode(LocationIngest.DataMode.TEST)
                        .name("Example location")
                        .source("Bluestaq")
                        .altitude(10.23)
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .idLocation("LOCATION-ID")
                        .lat(45.23)
                        .lon(179.1)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
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
        val launchSiteDetailService = client.launchSiteDetails()

        launchSiteDetailService.update(
            LaunchSiteDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(LaunchSiteDetailUpdateParams.DataMode.TEST)
                .idLaunchSite("LAUNCHSITE-ID")
                .source("Bluestaq")
                .bodyId("LAUNCHSITEDETAILS-ID")
                .availableInclinations(listOf(10.23, 10.23, 12.23, 14.23))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example notes")
                .idLocation("LOCATION-ID")
                .launchGroup("Example-group-name")
                .location(
                    LocationIngest.builder()
                        .classificationMarking("U")
                        .dataMode(LocationIngest.DataMode.TEST)
                        .name("Example location")
                        .source("Bluestaq")
                        .altitude(10.23)
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .idLocation("LOCATION-ID")
                        .lat(45.23)
                        .lon(179.1)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
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
        val launchSiteDetailService = client.launchSiteDetails()

        val page = launchSiteDetailService.list()

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
        val launchSiteDetailService = client.launchSiteDetails()

        launchSiteDetailService.delete("id")
    }

    @Test
    fun findBySource() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchSiteDetailService = client.launchSiteDetails()

        val response =
            launchSiteDetailService.findBySource(
                LaunchSiteDetailFindBySourceParams.builder()
                    .source("source")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchSiteDetailService = client.launchSiteDetails()

        val launchSiteDetail =
            launchSiteDetailService.get(
                LaunchSiteDetailGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        launchSiteDetail.validate()
    }
}
