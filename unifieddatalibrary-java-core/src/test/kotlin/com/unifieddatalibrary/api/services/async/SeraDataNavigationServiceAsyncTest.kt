// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCountParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCreateParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeraDataNavigationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataNavigationServiceAsync = client.seraDataNavigation()

        val future =
            seraDataNavigationServiceAsync.create(
                SeraDataNavigationCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SeraDataNavigationCreateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .spacecraftId("spacecraftId")
                    .id("SERADATANAVIGATION-ID")
                    .areaCoverage("Worldwide")
                    .clockType("Rubidium")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .hostedForCompanyOrgId("hostedForCompanyOrgId")
                    .idNavigation("idNavigation")
                    .locationAccuracy(1.23)
                    .manufacturerOrgId("manufacturerOrgId")
                    .modeFrequency("1234")
                    .modes("Military")
                    .name("WAAS GEO-5")
                    .notes("Sample Notes")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .partnerSpacecraftId("partnerSpacecraftId")
                    .payloadType("WAAS")
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
        val seraDataNavigationServiceAsync = client.seraDataNavigation()

        val future =
            seraDataNavigationServiceAsync.update(
                SeraDataNavigationUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(SeraDataNavigationUpdateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .spacecraftId("spacecraftId")
                    .bodyId("SERADATANAVIGATION-ID")
                    .areaCoverage("Worldwide")
                    .clockType("Rubidium")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .hostedForCompanyOrgId("hostedForCompanyOrgId")
                    .idNavigation("idNavigation")
                    .locationAccuracy(1.23)
                    .manufacturerOrgId("manufacturerOrgId")
                    .modeFrequency("1234")
                    .modes("Military")
                    .name("WAAS GEO-5")
                    .notes("Sample Notes")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .partnerSpacecraftId("partnerSpacecraftId")
                    .payloadType("WAAS")
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
        val seraDataNavigationServiceAsync = client.seraDataNavigation()

        val pageFuture = seraDataNavigationServiceAsync.list()

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
        val seraDataNavigationServiceAsync = client.seraDataNavigation()

        val future = seraDataNavigationServiceAsync.delete("id")

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
        val seraDataNavigationServiceAsync = client.seraDataNavigation()

        val responseFuture =
            seraDataNavigationServiceAsync.count(
                SeraDataNavigationCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seraDataNavigationServiceAsync = client.seraDataNavigation()

        val seraDataNavigationFuture =
            seraDataNavigationServiceAsync.get(
                SeraDataNavigationGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val seraDataNavigation = seraDataNavigationFuture.get()
        seraDataNavigation.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataNavigationServiceAsync = client.seraDataNavigation()

        val responseFuture = seraDataNavigationServiceAsync.queryhelp()

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
        val seraDataNavigationServiceAsync = client.seraDataNavigation()

        val responseFuture =
            seraDataNavigationServiceAsync.tuple(
                SeraDataNavigationTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
