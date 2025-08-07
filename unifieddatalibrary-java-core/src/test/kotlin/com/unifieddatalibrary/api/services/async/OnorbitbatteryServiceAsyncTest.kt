// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryCreateParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryGetParams
import com.unifieddatalibrary.api.models.onorbitbattery.OnorbitbatteryUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitbatteryServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitbatteryServiceAsync = client.onorbitbattery()

        val future =
            onorbitbatteryServiceAsync.create(
                OnorbitbatteryCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(OnorbitbatteryCreateParams.DataMode.TEST)
                    .idBattery("BATTERY-ID")
                    .idOnOrbit("ONORBIT-ID")
                    .source("Bluestaq")
                    .id("ONORBITBATTERY-ID")
                    .battery(
                        OnorbitbatteryCreateParams.Battery.builder()
                            .dataMode(OnorbitbatteryCreateParams.Battery.DataMode.TEST)
                            .name("JAK-BATTERY-1479")
                            .source("Bluestaq")
                            .id("BATTERY-ID")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .quantity(5)
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
        val onorbitbatteryServiceAsync = client.onorbitbattery()

        val future =
            onorbitbatteryServiceAsync.update(
                OnorbitbatteryUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(OnorbitbatteryUpdateParams.DataMode.TEST)
                    .idBattery("BATTERY-ID")
                    .idOnOrbit("ONORBIT-ID")
                    .source("Bluestaq")
                    .bodyId("ONORBITBATTERY-ID")
                    .battery(
                        OnorbitbatteryUpdateParams.Battery.builder()
                            .dataMode(OnorbitbatteryUpdateParams.Battery.DataMode.TEST)
                            .name("JAK-BATTERY-1479")
                            .source("Bluestaq")
                            .id("BATTERY-ID")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .quantity(5)
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
        val onorbitbatteryServiceAsync = client.onorbitbattery()

        val pageFuture = onorbitbatteryServiceAsync.list()

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
        val onorbitbatteryServiceAsync = client.onorbitbattery()

        val future = onorbitbatteryServiceAsync.delete("id")

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
        val onorbitbatteryServiceAsync = client.onorbitbattery()

        val onorbitBatteryFullFuture =
            onorbitbatteryServiceAsync.get(
                OnorbitbatteryGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val onorbitBatteryFull = onorbitBatteryFullFuture.get()
        onorbitBatteryFull.validate()
    }
}
