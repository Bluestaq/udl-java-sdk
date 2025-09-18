// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetCountParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetCreateParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetGetParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetListParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetTupleParams
import com.unifieddatalibrary.api.models.deconflictset.DeconflictsetUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeconflictsetServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val deconflictsetServiceAsync = client.deconflictset()

        val future =
            deconflictsetServiceAsync.create(
                DeconflictsetCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(DeconflictsetCreateParams.DataMode.TEST)
                    .eventStartTime(OffsetDateTime.parse("2023-09-27T20:49:37.812Z"))
                    .numWindows(250001)
                    .source("Bluestaq")
                    .id("123dd511-8ba5-47d3-9909-836149f87434")
                    .calculationEndTime(OffsetDateTime.parse("2023-09-25T20:00:00.123Z"))
                    .calculationId("3856c0a0-585f-4232-af5d-93bad320fac6")
                    .calculationStartTime(OffsetDateTime.parse("2023-09-25T18:00:00.123Z"))
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .addDeconflictWindow(
                        DeconflictsetCreateParams.DeconflictWindow.builder()
                            .classificationMarking("U")
                            .dataMode(DeconflictsetCreateParams.DeconflictWindow.DataMode.TEST)
                            .eventStartTime(OffsetDateTime.parse("2023-09-27T20:49:37.812Z"))
                            .source("Bluestaq")
                            .startTime(OffsetDateTime.parse("2023-07-19T00:00:00.001Z"))
                            .stopTime(OffsetDateTime.parse("2023-07-19T04:20:34.257Z"))
                            .id("123dd511-8ba5-47d3-9909-836149f87434")
                            .angleOfEntry(0.65)
                            .angleOfExit(0.65)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .entryCoords(
                                listOf(-191500.74728263554, -987729.0529358581, 6735105.853234725)
                            )
                            .eventType("LASER")
                            .exitCoords(
                                listOf(-361767.9896431379, -854021.6371921108, 6746208.020741149)
                            )
                            .idDeconflictSet("765dd511-8ba5-47d3-9909-836149f87da1")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .sourceDl("AXE")
                            .target("41715")
                            .targetType("VICTIM")
                            .victim("55914")
                            .windowType("CLOSED")
                            .build()
                    )
                    .addError("ERROR1")
                    .addError("ERROR2")
                    .eventEndTime(OffsetDateTime.parse("2023-09-28T20:49:37.812Z"))
                    .eventType("LASER")
                    .idLaserDeconflictRequest("026dd511-8ba5-47d3-9909-836149f87686")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .referenceFrame("J2000")
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .transactionId("TRANSACTION-ID")
                    .addWarning("WARNING1")
                    .addWarning("WARNING2")
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
        val deconflictsetServiceAsync = client.deconflictset()

        val pageFuture =
            deconflictsetServiceAsync.list(
                DeconflictsetListParams.builder()
                    .eventStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
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
        val deconflictsetServiceAsync = client.deconflictset()

        val responseFuture =
            deconflictsetServiceAsync.count(
                DeconflictsetCountParams.builder()
                    .eventStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
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
        val deconflictsetServiceAsync = client.deconflictset()

        val deconflictsetFuture =
            deconflictsetServiceAsync.get(
                DeconflictsetGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val deconflictset = deconflictsetFuture.get()
        deconflictset.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val deconflictsetServiceAsync = client.deconflictset()

        val responseFuture = deconflictsetServiceAsync.queryhelp()

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
        val deconflictsetServiceAsync = client.deconflictset()

        val responseFuture =
            deconflictsetServiceAsync.tuple(
                DeconflictsetTupleParams.builder()
                    .columns("columns")
                    .eventStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val deconflictsetServiceAsync = client.deconflictset()

        val future =
            deconflictsetServiceAsync.unvalidatedPublish(
                DeconflictsetUnvalidatedPublishParams.builder()
                    .classificationMarking("U")
                    .dataMode(DeconflictsetUnvalidatedPublishParams.DataMode.TEST)
                    .eventStartTime(OffsetDateTime.parse("2023-09-27T20:49:37.812Z"))
                    .numWindows(250001)
                    .source("Bluestaq")
                    .id("123dd511-8ba5-47d3-9909-836149f87434")
                    .calculationEndTime(OffsetDateTime.parse("2023-09-25T20:00:00.123Z"))
                    .calculationId("3856c0a0-585f-4232-af5d-93bad320fac6")
                    .calculationStartTime(OffsetDateTime.parse("2023-09-25T18:00:00.123Z"))
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .addDeconflictWindow(
                        DeconflictsetUnvalidatedPublishParams.DeconflictWindow.builder()
                            .classificationMarking("U")
                            .dataMode(
                                DeconflictsetUnvalidatedPublishParams.DeconflictWindow.DataMode.TEST
                            )
                            .eventStartTime(OffsetDateTime.parse("2023-09-27T20:49:37.812Z"))
                            .source("Bluestaq")
                            .startTime(OffsetDateTime.parse("2023-07-19T00:00:00.001Z"))
                            .stopTime(OffsetDateTime.parse("2023-07-19T04:20:34.257Z"))
                            .id("123dd511-8ba5-47d3-9909-836149f87434")
                            .angleOfEntry(0.65)
                            .angleOfExit(0.65)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .entryCoords(
                                listOf(-191500.74728263554, -987729.0529358581, 6735105.853234725)
                            )
                            .eventType("LASER")
                            .exitCoords(
                                listOf(-361767.9896431379, -854021.6371921108, 6746208.020741149)
                            )
                            .idDeconflictSet("765dd511-8ba5-47d3-9909-836149f87da1")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .sourceDl("AXE")
                            .target("41715")
                            .targetType("VICTIM")
                            .victim("55914")
                            .windowType("CLOSED")
                            .build()
                    )
                    .addError("ERROR1")
                    .addError("ERROR2")
                    .eventEndTime(OffsetDateTime.parse("2023-09-28T20:49:37.812Z"))
                    .eventType("LASER")
                    .idLaserDeconflictRequest("026dd511-8ba5-47d3-9909-836149f87686")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .referenceFrame("J2000")
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .transactionId("TRANSACTION-ID")
                    .addWarning("WARNING1")
                    .addWarning("WARNING2")
                    .build()
            )

        val response = future.get()
    }
}
