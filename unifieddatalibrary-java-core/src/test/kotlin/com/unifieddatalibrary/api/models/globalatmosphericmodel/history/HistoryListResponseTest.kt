// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListResponseTest {

    @Test
    fun create() {
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
                .type("Global Total Electron Density")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .cadence(10)
                .checksumValue("938c2cc0dcc05f2b68c4287040cfcf71")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .dataSourceIdentifier("Dragster globally assimilated atmospheric density v2.0")
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

        assertThat(historyListResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyListResponse.dataMode()).isEqualTo(HistoryListResponse.DataMode.TEST)
        assertThat(historyListResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyListResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
        assertThat(historyListResponse.type()).isEqualTo("Global Total Electron Density")
        assertThat(historyListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(historyListResponse.cadence()).contains(10)
        assertThat(historyListResponse.checksumValue()).contains("938c2cc0dcc05f2b68c4287040cfcf71")
        assertThat(historyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyListResponse.createdBy()).contains("some.user")
        assertThat(historyListResponse.dataSourceIdentifier())
            .contains("Dragster globally assimilated atmospheric density v2.0")
        assertThat(historyListResponse.endAlt()).contains(90.125)
        assertThat(historyListResponse.endLat()).contains(-88.75)
        assertThat(historyListResponse.endLon()).contains(-177.5)
        assertThat(historyListResponse.filename()).contains("glotec_elecden.geojson")
        assertThat(historyListResponse.filesize()).contains(2097152L)
        assertThat(historyListResponse.numAlt()).contains(35)
        assertThat(historyListResponse.numLat()).contains(72)
        assertThat(historyListResponse.numLon()).contains(72)
        assertThat(historyListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyListResponse.origNetwork()).contains("OPS1")
        assertThat(historyListResponse.reportTime())
            .contains(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
        assertThat(historyListResponse.sourceDl()).contains("AXE")
        assertThat(historyListResponse.startAlt()).contains(8553.163773)
        assertThat(historyListResponse.startLat()).contains(88.75)
        assertThat(historyListResponse.startLon()).contains(177.5)
        assertThat(historyListResponse.state()).contains("PREDICTED")
        assertThat(historyListResponse.stepLat()).contains(2.5)
        assertThat(historyListResponse.stepLon()).contains(5.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
                .type("Global Total Electron Density")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .cadence(10)
                .checksumValue("938c2cc0dcc05f2b68c4287040cfcf71")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .dataSourceIdentifier("Dragster globally assimilated atmospheric density v2.0")
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

        val roundtrippedHistoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyListResponse),
                jacksonTypeRef<HistoryListResponse>(),
            )

        assertThat(roundtrippedHistoryListResponse).isEqualTo(historyListResponse)
    }
}
