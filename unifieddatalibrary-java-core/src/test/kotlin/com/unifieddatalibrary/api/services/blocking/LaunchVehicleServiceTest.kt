// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCountParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleCreateParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleGetParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleTupleParams
import com.unifieddatalibrary.api.models.launchvehicle.LaunchVehicleUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaunchVehicleServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchVehicleService = client.launchVehicle()

        launchVehicleService.create(
            LaunchVehicleCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchVehicleCreateParams.DataMode.TEST)
                .name("Example-name")
                .source("Bluestaq")
                .id("LAUNCHVEHICLE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .type("Example-vehicle-type")
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
        val launchVehicleService = client.launchVehicle()

        launchVehicleService.update(
            LaunchVehicleUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(LaunchVehicleUpdateParams.DataMode.TEST)
                .name("Example-name")
                .source("Bluestaq")
                .bodyId("LAUNCHVEHICLE-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .type("Example-vehicle-type")
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
        val launchVehicleService = client.launchVehicle()

        val page = launchVehicleService.list()

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
        val launchVehicleService = client.launchVehicle()

        launchVehicleService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchVehicleService = client.launchVehicle()

        launchVehicleService.count(
            LaunchVehicleCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val launchVehicleService = client.launchVehicle()

        val launchVehicle =
            launchVehicleService.get(
                LaunchVehicleGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        launchVehicle.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchVehicleService = client.launchVehicle()

        val response = launchVehicleService.queryhelp()

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
        val launchVehicleService = client.launchVehicle()

        val response =
            launchVehicleService.tuple(
                LaunchVehicleTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
