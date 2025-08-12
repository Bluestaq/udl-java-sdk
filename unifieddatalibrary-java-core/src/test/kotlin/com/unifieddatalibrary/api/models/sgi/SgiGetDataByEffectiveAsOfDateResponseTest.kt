// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sgi

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgiGetDataByEffectiveAsOfDateResponseTest {

    @Test
    fun create() {
      val sgiGetDataByEffectiveAsOfDateResponse = SgiGetDataByEffectiveAsOfDateResponse.builder()
          .classificationMarking("U")
          .dataMode(SgiGetDataByEffectiveAsOfDateResponse.DataMode.TEST)
          .effectiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .sgiDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .source("Bluestaq")
          .id("SGI-ID")
          .analyzerAttenuation(5.1)
          .ap(1.23)
          .apDuration(3)
          .coeffDegree(listOf(
            1,
            2,
            3,
          ))
          .coeffOrder(listOf(
            1,
            2,
            3,
          ))
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .ctce(listOf(
            1.23,
            342.3,
            1.32,
          ))
          .ctci(listOf(
            1.23,
            342.3,
            1.32,
          ))
          .dst(1.23)
          .dtc(1.23)
          .e10(1.23)
          .e54(1.23)
          .f10(1.23)
          .f10High(187.5)
          .f10Low(185.5)
          .f54(1.23)
          .f81(1.23)
          .frequencies(listOf(
            25.0,
            25.125,
            25.25,
            25.375,
            25.5,
            25.625,
            25.75,
            25.875,
          ))
          .gamma(25)
          .idSensor("57c96c97-e076-48af-a068-73ee2cb37e65")
          .kIndex(1)
          .kp(4.66)
          .kpDuration(3)
          .m10(1.23)
          .m54(1.23)
          .mode(1)
          .normFactor(2.12679e-7)
          .observedBaseline(listOf(
            15,
            32,
            25,
            134,
            0,
            6,
            19,
            8,
          ))
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origSensorId("ORIGSENSOR-ID")
          .powers(listOf(
            67.1,
            65.2,
            68.1,
            74.3,
            68.1,
            96.4,
            97.3,
            68.1,
          ))
          .precedence(SgiGetDataByEffectiveAsOfDateResponse.Precedence.R)
          .rawFileUri("rawFileURI")
          .rbDuration(24)
          .rbIndex(1.02947164506)
          .rbRegionCode(2)
          .s10(1.23)
          .s54(1.23)
          .state(SgiGetDataByEffectiveAsOfDateResponse.State.I)
          .stationName("Boulder")
          .stce(listOf(
            1.23,
            342.3,
            1.32,
          ))
          .stci(listOf(
            1.23,
            342.3,
            1.32,
          ))
          .sunspotNum(151.1)
          .sunspotNumHigh(152.1)
          .sunspotNumLow(150.1)
          .addTag("PROVIDER_TAG1")
          .addTag("PROVIDER_TAG2")
          .transactionId("TRANSACTION-ID")
          .type("JBH09")
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .y10(1.23)
          .y54(1.23)
          .build()

      assertThat(sgiGetDataByEffectiveAsOfDateResponse.classificationMarking()).isEqualTo("U")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.dataMode()).isEqualTo(SgiGetDataByEffectiveAsOfDateResponse.DataMode.TEST)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.effectiveDate()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.sgiDate()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.source()).isEqualTo("Bluestaq")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.id()).contains("SGI-ID")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.analyzerAttenuation()).contains(5.1)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.ap()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.apDuration()).contains(3)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.coeffDegree().getOrNull()).containsExactly(1, 2, 3)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.coeffOrder().getOrNull()).containsExactly(1, 2, 3)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.createdBy()).contains("some.user")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.ctce().getOrNull()).containsExactly(1.23, 342.3, 1.32)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.ctci().getOrNull()).containsExactly(1.23, 342.3, 1.32)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.dst()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.dtc()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.e10()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.e54()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.f10()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.f10High()).contains(187.5)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.f10Low()).contains(185.5)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.f54()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.f81()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.frequencies().getOrNull()).containsExactly(25.0, 25.125, 25.25, 25.375, 25.5, 25.625, 25.75, 25.875)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.gamma()).contains(25)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.idSensor()).contains("57c96c97-e076-48af-a068-73ee2cb37e65")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.kIndex()).contains(1)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.kp()).contains(4.66)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.kpDuration()).contains(3)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.m10()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.m54()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.mode()).contains(1)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.normFactor()).contains(2.12679e-7)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.observedBaseline().getOrNull()).containsExactly(15, 32, 25, 134, 0, 6, 19, 8)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.origNetwork()).contains("ORIG")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.origSensorId()).contains("ORIGSENSOR-ID")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.powers().getOrNull()).containsExactly(67.1, 65.2, 68.1, 74.3, 68.1, 96.4, 97.3, 68.1)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.precedence()).contains(SgiGetDataByEffectiveAsOfDateResponse.Precedence.R)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.rawFileUri()).contains("rawFileURI")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.rbDuration()).contains(24)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.rbIndex()).contains(1.02947164506)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.rbRegionCode()).contains(2)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.s10()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.s54()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.state()).contains(SgiGetDataByEffectiveAsOfDateResponse.State.I)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.stationName()).contains("Boulder")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.stce().getOrNull()).containsExactly(1.23, 342.3, 1.32)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.stci().getOrNull()).containsExactly(1.23, 342.3, 1.32)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.sunspotNum()).contains(151.1)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.sunspotNumHigh()).contains(152.1)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.sunspotNumLow()).contains(150.1)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.tags().getOrNull()).containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.transactionId()).contains("TRANSACTION-ID")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.type()).contains("JBH09")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.updatedBy()).contains("some.user")
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.y10()).contains(1.23)
      assertThat(sgiGetDataByEffectiveAsOfDateResponse.y54()).contains(1.23)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sgiGetDataByEffectiveAsOfDateResponse = SgiGetDataByEffectiveAsOfDateResponse.builder()
          .classificationMarking("U")
          .dataMode(SgiGetDataByEffectiveAsOfDateResponse.DataMode.TEST)
          .effectiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .sgiDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .source("Bluestaq")
          .id("SGI-ID")
          .analyzerAttenuation(5.1)
          .ap(1.23)
          .apDuration(3)
          .coeffDegree(listOf(
            1,
            2,
            3,
          ))
          .coeffOrder(listOf(
            1,
            2,
            3,
          ))
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .ctce(listOf(
            1.23,
            342.3,
            1.32,
          ))
          .ctci(listOf(
            1.23,
            342.3,
            1.32,
          ))
          .dst(1.23)
          .dtc(1.23)
          .e10(1.23)
          .e54(1.23)
          .f10(1.23)
          .f10High(187.5)
          .f10Low(185.5)
          .f54(1.23)
          .f81(1.23)
          .frequencies(listOf(
            25.0,
            25.125,
            25.25,
            25.375,
            25.5,
            25.625,
            25.75,
            25.875,
          ))
          .gamma(25)
          .idSensor("57c96c97-e076-48af-a068-73ee2cb37e65")
          .kIndex(1)
          .kp(4.66)
          .kpDuration(3)
          .m10(1.23)
          .m54(1.23)
          .mode(1)
          .normFactor(2.12679e-7)
          .observedBaseline(listOf(
            15,
            32,
            25,
            134,
            0,
            6,
            19,
            8,
          ))
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origSensorId("ORIGSENSOR-ID")
          .powers(listOf(
            67.1,
            65.2,
            68.1,
            74.3,
            68.1,
            96.4,
            97.3,
            68.1,
          ))
          .precedence(SgiGetDataByEffectiveAsOfDateResponse.Precedence.R)
          .rawFileUri("rawFileURI")
          .rbDuration(24)
          .rbIndex(1.02947164506)
          .rbRegionCode(2)
          .s10(1.23)
          .s54(1.23)
          .state(SgiGetDataByEffectiveAsOfDateResponse.State.I)
          .stationName("Boulder")
          .stce(listOf(
            1.23,
            342.3,
            1.32,
          ))
          .stci(listOf(
            1.23,
            342.3,
            1.32,
          ))
          .sunspotNum(151.1)
          .sunspotNumHigh(152.1)
          .sunspotNumLow(150.1)
          .addTag("PROVIDER_TAG1")
          .addTag("PROVIDER_TAG2")
          .transactionId("TRANSACTION-ID")
          .type("JBH09")
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .y10(1.23)
          .y54(1.23)
          .build()

      val roundtrippedSgiGetDataByEffectiveAsOfDateResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(sgiGetDataByEffectiveAsOfDateResponse), jacksonTypeRef<SgiGetDataByEffectiveAsOfDateResponse>())

      assertThat(roundtrippedSgiGetDataByEffectiveAsOfDateResponse).isEqualTo(sgiGetDataByEffectiveAsOfDateResponse)
    }
}
