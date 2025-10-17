// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCountParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistCreateParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistGetParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistTupleParams
import com.unifieddatalibrary.api.models.onorbitlist.OnorbitlistUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitlistServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitlistServiceAsync = client.onorbitlist()

        val future =
            onorbitlistServiceAsync.create(
                OnorbitlistCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(OnorbitlistCreateParams.DataMode.TEST)
                    .name("HRR-SATELLITES")
                    .addOnOrbitListItem(
                        OnorbitlistCreateParams.OnOrbitListItem.builder()
                            .clearingBoxCrossTrack(1.25)
                            .clearingBoxInTrack(1.25)
                            .clearingRadius(1.25)
                            .commonName("VANGUARD 1")
                            .countryCode("USA")
                            .expiredOn(OffsetDateTime.parse("2024-07-12T00:00:00.000Z"))
                            .freqMins(300.25)
                            .monitoringType("REVISIT_RATE")
                            .objectId("5")
                            .orbitRegime("LEO")
                            .origObjectId("ORIGOBJECT-ID")
                            .payloadPriority(2.5)
                            .rank(3)
                            .urgency(5.1)
                            .build()
                    )
                    .source("Bluestaq")
                    .id("ONORBITLIST-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .defaultRevisitRateMins(15.3)
                    .description("DESCRIPTION_OF_LIST")
                    .listPriority(1.1)
                    .namespace("18SDS")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .transactionId("TRANSACTION-ID")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitlistServiceAsync = client.onorbitlist()

        val future =
            onorbitlistServiceAsync.update(
                OnorbitlistUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(OnorbitlistUpdateParams.DataMode.TEST)
                    .name("HRR-SATELLITES")
                    .addOnOrbitListItem(
                        OnorbitlistUpdateParams.OnOrbitListItem.builder()
                            .clearingBoxCrossTrack(1.25)
                            .clearingBoxInTrack(1.25)
                            .clearingRadius(1.25)
                            .commonName("VANGUARD 1")
                            .countryCode("USA")
                            .expiredOn(OffsetDateTime.parse("2024-07-12T00:00:00.000Z"))
                            .freqMins(300.25)
                            .monitoringType("REVISIT_RATE")
                            .objectId("5")
                            .orbitRegime("LEO")
                            .origObjectId("ORIGOBJECT-ID")
                            .payloadPriority(2.5)
                            .rank(3)
                            .urgency(5.1)
                            .build()
                    )
                    .source("Bluestaq")
                    .bodyId("ONORBITLIST-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .defaultRevisitRateMins(15.3)
                    .description("DESCRIPTION_OF_LIST")
                    .listPriority(1.1)
                    .namespace("18SDS")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .transactionId("TRANSACTION-ID")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
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
        val onorbitlistServiceAsync = client.onorbitlist()

        val pageFuture = onorbitlistServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitlistServiceAsync = client.onorbitlist()

        val future = onorbitlistServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitlistServiceAsync = client.onorbitlist()

        val responseFuture =
            onorbitlistServiceAsync.count(
                OnorbitlistCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitlistServiceAsync = client.onorbitlist()

        val onorbitlistFuture =
            onorbitlistServiceAsync.get(
                OnorbitlistGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val onorbitlist = onorbitlistFuture.get()
        onorbitlist.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitlistServiceAsync = client.onorbitlist()

        val responseFuture = onorbitlistServiceAsync.queryhelp()

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
        val onorbitlistServiceAsync = client.onorbitlist()

        val responseFuture =
            onorbitlistServiceAsync.tuple(
                OnorbitlistTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
