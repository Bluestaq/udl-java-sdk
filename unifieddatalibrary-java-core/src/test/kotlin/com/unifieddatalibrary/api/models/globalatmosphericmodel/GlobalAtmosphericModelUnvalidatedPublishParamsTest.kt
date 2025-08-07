// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.globalatmosphericmodel

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalAtmosphericModelUnvalidatedPublishParamsTest {

    @Test
    fun create() {
        GlobalAtmosphericModelUnvalidatedPublishParams.builder()
            .classificationMarking("U")
            .dataMode(GlobalAtmosphericModelUnvalidatedPublishParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            GlobalAtmosphericModelUnvalidatedPublishParams.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelUnvalidatedPublishParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode())
            .isEqualTo(GlobalAtmosphericModelUnvalidatedPublishParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.ts()).isEqualTo(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
        assertThat(body.type()).isEqualTo("Global Total Electron Density")
        assertThat(body.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(body.cadence()).contains(10)
        assertThat(body.checksumValue()).contains("938c2cc0dcc05f2b68c4287040cfcf71")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.endAlt()).contains(90.125)
        assertThat(body.endLat()).contains(-88.75)
        assertThat(body.endLon()).contains(-177.5)
        assertThat(body.filename()).contains("glotec_elecden.geojson")
        assertThat(body.filesize()).contains(2097152L)
        assertThat(body.numAlt()).contains(35)
        assertThat(body.numLat()).contains(72)
        assertThat(body.numLon()).contains(72)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.reportTime()).contains(OffsetDateTime.parse("2024-08-21T21:54:35.123Z"))
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.startAlt()).contains(8553.163773)
        assertThat(body.startLat()).contains(88.75)
        assertThat(body.startLon()).contains(177.5)
        assertThat(body.state()).contains("PREDICTED")
        assertThat(body.stepLat()).contains(2.5)
        assertThat(body.stepLon()).contains(5.5)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GlobalAtmosphericModelUnvalidatedPublishParams.builder()
                .classificationMarking("U")
                .dataMode(GlobalAtmosphericModelUnvalidatedPublishParams.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
                .type("Global Total Electron Density")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode())
            .isEqualTo(GlobalAtmosphericModelUnvalidatedPublishParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.ts()).isEqualTo(OffsetDateTime.parse("2024-03-01T11:45:00.123Z"))
        assertThat(body.type()).isEqualTo("Global Total Electron Density")
    }
}
