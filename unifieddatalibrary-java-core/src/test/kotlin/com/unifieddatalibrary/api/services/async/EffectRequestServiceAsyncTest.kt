// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestCountParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestCreateBulkParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestCreateParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestListParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestRetrieveParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestTupleParams
import com.unifieddatalibrary.api.models.effectrequests.EffectRequestUnvalidatedPublishParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EffectRequestServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestServiceAsync = client.effectRequests()

        val future =
            effectRequestServiceAsync.create(
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
        val effectRequestServiceAsync = client.effectRequests()

        val effectRequestFuture =
            effectRequestServiceAsync.retrieve(
                EffectRequestRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val effectRequest = effectRequestFuture.get()
        effectRequest.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestServiceAsync = client.effectRequests()

        val pageFuture =
            effectRequestServiceAsync.list(
                EffectRequestListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
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
        val effectRequestServiceAsync = client.effectRequests()

        val responseFuture =
            effectRequestServiceAsync.count(
                EffectRequestCountParams.builder()
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
        val effectRequestServiceAsync = client.effectRequests()

        val future =
            effectRequestServiceAsync.createBulk(
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
        val effectRequestServiceAsync = client.effectRequests()

        val responseFuture = effectRequestServiceAsync.queryHelp()

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
        val effectRequestServiceAsync = client.effectRequests()

        val responseFuture =
            effectRequestServiceAsync.tuple(
                EffectRequestTupleParams.builder()
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
        val effectRequestServiceAsync = client.effectRequests()

        val future =
            effectRequestServiceAsync.unvalidatedPublish(
                EffectRequestUnvalidatedPublishParams.builder()
                    .addBody(
                        EffectRequestUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(EffectRequestUnvalidatedPublishParams.Body.DataMode.TEST)
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
            )

        val response = future.get()
    }
}
