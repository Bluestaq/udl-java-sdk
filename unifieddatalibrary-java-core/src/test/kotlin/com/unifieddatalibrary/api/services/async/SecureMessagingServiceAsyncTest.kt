// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingDescribeTopicParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetLatestOffsetParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetMessagesParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SecureMessagingServiceAsyncTest {

    @Test
    fun describeTopic() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val secureMessagingServiceAsync = client.secureMessaging()

        val topicDetailsFuture =
            secureMessagingServiceAsync.describeTopic(
                SecureMessagingDescribeTopicParams.builder()
                    .topic("topic")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val topicDetails = topicDetailsFuture.get()
        topicDetails.validate()
    }

    @Test
    fun getLatestOffset() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val secureMessagingServiceAsync = client.secureMessaging()

        val future =
            secureMessagingServiceAsync.getLatestOffset(
                SecureMessagingGetLatestOffsetParams.builder()
                    .topic("topic")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun getMessages() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val secureMessagingServiceAsync = client.secureMessaging()

        val future =
            secureMessagingServiceAsync.getMessages(
                SecureMessagingGetMessagesParams.builder()
                    .topic("topic")
                    .offset(0L)
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val page = future.get()
    }

    @Test
    fun listTopics() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val secureMessagingServiceAsync = client.secureMessaging()

        val topicDetailsFuture = secureMessagingServiceAsync.listTopics()

        val topicDetails = topicDetailsFuture.get()
        topicDetails.forEach { it.validate() }
    }
}
