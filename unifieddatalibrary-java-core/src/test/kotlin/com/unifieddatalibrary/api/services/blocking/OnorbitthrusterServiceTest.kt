// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterCreateParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterGetParams
import com.unifieddatalibrary.api.models.onorbitthruster.OnorbitthrusterUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitthrusterServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitthrusterService = client.onorbitthruster()

        onorbitthrusterService.create(
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
                    OnorbitthrusterCreateParams.Engine.builder()
                        .classificationMarking("U")
                        .dataMode(OnorbitthrusterCreateParams.Engine.DataMode.TEST)
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitthrusterService = client.onorbitthruster()

        onorbitthrusterService.update(
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
                    OnorbitthrusterUpdateParams.Engine.builder()
                        .classificationMarking("U")
                        .dataMode(OnorbitthrusterUpdateParams.Engine.DataMode.TEST)
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitthrusterService = client.onorbitthruster()

        val page = onorbitthrusterService.list()

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
        val onorbitthrusterService = client.onorbitthruster()

        onorbitthrusterService.delete("id")
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitthrusterService = client.onorbitthruster()

        val onorbitThrusterFull =
            onorbitthrusterService.get(
                OnorbitthrusterGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        onorbitThrusterFull.validate()
    }
}
