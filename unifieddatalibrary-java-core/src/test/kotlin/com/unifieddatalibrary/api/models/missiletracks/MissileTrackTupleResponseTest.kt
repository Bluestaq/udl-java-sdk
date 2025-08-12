// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missiletracks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackTupleResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissileTrackTupleResponseTest {

    @Test
    fun create() {
      val missileTrackTupleResponse = MissileTrackTupleResponse.builder()
          .classificationMarking("U")
          .dataMode(MissileTrackTupleResponse.DataMode.TEST)
          .source("Bluestaq")
          .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
          .id("MissileTrack_ID")
          .acftSubType("SLBM")
          .alert("HIT")
          .angElev(15.2)
          .aouRptData(listOf(
            34.3,
            26.5,
            1.2,
          ))
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
          .env(MissileTrackTupleResponse.Env.AIR)
          .impactAouData(listOf(
            34.3,
            26.5,
            1.2,
          ))
          .impactAouType("ELLIPSE")
          .impactLat(19.88550102)
          .impactLon(46.74596844)
          .impactTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
          .infoSource("S1")
          .launchAouData(listOf(
            1.23,
            2.34,
            3.45,
          ))
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
          .objIdent(MissileTrackTupleResponse.ObjIdent.FRIEND)
          .objPlat("WEAPON")
          .objType("Ballistic")
          .objTypeConf(90)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
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
          .addVector(MissileTrackTupleResponse.Vector.builder()
              .epoch(OffsetDateTime.parse("2024-03-30T15:02:39.346768Z"))
              .accel(listOf(
                0.59236,
                -0.03537,
                0.35675,
              ))
              .confidence(100)
              .course(7.3580153)
              .cov(listOf(
                1.1,
                2.2,
                3.3,
              ))
              .covReferenceFrame(MissileTrackTupleResponse.Vector.CovReferenceFrame.ECEF)
              .flightAz(45.23)
              .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
              .object_("TARGET")
              .origSensorId("ORIGSENSOR-ID")
              .pos(listOf(
                -1456.91592,
                -2883.54041,
                6165.55186,
              ))
              .quat(listOf(
                0.03,
                0.02,
                0.01,
                0.012,
              ))
              .referenceFrame("ECEF")
              .spd(15.03443)
              .status("INITIAL")
              .timeSource("Sensor 1")
              .type("STATE")
              .vectorAlt(25.0)
              .vectorLat(45.0)
              .vectorLon(150.0)
              .vel(listOf(
                -1.21981,
                -6.60208,
                -3.36515,
              ))
              .build())
          .build()

      assertThat(missileTrackTupleResponse.classificationMarking()).isEqualTo("U")
      assertThat(missileTrackTupleResponse.dataMode()).isEqualTo(MissileTrackTupleResponse.DataMode.TEST)
      assertThat(missileTrackTupleResponse.source()).isEqualTo("Bluestaq")
      assertThat(missileTrackTupleResponse.ts()).isEqualTo(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
      assertThat(missileTrackTupleResponse.id()).contains("MissileTrack_ID")
      assertThat(missileTrackTupleResponse.acftSubType()).contains("SLBM")
      assertThat(missileTrackTupleResponse.alert()).contains("HIT")
      assertThat(missileTrackTupleResponse.angElev()).contains(15.2)
      assertThat(missileTrackTupleResponse.aouRptData().getOrNull()).containsExactly(34.3, 26.5, 1.2)
      assertThat(missileTrackTupleResponse.aouRptType()).contains("ELLIPSE")
      assertThat(missileTrackTupleResponse.azCorr()).contains(12.876)
      assertThat(missileTrackTupleResponse.boosting()).contains(true)
      assertThat(missileTrackTupleResponse.burnoutAlt()).contains(30567.452)
      assertThat(missileTrackTupleResponse.callSign()).contains("Charlie")
      assertThat(missileTrackTupleResponse.containment()).contains(90.64)
      assertThat(missileTrackTupleResponse.createdAt()).contains(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
      assertThat(missileTrackTupleResponse.createdBy()).contains("some.user")
      assertThat(missileTrackTupleResponse.dropPtInd()).contains(true)
      assertThat(missileTrackTupleResponse.emgInd()).contains(true)
      assertThat(missileTrackTupleResponse.env()).contains(MissileTrackTupleResponse.Env.AIR)
      assertThat(missileTrackTupleResponse.impactAouData().getOrNull()).containsExactly(34.3, 26.5, 1.2)
      assertThat(missileTrackTupleResponse.impactAouType()).contains("ELLIPSE")
      assertThat(missileTrackTupleResponse.impactLat()).contains(19.88550102)
      assertThat(missileTrackTupleResponse.impactLon()).contains(46.74596844)
      assertThat(missileTrackTupleResponse.impactTime()).contains(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
      assertThat(missileTrackTupleResponse.infoSource()).contains("S1")
      assertThat(missileTrackTupleResponse.launchAouData().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(missileTrackTupleResponse.launchAouType()).contains("ELLIPSE")
      assertThat(missileTrackTupleResponse.launchLat()).contains(19.88550102)
      assertThat(missileTrackTupleResponse.launchLon()).contains(46.74596844)
      assertThat(missileTrackTupleResponse.launchTime()).contains(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
      assertThat(missileTrackTupleResponse.lostTrkInd()).contains(false)
      assertThat(missileTrackTupleResponse.msgCreateDate()).contains(OffsetDateTime.parse("2024-04-25T08:17:01.346Z"))
      assertThat(missileTrackTupleResponse.msgSubType()).contains("Update")
      assertThat(missileTrackTupleResponse.msgType()).contains("MSG-TYPE")
      assertThat(missileTrackTupleResponse.mslStatus()).contains("AT LAUNCH")
      assertThat(missileTrackTupleResponse.muidSrc()).contains("MUID-SRC")
      assertThat(missileTrackTupleResponse.muidSrcTrk()).contains("MUID-SRC-ID")
      assertThat(missileTrackTupleResponse.name()).contains("TRACK-NAME")
      assertThat(missileTrackTupleResponse.objAct()).contains("HOLDING")
      assertThat(missileTrackTupleResponse.objIdent()).contains(MissileTrackTupleResponse.ObjIdent.FRIEND)
      assertThat(missileTrackTupleResponse.objPlat()).contains("WEAPON")
      assertThat(missileTrackTupleResponse.objType()).contains("Ballistic")
      assertThat(missileTrackTupleResponse.objTypeConf()).contains(90)
      assertThat(missileTrackTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(missileTrackTupleResponse.origNetwork()).contains("ORIG")
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
      assertThat(missileTrackTupleResponse.vectors().getOrNull()).containsExactly(MissileTrackTupleResponse.Vector.builder()
          .epoch(OffsetDateTime.parse("2024-03-30T15:02:39.346768Z"))
          .accel(listOf(
            0.59236,
            -0.03537,
            0.35675,
          ))
          .confidence(100)
          .course(7.3580153)
          .cov(listOf(
            1.1,
            2.2,
            3.3,
          ))
          .covReferenceFrame(MissileTrackTupleResponse.Vector.CovReferenceFrame.ECEF)
          .flightAz(45.23)
          .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
          .object_("TARGET")
          .origSensorId("ORIGSENSOR-ID")
          .pos(listOf(
            -1456.91592,
            -2883.54041,
            6165.55186,
          ))
          .quat(listOf(
            0.03,
            0.02,
            0.01,
            0.012,
          ))
          .referenceFrame("ECEF")
          .spd(15.03443)
          .status("INITIAL")
          .timeSource("Sensor 1")
          .type("STATE")
          .vectorAlt(25.0)
          .vectorLat(45.0)
          .vectorLon(150.0)
          .vel(listOf(
            -1.21981,
            -6.60208,
            -3.36515,
          ))
          .build())
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val missileTrackTupleResponse = MissileTrackTupleResponse.builder()
          .classificationMarking("U")
          .dataMode(MissileTrackTupleResponse.DataMode.TEST)
          .source("Bluestaq")
          .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
          .id("MissileTrack_ID")
          .acftSubType("SLBM")
          .alert("HIT")
          .angElev(15.2)
          .aouRptData(listOf(
            34.3,
            26.5,
            1.2,
          ))
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
          .env(MissileTrackTupleResponse.Env.AIR)
          .impactAouData(listOf(
            34.3,
            26.5,
            1.2,
          ))
          .impactAouType("ELLIPSE")
          .impactLat(19.88550102)
          .impactLon(46.74596844)
          .impactTime(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
          .infoSource("S1")
          .launchAouData(listOf(
            1.23,
            2.34,
            3.45,
          ))
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
          .objIdent(MissileTrackTupleResponse.ObjIdent.FRIEND)
          .objPlat("WEAPON")
          .objType("Ballistic")
          .objTypeConf(90)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
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
          .addVector(MissileTrackTupleResponse.Vector.builder()
              .epoch(OffsetDateTime.parse("2024-03-30T15:02:39.346768Z"))
              .accel(listOf(
                0.59236,
                -0.03537,
                0.35675,
              ))
              .confidence(100)
              .course(7.3580153)
              .cov(listOf(
                1.1,
                2.2,
                3.3,
              ))
              .covReferenceFrame(MissileTrackTupleResponse.Vector.CovReferenceFrame.ECEF)
              .flightAz(45.23)
              .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
              .object_("TARGET")
              .origSensorId("ORIGSENSOR-ID")
              .pos(listOf(
                -1456.91592,
                -2883.54041,
                6165.55186,
              ))
              .quat(listOf(
                0.03,
                0.02,
                0.01,
                0.012,
              ))
              .referenceFrame("ECEF")
              .spd(15.03443)
              .status("INITIAL")
              .timeSource("Sensor 1")
              .type("STATE")
              .vectorAlt(25.0)
              .vectorLat(45.0)
              .vectorLon(150.0)
              .vel(listOf(
                -1.21981,
                -6.60208,
                -3.36515,
              ))
              .build())
          .build()

      val roundtrippedMissileTrackTupleResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(missileTrackTupleResponse), jacksonTypeRef<MissileTrackTupleResponse>())

      assertThat(roundtrippedMissileTrackTupleResponse).isEqualTo(missileTrackTupleResponse)
    }
}
