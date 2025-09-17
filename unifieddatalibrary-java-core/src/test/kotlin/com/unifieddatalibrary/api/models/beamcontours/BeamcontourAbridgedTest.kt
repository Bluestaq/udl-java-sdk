// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beamcontours

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamcontourAbridgedTest {

    @Test
    fun create() {
        val beamcontourAbridged =
            BeamcontourAbridged.builder()
                .classificationMarking("U")
                .dataMode(BeamcontourAbridged.DataMode.TEST)
                .idBeam("REF-BEAM-ID")
                .source("Bluestaq")
                .type(BeamcontourAbridged.Type.BORESIGHT)
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
                .build()

        assertThat(beamcontourAbridged.classificationMarking()).isEqualTo("U")
        assertThat(beamcontourAbridged.dataMode()).isEqualTo(BeamcontourAbridged.DataMode.TEST)
        assertThat(beamcontourAbridged.idBeam()).isEqualTo("REF-BEAM-ID")
        assertThat(beamcontourAbridged.source()).isEqualTo("Bluestaq")
        assertThat(beamcontourAbridged.type()).isEqualTo(BeamcontourAbridged.Type.BORESIGHT)
        assertThat(beamcontourAbridged.id()).contains("BEAMCONTOUR-ID")
        assertThat(beamcontourAbridged.contourIdx()).contains(1L)
        assertThat(beamcontourAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(beamcontourAbridged.createdBy()).contains("some.user")
        assertThat(beamcontourAbridged.gain()).contains(17.1)
        assertThat(beamcontourAbridged.geographyJson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(beamcontourAbridged.geographyNdims()).contains(2)
        assertThat(beamcontourAbridged.geographySrid()).contains(4326)
        assertThat(beamcontourAbridged.geographyText())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(beamcontourAbridged.geographyType()).contains("ST_Polygon")
        assertThat(beamcontourAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(beamcontourAbridged.origNetwork()).contains("OPS1")
        assertThat(beamcontourAbridged.regionName()).contains("Example region name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beamcontourAbridged =
            BeamcontourAbridged.builder()
                .classificationMarking("U")
                .dataMode(BeamcontourAbridged.DataMode.TEST)
                .idBeam("REF-BEAM-ID")
                .source("Bluestaq")
                .type(BeamcontourAbridged.Type.BORESIGHT)
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
                .build()

        val roundtrippedBeamcontourAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beamcontourAbridged),
                jacksonTypeRef<BeamcontourAbridged>(),
            )

        assertThat(roundtrippedBeamcontourAbridged).isEqualTo(beamcontourAbridged)
    }
}
