// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryQueryResponseTest {

    @Test
    fun create() {
        val historyQueryResponse =
            HistoryQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryQueryResponse.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
                .type("Global Total Electron Density")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .cadence(10)
                .checksumValue("938c2cc0dcc05f2b68c4287040cfcf71")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endAlt(90.125)
                .endLat(-88.75)
                .endLon(-177.5)
                .filename("glotec_elecden.geojson")
                .filesize(2097152L)
                .numAlt(35)
                .numLat(72)
                .numLon(72)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .reportTime(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
                .sourceDl("AXE")
                .startAlt(8553.163773)
                .startLat(88.75)
                .startLon(177.5)
                .state("PREDICTED")
                .stepLat(2.5)
                .stepLon(5.5)
                .build()

        assertThat(historyQueryResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyQueryResponse.dataMode()).isEqualTo(HistoryQueryResponse.DataMode.TEST)
        assertThat(historyQueryResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyQueryResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
        assertThat(historyQueryResponse.type()).isEqualTo("Global Total Electron Density")
        assertThat(historyQueryResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(historyQueryResponse.cadence()).contains(10)
        assertThat(historyQueryResponse.checksumValue())
            .contains("938c2cc0dcc05f2b68c4287040cfcf71")
        assertThat(historyQueryResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyQueryResponse.createdBy()).contains("some.user")
        assertThat(historyQueryResponse.endAlt()).contains(90.125)
        assertThat(historyQueryResponse.endLat()).contains(-88.75)
        assertThat(historyQueryResponse.endLon()).contains(-177.5)
        assertThat(historyQueryResponse.filename()).contains("glotec_elecden.geojson")
        assertThat(historyQueryResponse.filesize()).contains(2097152L)
        assertThat(historyQueryResponse.numAlt()).contains(35)
        assertThat(historyQueryResponse.numLat()).contains(72)
        assertThat(historyQueryResponse.numLon()).contains(72)
        assertThat(historyQueryResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyQueryResponse.origNetwork()).contains("OPS1")
        assertThat(historyQueryResponse.reportTime())
            .contains(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
        assertThat(historyQueryResponse.sourceDl()).contains("AXE")
        assertThat(historyQueryResponse.startAlt()).contains(8553.163773)
        assertThat(historyQueryResponse.startLat()).contains(88.75)
        assertThat(historyQueryResponse.startLon()).contains(177.5)
        assertThat(historyQueryResponse.state()).contains("PREDICTED")
        assertThat(historyQueryResponse.stepLat()).contains(2.5)
        assertThat(historyQueryResponse.stepLon()).contains(5.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyQueryResponse =
            HistoryQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryQueryResponse.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
                .type("Global Total Electron Density")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .cadence(10)
                .checksumValue("938c2cc0dcc05f2b68c4287040cfcf71")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endAlt(90.125)
                .endLat(-88.75)
                .endLon(-177.5)
                .filename("glotec_elecden.geojson")
                .filesize(2097152L)
                .numAlt(35)
                .numLat(72)
                .numLon(72)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .reportTime(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
                .sourceDl("AXE")
                .startAlt(8553.163773)
                .startLat(88.75)
                .startLon(177.5)
                .state("PREDICTED")
                .stepLat(2.5)
                .stepLon(5.5)
                .build()

        val roundtrippedHistoryQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyQueryResponse),
                jacksonTypeRef<HistoryQueryResponse>(),
            )

        assertThat(roundtrippedHistoryQueryResponse).isEqualTo(historyQueryResponse)
    }
}
