// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airfieldstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.airfieldstatus.AirfieldstatusAbridged
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirfieldstatusAbridgedTest {

    @Test
    fun create() {
      val airfieldstatusAbridged = AirfieldstatusAbridged.builder()
          .classificationMarking("U")
          .dataMode(AirfieldstatusAbridged.DataMode.TEST)
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

      assertThat(airfieldstatusAbridged.classificationMarking()).isEqualTo("U")
      assertThat(airfieldstatusAbridged.dataMode()).isEqualTo(AirfieldstatusAbridged.DataMode.TEST)
      assertThat(airfieldstatusAbridged.idAirfield()).isEqualTo("3136498f-2969-3535-1432-e984b2e2e686")
      assertThat(airfieldstatusAbridged.source()).isEqualTo("Bluestaq")
      assertThat(airfieldstatusAbridged.id()).contains("be831d39-1822-da9f-7ace-6cc5643397dc")
      assertThat(airfieldstatusAbridged.altAirfieldId()).contains("AIRFIELD-ID")
      assertThat(airfieldstatusAbridged.approvedBy()).contains("John Smith")
      assertThat(airfieldstatusAbridged.approvedDate()).contains(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
      assertThat(airfieldstatusAbridged.arffCat()).contains("FAA-A")
      assertThat(airfieldstatusAbridged.cargoMog()).contains(8)
      assertThat(airfieldstatusAbridged.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
      assertThat(airfieldstatusAbridged.createdBy()).contains("some.user")
      assertThat(airfieldstatusAbridged.fleetServiceMog()).contains(4)
      assertThat(airfieldstatusAbridged.fuelMog()).contains(9)
      assertThat(airfieldstatusAbridged.fuelQtys().getOrNull()).containsExactly(263083.6, 286674.9, 18143.69)
      assertThat(airfieldstatusAbridged.fuelTypes().getOrNull()).containsExactly("JP-8", "Jet A", "AVGAS")
      assertThat(airfieldstatusAbridged.gseTime()).contains(10)
      assertThat(airfieldstatusAbridged.medCap()).contains("Large Field Hospital")
      assertThat(airfieldstatusAbridged.message()).contains("Status message about the airfield.")
      assertThat(airfieldstatusAbridged.mheQtys().getOrNull()).containsExactly(1, 3, 1)
      assertThat(airfieldstatusAbridged.mheTypes().getOrNull()).containsExactly("30k", "AT", "60k")
      assertThat(airfieldstatusAbridged.mxMog()).contains(3)
      assertThat(airfieldstatusAbridged.narrowParkingMog()).contains(5)
      assertThat(airfieldstatusAbridged.narrowWorkingMog()).contains(4)
      assertThat(airfieldstatusAbridged.numCog()).contains(2)
      assertThat(airfieldstatusAbridged.operatingMog()).contains(4)
      assertThat(airfieldstatusAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(airfieldstatusAbridged.origNetwork()).contains("OPS1")
      assertThat(airfieldstatusAbridged.passengerServiceMog()).contains(5)
      assertThat(airfieldstatusAbridged.priFreq()).contains(123.45)
      assertThat(airfieldstatusAbridged.priRwyNum()).contains("35R")
      assertThat(airfieldstatusAbridged.reviewedBy()).contains("Jane Doe")
      assertThat(airfieldstatusAbridged.reviewedDate()).contains(OffsetDateTime.parse("2024-01-01T00:00:00.123Z"))
      assertThat(airfieldstatusAbridged.rwyCondReading()).contains(23)
      assertThat(airfieldstatusAbridged.rwyFrictionFactor()).contains(10)
      assertThat(airfieldstatusAbridged.rwyMarkings().getOrNull()).containsExactly("Aiming Point", "Threshold")
      assertThat(airfieldstatusAbridged.slotTypesReq().getOrNull()).containsExactly("PARKING", "WORKING", "LANDING")
      assertThat(airfieldstatusAbridged.sourceDl()).contains("AXE")
      assertThat(airfieldstatusAbridged.surveyDate()).contains(OffsetDateTime.parse("2023-01-01T12:00:00.123Z"))
      assertThat(airfieldstatusAbridged.wideParkingMog()).contains(7)
      assertThat(airfieldstatusAbridged.wideWorkingMog()).contains(3)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val airfieldstatusAbridged = AirfieldstatusAbridged.builder()
          .classificationMarking("U")
          .dataMode(AirfieldstatusAbridged.DataMode.TEST)
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

      val roundtrippedAirfieldstatusAbridged = jsonMapper.readValue(jsonMapper.writeValueAsString(airfieldstatusAbridged), jacksonTypeRef<AirfieldstatusAbridged>())

      assertThat(roundtrippedAirfieldstatusAbridged).isEqualTo(airfieldstatusAbridged)
    }
}
