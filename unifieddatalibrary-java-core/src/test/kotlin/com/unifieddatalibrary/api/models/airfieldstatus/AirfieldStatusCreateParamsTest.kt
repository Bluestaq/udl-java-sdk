// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldstatus

import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldStatusCreateParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldStatusCreateParamsTest {

    @Test
    fun create() {
      AirfieldStatusCreateParams.builder()
          .classificationMarking("U")
          .dataMode(AirfieldStatusCreateParams.DataMode.TEST)
          .idAirfield("3136498f-2969-3535-1432-e984b2e2e686")
          .source("Bluestaq")
          .id("be831d39-1822-da9f-7ace-6cc5643397dc")
          .altAirfieldId("AIRFIELD-ID")
          .approvedBy("John Smith")
          .approvedDate(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
          .arffCat("FAA-A")
          .cargoMog(8)
          .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .fleetServiceMog(4)
          .fuelMog(9)
          .fuelQtys(listOf(
            263083.6,
            286674.9,
            18143.69,
          ))
          .fuelTypes(listOf(
            "JP-8",
            "Jet A",
            "AVGAS",
          ))
          .gseTime(10)
          .medCap("Large Field Hospital")
          .message("Status message about the airfield.")
          .mheQtys(listOf(
            1,
            3,
            1,
          ))
          .mheTypes(listOf(
            "30k",
            "AT",
            "60k",
          ))
          .mxMog(3)
          .narrowParkingMog(5)
          .narrowWorkingMog(4)
          .numCog(2)
          .operatingMog(4)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .passengerServiceMog(5)
          .priFreq(123.45)
          .priRwyNum("35R")
          .reviewedBy("Jane Doe")
          .reviewedDate(OffsetDateTime.parse("2024-01-01T00:00:00.123Z"))
          .rwyCondReading(23)
          .rwyFrictionFactor(10)
          .addRwyMarking("Aiming Point")
          .addRwyMarking("Threshold")
          .slotTypesReq(listOf(
            "PARKING",
            "WORKING",
            "LANDING",
          ))
          .sourceDl("AXE")
          .surveyDate(OffsetDateTime.parse("2023-01-01T12:00:00.123Z"))
          .wideParkingMog(7)
          .wideWorkingMog(3)
          .build()
    }

    @Test
    fun body() {
      val params = AirfieldStatusCreateParams.builder()
          .classificationMarking("U")
          .dataMode(AirfieldStatusCreateParams.DataMode.TEST)
          .idAirfield("3136498f-2969-3535-1432-e984b2e2e686")
          .source("Bluestaq")
          .id("be831d39-1822-da9f-7ace-6cc5643397dc")
          .altAirfieldId("AIRFIELD-ID")
          .approvedBy("John Smith")
          .approvedDate(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
          .arffCat("FAA-A")
          .cargoMog(8)
          .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .fleetServiceMog(4)
          .fuelMog(9)
          .fuelQtys(listOf(
            263083.6,
            286674.9,
            18143.69,
          ))
          .fuelTypes(listOf(
            "JP-8",
            "Jet A",
            "AVGAS",
          ))
          .gseTime(10)
          .medCap("Large Field Hospital")
          .message("Status message about the airfield.")
          .mheQtys(listOf(
            1,
            3,
            1,
          ))
          .mheTypes(listOf(
            "30k",
            "AT",
            "60k",
          ))
          .mxMog(3)
          .narrowParkingMog(5)
          .narrowWorkingMog(4)
          .numCog(2)
          .operatingMog(4)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .passengerServiceMog(5)
          .priFreq(123.45)
          .priRwyNum("35R")
          .reviewedBy("Jane Doe")
          .reviewedDate(OffsetDateTime.parse("2024-01-01T00:00:00.123Z"))
          .rwyCondReading(23)
          .rwyFrictionFactor(10)
          .addRwyMarking("Aiming Point")
          .addRwyMarking("Threshold")
          .slotTypesReq(listOf(
            "PARKING",
            "WORKING",
            "LANDING",
          ))
          .sourceDl("AXE")
          .surveyDate(OffsetDateTime.parse("2023-01-01T12:00:00.123Z"))
          .wideParkingMog(7)
          .wideWorkingMog(3)
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(AirfieldStatusCreateParams.DataMode.TEST)
      assertThat(body.idAirfield()).isEqualTo("3136498f-2969-3535-1432-e984b2e2e686")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.id()).contains("be831d39-1822-da9f-7ace-6cc5643397dc")
      assertThat(body.altAirfieldId()).contains("AIRFIELD-ID")
      assertThat(body.approvedBy()).contains("John Smith")
      assertThat(body.approvedDate()).contains(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
      assertThat(body.arffCat()).contains("FAA-A")
      assertThat(body.cargoMog()).contains(8)
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.fleetServiceMog()).contains(4)
      assertThat(body.fuelMog()).contains(9)
      assertThat(body.fuelQtys().getOrNull()).containsExactly(263083.6, 286674.9, 18143.69)
      assertThat(body.fuelTypes().getOrNull()).containsExactly("JP-8", "Jet A", "AVGAS")
      assertThat(body.gseTime()).contains(10)
      assertThat(body.medCap()).contains("Large Field Hospital")
      assertThat(body.message()).contains("Status message about the airfield.")
      assertThat(body.mheQtys().getOrNull()).containsExactly(1, 3, 1)
      assertThat(body.mheTypes().getOrNull()).containsExactly("30k", "AT", "60k")
      assertThat(body.mxMog()).contains(3)
      assertThat(body.narrowParkingMog()).contains(5)
      assertThat(body.narrowWorkingMog()).contains(4)
      assertThat(body.numCog()).contains(2)
      assertThat(body.operatingMog()).contains(4)
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("OPS1")
      assertThat(body.passengerServiceMog()).contains(5)
      assertThat(body.priFreq()).contains(123.45)
      assertThat(body.priRwyNum()).contains("35R")
      assertThat(body.reviewedBy()).contains("Jane Doe")
      assertThat(body.reviewedDate()).contains(OffsetDateTime.parse("2024-01-01T00:00:00.123Z"))
      assertThat(body.rwyCondReading()).contains(23)
      assertThat(body.rwyFrictionFactor()).contains(10)
      assertThat(body.rwyMarkings().getOrNull()).containsExactly("Aiming Point", "Threshold")
      assertThat(body.slotTypesReq().getOrNull()).containsExactly("PARKING", "WORKING", "LANDING")
      assertThat(body.sourceDl()).contains("AXE")
      assertThat(body.surveyDate()).contains(OffsetDateTime.parse("2023-01-01T12:00:00.123Z"))
      assertThat(body.wideParkingMog()).contains(7)
      assertThat(body.wideWorkingMog()).contains(3)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = AirfieldStatusCreateParams.builder()
          .classificationMarking("U")
          .dataMode(AirfieldStatusCreateParams.DataMode.TEST)
          .idAirfield("3136498f-2969-3535-1432-e984b2e2e686")
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(AirfieldStatusCreateParams.DataMode.TEST)
      assertThat(body.idAirfield()).isEqualTo("3136498f-2969-3535-1432-e984b2e2e686")
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
