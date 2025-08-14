// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.SolarArrayIngest
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayCreateParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayGetParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitsolararrayServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitsolararrayServiceAsync = client.onorbitsolararray()

        val future =
            onorbitsolararrayServiceAsync.create(
                OnorbitsolararrayCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(OnorbitsolararrayCreateParams.DataMode.TEST)
                    .idOnOrbit("ONORBIT-ID")
                    .idSolarArray("SOLARARRAY-ID")
                    .source("Bluestaq")
                    .id("ONORBITSOLARARRAY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .quantity(10)
                    .solarArray(
                        SolarArrayIngest.builder()
                            .dataMode(SolarArrayIngest.DataMode.TEST)
                            .name("Solar1")
                            .source("Bluestaq")
                            .id("SOLARARRAY-ID")
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
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitsolararrayServiceAsync = client.onorbitsolararray()

        val future =
            onorbitsolararrayServiceAsync.update(
                OnorbitsolararrayUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(OnorbitsolararrayUpdateParams.DataMode.TEST)
                    .idOnOrbit("ONORBIT-ID")
                    .idSolarArray("SOLARARRAY-ID")
                    .source("Bluestaq")
                    .bodyId("ONORBITSOLARARRAY-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .quantity(10)
                    .solarArray(
                        SolarArrayIngest.builder()
                            .dataMode(SolarArrayIngest.DataMode.TEST)
                            .name("Solar1")
                            .source("Bluestaq")
                            .id("SOLARARRAY-ID")
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
        val onorbitsolararrayServiceAsync = client.onorbitsolararray()

        val pageFuture = onorbitsolararrayServiceAsync.list()

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
        val onorbitsolararrayServiceAsync = client.onorbitsolararray()

        val future = onorbitsolararrayServiceAsync.delete("id")

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
        val onorbitsolararrayServiceAsync = client.onorbitsolararray()

        val onorbitSolarArrayFullFuture =
            onorbitsolararrayServiceAsync.get(
                OnorbitsolararrayGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val onorbitSolarArrayFull = onorbitSolarArrayFullFuture.get()
        onorbitSolarArrayFull.validate()
    }
}
