// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.BatteryIngest
import com.unifieddatalibrary.api.models.batteries.BatteryCountParams
import com.unifieddatalibrary.api.models.batteries.BatteryCreateParams
import com.unifieddatalibrary.api.models.batteries.BatteryRetrieveParams
import com.unifieddatalibrary.api.models.batteries.BatteryTupleParams
import com.unifieddatalibrary.api.models.batteries.BatteryUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatteryServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batteryService = client.batteries()

        batteryService.create(
            BatteryCreateParams.builder()
                .batteryIngest(
                    BatteryIngest.builder()
                        .dataMode(BatteryIngest.DataMode.TEST)
                        .name("JAK-BATTERY-1479")
                        .source("Bluestaq")
                        .id("BATTERY-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
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
        val batteryService = client.batteries()

        val batteryFull =
            batteryService.retrieve(
                BatteryRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        batteryFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batteryService = client.batteries()

        batteryService.update(
            BatteryUpdateParams.builder()
                .pathId("id")
                .batteryIngest(
                    BatteryIngest.builder()
                        .dataMode(BatteryIngest.DataMode.TEST)
                        .name("JAK-BATTERY-1479")
                        .source("Bluestaq")
                        .id("BATTERY-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
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
        val batteryService = client.batteries()

        val page = batteryService.list()

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
        val batteryService = client.batteries()

        batteryService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batteryService = client.batteries()

        batteryService.count(BatteryCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batteryService = client.batteries()

        val response = batteryService.queryhelp()

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
        val batteryService = client.batteries()

        val batteryFulls =
            batteryService.tuple(
                BatteryTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        batteryFulls.forEach { it.validate() }
    }
}
