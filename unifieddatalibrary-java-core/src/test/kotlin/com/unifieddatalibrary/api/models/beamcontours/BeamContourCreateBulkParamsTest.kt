// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.beamcontours

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeamContourCreateBulkParamsTest {

    @Test
    fun create() {
        BeamContourCreateBulkParams.builder()
            .addBody(
                BeamContourCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(BeamContourCreateBulkParams.Body.DataMode.TEST)
                    .idBeam("REF-BEAM-ID")
                    .source("Bluestaq")
                    .type(BeamContourCreateBulkParams.Body.Type.BORESIGHT)
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BeamContourCreateBulkParams.builder()
                .addBody(
                    BeamContourCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(BeamContourCreateBulkParams.Body.DataMode.TEST)
                        .idBeam("REF-BEAM-ID")
                        .source("Bluestaq")
                        .type(BeamContourCreateBulkParams.Body.Type.BORESIGHT)
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                BeamContourCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(BeamContourCreateBulkParams.Body.DataMode.TEST)
                    .idBeam("REF-BEAM-ID")
                    .source("Bluestaq")
                    .type(BeamContourCreateBulkParams.Body.Type.BORESIGHT)
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BeamContourCreateBulkParams.builder()
                .addBody(
                    BeamContourCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(BeamContourCreateBulkParams.Body.DataMode.TEST)
                        .idBeam("REF-BEAM-ID")
                        .source("Bluestaq")
                        .type(BeamContourCreateBulkParams.Body.Type.BORESIGHT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                BeamContourCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(BeamContourCreateBulkParams.Body.DataMode.TEST)
                    .idBeam("REF-BEAM-ID")
                    .source("Bluestaq")
                    .type(BeamContourCreateBulkParams.Body.Type.BORESIGHT)
                    .build()
            )
    }
}
