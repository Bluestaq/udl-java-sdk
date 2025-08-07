// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.observations.swir.SwirUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SwirServiceTest {

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val swirService = client.observations().swir()

        swirService.unvalidatedPublish(
            SwirUnvalidatedPublishParams.builder()
                .addBody(
                    SwirUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(SwirUnvalidatedPublishParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                        .id("SWIR-ID")
                        .addAbsFlux(1.23)
                        .addAbsFlux(4.56)
                        .badWave("Example Comments")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .addFluxRatio(1.23)
                        .addFluxRatio(4.56)
                        .idOnOrbit("45234")
                        .lat(70.55208)
                        .locationName("AeroTel")
                        .lon(81.18191)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .origObjectId("WildBlue-1")
                        .addRatioWavelength(1.23)
                        .addRatioWavelength(4.56)
                        .satNo(25544)
                        .solarPhaseAngle(1.23)
                        .addWavelength(1.23)
                        .addWavelength(4.56)
                        .build()
                )
                .build()
        )
    }
}
