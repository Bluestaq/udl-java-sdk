// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCountParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCreateParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusRetrieveParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusTupleParams
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AirfieldStatusServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldStatusServiceAsync = client.airfieldStatus()

        val future =
            airfieldStatusServiceAsync.create(
                AirfieldStatusCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(AirfieldStatusCreateParams.DataMode.TEST)
                    .idAirfield("3136498f-2969-3535-1432-e984b2e2e686")
                    .source("Bluestaq")
                    .id("be831d39-1822-da9f-7ace-6cc5643397dc")
                    .altAirfieldId("AIRFIELD-ID")
                    .approvedBy("John Smith")
                    .approvedDate(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                    .arffCat("FAA-A")
                    .cargoMog(8)
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .fleetServiceMog(4)
                    .fuelMog(9)
                    .fuelQtys(listOf(263083.6, 286674.9, 18143.69))
                    .fuelTypes(listOf("JP-8", "Jet A", "AVGAS"))
                    .gseTime(10)
                    .medCap("Large Field Hospital")
                    .message("Status message about the airfield.")
                    .mheQtys(listOf(1, 3, 1))
                    .mheTypes(listOf("30k", "AT", "60k"))
                    .mxMog(3)
                    .narrowParkingMog(5)
                    .narrowWorkingMog(4)
                    .numCog(2)
                    .operatingMog(4)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .passengerServiceMog(5)
                    .priFreq(123.45)
                    .priRwyNum("35R")
                    .reviewedBy("Jane Doe")
                    .reviewedDate(OffsetDateTime.parse("2024-01-01T00:00:00.123Z"))
                    .rwyCondReading(23)
                    .rwyFrictionFactor(10)
                    .addRwyMarking("Aiming Point")
                    .addRwyMarking("Threshold")
                    .slotTypesReq(listOf("PARKING", "WORKING", "LANDING"))
                    .sourceDl("AXE")
                    .surveyDate(OffsetDateTime.parse("2023-01-01T12:00:00.123Z"))
                    .wideParkingMog(7)
                    .wideWorkingMog(3)
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
        val airfieldStatusServiceAsync = client.airfieldStatus()

        val airfieldstatusFullFuture =
            airfieldStatusServiceAsync.retrieve(
                AirfieldStatusRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val airfieldstatusFull = airfieldstatusFullFuture.get()
        airfieldstatusFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airfieldStatusServiceAsync = client.airfieldStatus()

        val future =
            airfieldStatusServiceAsync.update(
                AirfieldStatusUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(AirfieldStatusUpdateParams.DataMode.TEST)
                    .idAirfield("3136498f-2969-3535-1432-e984b2e2e686")
                    .source("Bluestaq")
                    .bodyId("be831d39-1822-da9f-7ace-6cc5643397dc")
                    .altAirfieldId("AIRFIELD-ID")
                    .approvedBy("John Smith")
                    .approvedDate(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                    .arffCat("FAA-A")
                    .cargoMog(8)
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .fleetServiceMog(4)
                    .fuelMog(9)
                    .fuelQtys(listOf(263083.6, 286674.9, 18143.69))
                    .fuelTypes(listOf("JP-8", "Jet A", "AVGAS"))
                    .gseTime(10)
                    .medCap("Large Field Hospital")
                    .message("Status message about the airfield.")
                    .mheQtys(listOf(1, 3, 1))
                    .mheTypes(listOf("30k", "AT", "60k"))
                    .mxMog(3)
                    .narrowParkingMog(5)
                    .narrowWorkingMog(4)
                    .numCog(2)
                    .operatingMog(4)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .passengerServiceMog(5)
                    .priFreq(123.45)
                    .priRwyNum("35R")
                    .reviewedBy("Jane Doe")
                    .reviewedDate(OffsetDateTime.parse("2024-01-01T00:00:00.123Z"))
                    .rwyCondReading(23)
                    .rwyFrictionFactor(10)
                    .addRwyMarking("Aiming Point")
                    .addRwyMarking("Threshold")
                    .slotTypesReq(listOf("PARKING", "WORKING", "LANDING"))
                    .sourceDl("AXE")
                    .surveyDate(OffsetDateTime.parse("2023-01-01T12:00:00.123Z"))
                    .wideParkingMog(7)
                    .wideWorkingMog(3)
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
        val airfieldStatusServiceAsync = client.airfieldStatus()

        val pageFuture = airfieldStatusServiceAsync.list()

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
        val airfieldStatusServiceAsync = client.airfieldStatus()

        val future = airfieldStatusServiceAsync.delete("id")

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
        val airfieldStatusServiceAsync = client.airfieldStatus()

        val responseFuture =
            airfieldStatusServiceAsync.count(
                AirfieldStatusCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val airfieldStatusServiceAsync = client.airfieldStatus()

        val responseFuture = airfieldStatusServiceAsync.queryhelp()

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
        val airfieldStatusServiceAsync = client.airfieldStatus()

        val airfieldstatusFullsFuture =
            airfieldStatusServiceAsync.tuple(
                AirfieldStatusTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val airfieldstatusFulls = airfieldstatusFullsFuture.get()
        airfieldstatusFulls.forEach { it.validate() }
    }
}
