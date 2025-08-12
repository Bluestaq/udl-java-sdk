// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthrusterstatus

import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitthrusterstatusCreateParamsTest {

    @Test
    fun create() {
      OnorbitthrusterstatusCreateParams.builder()
          .classificationMarking("U")
          .dataMode(OnorbitthrusterstatusCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
      val params = OnorbitthrusterstatusCreateParams.builder()
          .classificationMarking("U")
          .dataMode(OnorbitthrusterstatusCreateParams.DataMode.TEST)
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

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(OnorbitthrusterstatusCreateParams.DataMode.TEST)
      assertThat(body.idOnorbitThruster()).isEqualTo("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.statusTime()).isEqualTo(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
      assertThat(body.id()).contains("af103c-1f917dc-002c1bd")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.estDeltaV()).contains(10.1)
      assertThat(body.fuelMass()).contains(100.1)
      assertThat(body.fuelMassUnc()).contains(10.1)
      assertThat(body.isp()).contains(300.1)
      assertThat(body.maxDeltaV()).contains(100.1)
      assertThat(body.minDeltaV()).contains(0.1)
      assertThat(body.name()).contains("REA1")
      assertThat(body.operational()).contains(true)
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("ORIG")
      assertThat(body.propMassAvg()).contains(907.6)
      assertThat(body.propMassMax()).contains(2333.3)
      assertThat(body.propMassMedian()).contains(200.1)
      assertThat(body.propMassMin()).contains(0.1)
      assertThat(body.thrustMax()).contains(22.1)
      assertThat(body.totalDeltaV()).contains(100.1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OnorbitthrusterstatusCreateParams.builder()
          .classificationMarking("U")
          .dataMode(OnorbitthrusterstatusCreateParams.DataMode.TEST)
          .idOnorbitThruster("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
          .source("Bluestaq")
          .statusTime(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(OnorbitthrusterstatusCreateParams.DataMode.TEST)
      assertThat(body.idOnorbitThruster()).isEqualTo("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.statusTime()).isEqualTo(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
    }
}
