// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalAtmosphericModelRetrieveResponseTest {

    @Test
    fun create() {
        val globalAtmosphericModelRetrieveResponse =
            GlobalAtmosphericModelRetrieveResponse.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelRetrieveResponse.DataMode.TEST)
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

        assertThat(globalAtmosphericModelRetrieveResponse.classificationMarking()).isEqualTo("U")
        assertThat(globalAtmosphericModelRetrieveResponse.dataMode())
            .isEqualTo(GlobalAtmosphericModelRetrieveResponse.DataMode.TEST)
        assertThat(globalAtmosphericModelRetrieveResponse.source()).isEqualTo("Bluestaq")
        assertThat(globalAtmosphericModelRetrieveResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
        assertThat(globalAtmosphericModelRetrieveResponse.type())
            .isEqualTo("Global Total Electron Density")
        assertThat(globalAtmosphericModelRetrieveResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(globalAtmosphericModelRetrieveResponse.cadence()).contains(10)
        assertThat(globalAtmosphericModelRetrieveResponse.checksumValue())
            .contains("938c2cc0dcc05f2b68c4287040cfcf71")
        assertThat(globalAtmosphericModelRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(globalAtmosphericModelRetrieveResponse.createdBy()).contains("some.user")
        assertThat(globalAtmosphericModelRetrieveResponse.dataSourceIdentifier())
            .contains("Dragster globally assimilated atmospheric density v2.0")
        assertThat(globalAtmosphericModelRetrieveResponse.endAlt()).contains(90.125)
        assertThat(globalAtmosphericModelRetrieveResponse.endLat()).contains(-88.75)
        assertThat(globalAtmosphericModelRetrieveResponse.endLon()).contains(-177.5)
        assertThat(globalAtmosphericModelRetrieveResponse.filename())
            .contains("glotec_elecden.geojson")
        assertThat(globalAtmosphericModelRetrieveResponse.filesize()).contains(2097152L)
        assertThat(globalAtmosphericModelRetrieveResponse.numAlt()).contains(35)
        assertThat(globalAtmosphericModelRetrieveResponse.numLat()).contains(72)
        assertThat(globalAtmosphericModelRetrieveResponse.numLon()).contains(72)
        assertThat(globalAtmosphericModelRetrieveResponse.origin())
            .contains("THIRD_PARTY_DATASOURCE")
        assertThat(globalAtmosphericModelRetrieveResponse.origNetwork()).contains("OPS1")
        assertThat(globalAtmosphericModelRetrieveResponse.reportTime())
            .contains(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
        assertThat(globalAtmosphericModelRetrieveResponse.sourceDl()).contains("AXE")
        assertThat(globalAtmosphericModelRetrieveResponse.startAlt()).contains(8553.163773)
        assertThat(globalAtmosphericModelRetrieveResponse.startLat()).contains(88.75)
        assertThat(globalAtmosphericModelRetrieveResponse.startLon()).contains(177.5)
        assertThat(globalAtmosphericModelRetrieveResponse.state()).contains("PREDICTED")
        assertThat(globalAtmosphericModelRetrieveResponse.stepLat()).contains(2.5)
        assertThat(globalAtmosphericModelRetrieveResponse.stepLon()).contains(5.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalAtmosphericModelRetrieveResponse =
            GlobalAtmosphericModelRetrieveResponse.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelRetrieveResponse.DataMode.TEST)
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

        val roundtrippedGlobalAtmosphericModelRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalAtmosphericModelRetrieveResponse),
                jacksonTypeRef<GlobalAtmosphericModelRetrieveResponse>(),
            )

        assertThat(roundtrippedGlobalAtmosphericModelRetrieveResponse)
            .isEqualTo(globalAtmosphericModelRetrieveResponse)
    }
}
