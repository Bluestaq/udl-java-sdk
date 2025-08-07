// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.ais.AiCountParams
import com.unifieddatalibrary.api.models.ais.AiCreateBulkParams
import com.unifieddatalibrary.api.models.ais.AiHistoryCountParams
import com.unifieddatalibrary.api.models.ais.AiListParams
import com.unifieddatalibrary.api.models.ais.AiTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AiServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aiServiceAsync = client.ais()

        val pageFuture =
            aiServiceAsync.list(
                AiListParams.builder().ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z")).build()
            )

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
        val aiServiceAsync = client.ais()

        val responseFuture =
            aiServiceAsync.count(
                AiCountParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

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
        val aiServiceAsync = client.ais()

        val future =
            aiServiceAsync.createBulk(
                AiCreateBulkParams.builder()
                    .addBody(
                        AiCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(AiCreateBulkParams.Body.DataMode.TEST)
                            .source("Bluestaq")
                            .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .id("AIS-ID")
                            .antennaRefDimensions(listOf(50.1, 50.1, 20.1, 20.1))
                            .avgSpeed(12.1)
                            .callSign("V2OZ")
                            .cargoType("Freight")
                            .course(157.1)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .currentPortGuid("0ABC")
                            .currentPortLocode("XF013")
                            .destination("USCLE")
                            .destinationEta(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .distanceToGo(150.5)
                            .distanceTravelled(200.3)
                            .draught(21.1)
                            .engagedIn("Cargo")
                            .etaCalculated(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .etaUpdated(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .idTrack("TRACK-ID")
                            .idVessel("VESSEL-ID")
                            .imon(9015462L)
                            .lastPortGuid("0VAX")
                            .lastPortLocode("USSKY")
                            .lat(47.758499)
                            .length(511.1)
                            .lon(-5.154223)
                            .maxSpeed(13.3)
                            .mmsi(304010417L)
                            .navStatus("Underway Using Engine")
                            .nextPortGuid("0Z8Q")
                            .nextPortLocode("USCLE")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .posDeviceType("GPS")
                            .posHiAccuracy(true)
                            .posHiLatency(true)
                            .rateOfTurn(22.1)
                            .shipDescription("Search and rescue vessels")
                            .shipName("DORNUM")
                            .shipType("Passenger")
                            .sourceDl("AXE")
                            .specialCraft("Tug")
                            .specialManeuver(false)
                            .speed(10.5)
                            .trueHeading(329.1)
                            .vesselFlag("United States")
                            .width(24.1)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun historyCount() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aiServiceAsync = client.ais()

        val responseFuture =
            aiServiceAsync.historyCount(
                AiHistoryCountParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
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
        val aiServiceAsync = client.ais()

        val responseFuture = aiServiceAsync.queryhelp()

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
        val aiServiceAsync = client.ais()

        val aisFullsFuture =
            aiServiceAsync.tuple(
                AiTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val aisFulls = aisFullsFuture.get()
        aisFulls.forEach { it.validate() }
    }
}
