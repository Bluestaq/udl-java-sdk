// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCountParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateBulkParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourCreateParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourListParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourRetrieveParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourTupleParams
import com.unifieddatalibrary.api.models.beamcontours.BeamContourUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BeamContourServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamContourServiceAsync = client.beamContours()

        val future =
            beamContourServiceAsync.create(
                BeamContourCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(BeamContourCreateParams.DataMode.TEST)
                    .idBeam("REF-BEAM-ID")
                    .source("Bluestaq")
                    .type(BeamContourCreateParams.Type.BORESIGHT)
                    .id("BEAMCONTOUR-ID")
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
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamContourServiceAsync = client.beamContours()

        val beamcontourFullFuture =
            beamContourServiceAsync.retrieve(
                BeamContourRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val beamcontourFull = beamcontourFullFuture.get()
        beamcontourFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamContourServiceAsync = client.beamContours()

        val future =
            beamContourServiceAsync.update(
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
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamContourServiceAsync = client.beamContours()

        val pageFuture =
            beamContourServiceAsync.list(BeamContourListParams.builder().idBeam("idBeam").build())

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamContourServiceAsync = client.beamContours()

        val future = beamContourServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamContourServiceAsync = client.beamContours()

        val responseFuture =
            beamContourServiceAsync.count(
                BeamContourCountParams.builder()
                    .idBeam("idBeam")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamContourServiceAsync = client.beamContours()

        val future =
            beamContourServiceAsync.createBulk(
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
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamContourServiceAsync = client.beamContours()

        val responseFuture = beamContourServiceAsync.queryHelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val beamContourServiceAsync = client.beamContours()

        val beamcontourFullsFuture =
            beamContourServiceAsync.tuple(
                BeamContourTupleParams.builder()
                    .columns("columns")
                    .idBeam("idBeam")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val beamcontourFulls = beamcontourFullsFuture.get()
        beamcontourFulls.forEach { it.validate() }
    }
}
