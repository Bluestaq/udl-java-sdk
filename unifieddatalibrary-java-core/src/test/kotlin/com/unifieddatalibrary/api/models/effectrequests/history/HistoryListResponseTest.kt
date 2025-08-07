// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListResponseTest {

    @Test
    fun create() {
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
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

        assertThat(historyListResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyListResponse.dataMode()).isEqualTo(HistoryListResponse.DataMode.TEST)
        assertThat(historyListResponse.effectList()).containsExactly("COVER", "DECEIVE")
        assertThat(historyListResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyListResponse.id()).contains("EFFECTREQUEST-ID")
        assertThat(historyListResponse.context()).contains("Example Notes")
        assertThat(historyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyListResponse.createdBy()).contains("some.user")
        assertThat(historyListResponse.deadlineType()).contains("NoLaterThan")
        assertThat(historyListResponse.endTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(historyListResponse.externalRequestId()).contains("EXTERNALREQUEST-ID")
        assertThat(historyListResponse.metricTypes().getOrNull()).containsExactly("COST", "RISK")
        assertThat(historyListResponse.metricWeights().getOrNull()).containsExactly(0.5, 0.6)
        assertThat(historyListResponse.modelClass()).contains("Preference model")
        assertThat(historyListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyListResponse.origNetwork()).contains("ORIG")
        assertThat(historyListResponse.priority()).contains("LOW")
        assertThat(historyListResponse.startTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(historyListResponse.state()).contains("CREATED")
        assertThat(historyListResponse.targetSrcId()).contains("TARGETSRC-ID")
        assertThat(historyListResponse.targetSrcType()).contains("POI")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
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

        val roundtrippedHistoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyListResponse),
                jacksonTypeRef<HistoryListResponse>(),
            )

        assertThat(roundtrippedHistoryListResponse).isEqualTo(historyListResponse)
    }
}
