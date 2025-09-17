// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ecpedr

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EcpedrUnvalidatedPublishParamsTest {

    @Test
    fun create() {
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
                    .senReferenceFrame(EcpedrUnvalidatedPublishParams.Body.SenReferenceFrame.TEME)
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .transactionId("TRANSACTION-ID")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .containsExactly(
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
                    .senReferenceFrame(EcpedrUnvalidatedPublishParams.Body.SenReferenceFrame.TEME)
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .transactionId("TRANSACTION-ID")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EcpedrUnvalidatedPublishParams.builder()
                .addBody(
                    EcpedrUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EcpedrUnvalidatedPublishParams.Body.DataMode.TEST)
                        .addEcpedrMeasurement(
                            EcpedrUnvalidatedPublishParams.Body.EcpedrMeasurement.builder()
                                .obType("FLUX")
                                .obUoM("#/MeV/cm^2/sr/s")
                                .build()
                        )
                        .obTime(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                EcpedrUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(EcpedrUnvalidatedPublishParams.Body.DataMode.TEST)
                    .addEcpedrMeasurement(
                        EcpedrUnvalidatedPublishParams.Body.EcpedrMeasurement.builder()
                            .obType("FLUX")
                            .obUoM("#/MeV/cm^2/sr/s")
                            .build()
                    )
                    .obTime(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
                    .source("Bluestaq")
                    .build()
            )
    }
}
