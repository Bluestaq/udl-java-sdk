// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingDescribeTopicParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetLatestOffsetParams
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetMessagesParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SecureMessagingServiceTest {

    @Test
    fun describeTopic() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val secureMessagingService = client.secureMessaging()

        val topicDetails =
            secureMessagingService.describeTopic(
                SecureMessagingDescribeTopicParams.builder()
                    .topic("topic")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        topicDetails.validate()
    }

    @Test
    fun getLatestOffset() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val secureMessagingService = client.secureMessaging()

        secureMessagingService.getLatestOffset(
            SecureMessagingGetLatestOffsetParams.builder()
                .topic("topic")
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun getMessages() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val secureMessagingService = client.secureMessaging()

        secureMessagingService.getMessages(
            SecureMessagingGetMessagesParams.builder()
                .topic("topic")
                .offset(0L)
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun listTopics() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val secureMessagingService = client.secureMessaging()

        val topicDetails = secureMessagingService.listTopics()

        topicDetails.forEach { it.validate() }
    }
}
