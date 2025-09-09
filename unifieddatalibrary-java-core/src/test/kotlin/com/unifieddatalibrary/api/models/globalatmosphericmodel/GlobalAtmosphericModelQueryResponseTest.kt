// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalAtmosphericModelQueryResponseTest {

    @Test
    fun create() {
        val globalAtmosphericModelQueryResponse =
            GlobalAtmosphericModelQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelQueryResponse.DataMode.TEST)
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

        assertThat(globalAtmosphericModelQueryResponse.classificationMarking()).isEqualTo("U")
        assertThat(globalAtmosphericModelQueryResponse.dataMode())
            .isEqualTo(GlobalAtmosphericModelQueryResponse.DataMode.TEST)
        assertThat(globalAtmosphericModelQueryResponse.source()).isEqualTo("Bluestaq")
        assertThat(globalAtmosphericModelQueryResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
        assertThat(globalAtmosphericModelQueryResponse.type())
            .isEqualTo("Global Total Electron Density")
        assertThat(globalAtmosphericModelQueryResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(globalAtmosphericModelQueryResponse.cadence()).contains(10)
        assertThat(globalAtmosphericModelQueryResponse.checksumValue())
            .contains("938c2cc0dcc05f2b68c4287040cfcf71")
        assertThat(globalAtmosphericModelQueryResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(globalAtmosphericModelQueryResponse.createdBy()).contains("some.user")
        assertThat(globalAtmosphericModelQueryResponse.dataSourceIdentifier())
            .contains("Dragster globally assimilated atmospheric density v2.0")
        assertThat(globalAtmosphericModelQueryResponse.endAlt()).contains(90.125)
        assertThat(globalAtmosphericModelQueryResponse.endLat()).contains(-88.75)
        assertThat(globalAtmosphericModelQueryResponse.endLon()).contains(-177.5)
        assertThat(globalAtmosphericModelQueryResponse.filename())
            .contains("glotec_elecden.geojson")
        assertThat(globalAtmosphericModelQueryResponse.filesize()).contains(2097152L)
        assertThat(globalAtmosphericModelQueryResponse.numAlt()).contains(35)
        assertThat(globalAtmosphericModelQueryResponse.numLat()).contains(72)
        assertThat(globalAtmosphericModelQueryResponse.numLon()).contains(72)
        assertThat(globalAtmosphericModelQueryResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(globalAtmosphericModelQueryResponse.origNetwork()).contains("OPS1")
        assertThat(globalAtmosphericModelQueryResponse.reportTime())
            .contains(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
        assertThat(globalAtmosphericModelQueryResponse.sourceDl()).contains("AXE")
        assertThat(globalAtmosphericModelQueryResponse.startAlt()).contains(8553.163773)
        assertThat(globalAtmosphericModelQueryResponse.startLat()).contains(88.75)
        assertThat(globalAtmosphericModelQueryResponse.startLon()).contains(177.5)
        assertThat(globalAtmosphericModelQueryResponse.state()).contains("PREDICTED")
        assertThat(globalAtmosphericModelQueryResponse.stepLat()).contains(2.5)
        assertThat(globalAtmosphericModelQueryResponse.stepLon()).contains(5.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalAtmosphericModelQueryResponse =
            GlobalAtmosphericModelQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelQueryResponse.DataMode.TEST)
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

        val roundtrippedGlobalAtmosphericModelQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalAtmosphericModelQueryResponse),
                jacksonTypeRef<GlobalAtmosphericModelQueryResponse>(),
            )

        assertThat(roundtrippedGlobalAtmosphericModelQueryResponse)
            .isEqualTo(globalAtmosphericModelQueryResponse)
    }
}
