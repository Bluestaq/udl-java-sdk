// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beamcontours

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamContourUpdateParamsTest {

    @Test
    fun create() {
        BeamContourUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(BeamContourUpdateParams.DataMode.TEST)
            .idBeam("REF-BEAM-ID")
            .source("Bluestaq")
            .type(BeamContourUpdateParams.Type.BORESIGHT)
            .bodyId("BEAMCONTOUR-ID")
            .contourIdx(1L)
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .gain(17.1)
            .geography(
                "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
            )
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
            .origNetwork("ORIG")
            .regionName("Example region name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BeamContourUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(BeamContourUpdateParams.DataMode.TEST)
                .idBeam("REF-BEAM-ID")
                .source("Bluestaq")
                .type(BeamContourUpdateParams.Type.BORESIGHT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BeamContourUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(BeamContourUpdateParams.DataMode.TEST)
                .idBeam("REF-BEAM-ID")
                .source("Bluestaq")
                .type(BeamContourUpdateParams.Type.BORESIGHT)
                .bodyId("BEAMCONTOUR-ID")
                .contourIdx(1L)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .gain(17.1)
                .geography(
                    "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
                )
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
                .origNetwork("ORIG")
                .regionName("Example region name")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(BeamContourUpdateParams.DataMode.TEST)
        assertThat(body.idBeam()).isEqualTo("REF-BEAM-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.type()).isEqualTo(BeamContourUpdateParams.Type.BORESIGHT)
        assertThat(body.bodyId()).contains("BEAMCONTOUR-ID")
        assertThat(body.contourIdx()).contains(1L)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.gain()).contains(17.1)
        assertThat(body.geography())
            .contains(
                "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
            )
        assertThat(body.geographyJson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(body.geographyNdims()).contains(2)
        assertThat(body.geographySrid()).contains(4326)
        assertThat(body.geographyText())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(body.geographyType()).contains("ST_Polygon")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.regionName()).contains("Example region name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BeamContourUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(BeamContourUpdateParams.DataMode.TEST)
                .idBeam("REF-BEAM-ID")
                .source("Bluestaq")
                .type(BeamContourUpdateParams.Type.BORESIGHT)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(BeamContourUpdateParams.DataMode.TEST)
        assertThat(body.idBeam()).isEqualTo("REF-BEAM-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.type()).isEqualTo(BeamContourUpdateParams.Type.BORESIGHT)
    }
}
