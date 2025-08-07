// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.port

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortTupleResponseTest {

    @Test
    fun create() {
        val portTupleResponse =
            PortTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(PortTupleResponse.DataMode.TEST)
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

        assertThat(portTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(portTupleResponse.dataMode()).isEqualTo(PortTupleResponse.DataMode.TEST)
        assertThat(portTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(portTupleResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(portTupleResponse.avgDuration()).contains(41.1)
        assertThat(portTupleResponse.countryCode()).contains("US")
        assertThat(portTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(portTupleResponse.createdBy()).contains("some.user")
        assertThat(portTupleResponse.externalId()).contains("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
        assertThat(portTupleResponse.harborSize()).contains(160.1)
        assertThat(portTupleResponse.harborType()).contains("COASTAL NATURAL")
        assertThat(portTupleResponse.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
        assertThat(portTupleResponse.lat()).contains(45.23)
        assertThat(portTupleResponse.locode()).contains("CAVAN")
        assertThat(portTupleResponse.lon()).contains(179.1)
        assertThat(portTupleResponse.maxDraught()).contains(18.1)
        assertThat(portTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(portTupleResponse.origNetwork()).contains("OPS1")
        assertThat(portTupleResponse.pilotReqd()).contains(true)
        assertThat(portTupleResponse.portName()).contains("Vancouver")
        assertThat(portTupleResponse.shelter()).contains("EXCELLENT")
        assertThat(portTupleResponse.sourceDl()).contains("AXE")
        assertThat(portTupleResponse.tideRange()).contains(4.1)
        assertThat(portTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(portTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portTupleResponse =
            PortTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(PortTupleResponse.DataMode.TEST)
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

        val roundtrippedPortTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portTupleResponse),
                jacksonTypeRef<PortTupleResponse>(),
            )

        assertThat(roundtrippedPortTupleResponse).isEqualTo(portTupleResponse)
    }
}
