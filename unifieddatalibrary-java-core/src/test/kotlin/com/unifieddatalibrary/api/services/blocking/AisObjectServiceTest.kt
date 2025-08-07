// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.aisobjects.AisObjectUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AisObjectServiceTest {

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val aisObjectService = client.aisObjects()

        aisObjectService.unvalidatedPublish(
            AisObjectUnvalidatedPublishParams.builder()
                .addBody(
                    AisObjectUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(AisObjectUnvalidatedPublishParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                        .id("AIS-ID")
                        .antennaRefDimensions(listOf(50.1, 50.1, 20.1, 20.1))
                        .avgSpeed(12.1)
                        .callSign("V2OZ")
                        .cargoType("Freight")
                        .course(157.1)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .currentPortGuid("0ABC")
                        .currentPortLocode("XF013")
                        .destination("USCLE")
                        .destinationEta(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                        .distanceToGo(150.5)
                        .distanceTravelled(200.3)
                        .draught(21.1)
                        .engagedIn("Cargo")
                        .etaCalculated(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                        .etaUpdated(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                        .idTrack("TRACK-ID")
                        .idVessel("VESSEL-ID")
                        .imon(9015462L)
                        .lastPortGuid("0VAX")
                        .lastPortLocode("USSKY")
                        .lat(47.758499)
                        .length(511.1)
                        .lon(-5.154223)
                        .maxSpeed(13.3)
                        .mmsi(304010417L)
                        .navStatus("Underway Using Engine")
                        .nextPortGuid("0Z8Q")
                        .nextPortLocode("USCLE")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .posDeviceType("GPS")
                        .posHiAccuracy(true)
                        .posHiLatency(true)
                        .rateOfTurn(22.1)
                        .shipDescription("Search and rescue vessels")
                        .shipName("DORNUM")
                        .shipType("Passenger")
                        .sourceDl("AXE")
                        .specialCraft("Tug")
                        .specialManeuver(false)
                        .speed(10.5)
                        .trueHeading(329.1)
                        .vesselFlag("United States")
                        .width(24.1)
                        .build()
                )
                .build()
        )
    }
}
