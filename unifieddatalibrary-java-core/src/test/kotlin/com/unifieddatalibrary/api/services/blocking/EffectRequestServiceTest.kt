// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
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
internal class EffectRequestServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestService = client.effectRequests()

        effectRequestService.create(
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
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestService = client.effectRequests()

        val effectRequest =
            effectRequestService.retrieve(
                EffectRequestRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        effectRequest.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestService = client.effectRequests()

        val page =
            effectRequestService.list(
                EffectRequestListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestService = client.effectRequests()

        effectRequestService.count(
            EffectRequestCountParams.builder()
                .createdAt(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestService = client.effectRequests()

        effectRequestService.createBulk(
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
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestService = client.effectRequests()

        val response = effectRequestService.queryHelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestService = client.effectRequests()

        val response =
            effectRequestService.tuple(
                EffectRequestTupleParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val effectRequestService = client.effectRequests()

        effectRequestService.unvalidatedPublish(
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
    }
}
