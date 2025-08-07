// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EffectRequestRetrieveResponseTest {

    @Test
    fun create() {
        val effectRequestRetrieveResponse =
            EffectRequestRetrieveResponse.builder()
                .classificationMarking("U")
                .dataMode(EffectRequestRetrieveResponse.DataMode.TEST)
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

        assertThat(effectRequestRetrieveResponse.classificationMarking()).isEqualTo("U")
        assertThat(effectRequestRetrieveResponse.dataMode())
            .isEqualTo(EffectRequestRetrieveResponse.DataMode.TEST)
        assertThat(effectRequestRetrieveResponse.effectList()).containsExactly("COVER", "DECEIVE")
        assertThat(effectRequestRetrieveResponse.source()).isEqualTo("Bluestaq")
        assertThat(effectRequestRetrieveResponse.id()).contains("EFFECTREQUEST-ID")
        assertThat(effectRequestRetrieveResponse.context()).contains("Example Notes")
        assertThat(effectRequestRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(effectRequestRetrieveResponse.createdBy()).contains("some.user")
        assertThat(effectRequestRetrieveResponse.deadlineType()).contains("NoLaterThan")
        assertThat(effectRequestRetrieveResponse.endTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(effectRequestRetrieveResponse.externalRequestId()).contains("EXTERNALREQUEST-ID")
        assertThat(effectRequestRetrieveResponse.metricTypes().getOrNull())
            .containsExactly("COST", "RISK")
        assertThat(effectRequestRetrieveResponse.metricWeights().getOrNull())
            .containsExactly(0.5, 0.6)
        assertThat(effectRequestRetrieveResponse.modelClass()).contains("Preference model")
        assertThat(effectRequestRetrieveResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(effectRequestRetrieveResponse.origNetwork()).contains("ORIG")
        assertThat(effectRequestRetrieveResponse.priority()).contains("LOW")
        assertThat(effectRequestRetrieveResponse.startTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(effectRequestRetrieveResponse.state()).contains("CREATED")
        assertThat(effectRequestRetrieveResponse.targetSrcId()).contains("TARGETSRC-ID")
        assertThat(effectRequestRetrieveResponse.targetSrcType()).contains("POI")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val effectRequestRetrieveResponse =
            EffectRequestRetrieveResponse.builder()
                .classificationMarking("U")
                .dataMode(EffectRequestRetrieveResponse.DataMode.TEST)
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

        val roundtrippedEffectRequestRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(effectRequestRetrieveResponse),
                jacksonTypeRef<EffectRequestRetrieveResponse>(),
            )

        assertThat(roundtrippedEffectRequestRetrieveResponse)
            .isEqualTo(effectRequestRetrieveResponse)
    }
}
