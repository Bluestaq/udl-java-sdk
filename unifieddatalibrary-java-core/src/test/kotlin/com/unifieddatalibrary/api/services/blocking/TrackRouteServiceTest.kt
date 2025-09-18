// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.trackroute.AltitudeBlocksIngest
import com.unifieddatalibrary.api.models.trackroute.PointOfContactIngest
import com.unifieddatalibrary.api.models.trackroute.RoutePointsIngest
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCountParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteCreateBulkParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteGetParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteIngest
import com.unifieddatalibrary.api.models.trackroute.TrackRouteListParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteTupleParams
import com.unifieddatalibrary.api.models.trackroute.TrackRouteUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TrackRouteServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        trackRouteService.create(
            TrackRouteIngest.builder()
                .classificationMarking("U")
                .dataMode(TrackRouteIngest.DataMode.TEST)
                .lastUpdateDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                .source("Bluestaq")
                .type("AIR REFUELING")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .addAltitudeBlock(
                    AltitudeBlocksIngest.builder()
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
                    PointOfContactIngest.builder()
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
                    RoutePointsIngest.builder()
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        trackRouteService.update(
            TrackRouteUpdateParams.builder()
                .pathId("id")
                .trackRouteIngest(
                    TrackRouteIngest.builder()
                        .classificationMarking("U")
                        .dataMode(TrackRouteIngest.DataMode.TEST)
                        .lastUpdateDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                        .source("Bluestaq")
                        .type("AIR REFUELING")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .addAltitudeBlock(
                            AltitudeBlocksIngest.builder()
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
                            PointOfContactIngest.builder()
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
                            RoutePointsIngest.builder()
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        val page =
            trackRouteService.list(
                TrackRouteListParams.builder()
                    .lastUpdateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        trackRouteService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        trackRouteService.count(
            TrackRouteCountParams.builder()
                .lastUpdateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        trackRouteService.createBulk(
            TrackRouteCreateBulkParams.builder()
                .addBody(
                    TrackRouteIngest.builder()
                        .classificationMarking("U")
                        .dataMode(TrackRouteIngest.DataMode.TEST)
                        .lastUpdateDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                        .source("Bluestaq")
                        .type("AIR REFUELING")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .addAltitudeBlock(
                            AltitudeBlocksIngest.builder()
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
                            PointOfContactIngest.builder()
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
                            RoutePointsIngest.builder()
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
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        val trackRouteFull =
            trackRouteService.get(
                TrackRouteGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        trackRouteFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        val response = trackRouteService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        val trackRouteFulls =
            trackRouteService.tuple(
                TrackRouteTupleParams.builder()
                    .columns("columns")
                    .lastUpdateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        trackRouteFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val trackRouteService = client.trackRoute()

        trackRouteService.unvalidatedPublish(
            TrackRouteIngest.builder()
                .classificationMarking("U")
                .dataMode(TrackRouteIngest.DataMode.TEST)
                .lastUpdateDate(OffsetDateTime.parse("2024-09-17T16:00:00.123Z"))
                .source("Bluestaq")
                .type("AIR REFUELING")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .addAltitudeBlock(
                    AltitudeBlocksIngest.builder()
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
                    PointOfContactIngest.builder()
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
                    RoutePointsIngest.builder()
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
    }
}
