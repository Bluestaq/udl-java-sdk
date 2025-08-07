// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCountParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCreateParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotRetrieveParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotTupleParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AirfieldSlotServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotServiceAsync = client.airfieldSlots()

        val future =
            airfieldSlotServiceAsync.create(
                AirfieldSlotCreateParams.builder()
                    .airfieldName("USAF Academy AFLD")
                    .classificationMarking("U")
                    .dataMode(AirfieldSlotCreateParams.DataMode.TEST)
                    .name("Apron 5")
                    .source("Bluestaq")
                    .id("be831d39-1822-da9f-7ace-6cc5643397dc")
                    .acSlotCat(AirfieldSlotCreateParams.AcSlotCat.WIDE)
                    .altAirfieldId("ALT-AIRFIELD-ID")
                    .capacity(5)
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .endTime("2359Z")
                    .icao("KCOS")
                    .idAirfield("3136498f-2969-3535-1432-e984b2e2e686")
                    .minSeparation(7)
                    .notes("Notes for an airfield slot.")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .sourceDl("AXE")
                    .startTime("0000Z")
                    .type(AirfieldSlotCreateParams.Type.WORKING)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotServiceAsync = client.airfieldSlots()

        val airfieldslotFullFuture =
            airfieldSlotServiceAsync.retrieve(
                AirfieldSlotRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val airfieldslotFull = airfieldslotFullFuture.get()
        airfieldslotFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotServiceAsync = client.airfieldSlots()

        val future =
            airfieldSlotServiceAsync.update(
                AirfieldSlotUpdateParams.builder()
                    .pathId("id")
                    .airfieldName("USAF Academy AFLD")
                    .classificationMarking("U")
                    .dataMode(AirfieldSlotUpdateParams.DataMode.TEST)
                    .name("Apron 5")
                    .source("Bluestaq")
                    .bodyId("be831d39-1822-da9f-7ace-6cc5643397dc")
                    .acSlotCat(AirfieldSlotUpdateParams.AcSlotCat.WIDE)
                    .altAirfieldId("ALT-AIRFIELD-ID")
                    .capacity(5)
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .endTime("2359Z")
                    .icao("KCOS")
                    .idAirfield("3136498f-2969-3535-1432-e984b2e2e686")
                    .minSeparation(7)
                    .notes("Notes for an airfield slot.")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .sourceDl("AXE")
                    .startTime("0000Z")
                    .type(AirfieldSlotUpdateParams.Type.WORKING)
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
        val airfieldSlotServiceAsync = client.airfieldSlots()

        val pageFuture = airfieldSlotServiceAsync.list()

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
        val airfieldSlotServiceAsync = client.airfieldSlots()

        val future = airfieldSlotServiceAsync.delete("id")

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
        val airfieldSlotServiceAsync = client.airfieldSlots()

        val responseFuture =
            airfieldSlotServiceAsync.count(
                AirfieldSlotCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotServiceAsync = client.airfieldSlots()

        val responseFuture = airfieldSlotServiceAsync.queryhelp()

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
        val airfieldSlotServiceAsync = client.airfieldSlots()

        val airfieldslotFullsFuture =
            airfieldSlotServiceAsync.tuple(
                AirfieldSlotTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val airfieldslotFulls = airfieldslotFullsFuture.get()
        airfieldslotFulls.forEach { it.validate() }
    }
}
