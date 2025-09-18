// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCountParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCreateBulkParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrCreateParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrListParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrTupleParams
import com.unifieddatalibrary.api.models.ecpedr.EcpedrUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EcpedrServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpedrService = client.ecpedr()

        ecpedrService.create(
            EcpedrCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EcpedrCreateParams.DataMode.TEST)
                .addEcpedrMeasurement(
                    EcpedrCreateParams.EcpedrMeasurement.builder()
                        .obType("FLUX")
                        .obUoM("#/MeV/cm^2/sr/s")
                        .chanEnergyHigh(0.003495)
                        .chanEnergyLow(58.4)
                        .chanId("H05E")
                        .chanType("INTEGRAL")
                        .chanUnit("keV")
                        .msgNumber(21)
                        .obValue(31473.9)
                        .species("ELECTRON")
                        .build()
                )
                .obTime(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .genSystem("cpuch2.aero.org")
                .genTime(OffsetDateTime.parse("2025-03-13T18:00:00.123Z"))
                .idOnOrbit("ONORBIT-ID")
                .idSensor("REACH-101")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("WSF-M SV1")
                .origSensorId("CEASE-3")
                .satNo(101)
                .senPos(listOf(5893.74, 1408.8, 3899.38))
                .senReferenceFrame(EcpedrCreateParams.SenReferenceFrame.TEME)
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
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
        val ecpedrService = client.ecpedr()

        val page =
            ecpedrService.list(
                EcpedrListParams.builder()
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val ecpedrService = client.ecpedr()

        ecpedrService.count(
            EcpedrCountParams.builder()
                .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val ecpedrService = client.ecpedr()

        ecpedrService.createBulk(
            EcpedrCreateBulkParams.builder()
                .addBody(
                    EcpedrCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EcpedrCreateBulkParams.Body.DataMode.TEST)
                        .addEcpedrMeasurement(
                            EcpedrCreateBulkParams.Body.EcpedrMeasurement.builder()
                                .obType("FLUX")
                                .obUoM("#/MeV/cm^2/sr/s")
                                .chanEnergyHigh(0.003495)
                                .chanEnergyLow(58.4)
                                .chanId("H05E")
                                .chanType("INTEGRAL")
                                .chanUnit("keV")
                                .msgNumber(21)
                                .obValue(31473.9)
                                .species("ELECTRON")
                                .build()
                        )
                        .obTime(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .genSystem("cpuch2.aero.org")
                        .genTime(OffsetDateTime.parse("2025-03-13T18:00:00.123Z"))
                        .idOnOrbit("ONORBIT-ID")
                        .idSensor("REACH-101")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("WSF-M SV1")
                        .origSensorId("CEASE-3")
                        .satNo(101)
                        .senPos(listOf(5893.74, 1408.8, 3899.38))
                        .senReferenceFrame(EcpedrCreateBulkParams.Body.SenReferenceFrame.TEME)
                        .sourceDl("AXE")
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .transactionId("TRANSACTION-ID")
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
        val ecpedrService = client.ecpedr()

        val response = ecpedrService.queryhelp()

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
        val ecpedrService = client.ecpedr()

        val response =
            ecpedrService.tuple(
                EcpedrTupleParams.builder()
                    .columns("columns")
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val ecpedrService = client.ecpedr()

        ecpedrService.unvalidatedPublish(
            EcpedrUnvalidatedPublishParams.builder()
                .addBody(
                    EcpedrUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EcpedrUnvalidatedPublishParams.Body.DataMode.TEST)
                        .addEcpedrMeasurement(
                            EcpedrUnvalidatedPublishParams.Body.EcpedrMeasurement.builder()
                                .obType("FLUX")
                                .obUoM("#/MeV/cm^2/sr/s")
                                .chanEnergyHigh(0.003495)
                                .chanEnergyLow(58.4)
                                .chanId("H05E")
                                .chanType("INTEGRAL")
                                .chanUnit("keV")
                                .msgNumber(21)
                                .obValue(31473.9)
                                .species("ELECTRON")
                                .build()
                        )
                        .obTime(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .genSystem("cpuch2.aero.org")
                        .genTime(OffsetDateTime.parse("2025-03-13T18:00:00.123Z"))
                        .idOnOrbit("ONORBIT-ID")
                        .idSensor("REACH-101")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("WSF-M SV1")
                        .origSensorId("CEASE-3")
                        .satNo(101)
                        .senPos(listOf(5893.74, 1408.8, 3899.38))
                        .senReferenceFrame(
                            EcpedrUnvalidatedPublishParams.Body.SenReferenceFrame.TEME
                        )
                        .sourceDl("AXE")
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .transactionId("TRANSACTION-ID")
                        .build()
                )
                .build()
        )
    }
}
