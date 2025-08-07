// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.effectrequests

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EffectRequestCreateBulkParamsTest {

    @Test
    fun create() {
        EffectRequestCreateBulkParams.builder()
            .addBody(
                EffectRequestCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(EffectRequestCreateBulkParams.Body.DataMode.TEST)
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EffectRequestCreateBulkParams.builder()
                .addBody(
                    EffectRequestCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EffectRequestCreateBulkParams.Body.DataMode.TEST)
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                EffectRequestCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(EffectRequestCreateBulkParams.Body.DataMode.TEST)
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EffectRequestCreateBulkParams.builder()
                .addBody(
                    EffectRequestCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EffectRequestCreateBulkParams.Body.DataMode.TEST)
                        .addEffectList("COVER")
                        .addEffectList("DECEIVE")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                EffectRequestCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(EffectRequestCreateBulkParams.Body.DataMode.TEST)
                    .addEffectList("COVER")
                    .addEffectList("DECEIVE")
                    .source("Bluestaq")
                    .build()
            )
    }
}
