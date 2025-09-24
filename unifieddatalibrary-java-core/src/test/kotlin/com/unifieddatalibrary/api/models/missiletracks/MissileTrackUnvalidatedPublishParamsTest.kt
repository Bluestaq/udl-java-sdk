// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missiletracks

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissileTrackUnvalidatedPublishParamsTest {

    @Test
    fun create() {
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
                    .contextKeys(listOf("MsnID_DescLabel", "msnVer", "serVer", "velTs", "accelTs"))
                    .contextValues(
                        listOf(
                            "MissionID Descriptive Label text",
                            "1",
                            "001.9b",
                            "2024-06-07T14:17:39.234Z",
                            "2024-06-07T14:17:39.123Z",
                        )
                    )
                    .createdAt(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                    .createdBy("some.user")
                    .dropPtInd(true)
                    .emgInd(true)
                    .env(MissileTrackUnvalidatedPublishParams.Body.Env.AIR)
                    .impactAlt(0.02)
                    .impactAouData(listOf(34.3, 26.5, 1.2))
                    .impactAouType("ELLIPSE")
                    .impactConf(99.9)
                    .impactLat(19.88550102)
                    .impactLon(46.74596844)
                    .impactTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                    .infoSource("S1")
                    .launchAlt(0.01)
                    .launchAouData(listOf(1.23, 2.34, 3.45))
                    .launchAouType("ELLIPSE")
                    .launchAz(99.1)
                    .launchAzUnc(2.4)
                    .launchConf(90.7)
                    .launchLat(19.88550102)
                    .launchLon(46.74596844)
                    .launchTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                    .lostTrkInd(false)
                    .maneuverEnd(OffsetDateTime.parse("2021-01-01T01:01:15.456789Z"))
                    .maneuverStart(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
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
                            .contextKeys(
                                listOf("MsnID_DescLabel", "msnVer", "serVer", "velTs", "accelTs")
                            )
                            .contextValues(
                                listOf(
                                    "MissionID Descriptive Label text",
                                    "1",
                                    "001.9b",
                                    "2024-06-07T14:17:39.234Z",
                                    "2024-06-07T14:17:39.123Z",
                                )
                            )
                            .course(7.3580153)
                            .cov(listOf(1.1, 2.2, 3.3))
                            .covReferenceFrame(
                                MissileTrackUnvalidatedPublishParams.Body.Vector.CovReferenceFrame
                                    .ECEF
                            )
                            .flightAz(45.23)
                            .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
                            .object_("TARGET")
                            .origSensorId("ORIGSENSOR-ID")
                            .pos(listOf(-1456.91592, -2883.54041, 6165.55186))
                            .propagated(false)
                            .quat(listOf(0.03, 0.02, 0.01, 0.012))
                            .range(12.3)
                            .referenceFrame("ECEF")
                            .spd(15.03443)
                            .status("INITIAL")
                            .timeSource("Sensor 1")
                            .type("STATE")
                            .vectorAlt(25.0)
                            .vectorLat(45.0)
                            .vectorLon(150.0)
                            .vectorTrackId("102288")
                            .vel(listOf(-1.21981, -6.60208, -3.36515))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
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
                        .contextKeys(
                            listOf("MsnID_DescLabel", "msnVer", "serVer", "velTs", "accelTs")
                        )
                        .contextValues(
                            listOf(
                                "MissionID Descriptive Label text",
                                "1",
                                "001.9b",
                                "2024-06-07T14:17:39.234Z",
                                "2024-06-07T14:17:39.123Z",
                            )
                        )
                        .createdAt(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                        .createdBy("some.user")
                        .dropPtInd(true)
                        .emgInd(true)
                        .env(MissileTrackUnvalidatedPublishParams.Body.Env.AIR)
                        .impactAlt(0.02)
                        .impactAouData(listOf(34.3, 26.5, 1.2))
                        .impactAouType("ELLIPSE")
                        .impactConf(99.9)
                        .impactLat(19.88550102)
                        .impactLon(46.74596844)
                        .impactTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                        .infoSource("S1")
                        .launchAlt(0.01)
                        .launchAouData(listOf(1.23, 2.34, 3.45))
                        .launchAouType("ELLIPSE")
                        .launchAz(99.1)
                        .launchAzUnc(2.4)
                        .launchConf(90.7)
                        .launchLat(19.88550102)
                        .launchLon(46.74596844)
                        .launchTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                        .lostTrkInd(false)
                        .maneuverEnd(OffsetDateTime.parse("2021-01-01T01:01:15.456789Z"))
                        .maneuverStart(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
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
                                .contextKeys(
                                    listOf(
                                        "MsnID_DescLabel",
                                        "msnVer",
                                        "serVer",
                                        "velTs",
                                        "accelTs",
                                    )
                                )
                                .contextValues(
                                    listOf(
                                        "MissionID Descriptive Label text",
                                        "1",
                                        "001.9b",
                                        "2024-06-07T14:17:39.234Z",
                                        "2024-06-07T14:17:39.123Z",
                                    )
                                )
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
                                .propagated(false)
                                .quat(listOf(0.03, 0.02, 0.01, 0.012))
                                .range(12.3)
                                .referenceFrame("ECEF")
                                .spd(15.03443)
                                .status("INITIAL")
                                .timeSource("Sensor 1")
                                .type("STATE")
                                .vectorAlt(25.0)
                                .vectorLat(45.0)
                                .vectorLon(150.0)
                                .vectorTrackId("102288")
                                .vel(listOf(-1.21981, -6.60208, -3.36515))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
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
                    .contextKeys(listOf("MsnID_DescLabel", "msnVer", "serVer", "velTs", "accelTs"))
                    .contextValues(
                        listOf(
                            "MissionID Descriptive Label text",
                            "1",
                            "001.9b",
                            "2024-06-07T14:17:39.234Z",
                            "2024-06-07T14:17:39.123Z",
                        )
                    )
                    .createdAt(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                    .createdBy("some.user")
                    .dropPtInd(true)
                    .emgInd(true)
                    .env(MissileTrackUnvalidatedPublishParams.Body.Env.AIR)
                    .impactAlt(0.02)
                    .impactAouData(listOf(34.3, 26.5, 1.2))
                    .impactAouType("ELLIPSE")
                    .impactConf(99.9)
                    .impactLat(19.88550102)
                    .impactLon(46.74596844)
                    .impactTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                    .infoSource("S1")
                    .launchAlt(0.01)
                    .launchAouData(listOf(1.23, 2.34, 3.45))
                    .launchAouType("ELLIPSE")
                    .launchAz(99.1)
                    .launchAzUnc(2.4)
                    .launchConf(90.7)
                    .launchLat(19.88550102)
                    .launchLon(46.74596844)
                    .launchTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                    .lostTrkInd(false)
                    .maneuverEnd(OffsetDateTime.parse("2021-01-01T01:01:15.456789Z"))
                    .maneuverStart(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
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
                            .contextKeys(
                                listOf("MsnID_DescLabel", "msnVer", "serVer", "velTs", "accelTs")
                            )
                            .contextValues(
                                listOf(
                                    "MissionID Descriptive Label text",
                                    "1",
                                    "001.9b",
                                    "2024-06-07T14:17:39.234Z",
                                    "2024-06-07T14:17:39.123Z",
                                )
                            )
                            .course(7.3580153)
                            .cov(listOf(1.1, 2.2, 3.3))
                            .covReferenceFrame(
                                MissileTrackUnvalidatedPublishParams.Body.Vector.CovReferenceFrame
                                    .ECEF
                            )
                            .flightAz(45.23)
                            .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
                            .object_("TARGET")
                            .origSensorId("ORIGSENSOR-ID")
                            .pos(listOf(-1456.91592, -2883.54041, 6165.55186))
                            .propagated(false)
                            .quat(listOf(0.03, 0.02, 0.01, 0.012))
                            .range(12.3)
                            .referenceFrame("ECEF")
                            .spd(15.03443)
                            .status("INITIAL")
                            .timeSource("Sensor 1")
                            .type("STATE")
                            .vectorAlt(25.0)
                            .vectorLat(45.0)
                            .vectorLon(150.0)
                            .vectorTrackId("102288")
                            .vel(listOf(-1.21981, -6.60208, -3.36515))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MissileTrackUnvalidatedPublishParams.builder()
                .addBody(
                    MissileTrackUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(MissileTrackUnvalidatedPublishParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                MissileTrackUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(MissileTrackUnvalidatedPublishParams.Body.DataMode.TEST)
                    .source("Bluestaq")
                    .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                    .build()
            )
    }
}
