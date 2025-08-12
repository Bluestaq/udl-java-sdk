// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthrusterstatus

import com.unifieddatalibrary.api.models.onorbitthrusterstatus.OnorbitthrusterstatusCreateBulkParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitthrusterstatusCreateBulkParamsTest {

    @Test
    fun create() {
      OnorbitthrusterstatusCreateBulkParams.builder()
          .addBody(OnorbitthrusterstatusCreateBulkParams.Body.builder()
              .classificationMarking("U")
              .dataMode(OnorbitthrusterstatusCreateBulkParams.Body.DataMode.TEST)
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
              .build())
          .build()
    }

    @Test
    fun body() {
      val params = OnorbitthrusterstatusCreateBulkParams.builder()
          .addBody(OnorbitthrusterstatusCreateBulkParams.Body.builder()
              .classificationMarking("U")
              .dataMode(OnorbitthrusterstatusCreateBulkParams.Body.DataMode.TEST)
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
              .build())
          .build()

      val body = params._body()

      assertThat(body).containsExactly(OnorbitthrusterstatusCreateBulkParams.Body.builder()
          .classificationMarking("U")
          .dataMode(OnorbitthrusterstatusCreateBulkParams.Body.DataMode.TEST)
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
          .build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OnorbitthrusterstatusCreateBulkParams.builder()
          .addBody(OnorbitthrusterstatusCreateBulkParams.Body.builder()
              .classificationMarking("U")
              .dataMode(OnorbitthrusterstatusCreateBulkParams.Body.DataMode.TEST)
              .idOnorbitThruster("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
              .source("Bluestaq")
              .statusTime(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
              .build())
          .build()

      val body = params._body()

      assertThat(body).containsExactly(OnorbitthrusterstatusCreateBulkParams.Body.builder()
          .classificationMarking("U")
          .dataMode(OnorbitthrusterstatusCreateBulkParams.Body.DataMode.TEST)
          .idOnorbitThruster("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
          .source("Bluestaq")
          .statusTime(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
          .build())
    }
}
