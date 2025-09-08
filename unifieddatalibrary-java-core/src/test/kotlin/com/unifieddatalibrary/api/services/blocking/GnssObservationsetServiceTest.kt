// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetCountParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetCreateBulkParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetListParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetTupleParams
import com.unifieddatalibrary.api.models.gnssobservationset.GnssObservationsetUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GnssObservationsetServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssObservationsetService = client.gnssObservationset()

        val page =
            gnssObservationsetService.list(
                GnssObservationsetListParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssObservationsetService = client.gnssObservationset()

        gnssObservationsetService.count(
            GnssObservationsetCountParams.builder()
                .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val gnssObservationsetService = client.gnssObservationset()

        gnssObservationsetService.createBulk(
            GnssObservationsetCreateBulkParams.builder()
                .addBody(
                    GnssObservationsetCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(GnssObservationsetCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2022-01-01T00:00:00.123456Z"))
                        .id("GNSSObSet-ID")
                        .agcState(20)
                        .alt(200.0)
                        .addBoresight(1.23)
                        .addBoresight(3.23)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .esId("ES-ID")
                        .eventId("2f2205c9-7bc2-4e1a-8416-2f80cc71f64b")
                        .gDop(0.33)
                        .addGnssObservationList(
                            GnssObservationsetCreateBulkParams.Body.GnssObservationList.builder()
                                .agcState(20)
                                .gnssSatId("GEJ")
                                .ob(listOf(42.1, 1000.0, 0.9))
                                .obsCodeSet(listOf("S1C", "C1C", "C1D"))
                                .trackingStatus(0)
                                .build()
                        )
                        .hDop(0.03)
                        .idOnOrbit("ONORBIT-ID")
                        .lat(32.021)
                        .lon(125.123)
                        .markerType("SPACEBORNE")
                        .navigationStatus("degraded")
                        .addObsCode("ACL")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .outage(200)
                        .pDop(0.002)
                        .quat(listOf(0.03, 0.02, 0.01, 0.012))
                        .receiver("RECEIVER-ID")
                        .satNo(2)
                        .satPosition(listOf(1625.71954, 6782.15396, -1721.34267))
                        .satVelocity(listOf(2.03, 0.003, 0.12))
                        .addSrcId("SV_ID")
                        .addSrcId("SV_ID")
                        .addSrcTyp("SV")
                        .addSrcTyp("SV")
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .tDop(0.05)
                        .trackingStatus(0)
                        .transactionId("TRANSACTION-ID")
                        .vDop(0.03)
                        .build()
                )
                .build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssObservationsetService = client.gnssObservationset()

        val response = gnssObservationsetService.queryhelp()

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
        val gnssObservationsetService = client.gnssObservationset()

        val gnssObservationSetFulls =
            gnssObservationsetService.tuple(
                GnssObservationsetTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        gnssObservationSetFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val gnssObservationsetService = client.gnssObservationset()

        gnssObservationsetService.unvalidatedPublish(
            GnssObservationsetUnvalidatedPublishParams.builder()
                .addBody(
                    GnssObservationsetUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(GnssObservationsetUnvalidatedPublishParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2022-01-01T00:00:00.123456Z"))
                        .id("GNSSObSet-ID")
                        .agcState(20)
                        .alt(200.0)
                        .addBoresight(1.23)
                        .addBoresight(3.23)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .esId("ES-ID")
                        .eventId("2f2205c9-7bc2-4e1a-8416-2f80cc71f64b")
                        .gDop(0.33)
                        .addGnssObservationList(
                            GnssObservationsetUnvalidatedPublishParams.Body.GnssObservationList
                                .builder()
                                .agcState(20)
                                .gnssSatId("GEJ")
                                .ob(listOf(42.1, 1000.0, 0.9))
                                .obsCodeSet(listOf("S1C", "C1C", "C1D"))
                                .trackingStatus(0)
                                .build()
                        )
                        .hDop(0.03)
                        .idOnOrbit("ONORBIT-ID")
                        .lat(32.021)
                        .lon(125.123)
                        .markerType("SPACEBORNE")
                        .navigationStatus("degraded")
                        .addObsCode("ACL")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .outage(200)
                        .pDop(0.002)
                        .quat(listOf(0.03, 0.02, 0.01, 0.012))
                        .receiver("RECEIVER-ID")
                        .satNo(2)
                        .satPosition(listOf(1625.71954, 6782.15396, -1721.34267))
                        .satVelocity(listOf(2.03, 0.003, 0.12))
                        .addSrcId("SV_ID")
                        .addSrcId("SV_ID")
                        .addSrcTyp("SV")
                        .addSrcTyp("SV")
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .tDop(0.05)
                        .trackingStatus(0)
                        .transactionId("TRANSACTION-ID")
                        .vDop(0.03)
                        .build()
                )
                .build()
        )
    }
}
