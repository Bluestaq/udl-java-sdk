// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthrusterstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusListResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitthrusterstatusListResponseTest {

    @Test
    fun create() {
      val onorbitthrusterstatusListResponse = OnorbitthrusterstatusListResponse.builder()
          .classificationMarking("U")
          .dataMode(OnorbitthrusterstatusListResponse.DataMode.TEST)
          .idOnorbitThruster("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
          .source("Bluestaq")
          .statusTime(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
          .id("af103c-1f917dc-002c1bd")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .estDeltaV(10.1)
          .fuelMass(100.1)
          .fuelMassUnc(10.1)
          .isp(300.1)
          .maxDeltaV(100.1)
          .minDeltaV(0.1)
          .name("REA1")
          .operational(true)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .propMassAvg(907.6)
          .propMassMax(2333.3)
          .propMassMedian(200.1)
          .propMassMin(0.1)
          .thrustMax(22.1)
          .totalDeltaV(100.1)
          .build()

      assertThat(onorbitthrusterstatusListResponse.classificationMarking()).isEqualTo("U")
      assertThat(onorbitthrusterstatusListResponse.dataMode()).isEqualTo(OnorbitthrusterstatusListResponse.DataMode.TEST)
      assertThat(onorbitthrusterstatusListResponse.idOnorbitThruster()).isEqualTo("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
      assertThat(onorbitthrusterstatusListResponse.source()).isEqualTo("Bluestaq")
      assertThat(onorbitthrusterstatusListResponse.statusTime()).isEqualTo(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
      assertThat(onorbitthrusterstatusListResponse.id()).contains("af103c-1f917dc-002c1bd")
      assertThat(onorbitthrusterstatusListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(onorbitthrusterstatusListResponse.createdBy()).contains("some.user")
      assertThat(onorbitthrusterstatusListResponse.estDeltaV()).contains(10.1)
      assertThat(onorbitthrusterstatusListResponse.fuelMass()).contains(100.1)
      assertThat(onorbitthrusterstatusListResponse.fuelMassUnc()).contains(10.1)
      assertThat(onorbitthrusterstatusListResponse.isp()).contains(300.1)
      assertThat(onorbitthrusterstatusListResponse.maxDeltaV()).contains(100.1)
      assertThat(onorbitthrusterstatusListResponse.minDeltaV()).contains(0.1)
      assertThat(onorbitthrusterstatusListResponse.name()).contains("REA1")
      assertThat(onorbitthrusterstatusListResponse.operational()).contains(true)
      assertThat(onorbitthrusterstatusListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(onorbitthrusterstatusListResponse.origNetwork()).contains("ORIG")
      assertThat(onorbitthrusterstatusListResponse.propMassAvg()).contains(907.6)
      assertThat(onorbitthrusterstatusListResponse.propMassMax()).contains(2333.3)
      assertThat(onorbitthrusterstatusListResponse.propMassMedian()).contains(200.1)
      assertThat(onorbitthrusterstatusListResponse.propMassMin()).contains(0.1)
      assertThat(onorbitthrusterstatusListResponse.thrustMax()).contains(22.1)
      assertThat(onorbitthrusterstatusListResponse.totalDeltaV()).contains(100.1)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val onorbitthrusterstatusListResponse = OnorbitthrusterstatusListResponse.builder()
          .classificationMarking("U")
          .dataMode(OnorbitthrusterstatusListResponse.DataMode.TEST)
          .idOnorbitThruster("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
          .source("Bluestaq")
          .statusTime(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
          .id("af103c-1f917dc-002c1bd")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .estDeltaV(10.1)
          .fuelMass(100.1)
          .fuelMassUnc(10.1)
          .isp(300.1)
          .maxDeltaV(100.1)
          .minDeltaV(0.1)
          .name("REA1")
          .operational(true)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .propMassAvg(907.6)
          .propMassMax(2333.3)
          .propMassMedian(200.1)
          .propMassMin(0.1)
          .thrustMax(22.1)
          .totalDeltaV(100.1)
          .build()

      val roundtrippedOnorbitthrusterstatusListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(onorbitthrusterstatusListResponse), jacksonTypeRef<OnorbitthrusterstatusListResponse>())

      assertThat(roundtrippedOnorbitthrusterstatusListResponse).isEqualTo(onorbitthrusterstatusListResponse)
    }
}
