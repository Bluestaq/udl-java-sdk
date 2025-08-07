// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.notification.NotificationCountParams
import com.unifieddatalibrary.api.models.notification.NotificationCreateParams
import com.unifieddatalibrary.api.models.notification.NotificationCreateRawParams
import com.unifieddatalibrary.api.models.notification.NotificationGetParams
import com.unifieddatalibrary.api.models.notification.NotificationListParams
import com.unifieddatalibrary.api.models.notification.NotificationTupleParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val notificationServiceAsync = client.notification()

        val future =
            notificationServiceAsync.create(
                NotificationCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(NotificationCreateParams.DataMode.TEST)
                    .msgBody("msgBody")
                    .msgType("msgType")
                    .source("Bluestaq")
                    .id("NOTIFICATION-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
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
        val notificationServiceAsync = client.notification()

        val pageFuture =
            notificationServiceAsync.list(
                NotificationListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
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
        val notificationServiceAsync = client.notification()

        val responseFuture =
            notificationServiceAsync.count(
                NotificationCountParams.builder()
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun createRaw() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val notificationServiceAsync = client.notification()

        val future =
            notificationServiceAsync.createRaw(
                NotificationCreateRawParams.builder()
                    .classificationMarking("classificationMarking")
                    .dataMode("dataMode")
                    .msgType("msgType")
                    .origin("origin")
                    .source("source")
                    .msgId("msgId")
                    .addTag("string")
                    .body("{ \"Alert\": \"Warning\",  \"Code\": 12345 }")
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
        val notificationServiceAsync = client.notification()

        val notificationFullFuture =
            notificationServiceAsync.get(
                NotificationGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val notificationFull = notificationFullFuture.get()
        notificationFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val notificationServiceAsync = client.notification()

        val responseFuture = notificationServiceAsync.queryhelp()

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
        val notificationServiceAsync = client.notification()

        val notificationFullsFuture =
            notificationServiceAsync.tuple(
                NotificationTupleParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val notificationFulls = notificationFullsFuture.get()
        notificationFulls.forEach { it.validate() }
    }
}
