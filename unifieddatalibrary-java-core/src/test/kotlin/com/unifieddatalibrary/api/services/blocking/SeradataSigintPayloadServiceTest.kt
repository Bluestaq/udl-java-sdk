// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCountParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCreateParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeradataSigintPayloadServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataSigintPayloadService = client.seradataSigintPayload()

        seradataSigintPayloadService.create(
            SeradataSigintPayloadCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .id("SERADATASIGINTPAYLOAD-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .frequencyCoverage("1.1 to 3.3")
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idSensor("0c5ec9c0-10cd-1d35-c46b-3764c4d76e13")
                .interceptParameters("interceptParameters")
                .manufacturerOrgId("manufacturerOrgId")
                .name("Sensor Name")
                .notes("Sample Notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .positionalAccuracy("positionalAccuracy")
                .swathWidth(1.23)
                .type("Comint")
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
        val seradataSigintPayloadService = client.seradataSigintPayload()

        seradataSigintPayloadService.update(
            SeradataSigintPayloadUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SeradataSigintPayloadUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .spacecraftId("spacecraftId")
                .bodyId("SERADATASIGINTPAYLOAD-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .frequencyCoverage("1.1 to 3.3")
                .groundStationLocations("groundStationLocations")
                .groundStations("groundStations")
                .hostedForCompanyOrgId("hostedForCompanyOrgId")
                .idSensor("0c5ec9c0-10cd-1d35-c46b-3764c4d76e13")
                .interceptParameters("interceptParameters")
                .manufacturerOrgId("manufacturerOrgId")
                .name("Sensor Name")
                .notes("Sample Notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .positionalAccuracy("positionalAccuracy")
                .swathWidth(1.23)
                .type("Comint")
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
        val seradataSigintPayloadService = client.seradataSigintPayload()

        val page = seradataSigintPayloadService.list()

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
        val seradataSigintPayloadService = client.seradataSigintPayload()

        seradataSigintPayloadService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataSigintPayloadService = client.seradataSigintPayload()

        seradataSigintPayloadService.count(
            SeradataSigintPayloadCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seradataSigintPayloadService = client.seradataSigintPayload()

        val seradataSigintPayload =
            seradataSigintPayloadService.get(
                SeradataSigintPayloadGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        seradataSigintPayload.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataSigintPayloadService = client.seradataSigintPayload()

        val response = seradataSigintPayloadService.queryhelp()

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
        val seradataSigintPayloadService = client.seradataSigintPayload()

        val response =
            seradataSigintPayloadService.tuple(
                SeradataSigintPayloadTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
