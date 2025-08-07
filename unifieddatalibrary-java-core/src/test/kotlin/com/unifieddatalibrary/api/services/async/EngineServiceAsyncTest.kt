// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.engines.EngineCountParams
import com.unifieddatalibrary.api.models.engines.EngineCreateParams
import com.unifieddatalibrary.api.models.engines.EngineRetrieveParams
import com.unifieddatalibrary.api.models.engines.EngineTupleParams
import com.unifieddatalibrary.api.models.engines.EngineUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EngineServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val engineServiceAsync = client.engines()

        val future =
            engineServiceAsync.create(
                EngineCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(EngineCreateParams.DataMode.TEST)
                    .name("ENGINE_VARIANT1")
                    .source("Bluestaq")
                    .id("ENGINE-ID")
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
        val engineServiceAsync = client.engines()

        val engineFuture =
            engineServiceAsync.retrieve(
                EngineRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val engine = engineFuture.get()
        engine.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val engineServiceAsync = client.engines()

        val future =
            engineServiceAsync.update(
                EngineUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(EngineUpdateParams.DataMode.TEST)
                    .name("ENGINE_VARIANT1")
                    .source("Bluestaq")
                    .bodyId("ENGINE-ID")
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
        val engineServiceAsync = client.engines()

        val pageFuture = engineServiceAsync.list()

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
        val engineServiceAsync = client.engines()

        val future = engineServiceAsync.delete("id")

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
        val engineServiceAsync = client.engines()

        val responseFuture =
            engineServiceAsync.count(
                EngineCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val engineServiceAsync = client.engines()

        val responseFuture = engineServiceAsync.queryhelp()

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
        val engineServiceAsync = client.engines()

        val enginesFuture =
            engineServiceAsync.tuple(
                EngineTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val engines = enginesFuture.get()
        engines.forEach { it.validate() }
    }
}
