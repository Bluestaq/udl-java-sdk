// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.batteries.BatteryCountParams
import com.unifieddatalibrary.api.models.batteries.BatteryCreateParams
import com.unifieddatalibrary.api.models.batteries.BatteryRetrieveParams
import com.unifieddatalibrary.api.models.batteries.BatteryTupleParams
import com.unifieddatalibrary.api.models.batteries.BatteryUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatteryServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batteryServiceAsync = client.batteries()

        val future =
            batteryServiceAsync.create(
                BatteryCreateParams.builder()
                    .dataMode(BatteryCreateParams.DataMode.TEST)
                    .name("JAK-BATTERY-1479")
                    .source("Bluestaq")
                    .id("BATTERY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
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
        val batteryServiceAsync = client.batteries()

        val batteryFullFuture =
            batteryServiceAsync.retrieve(
                BatteryRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val batteryFull = batteryFullFuture.get()
        batteryFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batteryServiceAsync = client.batteries()

        val future =
            batteryServiceAsync.update(
                BatteryUpdateParams.builder()
                    .pathId("id")
                    .dataMode(BatteryUpdateParams.DataMode.TEST)
                    .name("JAK-BATTERY-1479")
                    .source("Bluestaq")
                    .bodyId("BATTERY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
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
        val batteryServiceAsync = client.batteries()

        val pageFuture = batteryServiceAsync.list()

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
        val batteryServiceAsync = client.batteries()

        val future = batteryServiceAsync.delete("id")

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
        val batteryServiceAsync = client.batteries()

        val responseFuture =
            batteryServiceAsync.count(
                BatteryCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val batteryServiceAsync = client.batteries()

        val responseFuture = batteryServiceAsync.queryhelp()

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
        val batteryServiceAsync = client.batteries()

        val batteryFullsFuture =
            batteryServiceAsync.tuple(
                BatteryTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val batteryFulls = batteryFullsFuture.get()
        batteryFulls.forEach { it.validate() }
    }
}
