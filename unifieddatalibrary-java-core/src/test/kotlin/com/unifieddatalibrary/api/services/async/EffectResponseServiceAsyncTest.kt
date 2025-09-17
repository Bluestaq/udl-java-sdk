// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCountParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseCreateParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseListParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseRetrieveParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseTupleParams
import com.unifieddatalibrary.api.models.effectresponses.EffectResponseUnvalidatedPublishParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EffectResponseServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectResponseServiceAsync = client.effectResponses()

        val future =
            effectResponseServiceAsync.create(
                EffectResponseCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(EffectResponseCreateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .type("COA")
                    .id("EFFECTRESPONSE-ID")
                    .addActionsList(
                        EffectResponseCreateParams.ActionsList.builder()
                            .actionActorSrcId("ACTIONACTORSRC-ID")
                            .actionActorSrcType("AIRCRAFT")
                            .actionEndTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                            .actionId("ACTION-ID")
                            .addActionMetric(
                                EffectResponseCreateParams.ActionsList.ActionMetric.builder()
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
                    )
                    .actorSrcId("RC-ID")
                    .actorSrcType("AIRCRAFT")
                    .addCoaMetric(
                        EffectResponseCreateParams.CoaMetric.builder()
                            .domainValue(10.1)
                            .metricType("GoalAchievement")
                            .provenance("Example metric")
                            .relativeValue(10.1)
                            .build()
                    )
                    .collateralDamageEst(0.5)
                    .createdAt(OffsetDateTime.parse("2021-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .decisionDeadline(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                    .addExternalAction("ACTION1")
                    .addExternalAction("ACTION2")
                    .externalRequestId("EXTERNALREQUEST-ID")
                    .idEffectRequest("EFFECTREQUEST-ID")
                    .munitionId("MUNITION-ID")
                    .munitionType("Dummy")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .probabilityOfKill(0.7)
                    .redTargetSrcId("REDTARGETSRC-ID")
                    .redTargetSrcType("POI")
                    .redTimeToOverhead(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                    .shotsRequired(10)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectResponseServiceAsync = client.effectResponses()

        val effectResponseFuture =
            effectResponseServiceAsync.retrieve(
                EffectResponseRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val effectResponse = effectResponseFuture.get()
        effectResponse.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectResponseServiceAsync = client.effectResponses()

        val pageFuture =
            effectResponseServiceAsync.list(
                EffectResponseListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectResponseServiceAsync = client.effectResponses()

        val responseFuture =
            effectResponseServiceAsync.count(
                EffectResponseCountParams.builder()
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectResponseServiceAsync = client.effectResponses()

        val future =
            effectResponseServiceAsync.createBulk(
                EffectResponseCreateBulkParams.builder()
                    .addBody(
                        EffectResponseCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(EffectResponseCreateBulkParams.Body.DataMode.TEST)
                            .source("Bluestaq")
                            .type("COA")
                            .id("EFFECTRESPONSE-ID")
                            .addActionsList(
                                EffectResponseCreateBulkParams.Body.ActionsList.builder()
                                    .actionActorSrcId("ACTIONACTORSRC-ID")
                                    .actionActorSrcType("AIRCRAFT")
                                    .actionEndTime(
                                        OffsetDateTime.parse("2021-01-01T00:00:00.123456Z")
                                    )
                                    .actionId("ACTION-ID")
                                    .addActionMetric(
                                        EffectResponseCreateBulkParams.Body.ActionsList.ActionMetric
                                            .builder()
                                            .domainValue(10.1)
                                            .metricType("GoalAchievement")
                                            .provenance("Example metric")
                                            .relativeValue(10.1)
                                            .build()
                                    )
                                    .actionStartTime(
                                        OffsetDateTime.parse("2021-01-01T00:00:00.123456Z")
                                    )
                                    .actorInterceptAlt(1.1)
                                    .actorInterceptLat(45.1)
                                    .actorInterceptLon(180.1)
                                    .effector("SENSOR1")
                                    .summary("Example summary")
                                    .targetSrcId("TARGETSRC-ID")
                                    .targetSrcType("POI")
                                    .totEndTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                                    .totStartTime(
                                        OffsetDateTime.parse("2021-01-01T00:00:00.123456Z")
                                    )
                                    .weaponInterceptAlt(1.1)
                                    .weaponInterceptLat(45.1)
                                    .weaponInterceptLon(180.1)
                                    .build()
                            )
                            .actorSrcId("RC-ID")
                            .actorSrcType("AIRCRAFT")
                            .addCoaMetric(
                                EffectResponseCreateBulkParams.Body.CoaMetric.builder()
                                    .domainValue(10.1)
                                    .metricType("GoalAchievement")
                                    .provenance("Example metric")
                                    .relativeValue(10.1)
                                    .build()
                            )
                            .collateralDamageEst(0.5)
                            .createdAt(OffsetDateTime.parse("2021-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .decisionDeadline(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                            .addExternalAction("ACTION1")
                            .addExternalAction("ACTION2")
                            .externalRequestId("EXTERNALREQUEST-ID")
                            .idEffectRequest("EFFECTREQUEST-ID")
                            .munitionId("MUNITION-ID")
                            .munitionType("Dummy")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .probabilityOfKill(0.7)
                            .redTargetSrcId("REDTARGETSRC-ID")
                            .redTargetSrcType("POI")
                            .redTimeToOverhead(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                            .shotsRequired(10)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectResponseServiceAsync = client.effectResponses()

        val responseFuture = effectResponseServiceAsync.queryHelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectResponseServiceAsync = client.effectResponses()

        val responseFuture =
            effectResponseServiceAsync.tuple(
                EffectResponseTupleParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectResponseServiceAsync = client.effectResponses()

        val future =
            effectResponseServiceAsync.unvalidatedPublish(
                EffectResponseUnvalidatedPublishParams.builder()
                    .addBody(
                        EffectResponseUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(EffectResponseUnvalidatedPublishParams.Body.DataMode.TEST)
                            .source("Bluestaq")
                            .type("COA")
                            .id("EFFECTRESPONSE-ID")
                            .addActionsList(
                                EffectResponseUnvalidatedPublishParams.Body.ActionsList.builder()
                                    .actionActorSrcId("ACTIONACTORSRC-ID")
                                    .actionActorSrcType("AIRCRAFT")
                                    .actionEndTime(
                                        OffsetDateTime.parse("2021-01-01T00:00:00.123456Z")
                                    )
                                    .actionId("ACTION-ID")
                                    .addActionMetric(
                                        EffectResponseUnvalidatedPublishParams.Body.ActionsList
                                            .ActionMetric
                                            .builder()
                                            .domainValue(10.1)
                                            .metricType("GoalAchievement")
                                            .provenance("Example metric")
                                            .relativeValue(10.1)
                                            .build()
                                    )
                                    .actionStartTime(
                                        OffsetDateTime.parse("2021-01-01T00:00:00.123456Z")
                                    )
                                    .actorInterceptAlt(1.1)
                                    .actorInterceptLat(45.1)
                                    .actorInterceptLon(180.1)
                                    .effector("SENSOR1")
                                    .summary("Example summary")
                                    .targetSrcId("TARGETSRC-ID")
                                    .targetSrcType("POI")
                                    .totEndTime(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                                    .totStartTime(
                                        OffsetDateTime.parse("2021-01-01T00:00:00.123456Z")
                                    )
                                    .weaponInterceptAlt(1.1)
                                    .weaponInterceptLat(45.1)
                                    .weaponInterceptLon(180.1)
                                    .build()
                            )
                            .actorSrcId("RC-ID")
                            .actorSrcType("AIRCRAFT")
                            .addCoaMetric(
                                EffectResponseUnvalidatedPublishParams.Body.CoaMetric.builder()
                                    .domainValue(10.1)
                                    .metricType("GoalAchievement")
                                    .provenance("Example metric")
                                    .relativeValue(10.1)
                                    .build()
                            )
                            .collateralDamageEst(0.5)
                            .createdAt(OffsetDateTime.parse("2021-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .decisionDeadline(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                            .addExternalAction("ACTION1")
                            .addExternalAction("ACTION2")
                            .externalRequestId("EXTERNALREQUEST-ID")
                            .idEffectRequest("EFFECTREQUEST-ID")
                            .munitionId("MUNITION-ID")
                            .munitionType("Dummy")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .probabilityOfKill(0.7)
                            .redTargetSrcId("REDTARGETSRC-ID")
                            .redTargetSrcType("POI")
                            .redTimeToOverhead(OffsetDateTime.parse("2021-01-01T00:00:00.123456Z"))
                            .shotsRequired(10)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
