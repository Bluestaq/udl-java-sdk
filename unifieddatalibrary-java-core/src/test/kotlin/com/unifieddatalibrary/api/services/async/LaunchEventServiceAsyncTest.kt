// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCountParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateBulkParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventCreateParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventGetParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventListParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventTupleParams
import com.unifieddatalibrary.api.models.launchevent.LaunchEventUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaunchEventServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchEventServiceAsync = client.launchEvent()

        val future =
            launchEventServiceAsync.create(
                LaunchEventCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(LaunchEventCreateParams.DataMode.TEST)
                    .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                    .source("Bluestaq")
                    .id("LAUNCHEVENT-ID")
                    .beNumber("ENC-123")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                    .declassificationString("Example Declassification")
                    .derivedFrom("Example source")
                    .idOnOrbit("REF-ONORBIT-ID")
                    .launchDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                    .launchFacilityName("Example launch facility name")
                    .launchFailureCode("Example failure code")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .origObjectId("ORIGOBJECT-ID")
                    .oSuffix("oSuffix")
                    .satNo(12)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchEventServiceAsync = client.launchEvent()

        val pageFuture =
            launchEventServiceAsync.list(
                LaunchEventListParams.builder()
                    .msgCreateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
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
        val launchEventServiceAsync = client.launchEvent()

        val responseFuture =
            launchEventServiceAsync.count(
                LaunchEventCountParams.builder()
                    .msgCreateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val launchEventServiceAsync = client.launchEvent()

        val future =
            launchEventServiceAsync.createBulk(
                LaunchEventCreateBulkParams.builder()
                    .addBody(
                        LaunchEventCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(LaunchEventCreateBulkParams.Body.DataMode.TEST)
                            .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                            .source("Bluestaq")
                            .id("LAUNCHEVENT-ID")
                            .beNumber("ENC-123")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                            .declassificationString("Example Declassification")
                            .derivedFrom("Example source")
                            .idOnOrbit("REF-ONORBIT-ID")
                            .launchDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                            .launchFacilityName("Example launch facility name")
                            .launchFailureCode("Example failure code")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .origObjectId("ORIGOBJECT-ID")
                            .oSuffix("oSuffix")
                            .satNo(12)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchEventServiceAsync = client.launchEvent()

        val launchEventFuture =
            launchEventServiceAsync.get(
                LaunchEventGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val launchEvent = launchEventFuture.get()
        launchEvent.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchEventServiceAsync = client.launchEvent()

        val responseFuture = launchEventServiceAsync.queryhelp()

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
        val launchEventServiceAsync = client.launchEvent()

        val responseFuture =
            launchEventServiceAsync.tuple(
                LaunchEventTupleParams.builder()
                    .columns("columns")
                    .msgCreateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val launchEventServiceAsync = client.launchEvent()

        val future =
            launchEventServiceAsync.unvalidatedPublish(
                LaunchEventUnvalidatedPublishParams.builder()
                    .addBody(
                        LaunchEventUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(LaunchEventUnvalidatedPublishParams.Body.DataMode.TEST)
                            .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                            .source("Bluestaq")
                            .id("LAUNCHEVENT-ID")
                            .beNumber("ENC-123")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                            .declassificationString("Example Declassification")
                            .derivedFrom("Example source")
                            .idOnOrbit("REF-ONORBIT-ID")
                            .launchDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                            .launchFacilityName("Example launch facility name")
                            .launchFailureCode("Example failure code")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .origObjectId("ORIGOBJECT-ID")
                            .oSuffix("oSuffix")
                            .satNo(12)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
