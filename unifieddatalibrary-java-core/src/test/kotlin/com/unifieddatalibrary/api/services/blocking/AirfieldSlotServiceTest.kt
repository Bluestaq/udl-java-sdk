// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCountParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotCreateParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotRetrieveParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotTupleParams
import com.unifieddatalibrary.api.models.airfieldslots.AirfieldSlotUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AirfieldSlotServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotService = client.airfieldSlots()

        airfieldSlotService.create(
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
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotService = client.airfieldSlots()

        val airfieldslotFull =
            airfieldSlotService.retrieve(
                AirfieldSlotRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        airfieldslotFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotService = client.airfieldSlots()

        airfieldSlotService.update(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotService = client.airfieldSlots()

        val page = airfieldSlotService.list()

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
        val airfieldSlotService = client.airfieldSlots()

        airfieldSlotService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotService = client.airfieldSlots()

        airfieldSlotService.count(
            AirfieldSlotCountParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldSlotService = client.airfieldSlots()

        val response = airfieldSlotService.queryhelp()

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
        val airfieldSlotService = client.airfieldSlots()

        val airfieldslotFulls =
            airfieldSlotService.tuple(
                AirfieldSlotTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        airfieldslotFulls.forEach { it.validate() }
    }
}
