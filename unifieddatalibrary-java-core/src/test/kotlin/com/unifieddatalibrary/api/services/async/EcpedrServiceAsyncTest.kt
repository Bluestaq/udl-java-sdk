// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
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
internal class EcpedrServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpedrServiceAsync = client.ecpedr()

        val future =
            ecpedrServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpedrServiceAsync = client.ecpedr()

        val pageFuture =
            ecpedrServiceAsync.list(
                EcpedrListParams.builder()
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpedrServiceAsync = client.ecpedr()

        val responseFuture =
            ecpedrServiceAsync.count(
                EcpedrCountParams.builder()
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpedrServiceAsync = client.ecpedr()

        val future =
            ecpedrServiceAsync.createBulk(
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

        val response = future.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpedrServiceAsync = client.ecpedr()

        val responseFuture = ecpedrServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpedrServiceAsync = client.ecpedr()

        val responseFuture =
            ecpedrServiceAsync.tuple(
                EcpedrTupleParams.builder()
                    .columns("columns")
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpedrServiceAsync = client.ecpedr()

        val future =
            ecpedrServiceAsync.unvalidatedPublish(
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

        val response = future.get()
    }
}
