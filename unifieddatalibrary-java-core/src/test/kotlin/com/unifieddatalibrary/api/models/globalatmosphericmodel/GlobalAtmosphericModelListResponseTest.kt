// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalAtmosphericModelListResponseTest {

    @Test
    fun create() {
        val globalAtmosphericModelListResponse =
            GlobalAtmosphericModelListResponse.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelListResponse.DataMode.TEST)
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

        assertThat(globalAtmosphericModelListResponse.classificationMarking()).isEqualTo("U")
        assertThat(globalAtmosphericModelListResponse.dataMode())
            .isEqualTo(GlobalAtmosphericModelListResponse.DataMode.TEST)
        assertThat(globalAtmosphericModelListResponse.source()).isEqualTo("Bluestaq")
        assertThat(globalAtmosphericModelListResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
        assertThat(globalAtmosphericModelListResponse.type())
            .isEqualTo("Global Total Electron Density")
        assertThat(globalAtmosphericModelListResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(globalAtmosphericModelListResponse.cadence()).contains(10)
        assertThat(globalAtmosphericModelListResponse.checksumValue())
            .contains("938c2cc0dcc05f2b68c4287040cfcf71")
        assertThat(globalAtmosphericModelListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(globalAtmosphericModelListResponse.createdBy()).contains("some.user")
        assertThat(globalAtmosphericModelListResponse.endAlt()).contains(90.125)
        assertThat(globalAtmosphericModelListResponse.endLat()).contains(-88.75)
        assertThat(globalAtmosphericModelListResponse.endLon()).contains(-177.5)
        assertThat(globalAtmosphericModelListResponse.filename()).contains("glotec_elecden.geojson")
        assertThat(globalAtmosphericModelListResponse.filesize()).contains(2097152L)
        assertThat(globalAtmosphericModelListResponse.numAlt()).contains(35)
        assertThat(globalAtmosphericModelListResponse.numLat()).contains(72)
        assertThat(globalAtmosphericModelListResponse.numLon()).contains(72)
        assertThat(globalAtmosphericModelListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(globalAtmosphericModelListResponse.origNetwork()).contains("OPS1")
        assertThat(globalAtmosphericModelListResponse.reportTime())
            .contains(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
        assertThat(globalAtmosphericModelListResponse.sourceDl()).contains("AXE")
        assertThat(globalAtmosphericModelListResponse.startAlt()).contains(8553.163773)
        assertThat(globalAtmosphericModelListResponse.startLat()).contains(88.75)
        assertThat(globalAtmosphericModelListResponse.startLon()).contains(177.5)
        assertThat(globalAtmosphericModelListResponse.state()).contains("PREDICTED")
        assertThat(globalAtmosphericModelListResponse.stepLat()).contains(2.5)
        assertThat(globalAtmosphericModelListResponse.stepLon()).contains(5.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalAtmosphericModelListResponse =
            GlobalAtmosphericModelListResponse.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelListResponse.DataMode.TEST)
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

        val roundtrippedGlobalAtmosphericModelListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalAtmosphericModelListResponse),
                jacksonTypeRef<GlobalAtmosphericModelListResponse>(),
            )

        assertThat(roundtrippedGlobalAtmosphericModelListResponse)
            .isEqualTo(globalAtmosphericModelListResponse)
    }
}
