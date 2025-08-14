// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.AntennaIngest
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaCreateParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaGetParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitantennaServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitantennaServiceAsync = client.onorbitantenna()

        val future =
            onorbitantennaServiceAsync.create(
                OnorbitantennaCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(OnorbitantennaCreateParams.DataMode.TEST)
                    .idAntenna("ANTENNA-ID")
                    .idOnOrbit("ONORBIT-ID")
                    .source("Bluestaq")
                    .id("ONORBITANTENNA-ID")
                    .antenna(
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
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
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
        val onorbitantennaServiceAsync = client.onorbitantenna()

        val future =
            onorbitantennaServiceAsync.update(
                OnorbitantennaUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(OnorbitantennaUpdateParams.DataMode.TEST)
                    .idAntenna("ANTENNA-ID")
                    .idOnOrbit("ONORBIT-ID")
                    .source("Bluestaq")
                    .bodyId("ONORBITANTENNA-ID")
                    .antenna(
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
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
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
        val onorbitantennaServiceAsync = client.onorbitantenna()

        val pageFuture = onorbitantennaServiceAsync.list()

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
        val onorbitantennaServiceAsync = client.onorbitantenna()

        val future = onorbitantennaServiceAsync.delete("id")

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
        val onorbitantennaServiceAsync = client.onorbitantenna()

        val onorbitAntennaFullFuture =
            onorbitantennaServiceAsync.get(
                OnorbitantennaGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val onorbitAntennaFull = onorbitAntennaFullFuture.get()
        onorbitAntennaFull.validate()
    }
}
