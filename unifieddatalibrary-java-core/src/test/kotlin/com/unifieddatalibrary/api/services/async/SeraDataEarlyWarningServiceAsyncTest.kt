// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCountParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningCreateParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningGetParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningTupleParams
import com.unifieddatalibrary.api.models.seradataearlywarning.SeraDataEarlyWarningUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeraDataEarlyWarningServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataEarlyWarningServiceAsync = client.seraDataEarlyWarning()

        val future =
            seraDataEarlyWarningServiceAsync.create(
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
        val seraDataEarlyWarningServiceAsync = client.seraDataEarlyWarning()

        val future =
            seraDataEarlyWarningServiceAsync.update(
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
        val seraDataEarlyWarningServiceAsync = client.seraDataEarlyWarning()

        val pageFuture = seraDataEarlyWarningServiceAsync.list()

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
        val seraDataEarlyWarningServiceAsync = client.seraDataEarlyWarning()

        val future = seraDataEarlyWarningServiceAsync.delete("id")

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
        val seraDataEarlyWarningServiceAsync = client.seraDataEarlyWarning()

        val responseFuture =
            seraDataEarlyWarningServiceAsync.count(
                SeraDataEarlyWarningCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seraDataEarlyWarningServiceAsync = client.seraDataEarlyWarning()

        val seraDataEarlyWarningFuture =
            seraDataEarlyWarningServiceAsync.get(
                SeraDataEarlyWarningGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val seraDataEarlyWarning = seraDataEarlyWarningFuture.get()
        seraDataEarlyWarning.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataEarlyWarningServiceAsync = client.seraDataEarlyWarning()

        val responseFuture = seraDataEarlyWarningServiceAsync.queryhelp()

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
        val seraDataEarlyWarningServiceAsync = client.seraDataEarlyWarning()

        val responseFuture =
            seraDataEarlyWarningServiceAsync.tuple(
                SeraDataEarlyWarningTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
