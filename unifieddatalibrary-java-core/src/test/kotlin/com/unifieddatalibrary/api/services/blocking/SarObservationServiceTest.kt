// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.sarobservation.SarObservationCountParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationCreateBulkParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationCreateParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationGetParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationListParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationTupleParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SarObservationServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sarObservationService = client.sarObservation()

        sarObservationService.create(
            SarObservationCreateParams.builder()
                .classificationMarking("U")
                .collectionEnd(OffsetDateTime.parse("2023-04-22T17:38:10.201770Z"))
                .collectionStart(OffsetDateTime.parse("2023-04-22T17:35:00.123456Z"))
                .dataMode(SarObservationCreateParams.DataMode.TEST)
                .sarMode("SPOTLIGHT")
                .source("Bluestaq")
                .id("SAROBSERVATION-ID")
                .agjson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .andims(3)
                .area(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .asrid(3)
                .atext(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .atype("POLYGON")
                .azimuthAngle(285.4481793)
                .centerTime(OffsetDateTime.parse("2023-04-22T17:36:35.100885Z"))
                .collectionId("COLLECTION-ID")
                .continuousSpotAngle(45.1)
                .coordSys("ECEF")
                .createdAt(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
                .createdBy("some.user")
                .detectionEnd(OffsetDateTime.parse("2023-07-08T17:35:20.772190Z"))
                .detectionId("DETECTION-ID")
                .detectionStart(OffsetDateTime.parse("2023-07-08T17:35:01.615396Z"))
                .dwellTime(79.156794)
                .externalId("EXTERNAL-ID")
                .farRange(34.1)
                .grazeAngle(45.1)
                .groundResolutionProjection(0.5)
                .idOnOrbit("36036")
                .idSensor("36036-1L")
                .incidenceAngle(45.1)
                .looksAzimuth(2)
                .looksRange(1)
                .multilookNumber(5.0)
                .nearRange(12.1)
                .obDirection("RIGHT")
                .operatingBand("L")
                .operatingFreq(2345.6)
                .orbitState("ASCENDING")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("36036")
                .origSensorId("SMOS-1L")
                .pulseBandwidth(500.1)
                .pulseDuration(0.000011)
                .resolutionAzimuth(0.123)
                .resolutionRange(0.123)
                .rxPolarization("H")
                .satNo(36036)
                .senalt(1.1)
                .senlatEnd(45.1)
                .senlatStart(45.1)
                .senlonEnd(179.1)
                .senlonStart(179.1)
                .senvelx(1.1)
                .senvely(1.1)
                .senvelz(1.1)
                .slantRange(60.1)
                .snr(10.1)
                .sourceDl("AXE")
                .spacingAzimuth(0.123)
                .spacingRange(0.123)
                .squintAngle(1.2)
                .addSrcId("f7e01cd4-626b-441f-a423-17b160eb78ba")
                .addSrcId("223833c4-be0d-4fdb-a2e4-325a48eccced")
                .addSrcTyp("ESID")
                .addSrcTyp("GROUNDIMAGE")
                .swathLength(12.1)
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .targetposx(50.23)
                .targetposy(50.23)
                .targetposz(50.23)
                .transactionId("TRANSACTION-ID")
                .txPolarization("H")
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
        val sarObservationService = client.sarObservation()

        val page =
            sarObservationService.list(
                SarObservationListParams.builder()
                    .collectionStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val sarObservationService = client.sarObservation()

        sarObservationService.count(
            SarObservationCountParams.builder()
                .collectionStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val sarObservationService = client.sarObservation()

        sarObservationService.createBulk(
            SarObservationCreateBulkParams.builder()
                .addBody(
                    SarObservationCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .collectionEnd(OffsetDateTime.parse("2023-04-22T17:38:10.201770Z"))
                        .collectionStart(OffsetDateTime.parse("2023-04-22T17:35:00.123456Z"))
                        .dataMode(SarObservationCreateBulkParams.Body.DataMode.TEST)
                        .sarMode("SPOTLIGHT")
                        .source("Bluestaq")
                        .id("SAROBSERVATION-ID")
                        .agjson(
                            "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                        )
                        .andims(3)
                        .asrid(3)
                        .atext(
                            "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                        )
                        .atype("POLYGON")
                        .azimuthAngle(285.4481793)
                        .centerTime(OffsetDateTime.parse("2023-04-22T17:36:35.100885Z"))
                        .collectionId("COLLECTION-ID")
                        .continuousSpotAngle(45.1)
                        .coordSys("ECEF")
                        .createdAt(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
                        .createdBy("some.user")
                        .detectionEnd(OffsetDateTime.parse("2023-07-08T17:35:20.772190Z"))
                        .detectionId("DETECTION-ID")
                        .detectionStart(OffsetDateTime.parse("2023-07-08T17:35:01.615396Z"))
                        .dwellTime(79.156794)
                        .externalId("EXTERNAL-ID")
                        .farRange(34.1)
                        .grazeAngle(45.1)
                        .groundResolutionProjection(0.5)
                        .idOnOrbit("36036")
                        .idSensor("36036-1L")
                        .incidenceAngle(45.1)
                        .looksAzimuth(2)
                        .looksRange(1)
                        .multilookNumber(5.0)
                        .nearRange(12.1)
                        .obDirection("RIGHT")
                        .operatingBand("L")
                        .operatingFreq(2345.6)
                        .orbitState("ASCENDING")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("36036")
                        .origSensorId("SMOS-1L")
                        .pulseBandwidth(500.1)
                        .pulseDuration(0.000011)
                        .resolutionAzimuth(0.123)
                        .resolutionRange(0.123)
                        .rxPolarization("H")
                        .satNo(36036)
                        .senalt(1.1)
                        .senlatEnd(45.1)
                        .senlatStart(45.1)
                        .senlonEnd(179.1)
                        .senlonStart(179.1)
                        .senvelx(1.1)
                        .senvely(1.1)
                        .senvelz(1.1)
                        .slantRange(60.1)
                        .snr(10.1)
                        .sourceDl("AXE")
                        .spacingAzimuth(0.123)
                        .spacingRange(0.123)
                        .squintAngle(1.2)
                        .addSrcId("f7e01cd4-626b-441f-a423-17b160eb78ba")
                        .addSrcId("223833c4-be0d-4fdb-a2e4-325a48eccced")
                        .addSrcTyp("ESID")
                        .addSrcTyp("GROUNDIMAGE")
                        .swathLength(12.1)
                        .addTag("PROVIDER_TAG1")
                        .addTag("PROVIDER_TAG2")
                        .targetposx(50.23)
                        .targetposy(50.23)
                        .targetposz(50.23)
                        .transactionId("TRANSACTION-ID")
                        .txPolarization("H")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sarObservationService = client.sarObservation()

        val sarObservation =
            sarObservationService.get(
                SarObservationGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        sarObservation.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sarObservationService = client.sarObservation()

        val response = sarObservationService.queryhelp()

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
        val sarObservationService = client.sarObservation()

        val response =
            sarObservationService.tuple(
                SarObservationTupleParams.builder()
                    .collectionStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .columns("columns")
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
        val sarObservationService = client.sarObservation()

        sarObservationService.unvalidatedPublish(
            SarObservationUnvalidatedPublishParams.builder()
                .addBody(
                    SarObservationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .collectionEnd(OffsetDateTime.parse("2023-04-22T17:38:10.201770Z"))
                        .collectionStart(OffsetDateTime.parse("2023-04-22T17:35:00.123456Z"))
                        .dataMode(SarObservationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .sarMode("SPOTLIGHT")
                        .source("Bluestaq")
                        .id("SAROBSERVATION-ID")
                        .agjson(
                            "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                        )
                        .andims(3)
                        .asrid(3)
                        .atext(
                            "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                        )
                        .atype("POLYGON")
                        .azimuthAngle(285.4481793)
                        .centerTime(OffsetDateTime.parse("2023-04-22T17:36:35.100885Z"))
                        .collectionId("COLLECTION-ID")
                        .continuousSpotAngle(45.1)
                        .coordSys("ECEF")
                        .createdAt(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
                        .createdBy("some.user")
                        .detectionEnd(OffsetDateTime.parse("2023-07-08T17:35:20.772190Z"))
                        .detectionId("DETECTION-ID")
                        .detectionStart(OffsetDateTime.parse("2023-07-08T17:35:01.615396Z"))
                        .dwellTime(79.156794)
                        .externalId("EXTERNAL-ID")
                        .farRange(34.1)
                        .grazeAngle(45.1)
                        .groundResolutionProjection(0.5)
                        .idOnOrbit("36036")
                        .idSensor("36036-1L")
                        .incidenceAngle(45.1)
                        .looksAzimuth(2)
                        .looksRange(1)
                        .multilookNumber(5.0)
                        .nearRange(12.1)
                        .obDirection("RIGHT")
                        .operatingBand("L")
                        .operatingFreq(2345.6)
                        .orbitState("ASCENDING")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("36036")
                        .origSensorId("SMOS-1L")
                        .pulseBandwidth(500.1)
                        .pulseDuration(0.000011)
                        .resolutionAzimuth(0.123)
                        .resolutionRange(0.123)
                        .rxPolarization("H")
                        .satNo(36036)
                        .senalt(1.1)
                        .senlatEnd(45.1)
                        .senlatStart(45.1)
                        .senlonEnd(179.1)
                        .senlonStart(179.1)
                        .senvelx(1.1)
                        .senvely(1.1)
                        .senvelz(1.1)
                        .slantRange(60.1)
                        .snr(10.1)
                        .sourceDl("AXE")
                        .spacingAzimuth(0.123)
                        .spacingRange(0.123)
                        .squintAngle(1.2)
                        .addSrcId("f7e01cd4-626b-441f-a423-17b160eb78ba")
                        .addSrcId("223833c4-be0d-4fdb-a2e4-325a48eccced")
                        .addSrcTyp("ESID")
                        .addSrcTyp("GROUNDIMAGE")
                        .swathLength(12.1)
                        .addTag("PROVIDER_TAG1")
                        .addTag("PROVIDER_TAG2")
                        .targetposx(50.23)
                        .targetposy(50.23)
                        .targetposz(50.23)
                        .transactionId("TRANSACTION-ID")
                        .txPolarization("H")
                        .build()
                )
                .build()
        )
    }
}
