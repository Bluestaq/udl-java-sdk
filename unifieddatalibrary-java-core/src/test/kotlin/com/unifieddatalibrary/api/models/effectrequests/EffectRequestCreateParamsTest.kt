// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EffectRequestCreateParamsTest {

    @Test
    fun create() {
        EffectRequestCreateParams.builder()
            .classificationMarking("U")
            .dataMode(EffectRequestCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            EffectRequestCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EffectRequestCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EffectRequestCreateParams.DataMode.TEST)
        assertThat(body.effectList()).containsExactly("COVER", "DECEIVE")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("EFFECTREQUEST-ID")
        assertThat(body.context()).contains("Example Notes")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.deadlineType()).contains("NoLaterThan")
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(body.externalRequestId()).contains("EXTERNALREQUEST-ID")
        assertThat(body.metricTypes().getOrNull()).containsExactly("COST", "RISK")
        assertThat(body.metricWeights().getOrNull()).containsExactly(0.5, 0.6)
        assertThat(body.modelClass()).contains("Preference model")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.priority()).contains("LOW")
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(body.state()).contains("CREATED")
        assertThat(body.targetSrcId()).contains("TARGETSRC-ID")
        assertThat(body.targetSrcType()).contains("POI")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EffectRequestCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EffectRequestCreateParams.DataMode.TEST)
                .addEffectList("COVER")
                .addEffectList("DECEIVE")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EffectRequestCreateParams.DataMode.TEST)
        assertThat(body.effectList()).containsExactly("COVER", "DECEIVE")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
