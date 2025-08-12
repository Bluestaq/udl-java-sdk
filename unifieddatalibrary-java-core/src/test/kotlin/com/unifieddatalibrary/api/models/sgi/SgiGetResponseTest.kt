// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sgi

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.sgi.SgiGetResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgiGetResponseTest {

    @Test
    fun create() {
      val sgiGetResponse = SgiGetResponse.builder()
          .classificationMarking("U")
          .dataMode(SgiGetResponse.DataMode.TEST)
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
          .precedence(SgiGetResponse.Precedence.R)
          .rawFileUri("rawFileURI")
          .rbDuration(24)
          .rbIndex(1.02947164506)
          .rbRegionCode(2)
          .s10(1.23)
          .s54(1.23)
          .state(SgiGetResponse.State.I)
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

      assertThat(sgiGetResponse.classificationMarking()).isEqualTo("U")
      assertThat(sgiGetResponse.dataMode()).isEqualTo(SgiGetResponse.DataMode.TEST)
      assertThat(sgiGetResponse.effectiveDate()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sgiGetResponse.sgiDate()).isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sgiGetResponse.source()).isEqualTo("Bluestaq")
      assertThat(sgiGetResponse.id()).contains("SGI-ID")
      assertThat(sgiGetResponse.analyzerAttenuation()).contains(5.1)
      assertThat(sgiGetResponse.ap()).contains(1.23)
      assertThat(sgiGetResponse.apDuration()).contains(3)
      assertThat(sgiGetResponse.coeffDegree().getOrNull()).containsExactly(1, 2, 3)
      assertThat(sgiGetResponse.coeffOrder().getOrNull()).containsExactly(1, 2, 3)
      assertThat(sgiGetResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sgiGetResponse.createdBy()).contains("some.user")
      assertThat(sgiGetResponse.ctce().getOrNull()).containsExactly(1.23, 342.3, 1.32)
      assertThat(sgiGetResponse.ctci().getOrNull()).containsExactly(1.23, 342.3, 1.32)
      assertThat(sgiGetResponse.dst()).contains(1.23)
      assertThat(sgiGetResponse.dtc()).contains(1.23)
      assertThat(sgiGetResponse.e10()).contains(1.23)
      assertThat(sgiGetResponse.e54()).contains(1.23)
      assertThat(sgiGetResponse.f10()).contains(1.23)
      assertThat(sgiGetResponse.f10High()).contains(187.5)
      assertThat(sgiGetResponse.f10Low()).contains(185.5)
      assertThat(sgiGetResponse.f54()).contains(1.23)
      assertThat(sgiGetResponse.f81()).contains(1.23)
      assertThat(sgiGetResponse.frequencies().getOrNull()).containsExactly(25.0, 25.125, 25.25, 25.375, 25.5, 25.625, 25.75, 25.875)
      assertThat(sgiGetResponse.gamma()).contains(25)
      assertThat(sgiGetResponse.idSensor()).contains("57c96c97-e076-48af-a068-73ee2cb37e65")
      assertThat(sgiGetResponse.kIndex()).contains(1)
      assertThat(sgiGetResponse.kp()).contains(4.66)
      assertThat(sgiGetResponse.kpDuration()).contains(3)
      assertThat(sgiGetResponse.m10()).contains(1.23)
      assertThat(sgiGetResponse.m54()).contains(1.23)
      assertThat(sgiGetResponse.mode()).contains(1)
      assertThat(sgiGetResponse.normFactor()).contains(2.12679e-7)
      assertThat(sgiGetResponse.observedBaseline().getOrNull()).containsExactly(15, 32, 25, 134, 0, 6, 19, 8)
      assertThat(sgiGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(sgiGetResponse.origNetwork()).contains("ORIG")
      assertThat(sgiGetResponse.origSensorId()).contains("ORIGSENSOR-ID")
      assertThat(sgiGetResponse.powers().getOrNull()).containsExactly(67.1, 65.2, 68.1, 74.3, 68.1, 96.4, 97.3, 68.1)
      assertThat(sgiGetResponse.precedence()).contains(SgiGetResponse.Precedence.R)
      assertThat(sgiGetResponse.rawFileUri()).contains("rawFileURI")
      assertThat(sgiGetResponse.rbDuration()).contains(24)
      assertThat(sgiGetResponse.rbIndex()).contains(1.02947164506)
      assertThat(sgiGetResponse.rbRegionCode()).contains(2)
      assertThat(sgiGetResponse.s10()).contains(1.23)
      assertThat(sgiGetResponse.s54()).contains(1.23)
      assertThat(sgiGetResponse.state()).contains(SgiGetResponse.State.I)
      assertThat(sgiGetResponse.stationName()).contains("Boulder")
      assertThat(sgiGetResponse.stce().getOrNull()).containsExactly(1.23, 342.3, 1.32)
      assertThat(sgiGetResponse.stci().getOrNull()).containsExactly(1.23, 342.3, 1.32)
      assertThat(sgiGetResponse.sunspotNum()).contains(151.1)
      assertThat(sgiGetResponse.sunspotNumHigh()).contains(152.1)
      assertThat(sgiGetResponse.sunspotNumLow()).contains(150.1)
      assertThat(sgiGetResponse.tags().getOrNull()).containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
      assertThat(sgiGetResponse.transactionId()).contains("TRANSACTION-ID")
      assertThat(sgiGetResponse.type()).contains("JBH09")
      assertThat(sgiGetResponse.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(sgiGetResponse.updatedBy()).contains("some.user")
      assertThat(sgiGetResponse.y10()).contains(1.23)
      assertThat(sgiGetResponse.y54()).contains(1.23)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val sgiGetResponse = SgiGetResponse.builder()
          .classificationMarking("U")
          .dataMode(SgiGetResponse.DataMode.TEST)
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
          .precedence(SgiGetResponse.Precedence.R)
          .rawFileUri("rawFileURI")
          .rbDuration(24)
          .rbIndex(1.02947164506)
          .rbRegionCode(2)
          .s10(1.23)
          .s54(1.23)
          .state(SgiGetResponse.State.I)
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

      val roundtrippedSgiGetResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(sgiGetResponse), jacksonTypeRef<SgiGetResponse>())

      assertThat(roundtrippedSgiGetResponse).isEqualTo(sgiGetResponse)
    }
}
