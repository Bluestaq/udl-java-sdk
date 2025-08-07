// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.solararray.SolarArrayCountParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayCreateParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayGetParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayTupleParams
import com.unifieddatalibrary.api.models.solararray.SolarArrayUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SolarArrayServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val solarArrayServiceAsync = client.solarArray()

        val future =
            solarArrayServiceAsync.create(
                SolarArrayCreateParams.builder()
                    .dataMode(SolarArrayCreateParams.DataMode.TEST)
                    .name("Solar1")
                    .source("Bluestaq")
                    .id("SOLARARRAY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val solarArrayServiceAsync = client.solarArray()

        val future =
            solarArrayServiceAsync.update(
                SolarArrayUpdateParams.builder()
                    .pathId("id")
                    .dataMode(SolarArrayUpdateParams.DataMode.TEST)
                    .name("Solar1")
                    .source("Bluestaq")
                    .bodyId("SOLARARRAY-ID")
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
        val solarArrayServiceAsync = client.solarArray()

        val pageFuture = solarArrayServiceAsync.list()

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
        val solarArrayServiceAsync = client.solarArray()

        val future = solarArrayServiceAsync.delete("id")

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
        val solarArrayServiceAsync = client.solarArray()

        val responseFuture =
            solarArrayServiceAsync.count(
                SolarArrayCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val solarArrayServiceAsync = client.solarArray()

        val solarArrayFullFuture =
            solarArrayServiceAsync.get(
                SolarArrayGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val solarArrayFull = solarArrayFullFuture.get()
        solarArrayFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val solarArrayServiceAsync = client.solarArray()

        val responseFuture = solarArrayServiceAsync.queryhelp()

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
        val solarArrayServiceAsync = client.solarArray()

        val solarArrayFullsFuture =
            solarArrayServiceAsync.tuple(
                SolarArrayTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val solarArrayFulls = solarArrayFullsFuture.get()
        solarArrayFulls.forEach { it.validate() }
    }
}
