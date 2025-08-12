// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectresponses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseMetricsFull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EffectResponseMetricsFullTest {

    @Test
    fun create() {
      val effectResponseMetricsFull = EffectResponseMetricsFull.builder()
          .domainValue(10.1)
          .metricType("GoalAchievement")
          .provenance("Example metric")
          .relativeValue(10.1)
          .build()

      assertThat(effectResponseMetricsFull.domainValue()).contains(10.1)
      assertThat(effectResponseMetricsFull.metricType()).contains("GoalAchievement")
      assertThat(effectResponseMetricsFull.provenance()).contains("Example metric")
      assertThat(effectResponseMetricsFull.relativeValue()).contains(10.1)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val effectResponseMetricsFull = EffectResponseMetricsFull.builder()
          .domainValue(10.1)
          .metricType("GoalAchievement")
          .provenance("Example metric")
          .relativeValue(10.1)
          .build()

      val roundtrippedEffectResponseMetricsFull = jsonMapper.readValue(jsonMapper.writeValueAsString(effectResponseMetricsFull), jacksonTypeRef<EffectResponseMetricsFull>())

      assertThat(roundtrippedEffectResponseMetricsFull).isEqualTo(effectResponseMetricsFull)
    }
}
