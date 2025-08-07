// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.port

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortListResponseTest {

    @Test
    fun create() {
        val portListResponse =
            PortListResponse.builder()
                .classificationMarking("U")
                .dataMode(PortListResponse.DataMode.TEST)
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

        assertThat(portListResponse.classificationMarking()).isEqualTo("U")
        assertThat(portListResponse.dataMode()).isEqualTo(PortListResponse.DataMode.TEST)
        assertThat(portListResponse.source()).isEqualTo("Bluestaq")
        assertThat(portListResponse.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(portListResponse.avgDuration()).contains(41.1)
        assertThat(portListResponse.countryCode()).contains("US")
        assertThat(portListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(portListResponse.createdBy()).contains("some.user")
        assertThat(portListResponse.externalId()).contains("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
        assertThat(portListResponse.harborSize()).contains(160.1)
        assertThat(portListResponse.harborType()).contains("COASTAL NATURAL")
        assertThat(portListResponse.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
        assertThat(portListResponse.lat()).contains(45.23)
        assertThat(portListResponse.locode()).contains("CAVAN")
        assertThat(portListResponse.lon()).contains(179.1)
        assertThat(portListResponse.maxDraught()).contains(18.1)
        assertThat(portListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(portListResponse.origNetwork()).contains("OPS1")
        assertThat(portListResponse.pilotReqd()).contains(true)
        assertThat(portListResponse.portName()).contains("Vancouver")
        assertThat(portListResponse.shelter()).contains("EXCELLENT")
        assertThat(portListResponse.tideRange()).contains(4.1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portListResponse =
            PortListResponse.builder()
                .classificationMarking("U")
                .dataMode(PortListResponse.DataMode.TEST)
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

        val roundtrippedPortListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portListResponse),
                jacksonTypeRef<PortListResponse>(),
            )

        assertThat(roundtrippedPortListResponse).isEqualTo(portListResponse)
    }
}
