// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCountParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCreateBulkParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCreateParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteGetParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteListParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteTupleParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TrackRouteServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteServiceAsync = client.trackRoute()

        val future =
            trackRouteServiceAsync.create(
                TrackRouteCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(TrackRouteCreateParams.DataMode.TEST)
                    .lastUpdateDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                    .source("Bluestaq")
                    .type("AIR REFUELING")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .addAltitudeBlock(
                        TrackRouteCreateParams.AltitudeBlock.builder()
                            .altitudeSequenceId("A1")
                            .lowerAltitude(27000.1)
                            .upperAltitude(27200.5)
                            .build()
                    )
                    .apnSetting("1-3-1")
                    .apxBeaconCode("5/1")
                    .artccMessage("OAKLAND CTR/GUAM CERAP")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .creatingOrg("HQPAC")
                    .direction("NE")
                    .effectiveDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                    .externalId("GDSSMH121004232315303094")
                    .lastUsedDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                    .locationTrackId("POACHR")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .addPoc(
                        TrackRouteCreateParams.Poc.builder()
                            .office("A34")
                            .phone("8675309")
                            .pocName("Fred Smith")
                            .pocOrg("HQAF")
                            .pocSequenceId(1)
                            .pocTypeName("Originator")
                            .rank("Capt")
                            .remark("POC remark.")
                            .username("fgsmith")
                            .build()
                    )
                    .priFreq(357.5)
                    .receiverTankerChCode("31/094")
                    .regionCode("5")
                    .regionName("North America")
                    .reviewDate(OffsetDateTime.parse("2024-09-16T16:00:00.123Z"))
                    .addRoutePoint(
                        TrackRouteCreateParams.RoutePoint.builder()
                            .altCountryCode("IZ")
                            .countryCode("NL")
                            .dafifPt(true)
                            .magDec(7.35)
                            .navaid("HTO")
                            .navaidLength(100.2)
                            .navaidType("VORTAC")
                            .ptLat(45.23)
                            .ptLon(179.1)
                            .ptSequenceId(1)
                            .ptTypeCode("EP")
                            .ptTypeName("ENTRY POINT")
                            .waypointName("KCHS")
                            .build()
                    )
                    .schedulerOrgName("97 OSS/OSOS DSN 866-5555")
                    .schedulerOrgUnit("612 AOC")
                    .secFreq(319.7)
                    .shortName("CH61")
                    .sic("N")
                    .sourceDl("AXE")
                    .trackId("CH61A")
                    .trackName("CH61 POST")
                    .typeCode("V")
                    .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteServiceAsync = client.trackRoute()

        val future =
            trackRouteServiceAsync.update(
                TrackRouteUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(TrackRouteUpdateParams.DataMode.TEST)
                    .lastUpdateDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                    .source("Bluestaq")
                    .type("AIR REFUELING")
                    .bodyId("026dd511-8ba5-47d3-9909-836149f87686")
                    .addAltitudeBlock(
                        TrackRouteUpdateParams.AltitudeBlock.builder()
                            .altitudeSequenceId("A1")
                            .lowerAltitude(27000.1)
                            .upperAltitude(27200.5)
                            .build()
                    )
                    .apnSetting("1-3-1")
                    .apxBeaconCode("5/1")
                    .artccMessage("OAKLAND CTR/GUAM CERAP")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .creatingOrg("HQPAC")
                    .direction("NE")
                    .effectiveDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                    .externalId("GDSSMH121004232315303094")
                    .lastUsedDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                    .locationTrackId("POACHR")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .addPoc(
                        TrackRouteUpdateParams.Poc.builder()
                            .office("A34")
                            .phone("8675309")
                            .pocName("Fred Smith")
                            .pocOrg("HQAF")
                            .pocSequenceId(1)
                            .pocTypeName("Originator")
                            .rank("Capt")
                            .remark("POC remark.")
                            .username("fgsmith")
                            .build()
                    )
                    .priFreq(357.5)
                    .receiverTankerChCode("31/094")
                    .regionCode("5")
                    .regionName("North America")
                    .reviewDate(OffsetDateTime.parse("2024-09-16T16:00:00.123Z"))
                    .addRoutePoint(
                        TrackRouteUpdateParams.RoutePoint.builder()
                            .altCountryCode("IZ")
                            .countryCode("NL")
                            .dafifPt(true)
                            .magDec(7.35)
                            .navaid("HTO")
                            .navaidLength(100.2)
                            .navaidType("VORTAC")
                            .ptLat(45.23)
                            .ptLon(179.1)
                            .ptSequenceId(1)
                            .ptTypeCode("EP")
                            .ptTypeName("ENTRY POINT")
                            .waypointName("KCHS")
                            .build()
                    )
                    .schedulerOrgName("97 OSS/OSOS DSN 866-5555")
                    .schedulerOrgUnit("612 AOC")
                    .secFreq(319.7)
                    .shortName("CH61")
                    .sic("N")
                    .sourceDl("AXE")
                    .trackId("CH61A")
                    .trackName("CH61 POST")
                    .typeCode("V")
                    .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
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
        val trackRouteServiceAsync = client.trackRoute()

        val pageFuture =
            trackRouteServiceAsync.list(
                TrackRouteListParams.builder()
                    .lastUpdateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

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
        val trackRouteServiceAsync = client.trackRoute()

        val future = trackRouteServiceAsync.delete("id")

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
        val trackRouteServiceAsync = client.trackRoute()

        val responseFuture =
            trackRouteServiceAsync.count(
                TrackRouteCountParams.builder()
                    .lastUpdateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val trackRouteServiceAsync = client.trackRoute()

        val future =
            trackRouteServiceAsync.createBulk(
                TrackRouteCreateBulkParams.builder()
                    .addBody(
                        TrackRouteCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(TrackRouteCreateBulkParams.Body.DataMode.TEST)
                            .lastUpdateDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                            .source("Bluestaq")
                            .type("AIR REFUELING")
                            .id("026dd511-8ba5-47d3-9909-836149f87686")
                            .addAltitudeBlock(
                                TrackRouteCreateBulkParams.Body.AltitudeBlock.builder()
                                    .altitudeSequenceId("A1")
                                    .lowerAltitude(27000.1)
                                    .upperAltitude(27200.5)
                                    .build()
                            )
                            .apnSetting("1-3-1")
                            .apxBeaconCode("5/1")
                            .artccMessage("OAKLAND CTR/GUAM CERAP")
                            .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .creatingOrg("HQPAC")
                            .direction("NE")
                            .effectiveDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                            .externalId("GDSSMH121004232315303094")
                            .lastUsedDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                            .locationTrackId("POACHR")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .addPoc(
                                TrackRouteCreateBulkParams.Body.Poc.builder()
                                    .office("A34")
                                    .phone("8675309")
                                    .pocName("Fred Smith")
                                    .pocOrg("HQAF")
                                    .pocSequenceId(1)
                                    .pocTypeName("Originator")
                                    .rank("Capt")
                                    .remark("POC remark.")
                                    .username("fgsmith")
                                    .build()
                            )
                            .priFreq(357.5)
                            .receiverTankerChCode("31/094")
                            .regionCode("5")
                            .regionName("North America")
                            .reviewDate(OffsetDateTime.parse("2024-09-16T16:00:00.123Z"))
                            .addRoutePoint(
                                TrackRouteCreateBulkParams.Body.RoutePoint.builder()
                                    .altCountryCode("IZ")
                                    .countryCode("NL")
                                    .dafifPt(true)
                                    .magDec(7.35)
                                    .navaid("HTO")
                                    .navaidLength(100.2)
                                    .navaidType("VORTAC")
                                    .ptLat(45.23)
                                    .ptLon(179.1)
                                    .ptSequenceId(1)
                                    .ptTypeCode("EP")
                                    .ptTypeName("ENTRY POINT")
                                    .waypointName("KCHS")
                                    .build()
                            )
                            .schedulerOrgName("97 OSS/OSOS DSN 866-5555")
                            .schedulerOrgUnit("612 AOC")
                            .secFreq(319.7)
                            .shortName("CH61")
                            .sic("N")
                            .sourceDl("AXE")
                            .trackId("CH61A")
                            .trackName("CH61 POST")
                            .typeCode("V")
                            .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                            .updatedBy("some.user")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteServiceAsync = client.trackRoute()

        val trackRouteFullFuture =
            trackRouteServiceAsync.get(
                TrackRouteGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val trackRouteFull = trackRouteFullFuture.get()
        trackRouteFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteServiceAsync = client.trackRoute()

        val responseFuture = trackRouteServiceAsync.queryhelp()

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
        val trackRouteServiceAsync = client.trackRoute()

        val trackRouteFullsFuture =
            trackRouteServiceAsync.tuple(
                TrackRouteTupleParams.builder()
                    .columns("columns")
                    .lastUpdateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val trackRouteFulls = trackRouteFullsFuture.get()
        trackRouteFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteServiceAsync = client.trackRoute()

        val future =
            trackRouteServiceAsync.unvalidatedPublish(
                TrackRouteUnvalidatedPublishParams.builder()
                    .classificationMarking("U")
                    .dataMode(TrackRouteUnvalidatedPublishParams.DataMode.TEST)
                    .lastUpdateDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                    .source("Bluestaq")
                    .type("AIR REFUELING")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .addAltitudeBlock(
                        TrackRouteUnvalidatedPublishParams.AltitudeBlock.builder()
                            .altitudeSequenceId("A1")
                            .lowerAltitude(27000.1)
                            .upperAltitude(27200.5)
                            .build()
                    )
                    .apnSetting("1-3-1")
                    .apxBeaconCode("5/1")
                    .artccMessage("OAKLAND CTR/GUAM CERAP")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .creatingOrg("HQPAC")
                    .direction("NE")
                    .effectiveDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                    .externalId("GDSSMH121004232315303094")
                    .lastUsedDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                    .locationTrackId("POACHR")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .addPoc(
                        TrackRouteUnvalidatedPublishParams.Poc.builder()
                            .office("A34")
                            .phone("8675309")
                            .pocName("Fred Smith")
                            .pocOrg("HQAF")
                            .pocSequenceId(1)
                            .pocTypeName("Originator")
                            .rank("Capt")
                            .remark("POC remark.")
                            .username("fgsmith")
                            .build()
                    )
                    .priFreq(357.5)
                    .receiverTankerChCode("31/094")
                    .regionCode("5")
                    .regionName("North America")
                    .reviewDate(OffsetDateTime.parse("2024-09-16T16:00:00.123Z"))
                    .addRoutePoint(
                        TrackRouteUnvalidatedPublishParams.RoutePoint.builder()
                            .altCountryCode("IZ")
                            .countryCode("NL")
                            .dafifPt(true)
                            .magDec(7.35)
                            .navaid("HTO")
                            .navaidLength(100.2)
                            .navaidType("VORTAC")
                            .ptLat(45.23)
                            .ptLon(179.1)
                            .ptSequenceId(1)
                            .ptTypeCode("EP")
                            .ptTypeName("ENTRY POINT")
                            .waypointName("KCHS")
                            .build()
                    )
                    .schedulerOrgName("97 OSS/OSOS DSN 866-5555")
                    .schedulerOrgUnit("612 AOC")
                    .secFreq(319.7)
                    .shortName("CH61")
                    .sic("N")
                    .sourceDl("AXE")
                    .trackId("CH61A")
                    .trackName("CH61 POST")
                    .typeCode("V")
                    .updatedAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )

        val response = future.get()
    }
}
