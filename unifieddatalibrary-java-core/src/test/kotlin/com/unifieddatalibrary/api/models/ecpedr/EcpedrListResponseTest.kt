// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ecpedr

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EcpedrListResponseTest {

    @Test
    fun create() {
        val ecpedrListResponse =
            EcpedrListResponse.builder()
                .classificationMarking("U")
                .dataMode(EcpedrListResponse.DataMode.TEST)
                .addEcpedrMeasurement(
                    EcpedrListResponse.EcpedrMeasurement.builder()
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
                .senReferenceFrame(EcpedrListResponse.SenReferenceFrame.TEME)
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .build()

        assertThat(ecpedrListResponse.classificationMarking()).isEqualTo("U")
        assertThat(ecpedrListResponse.dataMode()).isEqualTo(EcpedrListResponse.DataMode.TEST)
        assertThat(ecpedrListResponse.ecpedrMeasurements())
            .containsExactly(
                EcpedrListResponse.EcpedrMeasurement.builder()
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
        assertThat(ecpedrListResponse.obTime())
            .isEqualTo(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
        assertThat(ecpedrListResponse.source()).isEqualTo("Bluestaq")
        assertThat(ecpedrListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(ecpedrListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(ecpedrListResponse.createdBy()).contains("some.user")
        assertThat(ecpedrListResponse.genSystem()).contains("cpuch2.aero.org")
        assertThat(ecpedrListResponse.genTime())
            .contains(OffsetDateTime.parse("2025-03-13T18:00:00.123Z"))
        assertThat(ecpedrListResponse.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(ecpedrListResponse.idSensor()).contains("REACH-101")
        assertThat(ecpedrListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(ecpedrListResponse.origNetwork()).contains("OPS1")
        assertThat(ecpedrListResponse.origObjectId()).contains("WSF-M SV1")
        assertThat(ecpedrListResponse.origSensorId()).contains("CEASE-3")
        assertThat(ecpedrListResponse.satNo()).contains(101)
        assertThat(ecpedrListResponse.senPos().getOrNull())
            .containsExactly(5893.74, 1408.8, 3899.38)
        assertThat(ecpedrListResponse.senReferenceFrame())
            .contains(EcpedrListResponse.SenReferenceFrame.TEME)
        assertThat(ecpedrListResponse.sourceDl()).contains("AXE")
        assertThat(ecpedrListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(ecpedrListResponse.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ecpedrListResponse =
            EcpedrListResponse.builder()
                .classificationMarking("U")
                .dataMode(EcpedrListResponse.DataMode.TEST)
                .addEcpedrMeasurement(
                    EcpedrListResponse.EcpedrMeasurement.builder()
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
                .senReferenceFrame(EcpedrListResponse.SenReferenceFrame.TEME)
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .build()

        val roundtrippedEcpedrListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ecpedrListResponse),
                jacksonTypeRef<EcpedrListResponse>(),
            )

        assertThat(roundtrippedEcpedrListResponse).isEqualTo(ecpedrListResponse)
    }
}
