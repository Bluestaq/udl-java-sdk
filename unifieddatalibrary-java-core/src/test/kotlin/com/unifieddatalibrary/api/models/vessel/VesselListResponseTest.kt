// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.vessel

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VesselListResponseTest {

    @Test
    fun create() {
        val vesselListResponse =
            VesselListResponse.builder()
                .classificationMarking("U")
                .dataMode(VesselListResponse.DataMode.TEST)
                .source("Bluestaq")
                .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .altVesselId("590b5194fc32e75dd00682ba")
                .callsign("V2OZ")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .firstSeen(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .hullNum("A30081")
                .idEntity("ENTITY-ID")
                .idOrganization("0147f777-w09a-835f-85aa-0a07a730fgg0")
                .imon(9566356)
                .length(511.1)
                .maxDraught(21.1)
                .maxSpeed(32.5)
                .mmsi("416450000")
                .numBlades(4)
                .numShafts(3)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .propType("Diesel")
                .sconum("B45524")
                .status("In Service/Commission")
                .sternType("Cruiser")
                .vesselBuilder("Samsung Heavy Inds - Geoje")
                .vesselClass("Nimitz")
                .vesselDescription("Search and Rescue Vessel")
                .vesselFlag("United States")
                .vesselName("DORNUM")
                .vesselType("Passenger")
                .vslWt(3423.76)
                .width(24.1)
                .yearBuilt("2014")
                .build()

        assertThat(vesselListResponse.classificationMarking()).isEqualTo("U")
        assertThat(vesselListResponse.dataMode()).isEqualTo(VesselListResponse.DataMode.TEST)
        assertThat(vesselListResponse.source()).isEqualTo("Bluestaq")
        assertThat(vesselListResponse.id()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(vesselListResponse.altVesselId()).contains("590b5194fc32e75dd00682ba")
        assertThat(vesselListResponse.callsign()).contains("V2OZ")
        assertThat(vesselListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(vesselListResponse.createdBy()).contains("some.user")
        assertThat(vesselListResponse.firstSeen())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(vesselListResponse.hullNum()).contains("A30081")
        assertThat(vesselListResponse.idEntity()).contains("ENTITY-ID")
        assertThat(vesselListResponse.idOrganization())
            .contains("0147f777-w09a-835f-85aa-0a07a730fgg0")
        assertThat(vesselListResponse.imon()).contains(9566356)
        assertThat(vesselListResponse.length()).contains(511.1)
        assertThat(vesselListResponse.maxDraught()).contains(21.1)
        assertThat(vesselListResponse.maxSpeed()).contains(32.5)
        assertThat(vesselListResponse.mmsi()).contains("416450000")
        assertThat(vesselListResponse.numBlades()).contains(4)
        assertThat(vesselListResponse.numShafts()).contains(3)
        assertThat(vesselListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(vesselListResponse.origNetwork()).contains("OPS1")
        assertThat(vesselListResponse.propType()).contains("Diesel")
        assertThat(vesselListResponse.sconum()).contains("B45524")
        assertThat(vesselListResponse.status()).contains("In Service/Commission")
        assertThat(vesselListResponse.sternType()).contains("Cruiser")
        assertThat(vesselListResponse.vesselBuilder()).contains("Samsung Heavy Inds - Geoje")
        assertThat(vesselListResponse.vesselClass()).contains("Nimitz")
        assertThat(vesselListResponse.vesselDescription()).contains("Search and Rescue Vessel")
        assertThat(vesselListResponse.vesselFlag()).contains("United States")
        assertThat(vesselListResponse.vesselName()).contains("DORNUM")
        assertThat(vesselListResponse.vesselType()).contains("Passenger")
        assertThat(vesselListResponse.vslWt()).contains(3423.76)
        assertThat(vesselListResponse.width()).contains(24.1)
        assertThat(vesselListResponse.yearBuilt()).contains("2014")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vesselListResponse =
            VesselListResponse.builder()
                .classificationMarking("U")
                .dataMode(VesselListResponse.DataMode.TEST)
                .source("Bluestaq")
                .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .altVesselId("590b5194fc32e75dd00682ba")
                .callsign("V2OZ")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .firstSeen(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .hullNum("A30081")
                .idEntity("ENTITY-ID")
                .idOrganization("0147f777-w09a-835f-85aa-0a07a730fgg0")
                .imon(9566356)
                .length(511.1)
                .maxDraught(21.1)
                .maxSpeed(32.5)
                .mmsi("416450000")
                .numBlades(4)
                .numShafts(3)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .propType("Diesel")
                .sconum("B45524")
                .status("In Service/Commission")
                .sternType("Cruiser")
                .vesselBuilder("Samsung Heavy Inds - Geoje")
                .vesselClass("Nimitz")
                .vesselDescription("Search and Rescue Vessel")
                .vesselFlag("United States")
                .vesselName("DORNUM")
                .vesselType("Passenger")
                .vslWt(3423.76)
                .width(24.1)
                .yearBuilt("2014")
                .build()

        val roundtrippedVesselListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vesselListResponse),
                jacksonTypeRef<VesselListResponse>(),
            )

        assertThat(roundtrippedVesselListResponse).isEqualTo(vesselListResponse)
    }
}
