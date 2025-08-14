// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectresponses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EffectResponseActionsListFullTest {

    @Test
    fun create() {
        val effectResponseActionsListFull =
            EffectResponseActionsListFull.builder()
                .actionActorSrcId("ACTIONACTORSRC-ID")
                .actionActorSrcType("AIRCRAFT")
                .actionEndTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                .actionId("ACTION-ID")
                .addActionMetric(
                    EffectResponseMetricsFull.builder()
                        .domainValue(10.1)
                        .metricType("GoalAchievement")
                        .provenance("Example metric")
                        .relativeValue(10.1)
                        .build()
                )
                .actionStartTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                .actorInterceptAlt(1.1)
                .actorInterceptLat(45.1)
                .actorInterceptLon(180.1)
                .effector("SENSOR1")
                .summary("Example summary")
                .targetSrcId("TARGETSRC-ID")
                .targetSrcType("POI")
                .totEndTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                .totStartTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                .weaponInterceptAlt(1.1)
                .weaponInterceptLat(45.1)
                .weaponInterceptLon(180.1)
                .build()

        assertThat(effectResponseActionsListFull.actionActorSrcId()).contains("ACTIONACTORSRC-ID")
        assertThat(effectResponseActionsListFull.actionActorSrcType()).contains("AIRCRAFT")
        assertThat(effectResponseActionsListFull.actionEndTime())
            .contains(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
        assertThat(effectResponseActionsListFull.actionId()).contains("ACTION-ID")
        assertThat(effectResponseActionsListFull.actionMetrics().getOrNull())
            .containsExactly(
                EffectResponseMetricsFull.builder()
                    .domainValue(10.1)
                    .metricType("GoalAchievement")
                    .provenance("Example metric")
                    .relativeValue(10.1)
                    .build()
            )
        assertThat(effectResponseActionsListFull.actionStartTime())
            .contains(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
        assertThat(effectResponseActionsListFull.actorInterceptAlt()).contains(1.1)
        assertThat(effectResponseActionsListFull.actorInterceptLat()).contains(45.1)
        assertThat(effectResponseActionsListFull.actorInterceptLon()).contains(180.1)
        assertThat(effectResponseActionsListFull.effector()).contains("SENSOR1")
        assertThat(effectResponseActionsListFull.summary()).contains("Example summary")
        assertThat(effectResponseActionsListFull.targetSrcId()).contains("TARGETSRC-ID")
        assertThat(effectResponseActionsListFull.targetSrcType()).contains("POI")
        assertThat(effectResponseActionsListFull.totEndTime())
            .contains(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
        assertThat(effectResponseActionsListFull.totStartTime())
            .contains(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
        assertThat(effectResponseActionsListFull.weaponInterceptAlt()).contains(1.1)
        assertThat(effectResponseActionsListFull.weaponInterceptLat()).contains(45.1)
        assertThat(effectResponseActionsListFull.weaponInterceptLon()).contains(180.1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val effectResponseActionsListFull =
            EffectResponseActionsListFull.builder()
                .actionActorSrcId("ACTIONACTORSRC-ID")
                .actionActorSrcType("AIRCRAFT")
                .actionEndTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                .actionId("ACTION-ID")
                .addActionMetric(
                    EffectResponseMetricsFull.builder()
                        .domainValue(10.1)
                        .metricType("GoalAchievement")
                        .provenance("Example metric")
                        .relativeValue(10.1)
                        .build()
                )
                .actionStartTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                .actorInterceptAlt(1.1)
                .actorInterceptLat(45.1)
                .actorInterceptLon(180.1)
                .effector("SENSOR1")
                .summary("Example summary")
                .targetSrcId("TARGETSRC-ID")
                .targetSrcType("POI")
                .totEndTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                .totStartTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                .weaponInterceptAlt(1.1)
                .weaponInterceptLat(45.1)
                .weaponInterceptLon(180.1)
                .build()

        val roundtrippedEffectResponseActionsListFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(effectResponseActionsListFull),
                jacksonTypeRef<EffectResponseActionsListFull>(),
            )

        assertThat(roundtrippedEffectResponseActionsListFull)
            .isEqualTo(effectResponseActionsListFull)
    }
}
