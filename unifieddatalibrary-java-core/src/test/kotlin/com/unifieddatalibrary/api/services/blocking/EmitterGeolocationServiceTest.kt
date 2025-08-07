// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationCountParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationCreateBulkParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationCreateParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationQueryParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationRetrieveParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationTupleParams
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmitterGeolocationServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emitterGeolocationService = client.emitterGeolocation()

        emitterGeolocationService.create(
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
        )
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emitterGeolocationService = client.emitterGeolocation()

        val emitterGeolocation =
            emitterGeolocationService.retrieve(
                EmitterGeolocationRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        emitterGeolocation.validate()
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emitterGeolocationService = client.emitterGeolocation()

        emitterGeolocationService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emitterGeolocationService = client.emitterGeolocation()

        emitterGeolocationService.count(
            EmitterGeolocationCountParams.builder()
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emitterGeolocationService = client.emitterGeolocation()

        emitterGeolocationService.createBulk(
            EmitterGeolocationCreateBulkParams.builder()
                .addBody(
                    EmitterGeolocationCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EmitterGeolocationCreateBulkParams.Body.DataMode.TEST)
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
                )
                .build()
        )
    }

    @Test
    fun query() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emitterGeolocationService = client.emitterGeolocation()

        val response =
            emitterGeolocationService.query(
                EmitterGeolocationQueryParams.builder()
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emitterGeolocationService = client.emitterGeolocation()

        val response = emitterGeolocationService.queryHelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emitterGeolocationService = client.emitterGeolocation()

        val response =
            emitterGeolocationService.tuple(
                EmitterGeolocationTupleParams.builder()
                    .columns("columns")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emitterGeolocationService = client.emitterGeolocation()

        emitterGeolocationService.unvalidatedPublish(
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
                )
                .build()
        )
    }
}
