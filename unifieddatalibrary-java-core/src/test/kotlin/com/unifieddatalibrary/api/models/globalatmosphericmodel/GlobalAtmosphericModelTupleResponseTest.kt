// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalAtmosphericModelTupleResponseTest {

    @Test
    fun create() {
        val globalAtmosphericModelTupleResponse =
            GlobalAtmosphericModelTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelTupleResponse.DataMode.TEST)
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

        assertThat(globalAtmosphericModelTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(globalAtmosphericModelTupleResponse.dataMode())
            .isEqualTo(GlobalAtmosphericModelTupleResponse.DataMode.TEST)
        assertThat(globalAtmosphericModelTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(globalAtmosphericModelTupleResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
        assertThat(globalAtmosphericModelTupleResponse.type())
            .isEqualTo("Global Total Electron Density")
        assertThat(globalAtmosphericModelTupleResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(globalAtmosphericModelTupleResponse.cadence()).contains(10)
        assertThat(globalAtmosphericModelTupleResponse.checksumValue())
            .contains("938c2cc0dcc05f2b68c4287040cfcf71")
        assertThat(globalAtmosphericModelTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(globalAtmosphericModelTupleResponse.createdBy()).contains("some.user")
        assertThat(globalAtmosphericModelTupleResponse.dataSourceIdentifier())
            .contains("Dragster globally assimilated atmospheric density v2.0")
        assertThat(globalAtmosphericModelTupleResponse.endAlt()).contains(90.125)
        assertThat(globalAtmosphericModelTupleResponse.endLat()).contains(-88.75)
        assertThat(globalAtmosphericModelTupleResponse.endLon()).contains(-177.5)
        assertThat(globalAtmosphericModelTupleResponse.filename())
            .contains("glotec_elecden.geojson")
        assertThat(globalAtmosphericModelTupleResponse.filesize()).contains(2097152L)
        assertThat(globalAtmosphericModelTupleResponse.numAlt()).contains(35)
        assertThat(globalAtmosphericModelTupleResponse.numLat()).contains(72)
        assertThat(globalAtmosphericModelTupleResponse.numLon()).contains(72)
        assertThat(globalAtmosphericModelTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(globalAtmosphericModelTupleResponse.origNetwork()).contains("OPS1")
        assertThat(globalAtmosphericModelTupleResponse.reportTime())
            .contains(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
        assertThat(globalAtmosphericModelTupleResponse.sourceDl()).contains("AXE")
        assertThat(globalAtmosphericModelTupleResponse.startAlt()).contains(8553.163773)
        assertThat(globalAtmosphericModelTupleResponse.startLat()).contains(88.75)
        assertThat(globalAtmosphericModelTupleResponse.startLon()).contains(177.5)
        assertThat(globalAtmosphericModelTupleResponse.state()).contains("PREDICTED")
        assertThat(globalAtmosphericModelTupleResponse.stepLat()).contains(2.5)
        assertThat(globalAtmosphericModelTupleResponse.stepLon()).contains(5.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalAtmosphericModelTupleResponse =
            GlobalAtmosphericModelTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelTupleResponse.DataMode.TEST)
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

        val roundtrippedGlobalAtmosphericModelTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalAtmosphericModelTupleResponse),
                jacksonTypeRef<GlobalAtmosphericModelTupleResponse>(),
            )

        assertThat(roundtrippedGlobalAtmosphericModelTupleResponse)
            .isEqualTo(globalAtmosphericModelTupleResponse)
    }
}
