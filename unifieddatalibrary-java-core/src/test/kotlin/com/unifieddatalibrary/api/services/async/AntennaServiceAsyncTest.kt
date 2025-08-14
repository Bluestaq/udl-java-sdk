// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.AntennaIngest
import com.unifieddatalibrary.api.models.antennas.AntennaCountParams
import com.unifieddatalibrary.api.models.antennas.AntennaCreateParams
import com.unifieddatalibrary.api.models.antennas.AntennaRetrieveParams
import com.unifieddatalibrary.api.models.antennas.AntennaTupleParams
import com.unifieddatalibrary.api.models.antennas.AntennaUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AntennaServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val antennaServiceAsync = client.antennas()

        val future =
            antennaServiceAsync.create(
                AntennaCreateParams.builder()
                    .antennaIngest(
                        AntennaIngest.builder()
                            .dataMode(AntennaIngest.DataMode.TEST)
                            .name("IRIDIUM NEXT 121-ANTENNA-10075")
                            .source("Bluestaq")
                            .id("ANTENNA-ID")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .build()
                    )
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
        val antennaServiceAsync = client.antennas()

        val antennaFullFuture =
            antennaServiceAsync.retrieve(
                AntennaRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val antennaFull = antennaFullFuture.get()
        antennaFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val antennaServiceAsync = client.antennas()

        val future =
            antennaServiceAsync.update(
                AntennaUpdateParams.builder()
                    .pathId("id")
                    .antennaIngest(
                        AntennaIngest.builder()
                            .dataMode(AntennaIngest.DataMode.TEST)
                            .name("IRIDIUM NEXT 121-ANTENNA-10075")
                            .source("Bluestaq")
                            .id("ANTENNA-ID")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .build()
                    )
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
        val antennaServiceAsync = client.antennas()

        val pageFuture = antennaServiceAsync.list()

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
        val antennaServiceAsync = client.antennas()

        val future = antennaServiceAsync.delete("id")

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
        val antennaServiceAsync = client.antennas()

        val responseFuture =
            antennaServiceAsync.count(
                AntennaCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val antennaServiceAsync = client.antennas()

        val responseFuture = antennaServiceAsync.queryhelp()

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
        val antennaServiceAsync = client.antennas()

        val antennaFullsFuture =
            antennaServiceAsync.tuple(
                AntennaTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val antennaFulls = antennaFullsFuture.get()
        antennaFulls.forEach { it.validate() }
    }
}
