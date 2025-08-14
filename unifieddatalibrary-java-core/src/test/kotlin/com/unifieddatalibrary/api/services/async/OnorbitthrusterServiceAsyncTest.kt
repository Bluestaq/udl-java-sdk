// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.EngineIngest
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterCreateParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterGetParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitthrusterServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitthrusterServiceAsync = client.onorbitthruster()

        val future =
            onorbitthrusterServiceAsync.create(
                OnorbitthrusterCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(OnorbitthrusterCreateParams.DataMode.TEST)
                    .idEngine("ENGINE-ID")
                    .idOnOrbit("ONORBIT-ID")
                    .source("Bluestaq")
                    .id("ONORBITTHRUSTER-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .engine(
                        EngineIngest.builder()
                            .classificationMarking("U")
                            .dataMode(EngineIngest.DataMode.TEST)
                            .name("ENGINE_VARIANT1")
                            .source("Bluestaq")
                            .id("ENGINE-ID")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .build()
                    )
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .quantity(10)
                    .type("Hydrazine REA")
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
        val onorbitthrusterServiceAsync = client.onorbitthruster()

        val future =
            onorbitthrusterServiceAsync.update(
                OnorbitthrusterUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(OnorbitthrusterUpdateParams.DataMode.TEST)
                    .idEngine("ENGINE-ID")
                    .idOnOrbit("ONORBIT-ID")
                    .source("Bluestaq")
                    .bodyId("ONORBITTHRUSTER-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .engine(
                        EngineIngest.builder()
                            .classificationMarking("U")
                            .dataMode(EngineIngest.DataMode.TEST)
                            .name("ENGINE_VARIANT1")
                            .source("Bluestaq")
                            .id("ENGINE-ID")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .build()
                    )
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .quantity(10)
                    .type("Hydrazine REA")
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
        val onorbitthrusterServiceAsync = client.onorbitthruster()

        val pageFuture = onorbitthrusterServiceAsync.list()

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
        val onorbitthrusterServiceAsync = client.onorbitthruster()

        val future = onorbitthrusterServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitthrusterServiceAsync = client.onorbitthruster()

        val onorbitThrusterFullFuture =
            onorbitthrusterServiceAsync.get(
                OnorbitthrusterGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val onorbitThrusterFull = onorbitThrusterFullFuture.get()
        onorbitThrusterFull.validate()
    }
}
