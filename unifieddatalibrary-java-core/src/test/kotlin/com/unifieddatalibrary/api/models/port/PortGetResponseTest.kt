// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.port

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortGetResponseTest {

    @Test
    fun create() {
        val portGetResponse =
            PortGetResponse.builder()
                .classificationMarking("U")
                .dataMode(PortGetResponse.DataMode.TEST)
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
                .sourceDl("AXE")
                .tideRange(4.1)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(portGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(portGetResponse.dataMode()).isEqualTo(PortGetResponse.DataMode.TEST)
        assertThat(portGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(portGetResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(portGetResponse.avgDuration()).contains(41.1)
        assertThat(portGetResponse.countryCode()).contains("US")
        assertThat(portGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(portGetResponse.createdBy()).contains("some.user")
        assertThat(portGetResponse.externalId()).contains("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
        assertThat(portGetResponse.harborSize()).contains(160.1)
        assertThat(portGetResponse.harborType()).contains("COASTAL NATURAL")
        assertThat(portGetResponse.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
        assertThat(portGetResponse.lat()).contains(45.23)
        assertThat(portGetResponse.locode()).contains("CAVAN")
        assertThat(portGetResponse.lon()).contains(179.1)
        assertThat(portGetResponse.maxDraught()).contains(18.1)
        assertThat(portGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(portGetResponse.origNetwork()).contains("OPS1")
        assertThat(portGetResponse.pilotReqd()).contains(true)
        assertThat(portGetResponse.portName()).contains("Vancouver")
        assertThat(portGetResponse.shelter()).contains("EXCELLENT")
        assertThat(portGetResponse.sourceDl()).contains("AXE")
        assertThat(portGetResponse.tideRange()).contains(4.1)
        assertThat(portGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(portGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portGetResponse =
            PortGetResponse.builder()
                .classificationMarking("U")
                .dataMode(PortGetResponse.DataMode.TEST)
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
                .sourceDl("AXE")
                .tideRange(4.1)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedPortGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portGetResponse),
                jacksonTypeRef<PortGetResponse>(),
            )

        assertThat(roundtrippedPortGetResponse).isEqualTo(portGetResponse)
    }
}
