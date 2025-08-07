// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.port

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortCreateParamsTest {

    @Test
    fun create() {
        PortCreateParams.builder()
            .classificationMarking("U")
            .dataMode(PortCreateParams.DataMode.TEST)
            .source("Bluestaq")
            .id("026dd511-8ba5-47d3-9909-836149f87686")
            .avgDuration(41.1)
            .countryCode("US")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .externalId("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
            .harborSize(160.1)
            .harborType("COASTAL NATURAL")
            .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
            .lat(45.23)
            .locode("CAVAN")
            .lon(179.1)
            .maxDraught(18.1)
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .pilotReqd(true)
            .portName("Vancouver")
            .shelter("EXCELLENT")
            .tideRange(4.1)
            .build()
    }

    @Test
    fun body() {
        val params =
            PortCreateParams.builder()
                .classificationMarking("U")
                .dataMode(PortCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .avgDuration(41.1)
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .externalId("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
                .harborSize(160.1)
                .harborType("COASTAL NATURAL")
                .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                .lat(45.23)
                .locode("CAVAN")
                .lon(179.1)
                .maxDraught(18.1)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .pilotReqd(true)
                .portName("Vancouver")
                .shelter("EXCELLENT")
                .tideRange(4.1)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(PortCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(body.avgDuration()).contains(41.1)
        assertThat(body.countryCode()).contains("US")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.externalId()).contains("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
        assertThat(body.harborSize()).contains(160.1)
        assertThat(body.harborType()).contains("COASTAL NATURAL")
        assertThat(body.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
        assertThat(body.lat()).contains(45.23)
        assertThat(body.locode()).contains("CAVAN")
        assertThat(body.lon()).contains(179.1)
        assertThat(body.maxDraught()).contains(18.1)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.pilotReqd()).contains(true)
        assertThat(body.portName()).contains("Vancouver")
        assertThat(body.shelter()).contains("EXCELLENT")
        assertThat(body.tideRange()).contains(4.1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PortCreateParams.builder()
                .classificationMarking("U")
                .dataMode(PortCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(PortCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
