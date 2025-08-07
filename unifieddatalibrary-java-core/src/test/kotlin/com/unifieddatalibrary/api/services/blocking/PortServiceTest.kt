// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
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
internal class PortServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portService = client.port()

        portService.create(
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portService = client.port()

        portService.update(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portService = client.port()

        val page = portService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portService = client.port()

        portService.count(PortCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portService = client.port()

        portService.createBulk(
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
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portService = client.port()

        val port =
            portService.get(PortGetParams.builder().id("id").firstResult(0L).maxResults(0L).build())

        port.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val portService = client.port()

        val response = portService.queryhelp()

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
        val portService = client.port()

        val response =
            portService.tuple(
                PortTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        response.forEach { it.validate() }
    }
}
