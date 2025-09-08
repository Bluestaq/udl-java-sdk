// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emittergeolocation

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmitterGeolocationUnvalidatedPublishParamsTest {

    @Test
    fun create() {
        EmitterGeolocationUnvalidatedPublishParams.builder()
            .addBody(
                EmitterGeolocationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(EmitterGeolocationUnvalidatedPublishParams.Body.DataMode.TEST)
                    .signalOfInterestType("RF")
                    .source("Bluestaq")
                    .startTime(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .agjson(
                        "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                    )
                    .algVersion("v1.0-3-gps_nb_3ball")
                    .andims(3)
                    .asrid(3)
                    .atext(
                        "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                    )
                    .atype("MultiPolygon")
                    .centerFreq(1575.42)
                    .cluster("CONSTELLATION1-F")
                    .confArea(81577480.056)
                    .constellation("HawkEye360")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .createdTs(OffsetDateTime.parse("2024-05-31T23:06:18.123456Z"))
                    .detectAlt(123.456)
                    .detectLat(41.172)
                    .detectLon(37.019)
                    .endTime(OffsetDateTime.parse("2024-05-31T21:16:15.123456Z"))
                    .errEllp(listOf(1.23, 2.34, 3.45))
                    .externalId("780180925")
                    .idOnOrbit("HawkEye360-7")
                    .idRfEmitter("026dd511-8ba5-47d3-9909-836149f87686")
                    .idSensor("OCULUSA")
                    .maxFreq(1575.42)
                    .minFreq(1575.42)
                    .numBursts(17)
                    .orderId("155240")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origObjectId("ORIGOBJECT-ID")
                    .origRfEmitterId("12345678")
                    .origSensorId("ORIGSENSOR-ID")
                    .passGroupId("80fd25a8-8b41-448d-888a-91c9dfcd940b")
                    .receivedTs(OffsetDateTime.parse("2024-05-31T21:16:58.123456Z"))
                    .satNo(101)
                    .signalOfInterest("GPS")
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EmitterGeolocationUnvalidatedPublishParams.builder()
                .addBody(
                    EmitterGeolocationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EmitterGeolocationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .signalOfInterestType("RF")
                        .source("Bluestaq")
                        .startTime(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .agjson(
                            "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                        )
                        .algVersion("v1.0-3-gps_nb_3ball")
                        .andims(3)
                        .asrid(3)
                        .atext(
                            "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                        )
                        .atype("MultiPolygon")
                        .centerFreq(1575.42)
                        .cluster("CONSTELLATION1-F")
                        .confArea(81577480.056)
                        .constellation("HawkEye360")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .createdTs(OffsetDateTime.parse("2024-05-31T23:06:18.123456Z"))
                        .detectAlt(123.456)
                        .detectLat(41.172)
                        .detectLon(37.019)
                        .endTime(OffsetDateTime.parse("2024-05-31T21:16:15.123456Z"))
                        .errEllp(listOf(1.23, 2.34, 3.45))
                        .externalId("780180925")
                        .idOnOrbit("HawkEye360-7")
                        .idRfEmitter("026dd511-8ba5-47d3-9909-836149f87686")
                        .idSensor("OCULUSA")
                        .maxFreq(1575.42)
                        .minFreq(1575.42)
                        .numBursts(17)
                        .orderId("155240")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .origRfEmitterId("12345678")
                        .origSensorId("ORIGSENSOR-ID")
                        .passGroupId("80fd25a8-8b41-448d-888a-91c9dfcd940b")
                        .receivedTs(OffsetDateTime.parse("2024-05-31T21:16:58.123456Z"))
                        .satNo(101)
                        .signalOfInterest("GPS")
                        .sourceDl("AXE")
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                EmitterGeolocationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(EmitterGeolocationUnvalidatedPublishParams.Body.DataMode.TEST)
                    .signalOfInterestType("RF")
                    .source("Bluestaq")
                    .startTime(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .agjson(
                        "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                    )
                    .algVersion("v1.0-3-gps_nb_3ball")
                    .andims(3)
                    .asrid(3)
                    .atext(
                        "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                    )
                    .atype("MultiPolygon")
                    .centerFreq(1575.42)
                    .cluster("CONSTELLATION1-F")
                    .confArea(81577480.056)
                    .constellation("HawkEye360")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .createdTs(OffsetDateTime.parse("2024-05-31T23:06:18.123456Z"))
                    .detectAlt(123.456)
                    .detectLat(41.172)
                    .detectLon(37.019)
                    .endTime(OffsetDateTime.parse("2024-05-31T21:16:15.123456Z"))
                    .errEllp(listOf(1.23, 2.34, 3.45))
                    .externalId("780180925")
                    .idOnOrbit("HawkEye360-7")
                    .idRfEmitter("026dd511-8ba5-47d3-9909-836149f87686")
                    .idSensor("OCULUSA")
                    .maxFreq(1575.42)
                    .minFreq(1575.42)
                    .numBursts(17)
                    .orderId("155240")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origObjectId("ORIGOBJECT-ID")
                    .origRfEmitterId("12345678")
                    .origSensorId("ORIGSENSOR-ID")
                    .passGroupId("80fd25a8-8b41-448d-888a-91c9dfcd940b")
                    .receivedTs(OffsetDateTime.parse("2024-05-31T21:16:58.123456Z"))
                    .satNo(101)
                    .signalOfInterest("GPS")
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmitterGeolocationUnvalidatedPublishParams.builder()
                .addBody(
                    EmitterGeolocationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EmitterGeolocationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .signalOfInterestType("RF")
                        .source("Bluestaq")
                        .startTime(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                EmitterGeolocationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(EmitterGeolocationUnvalidatedPublishParams.Body.DataMode.TEST)
                    .signalOfInterestType("RF")
                    .source("Bluestaq")
                    .startTime(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
                    .build()
            )
    }
}
