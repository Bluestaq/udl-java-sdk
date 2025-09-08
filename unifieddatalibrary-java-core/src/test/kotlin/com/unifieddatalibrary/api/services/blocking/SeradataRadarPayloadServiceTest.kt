// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCountParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadCreateParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadGetParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadTupleParams
import com.unifieddatalibrary.api.models.seradataradarpayload.SeradataRadarPayloadUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeradataRadarPayloadServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataRadarPayloadService = client.seradataRadarPayload()

        seradataRadarPayloadService.create(
            SeradataRadarPayloadCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SeradataRadarPayloadCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("12345")
                .id("SERADATARADARPAYLOAD-ID")
                .bandwidth(1.23)
                .bestResolution(1.23)
                .category("SAR")
                .constellationInterferometricCapability("constellationInterferometricCapability")
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataRadarPayloadService = client.seradataRadarPayload()

        seradataRadarPayloadService.update(
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
                .constellationInterferometricCapability("constellationInterferometricCapability")
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataRadarPayloadService = client.seradataRadarPayload()

        val page = seradataRadarPayloadService.list()

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
        val seradataRadarPayloadService = client.seradataRadarPayload()

        seradataRadarPayloadService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataRadarPayloadService = client.seradataRadarPayload()

        seradataRadarPayloadService.count(
            SeradataRadarPayloadCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seradataRadarPayloadService = client.seradataRadarPayload()

        val seradataRadarPayload =
            seradataRadarPayloadService.get(
                SeradataRadarPayloadGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        seradataRadarPayload.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataRadarPayloadService = client.seradataRadarPayload()

        val response = seradataRadarPayloadService.queryhelp()

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
        val seradataRadarPayloadService = client.seradataRadarPayload()

        val response =
            seradataRadarPayloadService.tuple(
                SeradataRadarPayloadTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
