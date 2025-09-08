// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCountParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCreateParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningGetParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningTupleParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeraDataEarlyWarningServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataEarlyWarningService = client.seraDataEarlyWarning()

        seraDataEarlyWarningService.create(
            SeraDataEarlyWarningCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATAEARLYWARNING-ID")
                .bestResolution(1.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .earthPointing(true)
                .frequencyLimits("frequencyLimits")
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idIr("idIR")
                .manufacturerOrgId("manufacturerOrgId")
                .missileLaunchPhaseDetectionAbility("missileLaunchPhaseDetectionAbility")
                .name("Infra red telescope")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadNotes("Sample Notes")
                .spectralBands("Infra-Red")
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
        val seraDataEarlyWarningService = client.seraDataEarlyWarning()

        seraDataEarlyWarningService.update(
            SeraDataEarlyWarningUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SeraDataEarlyWarningUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .bodyId("SERADATAEARLYWARNING-ID")
                .bestResolution(1.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .earthPointing(true)
                .frequencyLimits("frequencyLimits")
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idIr("idIR")
                .manufacturerOrgId("manufacturerOrgId")
                .missileLaunchPhaseDetectionAbility("missileLaunchPhaseDetectionAbility")
                .name("Infra red telescope")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .partnerSpacecraftId("partnerSpacecraftId")
                .payloadNotes("Sample Notes")
                .spectralBands("Infra-Red")
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
        val seraDataEarlyWarningService = client.seraDataEarlyWarning()

        val page = seraDataEarlyWarningService.list()

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
        val seraDataEarlyWarningService = client.seraDataEarlyWarning()

        seraDataEarlyWarningService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataEarlyWarningService = client.seraDataEarlyWarning()

        seraDataEarlyWarningService.count(
            SeraDataEarlyWarningCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seraDataEarlyWarningService = client.seraDataEarlyWarning()

        val seraDataEarlyWarning =
            seraDataEarlyWarningService.get(
                SeraDataEarlyWarningGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        seraDataEarlyWarning.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataEarlyWarningService = client.seraDataEarlyWarning()

        val response = seraDataEarlyWarningService.queryhelp()

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
        val seraDataEarlyWarningService = client.seraDataEarlyWarning()

        val response =
            seraDataEarlyWarningService.tuple(
                SeraDataEarlyWarningTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
