// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCountParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationCreateParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationGetParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationTupleParams
import com.unifieddatalibrary.api.models.seradatanavigation.SeraDataNavigationUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeraDataNavigationServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataNavigationService = client.seraDataNavigation()

        seraDataNavigationService.create(
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
                .origNetwork("ORIG")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadType("WAAS")
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
        val seraDataNavigationService = client.seraDataNavigation()

        seraDataNavigationService.update(
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
                .origNetwork("ORIG")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadType("WAAS")
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
        val seraDataNavigationService = client.seraDataNavigation()

        val page = seraDataNavigationService.list()

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
        val seraDataNavigationService = client.seraDataNavigation()

        seraDataNavigationService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataNavigationService = client.seraDataNavigation()

        seraDataNavigationService.count(
            SeraDataNavigationCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seraDataNavigationService = client.seraDataNavigation()

        val seraDataNavigation =
            seraDataNavigationService.get(
                SeraDataNavigationGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        seraDataNavigation.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataNavigationService = client.seraDataNavigation()

        val response = seraDataNavigationService.queryhelp()

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
        val seraDataNavigationService = client.seraDataNavigation()

        val response =
            seraDataNavigationService.tuple(
                SeraDataNavigationTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
