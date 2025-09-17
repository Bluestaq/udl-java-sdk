// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCountParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCreateParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaunchSiteServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchSiteService = client.launchSite()

        launchSiteService.create(
            LaunchSiteCreateParams.builder()
                .classificationMarking("U")
                .code("SAN MARCO")
                .dataMode(LaunchSiteCreateParams.DataMode.TEST)
                .name("Example launch site name")
                .source("Bluestaq")
                .id("LAUNCHSITE-ID")
                .altCode("35")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .shortCode("SNMLP")
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
        val launchSiteService = client.launchSite()

        launchSiteService.update(
            LaunchSiteUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .code("SAN MARCO")
                .dataMode(LaunchSiteUpdateParams.DataMode.TEST)
                .name("Example launch site name")
                .source("Bluestaq")
                .bodyId("LAUNCHSITE-ID")
                .altCode("35")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .shortCode("SNMLP")
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
        val launchSiteService = client.launchSite()

        val page = launchSiteService.list()

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
        val launchSiteService = client.launchSite()

        launchSiteService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchSiteService = client.launchSite()

        launchSiteService.count(
            LaunchSiteCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val launchSiteService = client.launchSite()

        val launchSite =
            launchSiteService.get(
                LaunchSiteGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        launchSite.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchSiteService = client.launchSite()

        val response = launchSiteService.queryhelp()

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
        val launchSiteService = client.launchSite()

        val response =
            launchSiteService.tuple(
                LaunchSiteTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
