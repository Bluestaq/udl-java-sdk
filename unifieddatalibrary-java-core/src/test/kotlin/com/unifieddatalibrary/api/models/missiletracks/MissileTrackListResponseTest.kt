// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.missiletracks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.missiletracks.MissileTrackListResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissileTrackListResponseTest {

    @Test
    fun create() {
      val missileTrackListResponse = MissileTrackListResponse.builder()
          .classificationMarking("U")
          .dataMode(MissileTrackListResponse.DataMode.TEST)
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
          .env(MissileTrackListResponse.Env.AIR)
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
          .objIdent(MissileTrackListResponse.ObjIdent.FRIEND)
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
          .addVector(MissileTrackListResponse.Vector.builder()
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
              .covReferenceFrame(MissileTrackListResponse.Vector.CovReferenceFrame.ECEF)
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

      assertThat(missileTrackListResponse.classificationMarking()).isEqualTo("U")
      assertThat(missileTrackListResponse.dataMode()).isEqualTo(MissileTrackListResponse.DataMode.TEST)
      assertThat(missileTrackListResponse.source()).isEqualTo("Bluestaq")
      assertThat(missileTrackListResponse.ts()).isEqualTo(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
      assertThat(missileTrackListResponse.id()).contains("MissileTrack_ID")
      assertThat(missileTrackListResponse.acftSubType()).contains("SLBM")
      assertThat(missileTrackListResponse.alert()).contains("HIT")
      assertThat(missileTrackListResponse.angElev()).contains(15.2)
      assertThat(missileTrackListResponse.aouRptData().getOrNull()).containsExactly(34.3, 26.5, 1.2)
      assertThat(missileTrackListResponse.aouRptType()).contains("ELLIPSE")
      assertThat(missileTrackListResponse.azCorr()).contains(12.876)
      assertThat(missileTrackListResponse.boosting()).contains(true)
      assertThat(missileTrackListResponse.burnoutAlt()).contains(30567.452)
      assertThat(missileTrackListResponse.callSign()).contains("Charlie")
      assertThat(missileTrackListResponse.containment()).contains(90.64)
      assertThat(missileTrackListResponse.createdAt()).contains(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
      assertThat(missileTrackListResponse.createdBy()).contains("some.user")
      assertThat(missileTrackListResponse.dropPtInd()).contains(true)
      assertThat(missileTrackListResponse.emgInd()).contains(true)
      assertThat(missileTrackListResponse.env()).contains(MissileTrackListResponse.Env.AIR)
      assertThat(missileTrackListResponse.impactAouData().getOrNull()).containsExactly(34.3, 26.5, 1.2)
      assertThat(missileTrackListResponse.impactAouType()).contains("ELLIPSE")
      assertThat(missileTrackListResponse.impactLat()).contains(19.88550102)
      assertThat(missileTrackListResponse.impactLon()).contains(46.74596844)
      assertThat(missileTrackListResponse.impactTime()).contains(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
      assertThat(missileTrackListResponse.infoSource()).contains("S1")
      assertThat(missileTrackListResponse.launchAouData().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(missileTrackListResponse.launchAouType()).contains("ELLIPSE")
      assertThat(missileTrackListResponse.launchLat()).contains(19.88550102)
      assertThat(missileTrackListResponse.launchLon()).contains(46.74596844)
      assertThat(missileTrackListResponse.launchTime()).contains(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
      assertThat(missileTrackListResponse.lostTrkInd()).contains(false)
      assertThat(missileTrackListResponse.msgCreateDate()).contains(OffsetDateTime.parse("2024-04-25T08:17:01.346Z"))
      assertThat(missileTrackListResponse.msgSubType()).contains("Update")
      assertThat(missileTrackListResponse.msgType()).contains("MSG-TYPE")
      assertThat(missileTrackListResponse.mslStatus()).contains("AT LAUNCH")
      assertThat(missileTrackListResponse.muidSrc()).contains("MUID-SRC")
      assertThat(missileTrackListResponse.muidSrcTrk()).contains("MUID-SRC-ID")
      assertThat(missileTrackListResponse.name()).contains("TRACK-NAME")
      assertThat(missileTrackListResponse.objAct()).contains("HOLDING")
      assertThat(missileTrackListResponse.objIdent()).contains(MissileTrackListResponse.ObjIdent.FRIEND)
      assertThat(missileTrackListResponse.objPlat()).contains("WEAPON")
      assertThat(missileTrackListResponse.objType()).contains("Ballistic")
      assertThat(missileTrackListResponse.objTypeConf()).contains(90)
      assertThat(missileTrackListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(missileTrackListResponse.origNetwork()).contains("ORIG")
      assertThat(missileTrackListResponse.parentTrackId()).contains("102288")
      assertThat(missileTrackListResponse.polarSingLocLat()).contains(19.88550102)
      assertThat(missileTrackListResponse.polarSingLocLon()).contains(46.74596844)
      assertThat(missileTrackListResponse.senMode()).contains("OBSBO")
      assertThat(missileTrackListResponse.spaceAmp()).contains("NUCLEAR WARHEAD")
      assertThat(missileTrackListResponse.spaceAmpConf()).contains(6)
      assertThat(missileTrackListResponse.spaceSpecType()).contains("SS-21_MOD_2_CRBM")
      assertThat(missileTrackListResponse.trackId()).contains("102288")
      assertThat(missileTrackListResponse.trkConf()).contains(0.95)
      assertThat(missileTrackListResponse.trkQual()).contains(1)
      assertThat(missileTrackListResponse.vectors().getOrNull()).containsExactly(MissileTrackListResponse.Vector.builder()
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
          .covReferenceFrame(MissileTrackListResponse.Vector.CovReferenceFrame.ECEF)
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
      val missileTrackListResponse = MissileTrackListResponse.builder()
          .classificationMarking("U")
          .dataMode(MissileTrackListResponse.DataMode.TEST)
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
          .env(MissileTrackListResponse.Env.AIR)
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
          .objIdent(MissileTrackListResponse.ObjIdent.FRIEND)
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
          .addVector(MissileTrackListResponse.Vector.builder()
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
              .covReferenceFrame(MissileTrackListResponse.Vector.CovReferenceFrame.ECEF)
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

      val roundtrippedMissileTrackListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(missileTrackListResponse), jacksonTypeRef<MissileTrackListResponse>())

      assertThat(roundtrippedMissileTrackListResponse).isEqualTo(missileTrackListResponse)
    }
}
