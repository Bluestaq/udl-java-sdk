// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCountParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadGetParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataopticalpayload.SeradataOpticalPayloadUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeradataOpticalPayloadServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataOpticalPayloadServiceAsync = client.seradataOpticalPayload()

        val future =
            seradataOpticalPayloadServiceAsync.create(
                SeradataOpticalPayloadCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SeradataOpticalPayloadCreateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .spacecraftId("spacecraftId")
                    .id("SERADATAOPTICALPAYLOAD-ID")
                    .bestResolution(1.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .fieldOfRegard(1.23)
                    .fieldOfView(1.23)
                    .groundStationLocations("groundStationLocations")
                    .groundStations("groundStations")
                    .hostedForCompanyOrgId("hostedForCompanyOrgId")
                    .idSensor("idSensor")
                    .imagingPayloadCategory("Infrared")
                    .manufacturerOrgId("manufacturerOrgId")
                    .name("TOURNESOL")
                    .notes("Sample Notes")
                    .numberOfFilmReturnCanisters(1L)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pointingMethod("Spacecraft")
                    .recorderSize("1024")
                    .spectralBand("Green")
                    .spectralFrequencyLimits("0.51")
                    .swathWidth(1.23)
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
        val seradataOpticalPayloadServiceAsync = client.seradataOpticalPayload()

        val future =
            seradataOpticalPayloadServiceAsync.update(
                SeradataOpticalPayloadUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(SeradataOpticalPayloadUpdateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .spacecraftId("spacecraftId")
                    .bodyId("SERADATAOPTICALPAYLOAD-ID")
                    .bestResolution(1.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .fieldOfRegard(1.23)
                    .fieldOfView(1.23)
                    .groundStationLocations("groundStationLocations")
                    .groundStations("groundStations")
                    .hostedForCompanyOrgId("hostedForCompanyOrgId")
                    .idSensor("idSensor")
                    .imagingPayloadCategory("Infrared")
                    .manufacturerOrgId("manufacturerOrgId")
                    .name("TOURNESOL")
                    .notes("Sample Notes")
                    .numberOfFilmReturnCanisters(1L)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pointingMethod("Spacecraft")
                    .recorderSize("1024")
                    .spectralBand("Green")
                    .spectralFrequencyLimits("0.51")
                    .swathWidth(1.23)
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
        val seradataOpticalPayloadServiceAsync = client.seradataOpticalPayload()

        val pageFuture = seradataOpticalPayloadServiceAsync.list()

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
        val seradataOpticalPayloadServiceAsync = client.seradataOpticalPayload()

        val future = seradataOpticalPayloadServiceAsync.delete("id")

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
        val seradataOpticalPayloadServiceAsync = client.seradataOpticalPayload()

        val responseFuture =
            seradataOpticalPayloadServiceAsync.count(
                SeradataOpticalPayloadCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seradataOpticalPayloadServiceAsync = client.seradataOpticalPayload()

        val seradataOpticalPayloadFuture =
            seradataOpticalPayloadServiceAsync.get(
                SeradataOpticalPayloadGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val seradataOpticalPayload = seradataOpticalPayloadFuture.get()
        seradataOpticalPayload.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataOpticalPayloadServiceAsync = client.seradataOpticalPayload()

        val responseFuture = seradataOpticalPayloadServiceAsync.queryhelp()

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
        val seradataOpticalPayloadServiceAsync = client.seradataOpticalPayload()

        val responseFuture =
            seradataOpticalPayloadServiceAsync.tuple(
                SeradataOpticalPayloadTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
