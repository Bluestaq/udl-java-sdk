// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ecpedr.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListResponseTest {

    @Test
    fun create() {
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
                .addEcpedrMeasurement(
                    HistoryListResponse.EcpedrMeasurement.builder()
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
                .senReferenceFrame(HistoryListResponse.SenReferenceFrame.TEME)
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .build()

        assertThat(historyListResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyListResponse.dataMode()).isEqualTo(HistoryListResponse.DataMode.TEST)
        assertThat(historyListResponse.ecpedrMeasurements())
            .containsExactly(
                HistoryListResponse.EcpedrMeasurement.builder()
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
        assertThat(historyListResponse.obTime())
            .isEqualTo(OffsetDateTime.parse("2025-03-13T17:00:00.123456Z"))
        assertThat(historyListResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(historyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyListResponse.createdBy()).contains("some.user")
        assertThat(historyListResponse.genSystem()).contains("cpuch2.aero.org")
        assertThat(historyListResponse.genTime())
            .contains(OffsetDateTime.parse("2025-03-13T18:00:00.123Z"))
        assertThat(historyListResponse.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(historyListResponse.idSensor()).contains("REACH-101")
        assertThat(historyListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyListResponse.origNetwork()).contains("OPS1")
        assertThat(historyListResponse.origObjectId()).contains("WSF-M SV1")
        assertThat(historyListResponse.origSensorId()).contains("CEASE-3")
        assertThat(historyListResponse.satNo()).contains(101)
        assertThat(historyListResponse.senPos().getOrNull())
            .containsExactly(5893.74, 1408.8, 3899.38)
        assertThat(historyListResponse.senReferenceFrame())
            .contains(HistoryListResponse.SenReferenceFrame.TEME)
        assertThat(historyListResponse.sourceDl()).contains("AXE")
        assertThat(historyListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(historyListResponse.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
                .addEcpedrMeasurement(
                    HistoryListResponse.EcpedrMeasurement.builder()
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
                .senReferenceFrame(HistoryListResponse.SenReferenceFrame.TEME)
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .build()

        val roundtrippedHistoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyListResponse),
                jacksonTypeRef<HistoryListResponse>(),
            )

        assertThat(roundtrippedHistoryListResponse).isEqualTo(historyListResponse)
    }
}
