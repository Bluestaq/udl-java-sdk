// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.track

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.track.TrackListResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackListResponseTest {

    @Test
    fun create() {
      val trackListResponse = TrackListResponse.builder()
          .classificationMarking("U")
          .dataMode(TrackListResponse.DataMode.TEST)
          .source("Bluestaq")
          .ts(OffsetDateTime.parse("2021-06-07T14:17:39.653043Z"))
          .id("TRACK-ID")
          .alt(1.23)
          .asset("asset")
          .assetNat("US")
          .attitude(listOf(
            10.0,
            0.1,
            1.0,
          ))
          .attitudeRate(listOf(
            0.0003,
            1e-7,
            0.00003,
          ))
          .callSign("callSign")
          .cntct("Contact Info")
          .course(88.37)
          .cov(listOf(
            1.1,
            2.2,
            3.3,
          ))
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .ecefAcc(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .ecefPos(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .ecefVel(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .eNuAcc(listOf(
            0.0003,
            0.014,
            0.0003,
          ))
          .eNuPos(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .eNuVel(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .env("LAND")
          .envConf(1.23)
          .errEllp(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .hdng(19.7)
          .identAmp("ZOMBIE")
          .identCred(0)
          .identRel(0)
          .jSeries("J12.5")
          .lat(1.23)
          .lcAcc(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lco(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lcPos(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lcs(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lcVel(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lon(1.23)
          .m1(1234)
          .m1v(1)
          .m2(1234)
          .m2v(1)
          .m3a(2636)
          .m3av(1)
          .modType("MASINT")
          .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .msnId("msnId")
          .multiSource(true)
          .objAct("HOLDING")
          .objId("objId")
          .objIdent("FRIEND")
          .objNat("NATO")
          .objPlat("COMBAT_VEHICLE")
          .objSpec("LIGHT_TANK")
          .objType("WATERCRAFT")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .sen("sen")
          .senQual("senQual")
          .sourceDl("AXE")
          .spd(1.23)
          .addSrcId("f7c70cc8-f9b7-4467-b4ad-3904e360e842")
          .addSrcId("1da3fab000014e3133709830937387405")
          .addSrcTyp("MTI")
          .addSrcTyp("POI")
          .strength(14)
          .addTag("TAG1")
          .addTag("TAG2")
          .trkConf(1.23)
          .trkId("trkId")
          .trkItmId("trkItmId")
          .trkNum("trkNum")
          .trkPtType("MEASURED")
          .trkQual(0)
          .trkStat("INITIATING")
          .build()

      assertThat(trackListResponse.classificationMarking()).isEqualTo("U")
      assertThat(trackListResponse.dataMode()).isEqualTo(TrackListResponse.DataMode.TEST)
      assertThat(trackListResponse.source()).isEqualTo("Bluestaq")
      assertThat(trackListResponse.ts()).isEqualTo(OffsetDateTime.parse("2021-06-07T14:17:39.653043Z"))
      assertThat(trackListResponse.id()).contains("TRACK-ID")
      assertThat(trackListResponse.alt()).contains(1.23)
      assertThat(trackListResponse.asset()).contains("asset")
      assertThat(trackListResponse.assetNat()).contains("US")
      assertThat(trackListResponse.attitude().getOrNull()).containsExactly(10.0, 0.1, 1.0)
      assertThat(trackListResponse.attitudeRate().getOrNull()).containsExactly(0.0003, 1e-7, 0.00003)
      assertThat(trackListResponse.callSign()).contains("callSign")
      assertThat(trackListResponse.cntct()).contains("Contact Info")
      assertThat(trackListResponse.course()).contains(88.37)
      assertThat(trackListResponse.cov().getOrNull()).containsExactly(1.1, 2.2, 3.3)
      assertThat(trackListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(trackListResponse.createdBy()).contains("some.user")
      assertThat(trackListResponse.ecefAcc().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.ecefPos().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.ecefVel().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.eNuAcc().getOrNull()).containsExactly(0.0003, 0.014, 0.0003)
      assertThat(trackListResponse.eNuPos().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.eNuVel().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.env()).contains("LAND")
      assertThat(trackListResponse.envConf()).contains(1.23)
      assertThat(trackListResponse.errEllp().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.hdng()).contains(19.7)
      assertThat(trackListResponse.identAmp()).contains("ZOMBIE")
      assertThat(trackListResponse.identCred()).contains(0)
      assertThat(trackListResponse.identRel()).contains(0)
      assertThat(trackListResponse.jSeries()).contains("J12.5")
      assertThat(trackListResponse.lat()).contains(1.23)
      assertThat(trackListResponse.lcAcc().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.lco().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.lcPos().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.lcs().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.lcVel().getOrNull()).containsExactly(1.23, 2.34, 3.45)
      assertThat(trackListResponse.lon()).contains(1.23)
      assertThat(trackListResponse.m1()).contains(1234)
      assertThat(trackListResponse.m1v()).contains(1)
      assertThat(trackListResponse.m2()).contains(1234)
      assertThat(trackListResponse.m2v()).contains(1)
      assertThat(trackListResponse.m3a()).contains(2636)
      assertThat(trackListResponse.m3av()).contains(1)
      assertThat(trackListResponse.modType()).contains("MASINT")
      assertThat(trackListResponse.msgTs()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(trackListResponse.msnId()).contains("msnId")
      assertThat(trackListResponse.multiSource()).contains(true)
      assertThat(trackListResponse.objAct()).contains("HOLDING")
      assertThat(trackListResponse.objId()).contains("objId")
      assertThat(trackListResponse.objIdent()).contains("FRIEND")
      assertThat(trackListResponse.objNat()).contains("NATO")
      assertThat(trackListResponse.objPlat()).contains("COMBAT_VEHICLE")
      assertThat(trackListResponse.objSpec()).contains("LIGHT_TANK")
      assertThat(trackListResponse.objType()).contains("WATERCRAFT")
      assertThat(trackListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(trackListResponse.origNetwork()).contains("ORIG")
      assertThat(trackListResponse.sen()).contains("sen")
      assertThat(trackListResponse.senQual()).contains("senQual")
      assertThat(trackListResponse.sourceDl()).contains("AXE")
      assertThat(trackListResponse.spd()).contains(1.23)
      assertThat(trackListResponse.srcIds().getOrNull()).containsExactly("f7c70cc8-f9b7-4467-b4ad-3904e360e842", "1da3fab000014e3133709830937387405")
      assertThat(trackListResponse.srcTyps().getOrNull()).containsExactly("MTI", "POI")
      assertThat(trackListResponse.strength()).contains(14)
      assertThat(trackListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
      assertThat(trackListResponse.trkConf()).contains(1.23)
      assertThat(trackListResponse.trkId()).contains("trkId")
      assertThat(trackListResponse.trkItmId()).contains("trkItmId")
      assertThat(trackListResponse.trkNum()).contains("trkNum")
      assertThat(trackListResponse.trkPtType()).contains("MEASURED")
      assertThat(trackListResponse.trkQual()).contains(0)
      assertThat(trackListResponse.trkStat()).contains("INITIATING")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val trackListResponse = TrackListResponse.builder()
          .classificationMarking("U")
          .dataMode(TrackListResponse.DataMode.TEST)
          .source("Bluestaq")
          .ts(OffsetDateTime.parse("2021-06-07T14:17:39.653043Z"))
          .id("TRACK-ID")
          .alt(1.23)
          .asset("asset")
          .assetNat("US")
          .attitude(listOf(
            10.0,
            0.1,
            1.0,
          ))
          .attitudeRate(listOf(
            0.0003,
            1e-7,
            0.00003,
          ))
          .callSign("callSign")
          .cntct("Contact Info")
          .course(88.37)
          .cov(listOf(
            1.1,
            2.2,
            3.3,
          ))
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .ecefAcc(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .ecefPos(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .ecefVel(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .eNuAcc(listOf(
            0.0003,
            0.014,
            0.0003,
          ))
          .eNuPos(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .eNuVel(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .env("LAND")
          .envConf(1.23)
          .errEllp(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .hdng(19.7)
          .identAmp("ZOMBIE")
          .identCred(0)
          .identRel(0)
          .jSeries("J12.5")
          .lat(1.23)
          .lcAcc(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lco(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lcPos(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lcs(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lcVel(listOf(
            1.23,
            2.34,
            3.45,
          ))
          .lon(1.23)
          .m1(1234)
          .m1v(1)
          .m2(1234)
          .m2v(1)
          .m3a(2636)
          .m3av(1)
          .modType("MASINT")
          .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .msnId("msnId")
          .multiSource(true)
          .objAct("HOLDING")
          .objId("objId")
          .objIdent("FRIEND")
          .objNat("NATO")
          .objPlat("COMBAT_VEHICLE")
          .objSpec("LIGHT_TANK")
          .objType("WATERCRAFT")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .sen("sen")
          .senQual("senQual")
          .sourceDl("AXE")
          .spd(1.23)
          .addSrcId("f7c70cc8-f9b7-4467-b4ad-3904e360e842")
          .addSrcId("1da3fab000014e3133709830937387405")
          .addSrcTyp("MTI")
          .addSrcTyp("POI")
          .strength(14)
          .addTag("TAG1")
          .addTag("TAG2")
          .trkConf(1.23)
          .trkId("trkId")
          .trkItmId("trkItmId")
          .trkNum("trkNum")
          .trkPtType("MEASURED")
          .trkQual(0)
          .trkStat("INITIATING")
          .build()

      val roundtrippedTrackListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(trackListResponse), jacksonTypeRef<TrackListResponse>())

      assertThat(roundtrippedTrackListResponse).isEqualTo(trackListResponse)
    }
}
