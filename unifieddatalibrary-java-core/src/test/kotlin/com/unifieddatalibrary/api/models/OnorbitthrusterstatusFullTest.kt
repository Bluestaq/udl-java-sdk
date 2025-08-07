// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitthrusterstatusFullTest {

    @Test
    fun create() {
        val onorbitthrusterstatusFull =
            OnorbitthrusterstatusFull.builder()
                .classificationMarking("U")
                .dataMode(OnorbitthrusterstatusFull.DataMode.TEST)
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

        assertThat(onorbitthrusterstatusFull.classificationMarking()).isEqualTo("U")
        assertThat(onorbitthrusterstatusFull.dataMode())
            .isEqualTo(OnorbitthrusterstatusFull.DataMode.TEST)
        assertThat(onorbitthrusterstatusFull.idOnorbitThruster())
            .isEqualTo("ff7dc909-e8b4-4a54-8529-1963d4e9b353")
        assertThat(onorbitthrusterstatusFull.source()).isEqualTo("Bluestaq")
        assertThat(onorbitthrusterstatusFull.statusTime())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
        assertThat(onorbitthrusterstatusFull.id()).contains("af103c-1f917dc-002c1bd")
        assertThat(onorbitthrusterstatusFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitthrusterstatusFull.createdBy()).contains("some.user")
        assertThat(onorbitthrusterstatusFull.estDeltaV()).contains(10.1)
        assertThat(onorbitthrusterstatusFull.fuelMass()).contains(100.1)
        assertThat(onorbitthrusterstatusFull.fuelMassUnc()).contains(10.1)
        assertThat(onorbitthrusterstatusFull.isp()).contains(300.1)
        assertThat(onorbitthrusterstatusFull.maxDeltaV()).contains(100.1)
        assertThat(onorbitthrusterstatusFull.minDeltaV()).contains(0.1)
        assertThat(onorbitthrusterstatusFull.name()).contains("REA1")
        assertThat(onorbitthrusterstatusFull.operational()).contains(true)
        assertThat(onorbitthrusterstatusFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitthrusterstatusFull.origNetwork()).contains("ORIG")
        assertThat(onorbitthrusterstatusFull.propMassAvg()).contains(907.6)
        assertThat(onorbitthrusterstatusFull.propMassMax()).contains(2333.3)
        assertThat(onorbitthrusterstatusFull.propMassMedian()).contains(200.1)
        assertThat(onorbitthrusterstatusFull.propMassMin()).contains(0.1)
        assertThat(onorbitthrusterstatusFull.thrustMax()).contains(22.1)
        assertThat(onorbitthrusterstatusFull.totalDeltaV()).contains(100.1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitthrusterstatusFull =
            OnorbitthrusterstatusFull.builder()
                .classificationMarking("U")
                .dataMode(OnorbitthrusterstatusFull.DataMode.TEST)
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

        val roundtrippedOnorbitthrusterstatusFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitthrusterstatusFull),
                jacksonTypeRef<OnorbitthrusterstatusFull>(),
            )

        assertThat(roundtrippedOnorbitthrusterstatusFull).isEqualTo(onorbitthrusterstatusFull)
    }
}
