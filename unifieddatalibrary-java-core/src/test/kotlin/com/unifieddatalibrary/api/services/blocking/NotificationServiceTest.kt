// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
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
internal class NotificationServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val notificationService = client.notification()

        notificationService.create(
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
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val notificationService = client.notification()

        val page =
            notificationService.list(
                NotificationListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
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
        val notificationService = client.notification()

        notificationService.count(
            NotificationCountParams.builder()
                .createdAt(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun createRaw() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val notificationService = client.notification()

        notificationService.createRaw(
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
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val notificationService = client.notification()

        val notificationFull =
            notificationService.get(
                NotificationGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        notificationFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val notificationService = client.notification()

        val response = notificationService.queryhelp()

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
        val notificationService = client.notification()

        val notificationFulls =
            notificationService.tuple(
                NotificationTupleParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        notificationFulls.forEach { it.validate() }
    }
}
