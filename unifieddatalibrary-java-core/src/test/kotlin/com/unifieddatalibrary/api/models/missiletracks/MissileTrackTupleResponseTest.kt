// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missiletracks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissileTrackTupleResponseTest {

    @Test
    fun create() {
        val missileTrackTupleResponse =
            MissileTrackTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(MissileTrackTupleResponse.DataMode.TEST)
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
                .env(MissileTrackTupleResponse.Env.AIR)
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
                .objIdent(MissileTrackTupleResponse.ObjIdent.FRIEND)
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
                    MissileTrackTupleResponse.Vector.builder()
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
                            MissileTrackTupleResponse.Vector.CovReferenceFrame.ECR_ECEF
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
                        .timeSource("Sensor1")
                        .type("STATE")
                        .vectorAlt(25.0)
                        .vectorLat(45.0)
                        .vectorLon(150.0)
                        .vectorTrackId("102288")
                        .vel(listOf(-1.21981, -6.60208, -3.36515))
                        .build()
                )
                .build()

        assertThat(missileTrackTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(missileTrackTupleResponse.dataMode())
            .isEqualTo(MissileTrackTupleResponse.DataMode.TEST)
        assertThat(missileTrackTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(missileTrackTupleResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
        assertThat(missileTrackTupleResponse.id()).contains("MissileTrack_ID")
        assertThat(missileTrackTupleResponse.acftSubType()).contains("SLBM")
        assertThat(missileTrackTupleResponse.alert()).contains("HIT")
        assertThat(missileTrackTupleResponse.angElev()).contains(15.2)
        assertThat(missileTrackTupleResponse.aouRptData().getOrNull())
            .containsExactly(34.3, 26.5, 1.2)
        assertThat(missileTrackTupleResponse.aouRptType()).contains("ELLIPSE")
        assertThat(missileTrackTupleResponse.azCorr()).contains(12.876)
        assertThat(missileTrackTupleResponse.boosting()).contains(true)
        assertThat(missileTrackTupleResponse.burnoutAlt()).contains(30567.452)
        assertThat(missileTrackTupleResponse.callSign()).contains("Charlie")
        assertThat(missileTrackTupleResponse.containment()).contains(90.64)
        assertThat(missileTrackTupleResponse.contextKeys().getOrNull())
            .containsExactly("MsnID_DescLabel", "msnVer", "serVer", "velTs", "accelTs")
        assertThat(missileTrackTupleResponse.contextValues().getOrNull())
            .containsExactly(
                "MissionID Descriptive Label text",
                "1",
                "001.9b",
                "2024-06-07T14:17:39.234Z",
                "2024-06-07T14:17:39.123Z",
            )
        assertThat(missileTrackTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
        assertThat(missileTrackTupleResponse.createdBy()).contains("some.user")
        assertThat(missileTrackTupleResponse.dropPtInd()).contains(true)
        assertThat(missileTrackTupleResponse.emgInd()).contains(true)
        assertThat(missileTrackTupleResponse.env()).contains(MissileTrackTupleResponse.Env.AIR)
        assertThat(missileTrackTupleResponse.impactAlt()).contains(0.02)
        assertThat(missileTrackTupleResponse.impactAouData().getOrNull())
            .containsExactly(34.3, 26.5, 1.2)
        assertThat(missileTrackTupleResponse.impactAouType()).contains("ELLIPSE")
        assertThat(missileTrackTupleResponse.impactConf()).contains(99.9)
        assertThat(missileTrackTupleResponse.impactLat()).contains(19.88550102)
        assertThat(missileTrackTupleResponse.impactLon()).contains(46.74596844)
        assertThat(missileTrackTupleResponse.impactTime())
            .contains(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
        assertThat(missileTrackTupleResponse.infoSource()).contains("S1")
        assertThat(missileTrackTupleResponse.launchAlt()).contains(0.01)
        assertThat(missileTrackTupleResponse.launchAouData().getOrNull())
            .containsExactly(1.23, 2.34, 3.45)
        assertThat(missileTrackTupleResponse.launchAouType()).contains("ELLIPSE")
        assertThat(missileTrackTupleResponse.launchAz()).contains(99.1)
        assertThat(missileTrackTupleResponse.launchAzUnc()).contains(2.4)
        assertThat(missileTrackTupleResponse.launchConf()).contains(90.7)
        assertThat(missileTrackTupleResponse.launchLat()).contains(19.88550102)
        assertThat(missileTrackTupleResponse.launchLon()).contains(46.74596844)
        assertThat(missileTrackTupleResponse.launchTime())
            .contains(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
        assertThat(missileTrackTupleResponse.lostTrkInd()).contains(false)
        assertThat(missileTrackTupleResponse.maneuverEnd())
            .contains(OffsetDateTime.parse("2021-01-01T01:01:15.456789Z"))
        assertThat(missileTrackTupleResponse.maneuverStart())
            .contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(missileTrackTupleResponse.msgCreateDate())
            .contains(OffsetDateTime.parse("2024-04-25T08:17:01.346Z"))
        assertThat(missileTrackTupleResponse.msgSubType()).contains("Update")
        assertThat(missileTrackTupleResponse.msgType()).contains("MSG-TYPE")
        assertThat(missileTrackTupleResponse.mslStatus()).contains("AT LAUNCH")
        assertThat(missileTrackTupleResponse.muidSrc()).contains("MUID-SRC")
        assertThat(missileTrackTupleResponse.muidSrcTrk()).contains("MUID-SRC-ID")
        assertThat(missileTrackTupleResponse.name()).contains("TRACK-NAME")
        assertThat(missileTrackTupleResponse.objAct()).contains("HOLDING")
        assertThat(missileTrackTupleResponse.objIdent())
            .contains(MissileTrackTupleResponse.ObjIdent.FRIEND)
        assertThat(missileTrackTupleResponse.objPlat()).contains("WEAPON")
        assertThat(missileTrackTupleResponse.objType()).contains("Ballistic")
        assertThat(missileTrackTupleResponse.objTypeConf()).contains(90)
        assertThat(missileTrackTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(missileTrackTupleResponse.origNetwork()).contains("OPS1")
        assertThat(missileTrackTupleResponse.parentTrackId()).contains("102288")
        assertThat(missileTrackTupleResponse.polarSingLocLat()).contains(19.88550102)
        assertThat(missileTrackTupleResponse.polarSingLocLon()).contains(46.74596844)
        assertThat(missileTrackTupleResponse.senMode()).contains("OBSBO")
        assertThat(missileTrackTupleResponse.spaceAmp()).contains("NUCLEAR WARHEAD")
        assertThat(missileTrackTupleResponse.spaceAmpConf()).contains(6)
        assertThat(missileTrackTupleResponse.spaceSpecType()).contains("SS-21_MOD_2_CRBM")
        assertThat(missileTrackTupleResponse.trackId()).contains("102288")
        assertThat(missileTrackTupleResponse.trkConf()).contains(0.95)
        assertThat(missileTrackTupleResponse.trkQual()).contains(1)
        assertThat(missileTrackTupleResponse.vectors().getOrNull())
            .containsExactly(
                MissileTrackTupleResponse.Vector.builder()
                    .epoch(OffsetDateTime.parse("2024-03-30T15:02:39.346768Z"))
                    .accel(listOf(0.59236, -0.03537, 0.35675))
                    .confidence(100)
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
                    .course(7.3580153)
                    .cov(listOf(1.1, 2.2, 3.3))
                    .covReferenceFrame(MissileTrackTupleResponse.Vector.CovReferenceFrame.ECR_ECEF)
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
                    .timeSource("Sensor1")
                    .type("STATE")
                    .vectorAlt(25.0)
                    .vectorLat(45.0)
                    .vectorLon(150.0)
                    .vectorTrackId("102288")
                    .vel(listOf(-1.21981, -6.60208, -3.36515))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missileTrackTupleResponse =
            MissileTrackTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(MissileTrackTupleResponse.DataMode.TEST)
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
                .env(MissileTrackTupleResponse.Env.AIR)
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
                .objIdent(MissileTrackTupleResponse.ObjIdent.FRIEND)
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
                    MissileTrackTupleResponse.Vector.builder()
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
                            MissileTrackTupleResponse.Vector.CovReferenceFrame.ECR_ECEF
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
                        .timeSource("Sensor1")
                        .type("STATE")
                        .vectorAlt(25.0)
                        .vectorLat(45.0)
                        .vectorLon(150.0)
                        .vectorTrackId("102288")
                        .vel(listOf(-1.21981, -6.60208, -3.36515))
                        .build()
                )
                .build()

        val roundtrippedMissileTrackTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missileTrackTupleResponse),
                jacksonTypeRef<MissileTrackTupleResponse>(),
            )

        assertThat(roundtrippedMissileTrackTupleResponse).isEqualTo(missileTrackTupleResponse)
    }
}
