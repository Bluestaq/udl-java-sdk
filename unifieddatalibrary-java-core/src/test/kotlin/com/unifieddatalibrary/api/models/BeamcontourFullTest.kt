// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamcontourFullTest {

    @Test
    fun create() {
        val beamcontourFull =
            BeamcontourFull.builder()
                .classificationMarking("U")
                .dataMode(BeamcontourFull.DataMode.TEST)
                .idBeam("REF-BEAM-ID")
                .source("Bluestaq")
                .type(BeamcontourFull.Type.BORESIGHT)
                .id("BEAMCONTOUR-ID")
                .contourIdx(1L)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .gain(17.1)
                .geographyJson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .geographyNdims(2)
                .geographySrid(4326)
                .geographyText(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .geographyType("ST_Polygon")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .regionName("Example region name")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(beamcontourFull.classificationMarking()).isEqualTo("U")
        assertThat(beamcontourFull.dataMode()).isEqualTo(BeamcontourFull.DataMode.TEST)
        assertThat(beamcontourFull.idBeam()).isEqualTo("REF-BEAM-ID")
        assertThat(beamcontourFull.source()).isEqualTo("Bluestaq")
        assertThat(beamcontourFull.type()).isEqualTo(BeamcontourFull.Type.BORESIGHT)
        assertThat(beamcontourFull.id()).contains("BEAMCONTOUR-ID")
        assertThat(beamcontourFull.contourIdx()).contains(1L)
        assertThat(beamcontourFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(beamcontourFull.createdBy()).contains("some.user")
        assertThat(beamcontourFull.gain()).contains(17.1)
        assertThat(beamcontourFull.geographyJson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(beamcontourFull.geographyNdims()).contains(2)
        assertThat(beamcontourFull.geographySrid()).contains(4326)
        assertThat(beamcontourFull.geographyText())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(beamcontourFull.geographyType()).contains("ST_Polygon")
        assertThat(beamcontourFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(beamcontourFull.origNetwork()).contains("OPS1")
        assertThat(beamcontourFull.regionName()).contains("Example region name")
        assertThat(beamcontourFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(beamcontourFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beamcontourFull =
            BeamcontourFull.builder()
                .classificationMarking("U")
                .dataMode(BeamcontourFull.DataMode.TEST)
                .idBeam("REF-BEAM-ID")
                .source("Bluestaq")
                .type(BeamcontourFull.Type.BORESIGHT)
                .id("BEAMCONTOUR-ID")
                .contourIdx(1L)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .gain(17.1)
                .geographyJson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .geographyNdims(2)
                .geographySrid(4326)
                .geographyText(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .geographyType("ST_Polygon")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .regionName("Example region name")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedBeamcontourFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beamcontourFull),
                jacksonTypeRef<BeamcontourFull>(),
            )

        assertThat(roundtrippedBeamcontourFull).isEqualTo(beamcontourFull)
    }
}
