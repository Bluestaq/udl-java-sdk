// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emittergeolocation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmitterGeolocationListResponseTest {

    @Test
    fun create() {
        val emitterGeolocationListResponse =
            EmitterGeolocationListResponse.builder()
                .classificationMarking("U")
                .dataMode(EmitterGeolocationListResponse.DataMode.TEST)
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

        assertThat(emitterGeolocationListResponse.classificationMarking()).isEqualTo("U")
        assertThat(emitterGeolocationListResponse.dataMode())
            .isEqualTo(EmitterGeolocationListResponse.DataMode.TEST)
        assertThat(emitterGeolocationListResponse.signalOfInterestType()).isEqualTo("RF")
        assertThat(emitterGeolocationListResponse.source()).isEqualTo("Bluestaq")
        assertThat(emitterGeolocationListResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2024-05-31T21:12:12.123456Z"))
        assertThat(emitterGeolocationListResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(emitterGeolocationListResponse.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(emitterGeolocationListResponse.algVersion()).contains("v1.0-3-gps_nb_3ball")
        assertThat(emitterGeolocationListResponse.andims()).contains(3)
        assertThat(emitterGeolocationListResponse.asrid()).contains(3)
        assertThat(emitterGeolocationListResponse.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(emitterGeolocationListResponse.atype()).contains("MultiPolygon")
        assertThat(emitterGeolocationListResponse.centerFreq()).contains(1575.42)
        assertThat(emitterGeolocationListResponse.cluster()).contains("CONSTELLATION1-F")
        assertThat(emitterGeolocationListResponse.confArea()).contains(81577480.056)
        assertThat(emitterGeolocationListResponse.constellation()).contains("HawkEye360")
        assertThat(emitterGeolocationListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(emitterGeolocationListResponse.createdBy()).contains("some.user")
        assertThat(emitterGeolocationListResponse.createdTs())
            .contains(OffsetDateTime.parse("2024-05-31T23:06:18.123456Z"))
        assertThat(emitterGeolocationListResponse.detectAlt()).contains(123.456)
        assertThat(emitterGeolocationListResponse.detectLat()).contains(41.172)
        assertThat(emitterGeolocationListResponse.detectLon()).contains(37.019)
        assertThat(emitterGeolocationListResponse.endTime())
            .contains(OffsetDateTime.parse("2024-05-31T21:16:15.123456Z"))
        assertThat(emitterGeolocationListResponse.errEllp().getOrNull())
            .containsExactly(1.23, 2.34, 3.45)
        assertThat(emitterGeolocationListResponse.externalId()).contains("780180925")
        assertThat(emitterGeolocationListResponse.idOnOrbit()).contains("HawkEye360-7")
        assertThat(emitterGeolocationListResponse.idRfEmitter())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(emitterGeolocationListResponse.idSensor()).contains("OCULUSA")
        assertThat(emitterGeolocationListResponse.maxFreq()).contains(1575.42)
        assertThat(emitterGeolocationListResponse.minFreq()).contains(1575.42)
        assertThat(emitterGeolocationListResponse.numBursts()).contains(17)
        assertThat(emitterGeolocationListResponse.orderId()).contains("155240")
        assertThat(emitterGeolocationListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(emitterGeolocationListResponse.origNetwork()).contains("OPS1")
        assertThat(emitterGeolocationListResponse.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(emitterGeolocationListResponse.origRfEmitterId()).contains("12345678")
        assertThat(emitterGeolocationListResponse.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(emitterGeolocationListResponse.passGroupId())
            .contains("80fd25a8-8b41-448d-888a-91c9dfcd940b")
        assertThat(emitterGeolocationListResponse.receivedTs())
            .contains(OffsetDateTime.parse("2024-05-31T21:16:58.123456Z"))
        assertThat(emitterGeolocationListResponse.satNo()).contains(101)
        assertThat(emitterGeolocationListResponse.signalOfInterest()).contains("GPS")
        assertThat(emitterGeolocationListResponse.sourceDl()).contains("AXE")
        assertThat(emitterGeolocationListResponse.tags().getOrNull())
            .containsExactly("TAG1", "TAG2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emitterGeolocationListResponse =
            EmitterGeolocationListResponse.builder()
                .classificationMarking("U")
                .dataMode(EmitterGeolocationListResponse.DataMode.TEST)
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

        val roundtrippedEmitterGeolocationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emitterGeolocationListResponse),
                jacksonTypeRef<EmitterGeolocationListResponse>(),
            )

        assertThat(roundtrippedEmitterGeolocationListResponse)
            .isEqualTo(emitterGeolocationListResponse)
    }
}
