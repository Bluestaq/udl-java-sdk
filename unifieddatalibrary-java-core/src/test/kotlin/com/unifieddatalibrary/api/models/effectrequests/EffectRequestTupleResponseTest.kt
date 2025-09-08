// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EffectRequestTupleResponseTest {

    @Test
    fun create() {
        val effectRequestTupleResponse =
            EffectRequestTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(EffectRequestTupleResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
                .priority("LOW")
                .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .state("CREATED")
                .targetSrcId("TARGETSRC-ID")
                .targetSrcType("POI")
                .build()

        assertThat(effectRequestTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(effectRequestTupleResponse.dataMode())
            .isEqualTo(EffectRequestTupleResponse.DataMode.TEST)
        assertThat(effectRequestTupleResponse.effectList()).containsExactly("COVER", "DECEIVE")
        assertThat(effectRequestTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(effectRequestTupleResponse.id()).contains("EFFECTREQUEST-ID")
        assertThat(effectRequestTupleResponse.context()).contains("Example Notes")
        assertThat(effectRequestTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(effectRequestTupleResponse.createdBy()).contains("some.user")
        assertThat(effectRequestTupleResponse.deadlineType()).contains("NoLaterThan")
        assertThat(effectRequestTupleResponse.endTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(effectRequestTupleResponse.externalRequestId()).contains("EXTERNALREQUEST-ID")
        assertThat(effectRequestTupleResponse.metricTypes().getOrNull())
            .containsExactly("COST", "RISK")
        assertThat(effectRequestTupleResponse.metricWeights().getOrNull()).containsExactly(0.5, 0.6)
        assertThat(effectRequestTupleResponse.modelClass()).contains("Preference model")
        assertThat(effectRequestTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(effectRequestTupleResponse.origNetwork()).contains("OPS1")
        assertThat(effectRequestTupleResponse.priority()).contains("LOW")
        assertThat(effectRequestTupleResponse.startTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(effectRequestTupleResponse.state()).contains("CREATED")
        assertThat(effectRequestTupleResponse.targetSrcId()).contains("TARGETSRC-ID")
        assertThat(effectRequestTupleResponse.targetSrcType()).contains("POI")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val effectRequestTupleResponse =
            EffectRequestTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(EffectRequestTupleResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
                .priority("LOW")
                .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .state("CREATED")
                .targetSrcId("TARGETSRC-ID")
                .targetSrcType("POI")
                .build()

        val roundtrippedEffectRequestTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(effectRequestTupleResponse),
                jacksonTypeRef<EffectRequestTupleResponse>(),
            )

        assertThat(roundtrippedEffectRequestTupleResponse).isEqualTo(effectRequestTupleResponse)
    }
}
