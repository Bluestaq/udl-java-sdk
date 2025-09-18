// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ecpedr

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EcpedrTupleResponseTest {

    @Test
    fun create() {
        val ecpedrTupleResponse =
            EcpedrTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(EcpedrTupleResponse.DataMode.TEST)
                .addEcpedrMeasurement(
                    EcpedrTupleResponse.EcpedrMeasurement.builder()
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
                .senReferenceFrame(EcpedrTupleResponse.SenReferenceFrame.TEME)
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .build()

        assertThat(ecpedrTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(ecpedrTupleResponse.dataMode()).isEqualTo(EcpedrTupleResponse.DataMode.TEST)
        assertThat(ecpedrTupleResponse.ecpedrMeasurements())
            .containsExactly(
                EcpedrTupleResponse.EcpedrMeasurement.builder()
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
        assertThat(ecpedrTupleResponse.obTime())
            .isEqualTo(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
        assertThat(ecpedrTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(ecpedrTupleResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(ecpedrTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(ecpedrTupleResponse.createdBy()).contains("some.user")
        assertThat(ecpedrTupleResponse.genSystem()).contains("cpuch2.aero.org")
        assertThat(ecpedrTupleResponse.genTime())
            .contains(OffsetDateTime.parse("2025-03-13T18:00:00.123Z"))
        assertThat(ecpedrTupleResponse.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(ecpedrTupleResponse.idSensor()).contains("REACH-101")
        assertThat(ecpedrTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(ecpedrTupleResponse.origNetwork()).contains("OPS1")
        assertThat(ecpedrTupleResponse.origObjectId()).contains("WSF-M SV1")
        assertThat(ecpedrTupleResponse.origSensorId()).contains("CEASE-3")
        assertThat(ecpedrTupleResponse.satNo()).contains(101)
        assertThat(ecpedrTupleResponse.senPos().getOrNull())
            .containsExactly(5893.74, 1408.8, 3899.38)
        assertThat(ecpedrTupleResponse.senReferenceFrame())
            .contains(EcpedrTupleResponse.SenReferenceFrame.TEME)
        assertThat(ecpedrTupleResponse.sourceDl()).contains("AXE")
        assertThat(ecpedrTupleResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(ecpedrTupleResponse.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ecpedrTupleResponse =
            EcpedrTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(EcpedrTupleResponse.DataMode.TEST)
                .addEcpedrMeasurement(
                    EcpedrTupleResponse.EcpedrMeasurement.builder()
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
                .senReferenceFrame(EcpedrTupleResponse.SenReferenceFrame.TEME)
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .build()

        val roundtrippedEcpedrTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ecpedrTupleResponse),
                jacksonTypeRef<EcpedrTupleResponse>(),
            )

        assertThat(roundtrippedEcpedrTupleResponse).isEqualTo(ecpedrTupleResponse)
    }
}
