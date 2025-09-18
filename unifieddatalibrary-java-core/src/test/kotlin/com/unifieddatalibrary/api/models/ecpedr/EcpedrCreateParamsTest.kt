// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ecpedr

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EcpedrCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EcpedrCreateParams.DataMode.TEST)
        assertThat(body.ecpedrMeasurements())
            .containsExactly(
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
        assertThat(body.obTime()).isEqualTo(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.genSystem()).contains("cpuch2.aero.org")
        assertThat(body.genTime()).contains(OffsetDateTime.parse("2025-03-13T18:00:00.123Z"))
        assertThat(body.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(body.idSensor()).contains("REACH-101")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.origObjectId()).contains("WSF-M SV1")
        assertThat(body.origSensorId()).contains("CEASE-3")
        assertThat(body.satNo()).contains(101)
        assertThat(body.senPos().getOrNull()).containsExactly(5893.74, 1408.8, 3899.38)
        assertThat(body.senReferenceFrame()).contains(EcpedrCreateParams.SenReferenceFrame.TEME)
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(body.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EcpedrCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EcpedrCreateParams.DataMode.TEST)
                .addEcpedrMeasurement(
                    EcpedrCreateParams.EcpedrMeasurement.builder()
                        .obType("FLUX")
                        .obUoM("#/MeV/cm^2/sr/s")
                        .build()
                )
                .obTime(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EcpedrCreateParams.DataMode.TEST)
        assertThat(body.ecpedrMeasurements())
            .containsExactly(
                EcpedrCreateParams.EcpedrMeasurement.builder()
                    .obType("FLUX")
                    .obUoM("#/MeV/cm^2/sr/s")
                    .build()
            )
        assertThat(body.obTime()).isEqualTo(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
