// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingCountParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingCreateParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingGetParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingListParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingTupleParams
import com.unifieddatalibrary.api.models.itemtrackings.ItemTrackingUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ItemTrackingServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val itemTrackingService = client.itemTrackings()

        itemTrackingService.create(
            ItemTrackingCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ItemTrackingCreateParams.DataMode.TEST)
                .scanCode("ABC1234")
                .scannerId("2051M")
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .createdAt(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
                .createdBy("some.user")
                .dvCode("DV-4")
                .idItem("36054487-bcba-6e2d-4f3b-9f25738b2639")
                .addKey("tapeColor")
                .addKey("hazmat")
                .lat(45.23)
                .lon(179.1)
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .scanType("TRANSIT")
                .scGenTool("bID")
                .sourceDl("AXE")
                .type("CARGO")
                .addValue("yellow")
                .addValue("false")
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
        val itemTrackingService = client.itemTrackings()

        val page =
            itemTrackingService.list(
                ItemTrackingListParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

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
        val itemTrackingService = client.itemTrackings()

        itemTrackingService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val itemTrackingService = client.itemTrackings()

        itemTrackingService.count(
            ItemTrackingCountParams.builder()
                .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
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
        val itemTrackingService = client.itemTrackings()

        val itemTracking =
            itemTrackingService.get(
                ItemTrackingGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        itemTracking.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val itemTrackingService = client.itemTrackings()

        val response = itemTrackingService.queryhelp()

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
        val itemTrackingService = client.itemTrackings()

        val response =
            itemTrackingService.tuple(
                ItemTrackingTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val itemTrackingService = client.itemTrackings()

        itemTrackingService.unvalidatedPublish(
            ItemTrackingUnvalidatedPublishParams.builder()
                .addBody(
                    ItemTrackingUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(ItemTrackingUnvalidatedPublishParams.Body.DataMode.TEST)
                        .scanCode("ABC1234")
                        .scannerId("2051M")
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2023-03-21T14:22:00.123Z"))
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .createdAt(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
                        .createdBy("some.user")
                        .dvCode("DV-4")
                        .idItem("36054487-bcba-6e2d-4f3b-9f25738b2639")
                        .addKey("tapeColor")
                        .addKey("hazmat")
                        .lat(45.23)
                        .lon(179.1)
                        .notes("Example notes")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .scanType("TRANSIT")
                        .scGenTool("bID")
                        .sourceDl("AXE")
                        .type("CARGO")
                        .addValue("yellow")
                        .addValue("false")
                        .build()
                )
                .build()
        )
    }
}
