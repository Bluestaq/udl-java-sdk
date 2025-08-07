// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaCreateParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaGetParams
import com.unifieddatalibrary.api.models.onorbitantenna.OnorbitantennaUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitantennaServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitantennaService = client.onorbitantenna()

        onorbitantennaService.create(
            OnorbitantennaCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitantennaCreateParams.DataMode.TEST)
                .idAntenna("ANTENNA-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .id("ONORBITANTENNA-ID")
                .antenna(
                    OnorbitantennaCreateParams.Antenna.builder()
                        .dataMode(OnorbitantennaCreateParams.Antenna.DataMode.TEST)
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitantennaService = client.onorbitantenna()

        onorbitantennaService.update(
            OnorbitantennaUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(OnorbitantennaUpdateParams.DataMode.TEST)
                .idAntenna("ANTENNA-ID")
                .idOnOrbit("ONORBIT-ID")
                .source("Bluestaq")
                .bodyId("ONORBITANTENNA-ID")
                .antenna(
                    OnorbitantennaUpdateParams.Antenna.builder()
                        .dataMode(OnorbitantennaUpdateParams.Antenna.DataMode.TEST)
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitantennaService = client.onorbitantenna()

        val page = onorbitantennaService.list()

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
        val onorbitantennaService = client.onorbitantenna()

        onorbitantennaService.delete("id")
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitantennaService = client.onorbitantenna()

        val onorbitAntennaFull =
            onorbitantennaService.get(
                OnorbitantennaGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        onorbitAntennaFull.validate()
    }
}
