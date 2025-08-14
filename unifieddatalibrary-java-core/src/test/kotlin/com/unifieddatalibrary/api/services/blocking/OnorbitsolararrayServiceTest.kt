// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.SolarArrayIngest
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayCreateParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayGetParams
import com.unifieddatalibrary.api.models.onorbitsolararray.OnorbitsolararrayUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitsolararrayServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitsolararrayService = client.onorbitsolararray()

        onorbitsolararrayService.create(
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitsolararrayService = client.onorbitsolararray()

        onorbitsolararrayService.update(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitsolararrayService = client.onorbitsolararray()

        val page = onorbitsolararrayService.list()

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
        val onorbitsolararrayService = client.onorbitsolararray()

        onorbitsolararrayService.delete("id")
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitsolararrayService = client.onorbitsolararray()

        val onorbitSolarArrayFull =
            onorbitsolararrayService.get(
                OnorbitsolararrayGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        onorbitSolarArrayFull.validate()
    }
}
