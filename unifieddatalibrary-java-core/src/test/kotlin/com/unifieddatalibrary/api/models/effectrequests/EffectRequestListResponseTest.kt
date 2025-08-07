// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EffectRequestListResponseTest {

    @Test
    fun create() {
        val effectRequestListResponse =
            EffectRequestListResponse.builder()
                .classificationMarking("U")
                .dataMode(EffectRequestListResponse.DataMode.TEST)
                .addEffectList("COVER")
                .addEffectList("DECEIVE")
                .source("Bluestaq")
                .id("EFFECTREQUEST-ID")
                .context("Example Notes")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deadlineType("NoLaterThan")
                .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .externalRequestId("EXTERNALREQUEST-ID")
                .addMetricType("COST")
                .addMetricType("RISK")
                .addMetricWeight(0.5)
                .addMetricWeight(0.6)
                .modelClass("Preference model")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .priority("LOW")
                .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .state("CREATED")
                .targetSrcId("TARGETSRC-ID")
                .targetSrcType("POI")
                .build()

        assertThat(effectRequestListResponse.classificationMarking()).isEqualTo("U")
        assertThat(effectRequestListResponse.dataMode())
            .isEqualTo(EffectRequestListResponse.DataMode.TEST)
        assertThat(effectRequestListResponse.effectList()).containsExactly("COVER", "DECEIVE")
        assertThat(effectRequestListResponse.source()).isEqualTo("Bluestaq")
        assertThat(effectRequestListResponse.id()).contains("EFFECTREQUEST-ID")
        assertThat(effectRequestListResponse.context()).contains("Example Notes")
        assertThat(effectRequestListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(effectRequestListResponse.createdBy()).contains("some.user")
        assertThat(effectRequestListResponse.deadlineType()).contains("NoLaterThan")
        assertThat(effectRequestListResponse.endTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(effectRequestListResponse.externalRequestId()).contains("EXTERNALREQUEST-ID")
        assertThat(effectRequestListResponse.metricTypes().getOrNull())
            .containsExactly("COST", "RISK")
        assertThat(effectRequestListResponse.metricWeights().getOrNull()).containsExactly(0.5, 0.6)
        assertThat(effectRequestListResponse.modelClass()).contains("Preference model")
        assertThat(effectRequestListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(effectRequestListResponse.origNetwork()).contains("ORIG")
        assertThat(effectRequestListResponse.priority()).contains("LOW")
        assertThat(effectRequestListResponse.startTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(effectRequestListResponse.state()).contains("CREATED")
        assertThat(effectRequestListResponse.targetSrcId()).contains("TARGETSRC-ID")
        assertThat(effectRequestListResponse.targetSrcType()).contains("POI")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val effectRequestListResponse =
            EffectRequestListResponse.builder()
                .classificationMarking("U")
                .dataMode(EffectRequestListResponse.DataMode.TEST)
                .addEffectList("COVER")
                .addEffectList("DECEIVE")
                .source("Bluestaq")
                .id("EFFECTREQUEST-ID")
                .context("Example Notes")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deadlineType("NoLaterThan")
                .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .externalRequestId("EXTERNALREQUEST-ID")
                .addMetricType("COST")
                .addMetricType("RISK")
                .addMetricWeight(0.5)
                .addMetricWeight(0.6)
                .modelClass("Preference model")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .priority("LOW")
                .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .state("CREATED")
                .targetSrcId("TARGETSRC-ID")
                .targetSrcType("POI")
                .build()

        val roundtrippedEffectRequestListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(effectRequestListResponse),
                jacksonTypeRef<EffectRequestListResponse>(),
            )

        assertThat(roundtrippedEffectRequestListResponse).isEqualTo(effectRequestListResponse)
    }
}
