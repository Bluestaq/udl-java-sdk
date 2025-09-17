// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCountParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackCreateBulkParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleParams
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MissileTrackServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val missileTrackServiceAsync = client.missileTracks()

        val pageFuture =
            missileTrackServiceAsync.list(
                MissileTrackListParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val missileTrackServiceAsync = client.missileTracks()

        val responseFuture =
            missileTrackServiceAsync.count(
                MissileTrackCountParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val missileTrackServiceAsync = client.missileTracks()

        val future =
            missileTrackServiceAsync.createBulk(
                MissileTrackCreateBulkParams.builder()
                    .addBody(
                        MissileTrackCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(MissileTrackCreateBulkParams.Body.DataMode.TEST)
                            .source("Bluestaq")
                            .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .id("MissileTrack_ID")
                            .acftSubType("SLBM")
                            .alert("HIT")
                            .angElev(15.2)
                            .aouRptData(listOf(34.3, 26.5, 1.2))
                            .aouRptType("ELLIPSE")
                            .azCorr(12.876)
                            .boosting(true)
                            .burnoutAlt(30567.452)
                            .callSign("Charlie")
                            .containment(90.64)
                            .createdAt(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                            .createdBy("some.user")
                            .dropPtInd(true)
                            .emgInd(true)
                            .env(MissileTrackCreateBulkParams.Body.Env.AIR)
                            .impactAouData(listOf(34.3, 26.5, 1.2))
                            .impactAouType("ELLIPSE")
                            .impactLat(19.88550102)
                            .impactLon(46.74596844)
                            .impactTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .infoSource("S1")
                            .launchAouData(listOf(1.23, 2.34, 3.45))
                            .launchAouType("ELLIPSE")
                            .launchLat(19.88550102)
                            .launchLon(46.74596844)
                            .launchTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .lostTrkInd(false)
                            .msgCreateDate(OffsetDateTime.parse("2024-04-25T08:17:01.346Z"))
                            .msgSubType("Update")
                            .msgType("MSG-TYPE")
                            .mslStatus("AT LAUNCH")
                            .muidSrc("MUID-SRC")
                            .muidSrcTrk("MUID-SRC-ID")
                            .name("TRACK-NAME")
                            .objAct("HOLDING")
                            .objIdent(MissileTrackCreateBulkParams.Body.ObjIdent.FRIEND)
                            .objPlat("WEAPON")
                            .objType("Ballistic")
                            .objTypeConf(90)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .parentTrackId("102288")
                            .polarSingLocLat(19.88550102)
                            .polarSingLocLon(46.74596844)
                            .senMode("OBSBO")
                            .spaceAmp("NUCLEAR WARHEAD")
                            .spaceAmpConf(6)
                            .spaceSpecType("SS-21_MOD_2_CRBM")
                            .trackId("102288")
                            .trkConf(0.95)
                            .trkQual(1)
                            .addVector(
                                MissileTrackCreateBulkParams.Body.Vector.builder()
                                    .epoch(OffsetDateTime.parse("2024-03-30T15:02:39.346768Z"))
                                    .accel(listOf(0.59236, -0.03537, 0.35675))
                                    .confidence(100)
                                    .course(7.3580153)
                                    .cov(listOf(1.1, 2.2, 3.3))
                                    .covReferenceFrame(
                                        MissileTrackCreateBulkParams.Body.Vector.CovReferenceFrame
                                            .ECEF
                                    )
                                    .flightAz(45.23)
                                    .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
                                    .object_("TARGET")
                                    .origSensorId("ORIGSENSOR-ID")
                                    .pos(listOf(-1456.91592, -2883.54041, 6165.55186))
                                    .quat(listOf(0.03, 0.02, 0.01, 0.012))
                                    .referenceFrame("ECEF")
                                    .spd(15.03443)
                                    .status("INITIAL")
                                    .timeSource("Sensor 1")
                                    .type("STATE")
                                    .vectorAlt(25.0)
                                    .vectorLat(45.0)
                                    .vectorLon(150.0)
                                    .vel(listOf(-1.21981, -6.60208, -3.36515))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val missileTrackServiceAsync = client.missileTracks()

        val responseFuture = missileTrackServiceAsync.queryhelp()

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
        val missileTrackServiceAsync = client.missileTracks()

        val responseFuture =
            missileTrackServiceAsync.tuple(
                MissileTrackTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val missileTrackServiceAsync = client.missileTracks()

        val future =
            missileTrackServiceAsync.unvalidatedPublish(
                MissileTrackUnvalidatedPublishParams.builder()
                    .addBody(
                        MissileTrackUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(MissileTrackUnvalidatedPublishParams.Body.DataMode.TEST)
                            .source("Bluestaq")
                            .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .id("MissileTrack_ID")
                            .acftSubType("SLBM")
                            .alert("HIT")
                            .angElev(15.2)
                            .aouRptData(listOf(34.3, 26.5, 1.2))
                            .aouRptType("ELLIPSE")
                            .azCorr(12.876)
                            .boosting(true)
                            .burnoutAlt(30567.452)
                            .callSign("Charlie")
                            .containment(90.64)
                            .createdAt(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                            .createdBy("some.user")
                            .dropPtInd(true)
                            .emgInd(true)
                            .env(MissileTrackUnvalidatedPublishParams.Body.Env.AIR)
                            .impactAouData(listOf(34.3, 26.5, 1.2))
                            .impactAouType("ELLIPSE")
                            .impactLat(19.88550102)
                            .impactLon(46.74596844)
                            .impactTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .infoSource("S1")
                            .launchAouData(listOf(1.23, 2.34, 3.45))
                            .launchAouType("ELLIPSE")
                            .launchLat(19.88550102)
                            .launchLon(46.74596844)
                            .launchTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .lostTrkInd(false)
                            .msgCreateDate(OffsetDateTime.parse("2024-04-25T08:17:01.346Z"))
                            .msgSubType("Update")
                            .msgType("MSG-TYPE")
                            .mslStatus("AT LAUNCH")
                            .muidSrc("MUID-SRC")
                            .muidSrcTrk("MUID-SRC-ID")
                            .name("TRACK-NAME")
                            .objAct("HOLDING")
                            .objIdent(MissileTrackUnvalidatedPublishParams.Body.ObjIdent.FRIEND)
                            .objPlat("WEAPON")
                            .objType("Ballistic")
                            .objTypeConf(90)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .parentTrackId("102288")
                            .polarSingLocLat(19.88550102)
                            .polarSingLocLon(46.74596844)
                            .senMode("OBSBO")
                            .spaceAmp("NUCLEAR WARHEAD")
                            .spaceAmpConf(6)
                            .spaceSpecType("SS-21_MOD_2_CRBM")
                            .trackId("102288")
                            .trkConf(0.95)
                            .trkQual(1)
                            .addVector(
                                MissileTrackUnvalidatedPublishParams.Body.Vector.builder()
                                    .epoch(OffsetDateTime.parse("2024-03-30T15:02:39.346768Z"))
                                    .accel(listOf(0.59236, -0.03537, 0.35675))
                                    .confidence(100)
                                    .course(7.3580153)
                                    .cov(listOf(1.1, 2.2, 3.3))
                                    .covReferenceFrame(
                                        MissileTrackUnvalidatedPublishParams.Body.Vector
                                            .CovReferenceFrame
                                            .ECEF
                                    )
                                    .flightAz(45.23)
                                    .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
                                    .object_("TARGET")
                                    .origSensorId("ORIGSENSOR-ID")
                                    .pos(listOf(-1456.91592, -2883.54041, 6165.55186))
                                    .quat(listOf(0.03, 0.02, 0.01, 0.012))
                                    .referenceFrame("ECEF")
                                    .spd(15.03443)
                                    .status("INITIAL")
                                    .timeSource("Sensor 1")
                                    .type("STATE")
                                    .vectorAlt(25.0)
                                    .vectorLat(45.0)
                                    .vectorLon(150.0)
                                    .vel(listOf(-1.21981, -6.60208, -3.36515))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
