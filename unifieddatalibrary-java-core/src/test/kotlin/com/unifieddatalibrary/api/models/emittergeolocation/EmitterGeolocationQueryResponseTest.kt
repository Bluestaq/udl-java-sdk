// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emittergeolocation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmitterGeolocationQueryResponseTest {

    @Test
    fun create() {
        val emitterGeolocationQueryResponse =
            EmitterGeolocationQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(EmitterGeolocationQueryResponse.DataMode.TEST)
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

        assertThat(emitterGeolocationQueryResponse.classificationMarking()).isEqualTo("U")
        assertThat(emitterGeolocationQueryResponse.dataMode())
            .isEqualTo(EmitterGeolocationQueryResponse.DataMode.TEST)
        assertThat(emitterGeolocationQueryResponse.signalOfInterestType()).isEqualTo("RF")
        assertThat(emitterGeolocationQueryResponse.source()).isEqualTo("Bluestaq")
        assertThat(emitterGeolocationQueryResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
        assertThat(emitterGeolocationQueryResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(emitterGeolocationQueryResponse.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(emitterGeolocationQueryResponse.algVersion()).contains("v1.0-3-gps_nb_3ball")
        assertThat(emitterGeolocationQueryResponse.andims()).contains(3)
        assertThat(emitterGeolocationQueryResponse.asrid()).contains(3)
        assertThat(emitterGeolocationQueryResponse.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(emitterGeolocationQueryResponse.atype()).contains("MultiPolygon")
        assertThat(emitterGeolocationQueryResponse.centerFreq()).contains(1575.42)
        assertThat(emitterGeolocationQueryResponse.cluster()).contains("CONSTELLATION1-F")
        assertThat(emitterGeolocationQueryResponse.confArea()).contains(81577480.056)
        assertThat(emitterGeolocationQueryResponse.constellation()).contains("HawkEye360")
        assertThat(emitterGeolocationQueryResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(emitterGeolocationQueryResponse.createdBy()).contains("some.user")
        assertThat(emitterGeolocationQueryResponse.createdTs())
            .contains(OffsetDateTime.parse("2024-05-31T23:06:18.123456Z"))
        assertThat(emitterGeolocationQueryResponse.detectAlt()).contains(123.456)
        assertThat(emitterGeolocationQueryResponse.detectLat()).contains(41.172)
        assertThat(emitterGeolocationQueryResponse.detectLon()).contains(37.019)
        assertThat(emitterGeolocationQueryResponse.endTime())
            .contains(OffsetDateTime.parse("2024-05-31T21:16:15.123456Z"))
        assertThat(emitterGeolocationQueryResponse.errEllp().getOrNull())
            .containsExactly(1.23, 2.34, 3.45)
        assertThat(emitterGeolocationQueryResponse.externalId()).contains("780180925")
        assertThat(emitterGeolocationQueryResponse.idOnOrbit()).contains("HawkEye360-7")
        assertThat(emitterGeolocationQueryResponse.idRfEmitter())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(emitterGeolocationQueryResponse.idSensor()).contains("OCULUSA")
        assertThat(emitterGeolocationQueryResponse.maxFreq()).contains(1575.42)
        assertThat(emitterGeolocationQueryResponse.minFreq()).contains(1575.42)
        assertThat(emitterGeolocationQueryResponse.numBursts()).contains(17)
        assertThat(emitterGeolocationQueryResponse.orderId()).contains("155240")
        assertThat(emitterGeolocationQueryResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(emitterGeolocationQueryResponse.origNetwork()).contains("OPS1")
        assertThat(emitterGeolocationQueryResponse.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(emitterGeolocationQueryResponse.origRfEmitterId()).contains("12345678")
        assertThat(emitterGeolocationQueryResponse.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(emitterGeolocationQueryResponse.passGroupId())
            .contains("80fd25a8-8b41-448d-888a-91c9dfcd940b")
        assertThat(emitterGeolocationQueryResponse.receivedTs())
            .contains(OffsetDateTime.parse("2024-05-31T21:16:58.123456Z"))
        assertThat(emitterGeolocationQueryResponse.satNo()).contains(101)
        assertThat(emitterGeolocationQueryResponse.signalOfInterest()).contains("GPS")
        assertThat(emitterGeolocationQueryResponse.sourceDl()).contains("AXE")
        assertThat(emitterGeolocationQueryResponse.tags().getOrNull())
            .containsExactly("TAG1", "TAG2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emitterGeolocationQueryResponse =
            EmitterGeolocationQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(EmitterGeolocationQueryResponse.DataMode.TEST)
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

        val roundtrippedEmitterGeolocationQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emitterGeolocationQueryResponse),
                jacksonTypeRef<EmitterGeolocationQueryResponse>(),
            )

        assertThat(roundtrippedEmitterGeolocationQueryResponse)
            .isEqualTo(emitterGeolocationQueryResponse)
    }
}
