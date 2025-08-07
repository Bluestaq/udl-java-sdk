// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emittergeolocation

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmitterGeolocationCreateParamsTest {

    @Test
    fun create() {
        EmitterGeolocationCreateParams.builder()
            .classificationMarking("U")
            .dataMode(EmitterGeolocationCreateParams.DataMode.TEST)
            .signalOfInterestType("RF")
            .source("Bluestaq")
            .startTime(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
            .id("026dd511-8ba5-47d3-9909-836149f87686")
            .agjson(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
            .algVersion("v1.0-3-gps_nb_3ball")
            .andims(3)
            .area(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
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
    }

    @Test
    fun body() {
        val params =
            EmitterGeolocationCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EmitterGeolocationCreateParams.DataMode.TEST)
                .signalOfInterestType("RF")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .agjson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .algVersion("v1.0-3-gps_nb_3ball")
                .andims(3)
                .area(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EmitterGeolocationCreateParams.DataMode.TEST)
        assertThat(body.signalOfInterestType()).isEqualTo("RF")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
        assertThat(body.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(body.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(body.algVersion()).contains("v1.0-3-gps_nb_3ball")
        assertThat(body.andims()).contains(3)
        assertThat(body.area())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(body.asrid()).contains(3)
        assertThat(body.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(body.atype()).contains("MultiPolygon")
        assertThat(body.centerFreq()).contains(1575.42)
        assertThat(body.cluster()).contains("CONSTELLATION1-F")
        assertThat(body.confArea()).contains(81577480.056)
        assertThat(body.constellation()).contains("HawkEye360")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.createdTs()).contains(OffsetDateTime.parse("2024-05-31T23:06:18.123456Z"))
        assertThat(body.detectAlt()).contains(123.456)
        assertThat(body.detectLat()).contains(41.172)
        assertThat(body.detectLon()).contains(37.019)
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2024-05-31T21:16:15.123456Z"))
        assertThat(body.errEllp().getOrNull()).containsExactly(1.23, 2.34, 3.45)
        assertThat(body.externalId()).contains("780180925")
        assertThat(body.idOnOrbit()).contains("HawkEye360-7")
        assertThat(body.idRfEmitter()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(body.idSensor()).contains("OCULUSA")
        assertThat(body.maxFreq()).contains(1575.42)
        assertThat(body.minFreq()).contains(1575.42)
        assertThat(body.numBursts()).contains(17)
        assertThat(body.orderId()).contains("155240")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(body.origRfEmitterId()).contains("12345678")
        assertThat(body.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(body.passGroupId()).contains("80fd25a8-8b41-448d-888a-91c9dfcd940b")
        assertThat(body.receivedTs()).contains(OffsetDateTime.parse("2024-05-31T21:16:58.123456Z"))
        assertThat(body.satNo()).contains(101)
        assertThat(body.signalOfInterest()).contains("GPS")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmitterGeolocationCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EmitterGeolocationCreateParams.DataMode.TEST)
                .signalOfInterestType("RF")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EmitterGeolocationCreateParams.DataMode.TEST)
        assertThat(body.signalOfInterestType()).isEqualTo("RF")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
    }
}
