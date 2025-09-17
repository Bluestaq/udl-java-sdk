// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCountParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadGetParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeradataRadarPayloadServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataRadarPayloadServiceAsync = client.seradataRadarPayload()

        val future =
            seradataRadarPayloadServiceAsync.create(
                SeradataRadarPayloadCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SeradataRadarPayloadCreateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .spacecraftId("12345")
                    .id("SERADATARADARPAYLOAD-ID")
                    .bandwidth(1.23)
                    .bestResolution(1.23)
                    .category("SAR")
                    .constellationInterferometricCapability(
                        "constellationInterferometricCapability"
                    )
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .dutyCycle("dutyCycle")
                    .fieldOfRegard(1.23)
                    .fieldOfView(1.23)
                    .frequency(1.23)
                    .frequencyBand("X")
                    .groundStationLocations("51,42N-44,35E")
                    .groundStations("groundStations")
                    .hostedForCompanyOrgId("hostedForCompanyOrgId")
                    .idSensor("3c1ee9a0-90ad-1d75-c47b-2414e0a77e53")
                    .manufacturerOrgId("manufacturerOrgId")
                    .name("ALT")
                    .notes("Sample Notes")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .partnerSpacecraft("partnerSpacecraft")
                    .pointingMethod("Spacecraft")
                    .receivePolarization("Lin Dual")
                    .recorderSize("256")
                    .swathWidth(1.23)
                    .transmitPolarization("Lin Dual")
                    .waveLength(1.23)
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
        val seradataRadarPayloadServiceAsync = client.seradataRadarPayload()

        val future =
            seradataRadarPayloadServiceAsync.update(
                SeradataRadarPayloadUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(SeradataRadarPayloadUpdateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .spacecraftId("12345")
                    .bodyId("SERADATARADARPAYLOAD-ID")
                    .bandwidth(1.23)
                    .bestResolution(1.23)
                    .category("SAR")
                    .constellationInterferometricCapability(
                        "constellationInterferometricCapability"
                    )
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .dutyCycle("dutyCycle")
                    .fieldOfRegard(1.23)
                    .fieldOfView(1.23)
                    .frequency(1.23)
                    .frequencyBand("X")
                    .groundStationLocations("51,42N-44,35E")
                    .groundStations("groundStations")
                    .hostedForCompanyOrgId("hostedForCompanyOrgId")
                    .idSensor("3c1ee9a0-90ad-1d75-c47b-2414e0a77e53")
                    .manufacturerOrgId("manufacturerOrgId")
                    .name("ALT")
                    .notes("Sample Notes")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .partnerSpacecraft("partnerSpacecraft")
                    .pointingMethod("Spacecraft")
                    .receivePolarization("Lin Dual")
                    .recorderSize("256")
                    .swathWidth(1.23)
                    .transmitPolarization("Lin Dual")
                    .waveLength(1.23)
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
        val seradataRadarPayloadServiceAsync = client.seradataRadarPayload()

        val pageFuture = seradataRadarPayloadServiceAsync.list()

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
        val seradataRadarPayloadServiceAsync = client.seradataRadarPayload()

        val future = seradataRadarPayloadServiceAsync.delete("id")

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
        val seradataRadarPayloadServiceAsync = client.seradataRadarPayload()

        val responseFuture =
            seradataRadarPayloadServiceAsync.count(
                SeradataRadarPayloadCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seradataRadarPayloadServiceAsync = client.seradataRadarPayload()

        val seradataRadarPayloadFuture =
            seradataRadarPayloadServiceAsync.get(
                SeradataRadarPayloadGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val seradataRadarPayload = seradataRadarPayloadFuture.get()
        seradataRadarPayload.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataRadarPayloadServiceAsync = client.seradataRadarPayload()

        val responseFuture = seradataRadarPayloadServiceAsync.queryhelp()

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
        val seradataRadarPayloadServiceAsync = client.seradataRadarPayload()

        val responseFuture =
            seradataRadarPayloadServiceAsync.tuple(
                SeradataRadarPayloadTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
