// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.port.PortCountParams
import com.unifieddatalibrary.api.models.port.PortCreateBulkParams
import com.unifieddatalibrary.api.models.port.PortCreateParams
import com.unifieddatalibrary.api.models.port.PortGetParams
import com.unifieddatalibrary.api.models.port.PortTupleParams
import com.unifieddatalibrary.api.models.port.PortUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PortServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portServiceAsync = client.port()

        val future =
            portServiceAsync.create(
                PortCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(PortCreateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .avgDuration(41.1)
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .externalId("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
                    .harborSize(160.1)
                    .harborType("COASTAL NATURAL")
                    .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                    .lat(45.23)
                    .locode("CAVAN")
                    .lon(179.1)
                    .maxDraught(18.1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pilotReqd(true)
                    .portName("Vancouver")
                    .shelter("EXCELLENT")
                    .tideRange(4.1)
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
        val portServiceAsync = client.port()

        val future =
            portServiceAsync.update(
                PortUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(PortUpdateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .bodyId("026dd511-8ba5-47d3-9909-836149f87686")
                    .avgDuration(41.1)
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .externalId("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
                    .harborSize(160.1)
                    .harborType("COASTAL NATURAL")
                    .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                    .lat(45.23)
                    .locode("CAVAN")
                    .lon(179.1)
                    .maxDraught(18.1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pilotReqd(true)
                    .portName("Vancouver")
                    .shelter("EXCELLENT")
                    .tideRange(4.1)
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
        val portServiceAsync = client.port()

        val pageFuture = portServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portServiceAsync = client.port()

        val responseFuture =
            portServiceAsync.count(PortCountParams.builder().firstResult(0L).maxResults(0L).build())

        val response = responseFuture.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portServiceAsync = client.port()

        val future =
            portServiceAsync.createBulk(
                PortCreateBulkParams.builder()
                    .addBody(
                        PortCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(PortCreateBulkParams.Body.DataMode.TEST)
                            .source("Bluestaq")
                            .id("026dd511-8ba5-47d3-9909-836149f87686")
                            .avgDuration(41.1)
                            .countryCode("US")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .externalId("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
                            .harborSize(160.1)
                            .harborType("COASTAL NATURAL")
                            .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                            .lat(45.23)
                            .locode("CAVAN")
                            .lon(179.1)
                            .maxDraught(18.1)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .pilotReqd(true)
                            .portName("Vancouver")
                            .shelter("EXCELLENT")
                            .tideRange(4.1)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portServiceAsync = client.port()

        val portFuture =
            portServiceAsync.get(
                PortGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val port = portFuture.get()
        port.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portServiceAsync = client.port()

        val responseFuture = portServiceAsync.queryhelp()

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
        val portServiceAsync = client.port()

        val responseFuture =
            portServiceAsync.tuple(
                PortTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
