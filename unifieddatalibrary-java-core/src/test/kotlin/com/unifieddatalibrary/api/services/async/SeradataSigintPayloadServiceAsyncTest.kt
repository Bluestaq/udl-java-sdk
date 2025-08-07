// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCountParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadCreateParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadGetParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadTupleParams
import com.unifieddatalibrary.api.models.seradatasigintpayload.SeradataSigintPayloadUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeradataSigintPayloadServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataSigintPayloadServiceAsync = client.seradataSigintPayload()

        val future =
            seradataSigintPayloadServiceAsync.create(
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
                    .origNetwork("ORIG")
                    .positionalAccuracy("positionalAccuracy")
                    .swathWidth(1.23)
                    .type("Comint")
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
        val seradataSigintPayloadServiceAsync = client.seradataSigintPayload()

        val future =
            seradataSigintPayloadServiceAsync.update(
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
                    .origNetwork("ORIG")
                    .positionalAccuracy("positionalAccuracy")
                    .swathWidth(1.23)
                    .type("Comint")
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
        val seradataSigintPayloadServiceAsync = client.seradataSigintPayload()

        val pageFuture = seradataSigintPayloadServiceAsync.list()

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
        val seradataSigintPayloadServiceAsync = client.seradataSigintPayload()

        val future = seradataSigintPayloadServiceAsync.delete("id")

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
        val seradataSigintPayloadServiceAsync = client.seradataSigintPayload()

        val responseFuture =
            seradataSigintPayloadServiceAsync.count(
                SeradataSigintPayloadCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val seradataSigintPayloadServiceAsync = client.seradataSigintPayload()

        val seradataSigintPayloadFuture =
            seradataSigintPayloadServiceAsync.get(
                SeradataSigintPayloadGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val seradataSigintPayload = seradataSigintPayloadFuture.get()
        seradataSigintPayload.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seradataSigintPayloadServiceAsync = client.seradataSigintPayload()

        val responseFuture = seradataSigintPayloadServiceAsync.queryhelp()

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
        val seradataSigintPayloadServiceAsync = client.seradataSigintPayload()

        val responseFuture =
            seradataSigintPayloadServiceAsync.tuple(
                SeradataSigintPayloadTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
