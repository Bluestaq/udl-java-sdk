// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCountParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkCreateParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkRetrieveParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkTupleParams
import com.unifieddatalibrary.api.models.aircraftstatusremarks.AircraftStatusRemarkUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AircraftStatusRemarkServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusRemarkService = client.aircraftStatusRemarks()

        aircraftStatusRemarkService.create(
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
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusRemarkService = client.aircraftStatusRemarks()

        val aircraftstatusremarkFull =
            aircraftStatusRemarkService.retrieve(
                AircraftStatusRemarkRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        aircraftstatusremarkFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusRemarkService = client.aircraftStatusRemarks()

        aircraftStatusRemarkService.update(
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
        val aircraftStatusRemarkService = client.aircraftStatusRemarks()

        val page = aircraftStatusRemarkService.list()

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
        val aircraftStatusRemarkService = client.aircraftStatusRemarks()

        aircraftStatusRemarkService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aircraftStatusRemarkService = client.aircraftStatusRemarks()

        aircraftStatusRemarkService.count(
            AircraftStatusRemarkCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val aircraftStatusRemarkService = client.aircraftStatusRemarks()

        val response = aircraftStatusRemarkService.queryhelp()

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
        val aircraftStatusRemarkService = client.aircraftStatusRemarks()

        val aircraftstatusremarkFulls =
            aircraftStatusRemarkService.tuple(
                AircraftStatusRemarkTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        aircraftstatusremarkFulls.forEach { it.validate() }
    }
}
