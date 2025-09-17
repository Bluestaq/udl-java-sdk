// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestCountParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestCreateParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestGetParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestListParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestTupleParams
import com.unifieddatalibrary.api.models.laserdeconflictrequest.LaserdeconflictrequestUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaserdeconflictrequestServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val laserdeconflictrequestService = client.laserdeconflictrequest()

        laserdeconflictrequestService.create(
            LaserdeconflictrequestCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaserdeconflictrequestCreateParams.DataMode.TEST)
                .endDate(OffsetDateTime.parse("2023-07-20T00:00:00.123Z"))
                .addIdLaserEmitter("2346c0a0-585f-4232-af5d-93bad320fdc0")
                .addIdLaserEmitter("4446c0a0-585f-4232-af5d-93bad320fbb1")
                .numTargets(25)
                .requestId("3856c0a0-585f-4232-af5d-93bad320fac6")
                .requestTs(OffsetDateTime.parse("2023-07-15T12:30:30.123Z"))
                .source("Bluestaq")
                .startDate(OffsetDateTime.parse("2023-07-19T00:00:00.123Z"))
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .centerlineAzimuth(20.3)
                .centerlineElevation(19.434)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .defaultCha(2.5)
                .enableDss(true)
                .addFixedPoint(
                    LaserdeconflictrequestCreateParams.FixedPoint.builder()
                        .latitude(-10.18)
                        .longitude(-179.98)
                        .height(-18.13)
                        .build()
                )
                .geopotentialModel("WGS84")
                .idOnOrbit("ONORBIT-ID")
                .addLaserDeconflictTarget(
                    LaserdeconflictrequestCreateParams.LaserDeconflictTarget.builder()
                        .classificationMarking("U")
                        .dataMode(
                            LaserdeconflictrequestCreateParams.LaserDeconflictTarget.DataMode.TEST
                        )
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .azimuth(27.91)
                        .azimuthEnd(90.5)
                        .azimuthIncrement(1.5)
                        .azimuthStart(60.5)
                        .centerlineAzimuth(11.02)
                        .centerlineElevation(1.68)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .declination(10.23)
                        .elevation(17.09)
                        .elevationEnd(88.05)
                        .elevationIncrement(0.5)
                        .elevationStart(67.05)
                        .addFixedPoint(
                            LaserdeconflictrequestCreateParams.LaserDeconflictTarget.FixedPoint
                                .builder()
                                .latitude(-10.18)
                                .longitude(-179.98)
                                .height(-18.13)
                                .build()
                        )
                        .idLaserDeconflictRequest("026dd511-8ba5-47d3-9909-836149f87686")
                        .lengthCenterline(369.79)
                        .lengthLeftRight(20.23)
                        .lengthUpDown(28.67)
                        .maximumHeight(0.5)
                        .minimumHeight(0.25)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .ra(11.93)
                        .solarSystemBody("MARS")
                        .sourceDl("AXE")
                        .starNumber(3791)
                        .startDate(OffsetDateTime.parse("2023-07-19T00:00:00.123Z"))
                        .targetNumber(100)
                        .targetObjectId("TARGET-ID")
                        .targetObjectNo(46852)
                        .build()
                )
                .laserSystemName("HEL-1")
                .lengthCenterline(79.35)
                .lengthLeftRight(56.23)
                .lengthUpDown(22.6)
                .maximumHeight(440.3)
                .minimumHeight(0.5)
                .missionName("USSF LP 18-1 Test Laser")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .platformLocationName("Vandenberg")
                .platformLocationType("FIXED_POINT")
                .programId("performance_test_llh-sat")
                .propagator("GP")
                .addProtectList(1234)
                .addProtectList(5678)
                .satNo(46852)
                .sourceDl("AXE")
                .sourceEnabled(false)
                .status("REQUESTED")
                .addTag("TAG1")
                .addTag("TAG2")
                .targetEnabled(true)
                .targetType("BOX_CENTERPOINT_LINE")
                .transactionId("TRANSACTION-ID")
                .treatEarthAs("VICTIM")
                .useFieldOfRegard(true)
                .victimEnabled(true)
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
        val laserdeconflictrequestService = client.laserdeconflictrequest()

        val page =
            laserdeconflictrequestService.list(
                LaserdeconflictrequestListParams.builder()
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val laserdeconflictrequestService = client.laserdeconflictrequest()

        laserdeconflictrequestService.count(
            LaserdeconflictrequestCountParams.builder()
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
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
        val laserdeconflictrequestService = client.laserdeconflictrequest()

        val laserdeconflictrequest =
            laserdeconflictrequestService.get(
                LaserdeconflictrequestGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        laserdeconflictrequest.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val laserdeconflictrequestService = client.laserdeconflictrequest()

        val response = laserdeconflictrequestService.queryhelp()

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
        val laserdeconflictrequestService = client.laserdeconflictrequest()

        val response =
            laserdeconflictrequestService.tuple(
                LaserdeconflictrequestTupleParams.builder()
                    .columns("columns")
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val laserdeconflictrequestService = client.laserdeconflictrequest()

        laserdeconflictrequestService.unvalidatedPublish(
            LaserdeconflictrequestUnvalidatedPublishParams.builder()
                .classificationMarking("U")
                .dataMode(LaserdeconflictrequestUnvalidatedPublishParams.DataMode.TEST)
                .endDate(OffsetDateTime.parse("2023-07-20T00:00:00.123Z"))
                .addIdLaserEmitter("2346c0a0-585f-4232-af5d-93bad320fdc0")
                .addIdLaserEmitter("4446c0a0-585f-4232-af5d-93bad320fbb1")
                .numTargets(25)
                .requestId("3856c0a0-585f-4232-af5d-93bad320fac6")
                .requestTs(OffsetDateTime.parse("2023-07-15T12:30:30.123Z"))
                .source("Bluestaq")
                .startDate(OffsetDateTime.parse("2023-07-19T00:00:00.123Z"))
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .centerlineAzimuth(20.3)
                .centerlineElevation(19.434)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .defaultCha(2.5)
                .enableDss(true)
                .addFixedPoint(
                    LaserdeconflictrequestUnvalidatedPublishParams.FixedPoint.builder()
                        .latitude(-10.18)
                        .longitude(-179.98)
                        .height(-18.13)
                        .build()
                )
                .geopotentialModel("WGS84")
                .idOnOrbit("ONORBIT-ID")
                .addLaserDeconflictTarget(
                    LaserdeconflictrequestUnvalidatedPublishParams.LaserDeconflictTarget.builder()
                        .classificationMarking("U")
                        .dataMode(
                            LaserdeconflictrequestUnvalidatedPublishParams.LaserDeconflictTarget
                                .DataMode
                                .TEST
                        )
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .azimuth(27.91)
                        .azimuthEnd(90.5)
                        .azimuthIncrement(1.5)
                        .azimuthStart(60.5)
                        .centerlineAzimuth(11.02)
                        .centerlineElevation(1.68)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .declination(10.23)
                        .elevation(17.09)
                        .elevationEnd(88.05)
                        .elevationIncrement(0.5)
                        .elevationStart(67.05)
                        .addFixedPoint(
                            LaserdeconflictrequestUnvalidatedPublishParams.LaserDeconflictTarget
                                .FixedPoint
                                .builder()
                                .latitude(-10.18)
                                .longitude(-179.98)
                                .height(-18.13)
                                .build()
                        )
                        .idLaserDeconflictRequest("026dd511-8ba5-47d3-9909-836149f87686")
                        .lengthCenterline(369.79)
                        .lengthLeftRight(20.23)
                        .lengthUpDown(28.67)
                        .maximumHeight(0.5)
                        .minimumHeight(0.25)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .ra(11.93)
                        .solarSystemBody("MARS")
                        .sourceDl("AXE")
                        .starNumber(3791)
                        .startDate(OffsetDateTime.parse("2023-07-19T00:00:00.123Z"))
                        .targetNumber(100)
                        .targetObjectId("TARGET-ID")
                        .targetObjectNo(46852)
                        .build()
                )
                .laserSystemName("HEL-1")
                .lengthCenterline(79.35)
                .lengthLeftRight(56.23)
                .lengthUpDown(22.6)
                .maximumHeight(440.3)
                .minimumHeight(0.5)
                .missionName("USSF LP 18-1 Test Laser")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .platformLocationName("Vandenberg")
                .platformLocationType("FIXED_POINT")
                .programId("performance_test_llh-sat")
                .propagator("GP")
                .addProtectList(1234)
                .addProtectList(5678)
                .satNo(46852)
                .sourceDl("AXE")
                .sourceEnabled(false)
                .status("REQUESTED")
                .addTag("TAG1")
                .addTag("TAG2")
                .targetEnabled(true)
                .targetType("BOX_CENTERPOINT_LINE")
                .transactionId("TRANSACTION-ID")
                .treatEarthAs("VICTIM")
                .useFieldOfRegard(true)
                .victimEnabled(true)
                .build()
        )
    }
}
