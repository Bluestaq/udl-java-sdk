// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCountParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCreateParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkRetrieveParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkTupleParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AircraftStatusRemarkServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusRemarkServiceAsync = client.aircraftStatusRemarks()

        val future =
            aircraftStatusRemarkServiceAsync.create(
                AircraftStatusRemarkCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(AircraftStatusRemarkCreateParams.DataMode.TEST)
                    .idAircraftStatus("388b1f64-ccff-4113-b049-3cf5542c2a42")
                    .source("Bluestaq")
                    .text("Remark text")
                    .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .altRmkId("GDSSBL022307131714250077")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .lastUpdatedAt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                    .lastUpdatedBy("JOHN SMITH")
                    .name("DISCREPANCY - 202297501")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .sourceDl("AXE")
                    .timestamp(OffsetDateTime.parse("2024-01-01T15:00:00.123Z"))
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
        val aircraftStatusRemarkServiceAsync = client.aircraftStatusRemarks()

        val aircraftstatusremarkFullFuture =
            aircraftStatusRemarkServiceAsync.retrieve(
                AircraftStatusRemarkRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val aircraftstatusremarkFull = aircraftstatusremarkFullFuture.get()
        aircraftstatusremarkFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusRemarkServiceAsync = client.aircraftStatusRemarks()

        val future =
            aircraftStatusRemarkServiceAsync.update(
                AircraftStatusRemarkUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(AircraftStatusRemarkUpdateParams.DataMode.TEST)
                    .idAircraftStatus("388b1f64-ccff-4113-b049-3cf5542c2a42")
                    .source("Bluestaq")
                    .text("Remark text")
                    .bodyId("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .altRmkId("GDSSBL022307131714250077")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .lastUpdatedAt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                    .lastUpdatedBy("JOHN SMITH")
                    .name("DISCREPANCY - 202297501")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .sourceDl("AXE")
                    .timestamp(OffsetDateTime.parse("2024-01-01T15:00:00.123Z"))
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
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
        val aircraftStatusRemarkServiceAsync = client.aircraftStatusRemarks()

        val pageFuture = aircraftStatusRemarkServiceAsync.list()

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
        val aircraftStatusRemarkServiceAsync = client.aircraftStatusRemarks()

        val future = aircraftStatusRemarkServiceAsync.delete("id")

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
        val aircraftStatusRemarkServiceAsync = client.aircraftStatusRemarks()

        val responseFuture =
            aircraftStatusRemarkServiceAsync.count(
                AircraftStatusRemarkCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val aircraftStatusRemarkServiceAsync = client.aircraftStatusRemarks()

        val responseFuture = aircraftStatusRemarkServiceAsync.queryhelp()

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
        val aircraftStatusRemarkServiceAsync = client.aircraftStatusRemarks()

        val aircraftstatusremarkFullsFuture =
            aircraftStatusRemarkServiceAsync.tuple(
                AircraftStatusRemarkTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val aircraftstatusremarkFulls = aircraftstatusremarkFullsFuture.get()
        aircraftstatusremarkFulls.forEach { it.validate() }
    }
}
