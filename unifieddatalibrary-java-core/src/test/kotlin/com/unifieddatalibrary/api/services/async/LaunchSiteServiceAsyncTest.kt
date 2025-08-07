// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCountParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteCreateParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteGetParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteTupleParams
import com.unifieddatalibrary.api.models.launchsite.LaunchSiteUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaunchSiteServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchSiteServiceAsync = client.launchSite()

        val future =
            launchSiteServiceAsync.create(
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
                    .origNetwork("ORIG")
                    .shortCode("SNMLP")
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
        val launchSiteServiceAsync = client.launchSite()

        val future =
            launchSiteServiceAsync.update(
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
                    .origNetwork("ORIG")
                    .shortCode("SNMLP")
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
        val launchSiteServiceAsync = client.launchSite()

        val pageFuture = launchSiteServiceAsync.list()

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
        val launchSiteServiceAsync = client.launchSite()

        val future = launchSiteServiceAsync.delete("id")

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
        val launchSiteServiceAsync = client.launchSite()

        val responseFuture =
            launchSiteServiceAsync.count(
                LaunchSiteCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val launchSiteServiceAsync = client.launchSite()

        val launchSiteFuture =
            launchSiteServiceAsync.get(
                LaunchSiteGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val launchSite = launchSiteFuture.get()
        launchSite.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchSiteServiceAsync = client.launchSite()

        val responseFuture = launchSiteServiceAsync.queryhelp()

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
        val launchSiteServiceAsync = client.launchSite()

        val responseFuture =
            launchSiteServiceAsync.tuple(
                LaunchSiteTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
