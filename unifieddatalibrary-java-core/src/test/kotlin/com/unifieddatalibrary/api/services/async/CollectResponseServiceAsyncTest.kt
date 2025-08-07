// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCountParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateBulkParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseCreateParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseListParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseRetrieveParams
import com.unifieddatalibrary.api.models.collectresponses.CollectResponseUnvalidatedPublishParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CollectResponseServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val collectResponseServiceAsync = client.collectResponses()

        val future =
            collectResponseServiceAsync.create(
                CollectResponseCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(CollectResponseCreateParams.DataMode.TEST)
                    .idRequest("REF-REQUEST-ID")
                    .source("Bluestaq")
                    .id("COLLECTRESPONSE-ID")
                    .actualEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                    .actualStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .altEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                    .altStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .errCode("ERROR CODE")
                    .externalId("EXTERNAL-ID")
                    .idOnOrbit("REF-ONORBIT-ID")
                    .idPlan("REF-PLAN-ID")
                    .idSensor("REF-SENSOR-ID")
                    .notes("Example notes")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .origObjectId("ORIGOBJECT-ID")
                    .origSensorId("ORIGSENSOR-ID")
                    .satNo(101)
                    .addSrcId("DOA_ID")
                    .addSrcId("DWELL_ID")
                    .addSrcTyp("DOA")
                    .addSrcTyp("DWELL")
                    .status("ACCEPTED")
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .taskId("TASK-ID")
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
        val collectResponseServiceAsync = client.collectResponses()

        val collectResponseFullFuture =
            collectResponseServiceAsync.retrieve(
                CollectResponseRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val collectResponseFull = collectResponseFullFuture.get()
        collectResponseFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val collectResponseServiceAsync = client.collectResponses()

        val pageFuture =
            collectResponseServiceAsync.list(
                CollectResponseListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
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
        val collectResponseServiceAsync = client.collectResponses()

        val responseFuture =
            collectResponseServiceAsync.count(
                CollectResponseCountParams.builder()
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
        val collectResponseServiceAsync = client.collectResponses()

        val future =
            collectResponseServiceAsync.createBulk(
                CollectResponseCreateBulkParams.builder()
                    .addBody(
                        CollectResponseCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(CollectResponseCreateBulkParams.Body.DataMode.TEST)
                            .idRequest("REF-REQUEST-ID")
                            .source("Bluestaq")
                            .id("COLLECTRESPONSE-ID")
                            .actualEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                            .actualStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .altEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                            .altStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .errCode("ERROR CODE")
                            .externalId("EXTERNAL-ID")
                            .idOnOrbit("REF-ONORBIT-ID")
                            .idPlan("REF-PLAN-ID")
                            .idSensor("REF-SENSOR-ID")
                            .notes("Example notes")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .origObjectId("ORIGOBJECT-ID")
                            .origSensorId("ORIGSENSOR-ID")
                            .satNo(101)
                            .addSrcId("DOA_ID")
                            .addSrcId("DWELL_ID")
                            .addSrcTyp("DOA")
                            .addSrcTyp("DWELL")
                            .status("ACCEPTED")
                            .addTag("PROVIDER_TAG1")
                            .addTag("PROVIDER_TAG2")
                            .taskId("TASK-ID")
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
        val collectResponseServiceAsync = client.collectResponses()

        val responseFuture = collectResponseServiceAsync.queryHelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val collectResponseServiceAsync = client.collectResponses()

        val future =
            collectResponseServiceAsync.unvalidatedPublish(
                CollectResponseUnvalidatedPublishParams.builder()
                    .addBody(
                        CollectResponseUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(CollectResponseUnvalidatedPublishParams.Body.DataMode.TEST)
                            .idRequest("REF-REQUEST-ID")
                            .source("Bluestaq")
                            .id("COLLECTRESPONSE-ID")
                            .actualEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                            .actualStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .altEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                            .altStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .errCode("ERROR CODE")
                            .externalId("EXTERNAL-ID")
                            .idOnOrbit("REF-ONORBIT-ID")
                            .idPlan("REF-PLAN-ID")
                            .idSensor("REF-SENSOR-ID")
                            .notes("Example notes")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .origObjectId("ORIGOBJECT-ID")
                            .origSensorId("ORIGSENSOR-ID")
                            .satNo(101)
                            .addSrcId("DOA_ID")
                            .addSrcId("DWELL_ID")
                            .addSrcTyp("DOA")
                            .addSrcTyp("DWELL")
                            .status("ACCEPTED")
                            .addTag("PROVIDER_TAG1")
                            .addTag("PROVIDER_TAG2")
                            .taskId("TASK-ID")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
